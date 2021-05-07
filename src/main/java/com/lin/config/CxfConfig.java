package com.lin.config;

import com.lin.service.Impl.LoginServiceImpl;
import com.lin.service.LoginService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;


@Configuration
public class CxfConfig {
    @Bean
    public ServletRegistrationBean servletRegistrationBean2(){
        return new ServletRegistrationBean(new CXFServlet(),"/webservice/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(){
        return new SpringBus();
    }

    @Bean
    public LoginService loginService(){
        return new LoginServiceImpl();
    }
    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint=new EndpointImpl(springBus(),loginService());
        endpoint.publish("/api");
        return endpoint;
    }
}
