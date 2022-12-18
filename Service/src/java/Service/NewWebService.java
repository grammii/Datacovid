/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Gramm
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("ServicePU");
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Findbyear")
    public Coviddata2 Findbyear(@WebParam(name = "year") int year) {
        EntityManager em = emf.createEntityManager();
        Coviddata2 cov = em.find(Coviddata2.class, year);
        return cov;
    }
}
