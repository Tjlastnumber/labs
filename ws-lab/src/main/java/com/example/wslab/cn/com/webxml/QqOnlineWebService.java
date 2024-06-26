package cn.com.webxml;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> <strong>腾讯QQ在线状态 WEB 服务</strong>。<a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> 和/或其各供应商不为本页面提供信息的错误、残缺、延迟或因依靠此信息所采取的任何行动负责。</br>此腾讯QQ在线状态Web Services请不要用于任何商业目的，若有需要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>，欢迎技术交流。 QQ：8409035<br /><strong>使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持</strong>！<br /><br />&nbsp;
 *
 * This class was generated by Apache CXF 3.3.0
 * 2024-02-15T16:48:00.952+08:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "qqOnlineWebService",
                  wsdlLocation = "file:/Users/lastnumber/learn/Labs/ws-lab/src/main/resources/wsdl/qqWebService.wsdl",
                  targetNamespace = "http://WebXml.com.cn/")
public class QqOnlineWebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://WebXml.com.cn/", "qqOnlineWebService");
    public final static QName QqOnlineWebServiceSoap12 = new QName("http://WebXml.com.cn/", "qqOnlineWebServiceSoap12");
    public final static QName QqOnlineWebServiceSoap = new QName("http://WebXml.com.cn/", "qqOnlineWebServiceSoap");
    public final static QName QqOnlineWebServiceHttpGet = new QName("http://WebXml.com.cn/", "qqOnlineWebServiceHttpGet");
    public final static QName QqOnlineWebServiceHttpPost = new QName("http://WebXml.com.cn/", "qqOnlineWebServiceHttpPost");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/lastnumber/learn/Labs/ws-lab/src/main/resources/wsdl/qqWebService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(QqOnlineWebService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/lastnumber/learn/Labs/ws-lab/src/main/resources/wsdl/qqWebService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public QqOnlineWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QqOnlineWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QqOnlineWebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public QqOnlineWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public QqOnlineWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public QqOnlineWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns QqOnlineWebServiceSoap
     */
    @WebEndpoint(name = "qqOnlineWebServiceSoap12")
    public QqOnlineWebServiceSoap getQqOnlineWebServiceSoap12() {
        return super.getPort(QqOnlineWebServiceSoap12, QqOnlineWebServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QqOnlineWebServiceSoap
     */
    @WebEndpoint(name = "qqOnlineWebServiceSoap12")
    public QqOnlineWebServiceSoap getQqOnlineWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(QqOnlineWebServiceSoap12, QqOnlineWebServiceSoap.class, features);
    }


    /**
     *
     * @return
     *     returns QqOnlineWebServiceSoap
     */
    @WebEndpoint(name = "qqOnlineWebServiceSoap")
    public QqOnlineWebServiceSoap getQqOnlineWebServiceSoap() {
        return super.getPort(QqOnlineWebServiceSoap, QqOnlineWebServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QqOnlineWebServiceSoap
     */
    @WebEndpoint(name = "qqOnlineWebServiceSoap")
    public QqOnlineWebServiceSoap getQqOnlineWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(QqOnlineWebServiceSoap, QqOnlineWebServiceSoap.class, features);
    }


    /**
     *
     * @return
     *     returns QqOnlineWebServiceHttpGet
     */
    @WebEndpoint(name = "qqOnlineWebServiceHttpGet")
    public QqOnlineWebServiceHttpGet getQqOnlineWebServiceHttpGet() {
        return super.getPort(QqOnlineWebServiceHttpGet, QqOnlineWebServiceHttpGet.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QqOnlineWebServiceHttpGet
     */
    @WebEndpoint(name = "qqOnlineWebServiceHttpGet")
    public QqOnlineWebServiceHttpGet getQqOnlineWebServiceHttpGet(WebServiceFeature... features) {
        return super.getPort(QqOnlineWebServiceHttpGet, QqOnlineWebServiceHttpGet.class, features);
    }


    /**
     *
     * @return
     *     returns QqOnlineWebServiceHttpPost
     */
    @WebEndpoint(name = "qqOnlineWebServiceHttpPost")
    public QqOnlineWebServiceHttpPost getQqOnlineWebServiceHttpPost() {
        return super.getPort(QqOnlineWebServiceHttpPost, QqOnlineWebServiceHttpPost.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QqOnlineWebServiceHttpPost
     */
    @WebEndpoint(name = "qqOnlineWebServiceHttpPost")
    public QqOnlineWebServiceHttpPost getQqOnlineWebServiceHttpPost(WebServiceFeature... features) {
        return super.getPort(QqOnlineWebServiceHttpPost, QqOnlineWebServiceHttpPost.class, features);
    }

}
