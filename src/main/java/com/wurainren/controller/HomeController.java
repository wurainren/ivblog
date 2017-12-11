package com.wurainren.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ex-renwu on 2017/12/11.
 */
@RestController
public class HomeController {
    @RequestMapping(value = {"", "/home"}, method= RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/helloadmin", method=RequestMethod.GET)
    @PreAuthorize("hasAnyRole('admin')")
    public String helloAdmin(){
        return "helloAdmin";
    }

    @RequestMapping(value = "/hellouser", method=RequestMethod.GET)
    @PreAuthorize("hasAnyRole('admin', 'tourists')")
    public String helloUser(){
        return "helloUser";
    }

    @RequestMapping(value = "/login", method=RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping("/403")
    public String forbidden(){
        return "403";
    }

}
