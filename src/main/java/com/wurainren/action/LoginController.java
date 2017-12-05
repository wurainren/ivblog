package com.wurainren.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ex-renwu on 2017/12/5.
 */
@RestController
public class LoginController {
    @RequestMapping(value="/login",method= RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.addObject("message","Welcome to Spring Boot & Thymeleaf");
        return modelAndView ;
    }
    @RequestMapping({"/","/index"})
    public String index(){
        return"/index";
    }

}
