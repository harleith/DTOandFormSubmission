/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.Service;

import com.valensi.Entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Harry
 */

@Repository
@Transactional
public class CustomerService {
    
    @PersistenceContext
    EntityManager em;

    public List<Customer> findAll() {
        List<Customer> cust;
        cust = this.em.createNamedQuery("Customer.findAll").getResultList();
        return cust;
    }
    
    public Customer findById(Integer customerId) {
        return em.find(Customer.class, customerId);
    }
    
    public CustomerService() {
    }

    public CustomerService(EntityManager em) {
        this.em = em;
    }
    
    
}
