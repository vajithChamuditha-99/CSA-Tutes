/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5client;


import server.Exception_Exception;
import server.TemperatureSample;
/**
 *
 * @author hp
 */
public class Tutorial5Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tutorial5Client client=new Tutorial5Client();
        client.execute();
       
    }

    private static String hello(java.lang.String name) {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.hello(name);
    }

    private static Boolean isConnected() {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.isConnected();
    }
    
    private void execute() {
        System.out.println("[CLIENT] - Starting Test");
        if(isConnected()){
            System.out.println("[CLIENT] - Server is connected, Continue the test");
        }else{
            System.out.println("[CLIENT] - Server not Connected, Test Failed...");
        }
        
        System.out.println("[CLIENT] - Test Completed!");
        TemperatureSample s=new TemperatureSample();
        s.setValue(1.0);
        try{
            addSample(s);
        } catch (Exception_Exception e){
            e.getmessege();
        }
        
    }

    private static Boolean addSample(server.TemperatureSample sample) throws Exception_Exception {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.addSample(sample);
    }

    private static TemperatureSample getMaximum() throws Exception_Exception {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.getMaximum();
    }

    private static Integer getNumberOfSamples() {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.getNumberOfSamples();
    }

    
    
}
