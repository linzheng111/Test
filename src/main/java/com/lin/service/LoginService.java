package com.lin.service;

import javax.jws.WebService;
import java.util.Map;

@WebService(name = "LoginService",
            targetNamespace = "http://linzheng.io/")
public interface LoginService {
    public String userLogin();
}
