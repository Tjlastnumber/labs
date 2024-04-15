package com.example.wslab;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;


@WebService(targetNamespace = "http://WebXml.com.cn/", name = "qqOnlineWebServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface IqqOnlineWebService {

    @WebMethod(action = "http://WebXml.com.cn/qqCheckOnline")
    @WebResult(name = "qqCheckOnlineResult", targetNamespace = "http://WebXml.com.cn/")
    java.lang.String qqCheckOnline(
            @WebParam(name = "qqCode", targetNamespace = "http://WebXml.com.cn/")
            java.lang.String qqCode
    );
}