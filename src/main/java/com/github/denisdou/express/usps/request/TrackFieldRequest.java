package com.github.denisdou.express.usps.request;

import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "trackId","revision","clientIp","sourceId" })
@XmlRootElement(name = "TrackFieldRequest")
public class TrackFieldRequest extends RequestAbstract {
    @XmlElement(name = "TrackID")
    private TrackId trackId;

    public static class TrackId {
        @XmlAttribute(name = "ID")
        String id;

        public TrackId(String id) {
            this.id = id;
        }
    }

    @XmlAttribute(name = "USERID")
    private String userId;
    @XmlElement(name = "Revision")
    private int revision;
    @XmlElement(name = "ClientIp")
    private String clientIp;
    @XmlElement(name = "SourceId")
    private String sourceId;

    public TrackId getTrackId() {
        return trackId;
    }

    public String getUserId() {
        return userId;
    }

    public int getRevision() {
        return revision;
    }

    public String getClientIp() {
        return clientIp;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setTrackId(String trackId) {
        this.trackId = new TrackId(trackId);
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
}
