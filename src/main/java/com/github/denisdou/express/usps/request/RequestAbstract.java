package com.github.denisdou.express.usps.request;
import com.github.denisdou.express.ExpressException;
import com.github.denisdou.express.util.XmlUtil;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author 402550833@qq.com doujiajun
 */
public abstract class RequestAbstract<T> {
    @XmlTransient
    protected XmlUtil xmlUtil = new XmlUtil<>();

    public String toXml(Class<T> clazz) throws ExpressException {
        try {
            return xmlUtil.objectToXml(this, clazz);
        } catch (JAXBException e) {
            throw new ExpressException(e.getMessage());
        }
    }
}
