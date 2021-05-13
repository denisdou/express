package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackResponse", propOrder = { "trackInfo" })
@XmlRootElement(name = "TrackResponse")
public class TrackResponse {

    @XmlElement(name = "TrackInfo")
    private TrackInfo trackInfo;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "TrackInfo", propOrder = { "trackSummary","trackDetail" })
    @XmlRootElement(name = "TrackInfo")
    public static class TrackInfo {
        @XmlElement(name = "TrackSummary")
        private String trackSummary;

        @XmlElements({@XmlElement(name = "TrackDetail", type = String.class)})
        private List<String> trackDetail;

        public String getTrackSummary() {
            return trackSummary;
        }

        public void setTrackSummary(String trackSummary) {
            this.trackSummary = trackSummary;
        }

        public List<String> getTrackDetail() {
            return trackDetail;
        }

        public void setTrackDetail(List<String> trackDetail) {
            this.trackDetail = trackDetail;
        }
    }

    public TrackInfo getTrackInfo() {
        return trackInfo;
    }

    public void setTrackInfo(TrackInfo trackInfo) {
        this.trackInfo = trackInfo;
    }
}
