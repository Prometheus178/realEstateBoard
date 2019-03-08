package com.customer.services;

import com.customer.dao.CustomerDAO;
import com.customer.entities.Customer;
import com.customer.services.email.Postman;
import com.house.entities.HouseInNewComplex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    @Transactional
    public void saveCustomerRequest(Customer customer) {
        customerDAO.saveCustomerRequest(customer);
    }

    @Transactional
    public Customer getCustomerRequestByID(int idCustomer) {
        return customerDAO.getCustomerRequestByID(idCustomer);
    }

    @Override
    public void sendEmail(Customer customer, HouseInNewComplex houseInNewComplex) {
        Postman postman = new Postman("sergeipopof178@Gmail.com", "Sirius178!");
        postman.send("Заявка",customer,houseInNewComplex,"sergeipopof178@Gmail.com", "Apkax@bk.ru");

    }
}
