package com.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityController.class);

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String mainPage() {

        return "content/user";

    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage() {

        return "content/admin";

    }
    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public ModelAndView authorizationView(@RequestParam(value = "error", required = false) String error){
        ModelAndView modelAndView = new ModelAndView("security/login");
        if (error != null ){
            modelAndView.addObject("error","Invalid password or login");
        }
        return modelAndView;
    }

}
