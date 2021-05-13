package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commitment", propOrder = {"mailClass","commitmentName","commitmentTime","commitmentSeq","location"})
@XmlRootElement(name = "Commitment")
public class Commitment{
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
