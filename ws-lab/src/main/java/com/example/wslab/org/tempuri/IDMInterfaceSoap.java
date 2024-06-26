package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2024-02-15T16:48:00.892+08:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IDMInterfaceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface IDMInterfaceSoap {

    /**
     * 获取法院用户信息数据
     */
    @WebMethod(operationName = "GetCourtMembers", action = "http://tempuri.org/GetCourtMembers")
    @RequestWrapper(localName = "GetCourtMembers", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCourtMembers")
    @ResponseWrapper(localName = "GetCourtMembersResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCourtMembersResponse")
    @WebResult(name = "GetCourtMembersResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String getCourtMembers(
        @WebParam(name = "ConditionJson", targetNamespace = "http://tempuri.org/")
        java.lang.String conditionJson
    );

    /**
     * 获取所有用户信息数据
     */
    @WebMethod(operationName = "GetMembers", action = "http://tempuri.org/GetMembers")
    @RequestWrapper(localName = "GetMembers", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMembers")
    @ResponseWrapper(localName = "GetMembersResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMembersResponse")
    @WebResult(name = "GetMembersResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String getMembers(
        @WebParam(name = "ConditionJson", targetNamespace = "http://tempuri.org/")
        java.lang.String conditionJson
    );

    /**
     * 修改用户密码（1：成功；0：失败）
     */
    @WebMethod(operationName = "ChangeUserPassword", action = "http://tempuri.org/ChangeUserPassword")
    @RequestWrapper(localName = "ChangeUserPassword", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ChangeUserPassword")
    @ResponseWrapper(localName = "ChangeUserPasswordResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ChangeUserPasswordResponse")
    @WebResult(name = "ChangeUserPasswordResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String changeUserPassword(
        @WebParam(name = "jsonString", targetNamespace = "http://tempuri.org/")
        java.lang.String jsonString
    );

    /**
     * 获取部门信息
     */
    @WebMethod(operationName = "GetDepartments", action = "http://tempuri.org/GetDepartments")
    @RequestWrapper(localName = "GetDepartments", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDepartments")
    @ResponseWrapper(localName = "GetDepartmentsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDepartmentsResponse")
    @WebResult(name = "GetDepartmentsResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String getDepartments(
        @WebParam(name = "ConditionJson", targetNamespace = "http://tempuri.org/")
        java.lang.String conditionJson
    );

    /**
     * test
     */
    @WebMethod(action = "http://tempuri.org/test")
    @RequestWrapper(localName = "test", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.TestResponse")
    @WebResult(name = "testResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String test();
}
