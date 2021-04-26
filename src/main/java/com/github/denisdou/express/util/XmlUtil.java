package com.github.denisdou.express.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.StringWriter;

/**
 * @author 402550833@qq.com doujiajun
 */
public class XmlUtil<T> {
    public String objectToXml(T data, Class<T> clazz) throws JAXBException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(data, stringWriter);
            return stringWriter.toString();
        } catch(PropertyException propertyException) {
            throw new PropertyException("Unable to convert to XML string." + propertyException.getMessage());
        } catch(JAXBException jaxbException) {
            throw new JAXBException("Unable to convert to XML string." + jaxbException.getMessage());
        }
    }
}
