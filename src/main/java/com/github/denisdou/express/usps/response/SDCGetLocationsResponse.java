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

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"sdd","cot","facType","street","city","state"})
    @XmlRootElement(name = "Location")
    public static class Location{
        @XmlElement(name = "SDD")
        private String sdd;
        @XmlElement(name = "COT")
        private String cot;
        @XmlElement(name = "FacType")
        private String facType;
        @XmlElement(name = "Street")
        private String street;
        @XmlElement(name = "City")
        private String city;
        @XmlElement(name = "State")
        private String state;
        @XmlElement(name = "ZIP")
        private String zip;
        @XmlElement(name = "IsGuaranteed")
        private String isGuaranteed;

        public String getSdd() {
            return sdd;
        }

        public String getCot() {
            return cot;
        }

        public String getFacType() {
            return facType;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getZip() {
            return zip;
        }

        public String getIsGuaranteed() {
            return isGuaranteed;
        }

        public void setSdd(String sdd) {
            this.sdd = sdd;
        }

        public void setCot(String cot) {
            this.cot = cot;
        }

        public void setFacType(String facType) {
            this.facType = facType;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public void setIsGuaranteed(String isGuaranteed) {
            isGuaranteed = isGuaranteed;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"mailClass","commitmentName","commitmentTime","commitmentSeq","location"})
    @XmlRootElement(name = "Commitment")
    public static class Commitment{
        @XmlElement(name = "MailClass")
        private Integer mailClass;
        @XmlElement(name = "CommitmentName")
        private String commitmentName;
        @XmlElement(name = "CommitmentTime")
        private String commitmentTime;
        @XmlElement(name = "CommitmentSeq")
        private String commitmentSeq;
        @XmlElement(name = "Location")
        private Location location;

        public Integer getMailClass() {
            return mailClass;
        }

        public String getCommitmentName() {
            return commitmentName;
        }

        public String getCommitmentTime() {
            return commitmentTime;
        }

        public String getCommitmentSeq() {
            return commitmentSeq;
        }

        public Location getLocation() {
            return location;
        }

        public void setMailClass(Integer mailClass) {
            this.mailClass = mailClass;
        }

        public void setCommitmentName(String commitmentName) {
            this.commitmentName = commitmentName;
        }

        public void setCommitmentTime(String commitmentTime) {
            this.commitmentTime = commitmentTime;
        }

        public void setCommitmentSeq(String commitmentSeq) {
            this.commitmentSeq = commitmentSeq;
        }

        public void setLocation(Location location) {
            this.location = location;
        }
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"ead","commitments"})
    @XmlRootElement(name = "Commitment")
    public static class Expedited{
        @XmlElement(name = "EAD")
        private String ead;

        @XmlElements({@XmlElement(name = "Commitment", type = Commitment.class)})
        private List<Commitment> commitments;

        public String getEad() {
            return ead;
        }

        public List<Commitment> getCommitment() {
            return commitments;
        }

        public void setEad(String ead) {
            this.ead = ead;
        }

        public void setCommitment(List<Commitment> commitment) {
            this.commitments = commitment;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"mailClass","nonExpeditedDestType","svcStdDays","schedDlvryDate"})
    @XmlRootElement(name = "NonExpedited")
    public static class NonExpedited{
        @XmlElement(name = "MailClass")
        private Integer mailClass;
        @XmlElement(name = "NonExpeditedDestType")
        private Integer nonExpeditedDestType;
        @XmlElement(name = "SvcStdDays")
        private Integer svcStdDays;
        @XmlElement(name = "SchedDlvryDate")
        private String schedDlvryDate;

        public Integer getMailClass() {
            return mailClass;
        }

        public void setMailClass(Integer mailClass) {
            this.mailClass = mailClass;
        }

        public Integer getNonExpeditedDestType() {
            return nonExpeditedDestType;
        }

        public void setNonExpeditedDestType(Integer nonExpeditedDestType) {
            this.nonExpeditedDestType = nonExpeditedDestType;
        }

        public Integer getSvcStdDays() {
            return svcStdDays;
        }

        public void setSvcStdDays(Integer svcStdDays) {
            this.svcStdDays = svcStdDays;
        }

        public String getSchedDlvryDate() {
            return schedDlvryDate;
        }

        public void setSchedDlvryDate(String schedDlvryDate) {
            this.schedDlvryDate = schedDlvryDate;
        }
    }
}
