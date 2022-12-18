/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import Model.Datacovid;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gramm
 */
@WebService(serviceName = "WebService")
public class WebService {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("ServerPU");
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Findbyear")
    public Datacovid Findbyear(@WebParam(name = "year") int year) {
        EntityManager em = emf.createEntityManager();
        Datacovid cov = em.find(Datacovid.class, year);
        return cov;
    }

    /**
     * This is a sample web service operation
     */

}
