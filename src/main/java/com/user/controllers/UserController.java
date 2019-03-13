package com.user.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class UserController{

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationView(){
        return "security/registration";
    }


}
