package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2024-02-15T16:48:00.868+08:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IDMInterfaceHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IDMInterfaceHttpGet {

    /**
     * 获取法院用户信息数据
     */
    @WebMethod(operationName = "GetCourtMembers")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public java.lang.String getCourtMembers(
        @WebParam(partName = "ConditionJson", name = "ConditionJson", targetNamespace = "http://tempuri.org/")
        java.lang.String conditionJson
    );

    /**
     * 获取所有用户信息数据
     */
    @WebMethod(operationName = "GetMembers")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public java.lang.String getMembers(
        @WebParam(partName = "ConditionJson", name = "ConditionJson", targetNamespace = "http://tempuri.org/")
        java.lang.String conditionJson
    );

    /**
     * 修改用户密码（1：成功；0：失败）
     */
    @WebMethod(operationName = "ChangeUserPassword")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public java.lang.String changeUserPassword(
        @WebParam(partName = "jsonString", name = "jsonString", targetNamespace = "http://tempuri.org/")
        java.lang.String jsonString
    );

    /**
     * 获取部门信息
     */
    @WebMethod(operationName = "GetDepartments")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public java.lang.String getDepartments(
        @WebParam(partName = "ConditionJson", name = "ConditionJson", targetNamespace = "http://tempuri.org/")
        java.lang.String conditionJson
    );

    /**
     * test
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public java.lang.String test();
}
