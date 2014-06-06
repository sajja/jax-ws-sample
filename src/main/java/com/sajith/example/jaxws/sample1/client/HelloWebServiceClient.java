package com.sajith.example.jaxws.sample1.client;


import com.sajith.example.jaxws.sample1.HelloWS;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by sajith on 6/6/14.
 */
public class HelloWebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/jax-ws-sample/helloWebService?wsdl");
        QName qname = new QName("http://sample1.jaxws.example.sajith.com/", "HelloWSImplService");
        Service service = Service.create(url, qname);
        HelloWS hello = service.getPort(HelloWS.class);
        System.out.println(hello.sayHello("fff"));
    }
}
