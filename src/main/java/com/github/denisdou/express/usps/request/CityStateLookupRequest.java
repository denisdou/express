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

import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "zipCode" })
@XmlRootElement(name = "CityStateLookupRequest")
public class CityStateLookupRequest extends RequestAbstract {

    @XmlElement(name = "ZipCode", required = true)
    protected ZipCode zipCode;

    @XmlAttribute(name = "USERID")
    protected String userId;

    public String getZipCode() {
        if (zipCode == null) {
            return "";
        }
        return zipCode.getZip5();
    }

    public void setZipCode(String zip5) {
        this.zipCode = new ZipCode();
        this.zipCode.setZip5(zip5);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "zip5" })
    public static class ZipCode {

        @XmlElement(name = "Zip5", required = true)
        protected String zip5;

        public String getZip5() {
            return zip5;
        }

        public void setZip5(String zip5) {
            if (zip5 != null) {
                this.zip5 = zip5.trim().replaceAll("\\s+", " ");
                return;
            }
            this.zip5 = "";
        }
    }
}
