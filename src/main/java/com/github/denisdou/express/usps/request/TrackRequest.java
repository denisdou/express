package com.github.denisdou.express.usps.request;

import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "trackId" })
@XmlRootElement(name = "TrackRequest")
public class TrackRequest extends RequestAbstract {
    @XmlAttribute(name = "USERID")
    String userId;
    @XmlElement(name = "TrackID")
    private TrackId trackId;

    @XmlRootElement(name = "TrackID")
    public static class TrackId {
        @XmlAttribute(name = "ID")
        String id;

        public TrackId(String id) {
            this.id = id;
        }
    }

    public TrackId getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = new TrackId(trackId);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
