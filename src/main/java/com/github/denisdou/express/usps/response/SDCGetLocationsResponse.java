package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "release","callerId","sourceId","mailClass","originZip","originCity","originState","destZip","destCity","destState","acceptDate","acceptTime","weight","expedited","nonExpediteds" })
@XmlRootElement(name = "SDCGetLocationsResponse")
public class SDCGetLocationsResponse {
    @XmlElement(name = "Release")
    private String release;
    @XmlElement(name = "CallerID")
    private Integer callerId;
    @XmlElement(name = "SourceID")
    private String sourceId;
    @XmlElement(name = "MailClass")
    private String mailClass;
    @XmlElement(name = "OriginZIP")
    private String originZip;
    @XmlElement(name = "OriginCity")
    private String originCity;
    @XmlElement(name = "OriginState")
    private String originState;
    @XmlElement(name = "DestZIP")
    private String destZip;
    @XmlElement(name = "DestCity")
    private String destCity;
    @XmlElement(name = "DestState")
    private String destState;
    @XmlElement(name = "AcceptDate")
    private String acceptDate;
    @XmlElement(name = "AcceptTime")
    private String acceptTime;
    @XmlElement(name = "Weight")
    private String weight;

    @XmlElement(name = "Expedited")
    private Expedited expedited;

    @XmlElements({@XmlElement(name = "NonExpedited", type = NonExpedited.class)})
    private List<NonExpedited> nonExpediteds;

    public void setRelease(String release) {
        this.release = release;
    }

    public void setCallerId(Integer callerId) {
        this.callerId = callerId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public void setMailClass(String mailClass) {
        this.mailClass = mailClass;
    }

    public void setOriginZip(String originZip) {
        this.originZip = originZip;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public void setOriginState(String originState) {
        this.originState = originState;
    }

    public void setDestZip(String destZip) {
        this.destZip = destZip;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public void setDestState(String destState) {
        this.destState = destState;
    }

    public void setAcceptDate(String acceptDate) {
        this.acceptDate = acceptDate;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setExpedited(Expedited expedited) {
        this.expedited = expedited;
    }

    public void setNonExpediteds(List<NonExpedited> nonExpediteds) {
        this.nonExpediteds = nonExpediteds;
    }

    public String getRelease() {
        return release;
    }

    public Integer getCallerId() {
        return callerId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getMailClass() {
        return mailClass;
    }

    public String getOriginZip() {
        return originZip;
    }

    public String getOriginCity() {
        return originCity;
    }

    public String getOriginState() {
        return originState;
    }

    public String getDestZip() {
        return destZip;
    }

    public String getDestCity() {
        return destCity;
    }

    public String getDestState() {
        return destState;
    }

    public String getAcceptDate() {
        return acceptDate;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public String getWeight() {
        return weight;
    }

    public Expedited getExpedited() {
        return expedited;
    }

    public List<NonExpedited> getNonExpediteds() {
        return nonExpediteds;
    }

}
