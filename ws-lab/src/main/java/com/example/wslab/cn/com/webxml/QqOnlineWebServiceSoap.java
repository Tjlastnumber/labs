package cn.com.webxml;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2024-02-15T16:48:00.946+08:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://WebXml.com.cn/", name = "qqOnlineWebServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface QqOnlineWebServiceSoap {

    /**
     * <br /><h3>获得腾讯QQ在线状态</h3><p>输入参数：QQ号码 String，默认QQ号码：8698053。返回数据：String，Y = 在线；N = 离线；E = QQ号码错误；A = 商业用户验证失败；V = 免费用户超过数量</p><br />
     */
    @WebMethod(action = "http://WebXml.com.cn/qqCheckOnline")
    @RequestWrapper(localName = "qqCheckOnline", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.QqCheckOnline")
    @ResponseWrapper(localName = "qqCheckOnlineResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.QqCheckOnlineResponse")
    @WebResult(name = "qqCheckOnlineResult", targetNamespace = "http://WebXml.com.cn/")
    public java.lang.String qqCheckOnline(
        @WebParam(name = "qqCode", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String qqCode
    );
}
