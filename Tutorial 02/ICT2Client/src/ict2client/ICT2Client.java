/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict2client;

import server.Exception_Exception;

/**
 *
 * @author hp
 */
public class ICT2Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICT2Client client=new ICT2Client();
        client.execute();
    }

    private static String safeShortestString(java.lang.String s1, java.lang.String s2) throws Exception_Exception {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.safeShortestString(s1, s2);
    }

    private static String shortestString(java.lang.String s1, java.lang.String s2) {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.shortestString(s1, s2);
    }

    private static Double testConnection() {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.testConnection();
    }

    private void execute(){
        if(){
            
        }
    }
    
}
