package com.github.denisdou.express.usps.request;
import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "userId","originZip","destinationZip","destinationType" })
@XmlRootElement(name = "FirstClassMailRequest")
public class FirstClassMailRequest extends RequestAbstract{
    @XmlAttribute(name = "USERID")
    private String userId;

    @XmlElement(name = "OriginZip")
    private String originZip;

    @XmlElement(name = "DestinationZip")
    private String destinationZip;

    @XmlElement(name = "DestinationType")
    private Integer destinationType;

    public String getUserId() {
        return userId;
    }

    public String getOriginZip() {
        return originZip;
    }

    public String getDestinationZip() {
        return destinationZip;
    }

    public Integer getDestinationType() {
        return destinationType;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setOriginZip(String originZip) {
        this.originZip = originZip;
    }

    public void setDestinationZip(String destinationZip) {
        this.destinationZip = destinationZip;
    }

    public void setDestinationType(Integer destinationType) {
        this.destinationType = destinationType;
    }
}