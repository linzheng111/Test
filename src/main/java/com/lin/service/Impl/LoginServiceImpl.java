package com.lin.service.Impl;

import com.lin.service.LoginService;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService(serviceName = "LoginService",//与接口指定name一致
            targetNamespace = "http://linzheng.io/",//与接口指定targetNamespace一致
            endpointInterface = "com.lin.service.LoginService" )//接口地址)
public class LoginServiceImpl implements LoginService {
    @Override
    public String userLogin() {


        return "hello"+"123";
    }
}
