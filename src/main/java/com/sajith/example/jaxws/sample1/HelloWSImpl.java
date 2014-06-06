package com.sajith.example.jaxws.sample1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface = "com.sajith.example.jaxws.sample1.HelloWS")
public class HelloWSImpl implements HelloWS{
    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name="guestname") String guestname){

        if(guestname==null){
            return "Hello";
        }
        return "Hello "+ guestname;

    }
}
