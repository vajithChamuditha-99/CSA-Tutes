/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial4client;

/**
 *
 * @author hp
 */
public class Tutorial4Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static String hello(java.lang.String name) {
        tutorial4client.TutorialFourWebService_Service service = new tutorial4client.TutorialFourWebService_Service();
        tutorial4client.TutorialFourWebService port = service.getTutorialFourWebServicePort();
        return port.hello(name);
    }

    private static Boolean isConnected() {
        tutorial4client.TutorialFourWebService_Service service = new tutorial4client.TutorialFourWebService_Service();
        tutorial4client.TutorialFourWebService port = service.getTutorialFourWebServicePort();
        return port.isConnected();
    }
    
    
}
