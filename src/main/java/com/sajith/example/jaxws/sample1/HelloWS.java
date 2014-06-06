package com.sajith.example.jaxws.sample1;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWS {
    public String sayHello(@WebParam(name = "guestname") String guestname);

}
