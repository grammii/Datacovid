/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client2;

import service.Coviddata2;

/**
 *
 * @author Gramm
 */
public class Client2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coviddata2 str = findbyear(2022);
        System.out.println(str);
    }

    private static Coviddata2 findbyear(int year) {
        service.NewWebService_Service service = new service.NewWebService_Service();
        service.NewWebService port = service.getNewWebServicePort();
        return port.findbyear(year);
    }
    
}
