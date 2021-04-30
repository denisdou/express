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

import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = { "firmName", "address1", "address2", "city", "state", "urbanization", "zip5", "zip4", "deliveryPoint", "carrierRoute" })
public class Address {

    @XmlElement(name = "FirmName")
    private String firmName;

    @XmlElement(name = "Address1")
    private String address1;

    @XmlElement(name = "Address2")
    private String address2;

    @XmlElement(name = "City")
    private String city;

    @XmlElement(name = "State")
    private String state;

    @XmlElement(name = "Urbanization")
    private String urbanization;

    @XmlElement(name = "Zip5")
    protected String zip5;

    @XmlElement(name = "Zip4")
    protected String zip4;

    @XmlElement(name = "DeliveryPoint")
    protected String deliveryPoint;

    @XmlElement(name = "CarrierRoute")
    protected String carrierRoute;

    public Address() {}

    public Address(Builder builder) {
        this.firmName = builder.firmName;
        this.address1 = builder.address1;
        this.address2 = builder.address2;
        this.city = builder.city;
        this.state = builder.state;
        this.urbanization = builder.urbanization;
        this.zip5 = builder.zip5;
        this.zip4 = builder.zip4;
    }

    public String getFirmName() {
        return firmName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getUrbanization() {
        return urbanization;
    }

    public String getZip5() {
        return zip5;
    }

    public String getZip4() {
        return zip4;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public String getCarrierRoute() {
        return carrierRoute;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setUrbanization(String urbanization) {
        this.urbanization = urbanization;
    }

    public void setZip5(String zip5) {
        this.zip5 = zip5;
    }

    public void setZip4(String zip4) {
        this.zip4 = zip4;
    }

    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public void setCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
    }

    private String trim(String text) {
        if(text == null) {
            return "";
        }
        return text.trim().replaceAll("\\s+", " ");
    }

    public static class Builder {
        private String firmName;
        private String address1;
        private String address2;
        private String city;
        private String state;
        private String urbanization;
        private String zip5;
        private String zip4;
        private String deliveryPoint;
        private String carrierRoute;

        public Builder setFirmName(String firmName) {
            this.firmName = firmName;
            return this;
        }

        public Builder setAddress1(String address1) {
            this.address1 = address1;
            return this;
        }

        public Builder setAddress2(String address2) {
            this.address2 = address2;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setUrbanization(String urbanization) {
            this.urbanization = urbanization;
            return this;
        }

        public Builder setZip5(String zip5) {
            this.zip5 = zip5;
            return this;
        }

        public Builder setZip4(String zip4) {
            this.zip4 = zip4;
            return this;
        }

        public Builder setDeliveryPoint(String deliveryPoint) {
            this.deliveryPoint = deliveryPoint;
            return this;
        }

        public Builder setCarrierRoute(String carrierRoute) {
            this.carrierRoute = carrierRoute;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
