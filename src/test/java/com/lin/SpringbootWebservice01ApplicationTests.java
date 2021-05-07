package com.lin;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootWebservice01ApplicationTests {

    @Test
    void contextLoads() {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/webservice/api?wsdl");
        // 需要密码的情况需要加上用户名和密码
        //client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        Object[] objects=null;
        // invoke("方法名",参数1,参数2,参数3....);
        try {
            objects = client.invoke("userLogin");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(objects[0]);
    }

}
