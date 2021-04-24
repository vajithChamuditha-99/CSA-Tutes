/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hp
 */
@WebService(serviceName = "ICT2WebService")
public class ICT2WebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "testConnection")
    public Double testConnection() {
        System.out.println("[SERVER] - Connected");
        return 1.0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "shortestString")
    public String shortestString(@WebParam(name = "s1") String s1, @WebParam(name = "s2") String s2) {
        String max=null;
        if(s1.length()>s2.length()){
            max=s1;
        }else{
            max=s2;
        }
        return max;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "safeShortestString")
    public String safeShortestString(@WebParam(name = "s1") String s1, @WebParam(name = "s2") String s2) throws Exception {
        //TODO write your implementation code here:
       
        String max=null;
        if(s1.length()>s2.length()){
            max=s1;
        }else{
            max=s2;
        }
        return max;
    }
    
    
}
