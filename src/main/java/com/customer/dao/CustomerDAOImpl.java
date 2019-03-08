package com.customer.dao;

import com.customer.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionF) {
        this.sessionFactory = sessionF;
    }

    public void saveCustomerRequest(Customer customer){
        Session session = sessionFactory.getCurrentSession();
        session.save(customer);
    }

    @Override
    public Customer getCustomerRequestByID(int idCustomer) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = (Customer) session.load(Customer.class, new Integer(idCustomer));
        System.out.println(customer);
        return customer;
    }
}
