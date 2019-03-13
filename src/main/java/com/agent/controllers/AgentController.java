package com.agent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AgentController {
    @RequestMapping(value = "/about" , method = RequestMethod.GET)
    public String aboutPage(){
        return "about";
    }
}
