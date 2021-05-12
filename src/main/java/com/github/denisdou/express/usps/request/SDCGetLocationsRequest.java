package com.github.denisdou.express.usps.request;
import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "userId","mailClass","originZip","destinationZip", "acceptDate", "acceptTime","nonEMDetail","nonEMOriginType","nonEMDestType","weight"})
@XmlRootElement(name = "SDCGetLocationsRequest")
public class SDCGetLocationsRequest extends RequestAbstract{
    @XmlAttribute(name = "USERID")
    private String userId;

    @XmlElement(name = "MailClass")
    private final Integer mailClass;

    @XmlElement(name = "OriginZIP")
    private final String originZip;

    @XmlElement(name = "DestinationZIP")
    private final String destinationZip;

    @XmlElement(name = "AcceptDate")
    private final String acceptDate;

    @XmlElement(name = "AcceptTime")
    private final String acceptTime;

    @XmlElement(name = "NonEMDetail")
    private final String nonEMDetail;

    @XmlElement(name = "NonEMOriginType")
    private final String nonEMOriginType;

    @XmlElement(name = "NonEMDestType")
    private final String nonEMDestType;

    @XmlElement(name = "Weight")
    private final String weight;

    public String getUserId() {
        return userId;
    }

    public Integer getMailClass() {
        return mailClass;
    }

    public String getOriginZip() {
        return originZip;
    }

    public String getDestinationZip() {
        return destinationZip;
    }

    public String getAcceptDate() {
        return acceptDate;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public String getNonEMDetail() {
        return nonEMDetail;
    }

    public String getNonEMOriginType() {
        return nonEMOriginType;
    }

    public String getNonEMDestType() {
        return nonEMDestType;
    }

    public String getWeight() {
        return weight;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SDCGetLocationsRequest() {
        this(new SDCGetLocationsRequest.Builder());
    }

    public SDCGetLocationsRequest(Builder builder) {
        this.mailClass = builder.mailClass;
        this.originZip = builder.originZip;
        this.destinationZip = builder.destinationZip;
        this.acceptDate = builder.acceptDate;
        this.acceptTime = builder.acceptTime;
        this.nonEMDetail = builder.nonEMDetail;
        this.nonEMOriginType = builder.nonEMOriginType;
        this.nonEMDestType = builder.nonEMDestType;
        this.weight = builder.weight;
    }

    public static class Builder {
        private Integer mailClass;
        private String originZip;
        private String destinationZip;
        private String acceptDate;
        private String acceptTime;
        private String nonEMDetail;
        private String nonEMOriginType;
        private String nonEMDestType;
        private String weight;

        public Builder mailClass(Integer mailClass) {
            this.mailClass = mailClass;
            return this;
        }

        public Builder originZip(String originZip) {
            this.originZip = originZip;
            return this;
        }

        public Builder destinationZip(String destinationZip) {
            this.destinationZip = destinationZip;
            return this;
        }

        public Builder acceptDate(String acceptDate) {
            this.acceptDate = acceptDate;
            return this;
        }

        public Builder acceptTime(String acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }

        public Builder nonEMDetail(String nonEMDetail) {
            this.nonEMDetail = nonEMDetail;
            return this;
        }

        public Builder nonEMOriginType(String nonEMOriginType) {
            this.nonEMOriginType = nonEMOriginType;
            return this;
        }

        public Builder nonEMDestType(String nonEMDestType) {
            this.nonEMDestType = nonEMDestType;
            return this;
        }

        public Builder weight(String weight) {
            this.weight = weight;
            return this;
        }

        public SDCGetLocationsRequest build() {
            return new SDCGetLocationsRequest(this);
        }
    }
}
