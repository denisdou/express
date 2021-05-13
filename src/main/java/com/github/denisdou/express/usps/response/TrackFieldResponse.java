package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackFieldResponse", propOrder = { "trackInfo" })
@XmlRootElement(name = "TrackFieldResponse")
public class TrackFieldResponse {

    @XmlElement(name = "TrackInfo")
    private TrackInfo trackInfo;

    public void setTrackInfo(TrackInfo trackInfo) {
        this.trackInfo = trackInfo;
    }

    public TrackInfo getTrackInfo() {
        return trackInfo;
    }

    public String getTrackId() {
        return trackInfo.getId();
    }

    public String getExpectedDeliveryDate() {
        return trackInfo.getExpectedDeliveryDate();
    }

    public String getPredictedDeliveryDate() {
        return trackInfo.getPredictedDeliveryDate();
    }

    public String getStatus() {
        return trackInfo.getStatus();
    }

    public String getStatusCategory() {
        return trackInfo.getStatusCategory();
    }

    public String getStatusSummary() {
        return trackInfo.getStatusSummary();
    }

    public TrackDetail getTrackSummary() {
        return trackInfo.getTrackSummary();
    }

    public List<TrackDetail> getTrackDetailList() {
        return trackInfo.getTrackDetailList();
    }
}
