package com.example.wslab;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.Test;


class WebServiceProxyTest {


    @Test
    public void test() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx");
        jaxWsProxyFactoryBean.setServiceClass(IqqOnlineWebService.class);
        IqqOnlineWebService ws = (IqqOnlineWebService) jaxWsProxyFactoryBean.create();
        String result = ws.qqCheckOnline("");
        System.out.println("result = " + result);
    }
}