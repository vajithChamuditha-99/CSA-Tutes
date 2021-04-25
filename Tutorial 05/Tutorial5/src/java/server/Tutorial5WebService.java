/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hp
 */
@WebService(serviceName = "Tutorial5WebService")
public class Tutorial5WebService {
    
    ArrayList <TemperatureSample> samples = new ArrayList();

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
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() {
        System.out.println("[SERVER] - Testing Connection...");
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addSample")
    public Boolean addSample(@WebParam(name = "sample") server.TemperatureSample sample) throws Exception {
        if(sample == null){
            throw new Exception();
        }
        System.out.println("[SERVER] - addSample ( " +sample+ " ) to "+samples);
        samples.add(sample);
        System.out.println("[SERVER] - Now Samples are " + samples);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNumberOfSamples")
    public Integer getNumberOfSamples() {
        System.out.println("[SERVER] - getNumberOfSamples()");
        return samples.size();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMaximum")
    public TemperatureSample getMaximum() throws Exception {
        if (samples.isEmpty()){
            throw new Exception();
        }
        TemperatureSample max=new TemperatureSample();
        for (int i=0;i<samples.size();i++){
            if(samples.get(i).getValue()>max.getValue()){
                max=samples.get(i);
            }
        }
        return max;
    }
}
