package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonExpedited", propOrder = {"mailClass","nonExpeditedDestType","svcStdDays","schedDlvryDate"})
@XmlRootElement(name = "NonExpedited")
public class NonExpedited{
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
