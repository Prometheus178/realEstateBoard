package com.customer.dao;

import com.customer.entities.Customer;

public interface CustomerDAO {

    void saveCustomerRequest(Customer customer);
    Customer getCustomerRequestByID(int idCustomer);
}
