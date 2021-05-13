package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Expedited", propOrder = {"ead","commitments"})
@XmlRootElement(name = "Expedited")
public class Expedited{
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