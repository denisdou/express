/**
 * express - United States Postal Service Web Tool Kit Development for Java applications
 * Copyright (c) 2021 denisdou Software LLC <https://github.com/denisdou/express>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal 
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 * SOFTWARE.
 */
package com.github.denisdou.express.usps;

import com.github.denisdou.express.ExpressException;
import com.github.denisdou.express.usps.request.*;
import com.github.denisdou.express.usps.response.*;
import okhttp3.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRegistry;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@XmlRegistry
public class USPSClient {
    //写超时时间
    private static final long WRITE_TIMEOUT = 30;
    //读取超时时间
    private static final long READ_TIMEOUT = 30;
    //连接超时时间
    private static final long CONNECT_TIMEOUT = 30;

    private final static String API_INSECURE_URL = "http://production.shippingapis.com/ShippingAPI.dll";

    private final static String API_SECURE_URL = "https://secure.shippingapis.com/ShippingAPI.dll";

    private String userId;

    private boolean secure;

    private OkHttpClient okHttpClient;

    /**
     * @param userId user ID
     */
    public USPSClient(String userId) {
        super();
        this.userId = userId;
        this.httpClient();
    }

    private void httpClient() {
        //1.通过配置ok的各种功能，来构建它的实例，就像组装电脑一样
        okHttpClient = new OkHttpClient.Builder()
                //连接超时
                .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
                //读取超时
                .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
                //写超时
                .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
                .build();
    }

