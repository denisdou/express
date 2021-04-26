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
package com.github.denisdou.express.usps.request;

import com.github.denisdou.express.usps.Address;

import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "includeOptionalElements", "returnCarrierRoute", "address" })
@XmlRootElement(name = "AddressValidateRequest")
public class AddressValidateRequest extends RequestAbstract {

    @XmlElement(name = "IncludeOptionalElements")
    protected Boolean includeOptionalElements;

    @XmlElement(name = "ReturnCarrierRoute")
    protected Boolean returnCarrierRoute;

    @XmlElement(name = "Address", required = true)
    protected Address address;

    @XmlAttribute(name = "USERID")
    protected String userId;

    public Boolean isIncludeOptionalElements() {
        return includeOptionalElements;
    }

    public void setIncludeOptionalElements(Boolean includeOptionalElements) {
        this.includeOptionalElements = includeOptionalElements;
    }

    public Boolean isReturnCarrierRoute() {
        return returnCarrierRoute;
    }

    public void setReturnCarrierRoute(Boolean returnCarrierRoute) {
        this.returnCarrierRoute = returnCarrierRoute;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
