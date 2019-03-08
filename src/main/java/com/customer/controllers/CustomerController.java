package com.customer.controllers;

import com.customer.entities.Customer;
import com.customer.services.CustomerService;
import com.house.entities.HouseInNewComplex;
import com.house.services.HouseInNewComplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    CustomerService service;
    @Qualifier("houseInNewComplexServiceImpl")
    @Autowired
    HouseInNewComplexService houseService;

    @RequestMapping(value = "/customer/{idHouse}", method = RequestMethod.GET)
    public ModelAndView customerPage(@PathVariable("idHouse") int idHouse) {
        ModelAndView modelAndView = new ModelAndView("request");
        modelAndView.addObject("idHouse", idHouse);
        return modelAndView;
    }

    @RequestMapping(value = "/customerRequest/{idHouse}", method = RequestMethod.POST)
    public ModelAndView customerRequest(@PathVariable("idHouse") int idHouse,
                                        @RequestParam(value = "name") String name,
                                        @RequestParam(value = "phoneNumber") String phoneNumber,
                                        @RequestParam(value = "email") String email,
                                        @RequestParam(value = "comment") String comment,
                                        @RequestParam(value = "mortgage") boolean mortgage,
                                        @RequestParam(value = "agreeToDataProcessing") boolean agreeToDataProcessing,
                                        Customer customer) {
        ModelAndView modelAndView = new ModelAndView("request");

        HouseInNewComplex houseInNewComplex = houseService.getHouseByID(idHouse);

        try {
            customer.setName(name);
            customer.setPhoneNumber(phoneNumber);
            customer.setEmail(email);
            customer.setComment(comment);
            customer.setMortgage(mortgage);
            customer.setAgreeToDataProcessing(agreeToDataProcessing);
            customer.setIdHouse(idHouse);
            service.saveCustomerRequest(customer);
            service.sendEmail(customer, houseInNewComplex);

            modelAndView.addObject("messageForCustomerOk",customer.getName());
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return modelAndView;
    }
}