    /**
     * @param userId user ID
     * @param secure secure
     */
    public USPSClient(String userId, boolean secure) {
        super();
        this.userId = userId;
        this.secure = secure;
        this.httpClient();
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public boolean isSecure() {
        return secure;
    }

    /**
     * @param api api
     * @param xml xml
     * @return String
     */
    private String buildURL(String api, String xml) {
        try {
            String baseUrl = secure ? API_SECURE_URL : API_INSECURE_URL;
            return baseUrl + String.format("?API=%s&XML=%s", URLEncoder.encode(api, "UTF-8"), URLEncoder.encode(xml, "UTF-8"));
        } catch(UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Unable to build API URL string." + e.getMessage());
        }
    }

    /**
     * @param url url
     * @return String
     * @throws IOException IOException
     */
    private String sendGet(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        // 创建一个通信请求
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    /**
     * @param text text
     * @throws ExpressException ExpressException
     */
    private void hasError(String text) throws ExpressException {
        if(text.indexOf("<Error>") != -1) {
            int beginIndex;
            int endIndex;
            beginIndex = text.indexOf("<Number>");
            endIndex = text.indexOf("</Number>");
            String code = null;
            if(beginIndex != -1 && endIndex != -1) {
                code = text.substring(beginIndex + 8, endIndex);
            }
            beginIndex = text.indexOf("<Description>");
            endIndex = text.indexOf("</Description>");
            String message = null;
            if(beginIndex != -1 && endIndex != -1) {
                message = text.substring(beginIndex + 13, endIndex);
            }
            throw new ExpressException(message, code);
        }
    }

    /**
     * @param address address
     * @param includeOptionalElements includeOptionalElements
     * @param returnCarrierRoute returnCarrierRoute
     * @return Address
     * @throws ExpressException ExpressException
     */
    public Address addressValidate(Address address, boolean includeOptionalElements, boolean returnCarrierRoute) throws ExpressException {
        AddressValidateRequest addressValidateRequest = new AddressValidateRequest();
        addressValidateRequest.setUserId(userId);

        if(includeOptionalElements) {
            addressValidateRequest.setIncludeOptionalElements(includeOptionalElements);
        }
        if(returnCarrierRoute) {
            addressValidateRequest.setReturnCarrierRoute(returnCarrierRoute);
        }
        addressValidateRequest.setAddress(address);

        try {
            AddressValidateResponse response = httpRequest("Verify", addressValidateRequest.toXml(AddressValidateRequest.class), AddressValidateResponse.class);
            return response.getAddress();
        }catch (ExpressException e) {
            throw new ExpressException(e.getMessage());
        }
    }

    /**
     * @param address address
     * @return Address
     * @throws ExpressException ExpressException
     */
    public Address zipCodeLookup(Address address) throws ExpressException {
        ZipCodeLookupRequest zipCodeLookupRequest = new ZipCodeLookupRequest();
        zipCodeLookupRequest.setUserId(userId);
        zipCodeLookupRequest.setAddress(address);

        try {
            ZipCodeLookupResponse response = httpRequest("ZipCodeLookup", zipCodeLookupRequest.toXml(ZipCodeLookupRequest.class), ZipCodeLookupResponse.class);
            return response.getAddress();
        }catch (ExpressException e) {
            throw new ExpressException(e.getMessage(), e.getCode());
        }
    }

    /**
     * @param zip5 zip5
     * @return Address
     * @throws ExpressException ExpressException
     */
    public Address cityStateLookup(String zip5) throws ExpressException {
        CityStateLookupRequest cityStateLookupRequest = new CityStateLookupRequest();
        cityStateLookupRequest.setUserId(userId);
        cityStateLookupRequest.setZipCode(zip5);

        try {
            CityStateLookupResponse response = httpRequest("CityStateLookup", cityStateLookupRequest.toXml(CityStateLookupRequest.class), CityStateLookupResponse.class);
            return response.getAddress();
        }catch (ExpressException e) {
            throw new ExpressException(e.getMessage(), e.getCode());
        }
    }

    /**
     * @param clientIp client Ip
     * @param trackId trackId
     * @param sourceId sourceId
     * @return TrackFieldResponse
     * @throws ExpressException ExpressException
     */
    public TrackFieldResponse trackField(String clientIp, String trackId, String sourceId) throws ExpressException {
        TrackFieldRequest trackFieldRequest = new TrackFieldRequest();
        trackFieldRequest.setTrackId(trackId);
        trackFieldRequest.setClientIp(clientIp);
        trackFieldRequest.setRevision(1);
        trackFieldRequest.setSourceId(sourceId);
        trackFieldRequest.setUserId(userId);

        try{
            return httpRequest("TrackV2", trackFieldRequest.toXml(TrackFieldRequest.class), TrackFieldResponse.class);
        }catch (ExpressException e) {
            throw new ExpressException(e.getMessage(), e.getCode());
        } catch (Exception e) {
            throw new ExpressException(e.getMessage());
        }
    }

    /**
     * @param api api
     * @param xmlString xmlString
     * @param clazz clazz
     * @param <T> <T>
     * @return T
     * @throws ExpressException ExpressException
     */
    private <T> T httpRequest(String api, String xmlString, Class<T> clazz) throws ExpressException {
        try {
            String responseText = sendGet(buildURL(api, xmlString));
            //验证是否报错
            hasError(responseText);

            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            T response = (T) unmarshaller.unmarshal(new StringReader(responseText));
            return response;
        }catch (JAXBException e) {
            throw new ExpressException(e.getMessage());
        }catch (IOException e) {
            throw new ExpressException(e.getMessage());
        }catch (ExpressException e) {
            throw new ExpressException(e.getMessage(), e.getCode());
        }
    }

    /**
     * Rate Calculator
     * @param packages packages
     * @return RateV4Response RateV4Response
     * @throws ExpressException ExpressException
     */
    public RateV4Response rate(List<PackageRequest> packages) throws ExpressException {
        RateV4Request request = new RateV4Request();
        request.setUserId(userId);
        request.setRevision("2");
        request.setPackages(packages);

        try{
            return httpRequest("RateV4", request.toXml(RateV4Request.class), RateV4Response.class);
        }catch (ExpressException e) {
            throw new ExpressException(e.getMessage(), e.getCode());
        } catch (Exception e) {
            throw new ExpressException(e.getMessage());
        }
    }

    public FirstClassMailResponse firstClassMail(FirstClassMailRequest firstClassMailRequest) throws ExpressException {
        firstClassMailRequest.setUserId(userId);
        try{
            return httpRequest("FirstClassMail", firstClassMailRequest.toXml(FirstClassMailRequest.class), FirstClassMailResponse.class);
        } catch (ExpressException e) {
            throw new ExpressException(e.getMessage(), e.getCode());
        } catch (Exception e) {
            throw new ExpressException(e.getMessage());
        }
    }

    public PriorityMailResponse priorityMail(PriorityMailRequest priorityMailRequest) throws ExpressException {
        priorityMailRequest.setUserId(userId);
        try{
            return httpRequest("PriorityMail", priorityMailRequest.toXml(PriorityMailRequest.class), PriorityMailResponse.class);
        } catch (ExpressException e) {
            throw new ExpressException(e.getMessage(), e.getCode());
        } catch (Exception e) {
            throw new ExpressException(e.getMessage());
        }
    }

    public SDCGetLocationsResponse sdcGetLocations(SDCGetLocationsRequest sdcGetLocationsRequest) throws ExpressException {
        sdcGetLocationsRequest.setUserId(userId);
        try{
            return httpRequest("SDCGetLocations", sdcGetLocationsRequest.toXml(SDCGetLocationsRequest.class), SDCGetLocationsResponse.class);
        } catch (ExpressException e) {
            throw new ExpressException(e.getMessage(), e.getCode());
        } catch (Exception e) {
            throw new ExpressException(e.getMessage());
        }
    }

    public TrackResponse tracking(String trackId) throws ExpressException {
        TrackRequest trackRequest = new TrackRequest();
        trackRequest.setUserId(userId);
        trackRequest.setTrackId(trackId);

        try{
            return httpRequest("TrackV2", trackRequest.toXml(TrackRequest.class), TrackResponse.class);
        } catch (ExpressException e) {
            throw new ExpressException(e.getMessage(), e.getCode());
        } catch (Exception e) {
            throw new ExpressException(e.getMessage());
        }
    }
}
