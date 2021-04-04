/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserver_server_1;

/**
 *
 * @author hp
 */
public class ClientServer_Server_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClientServer_Server_1 client=new ClientServer_Server_1();
        client.execute();
    }
    
    public void execute(){
        System.out.println("[CLIENT] - Starting test...");
        System.out.println("[CLIENT] - Tesr Completed");
    }

    private static Boolean isConnected() {
        ClientServer_Server_1.SimpleWebService_Service service = new ClientServer_Server_1.SimpleWebService_Service();
        ClientServer_Server_1.SimpleWebService port = service.getSimpleWebServicePort();
        return port.isConnected();
    }
    
    
}
