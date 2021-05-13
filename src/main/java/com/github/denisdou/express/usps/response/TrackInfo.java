package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackFieldInfo", propOrder = {"id","expectedDeliveryDate","predictedDeliveryDate","status","statusCategory","statusSummary","trackSummary","trackDetailList"})
public class TrackInfo {
    @XmlAttribute(name = "ID")
    private String id;

    @XmlElement(name = "ExpectedDeliveryDate")
    private String expectedDeliveryDate;

    @XmlElement(name = "PredictedDeliveryDate")
    private String predictedDeliveryDate;

    @XmlElement(name = "Status")
    private String status;

    @XmlElement(name = "StatusCategory")
    private String statusCategory;

    @XmlElement(name = "StatusSummary")
    private String statusSummary;

    @XmlElement(name = "TrackSummary")
    private TrackDetail trackSummary;

    @XmlElements({ @XmlElement(name = "TrackDetail", type = TrackDetail.class)})
    private List<TrackDetail> trackDetailList;

    public String getId() {
        return id;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public String getPredictedDeliveryDate() {
        return predictedDeliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public String getStatusCategory() {
        return statusCategory;
    }

    public String getStatusSummary() {
        return statusSummary;
    }

    public TrackDetail getTrackSummary() {
        return trackSummary;
    }

    public List<TrackDetail> getTrackDetailList() {
        return trackDetailList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public void setPredictedDeliveryDate(String predictedDeliveryDate) {
        this.predictedDeliveryDate = predictedDeliveryDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusCategory(String statusCategory) {
        this.statusCategory = statusCategory;
    }

    public void setStatusSummary(String statusSummary) {
        this.statusSummary = statusSummary;
    }

    public void setTrackDetailList(List<TrackDetail> trackDetailList) {
        this.trackDetailList = trackDetailList;
    }

    public void setTrackSummary(TrackDetail trackSummary) {
        this.trackSummary = trackSummary;
    }
}
