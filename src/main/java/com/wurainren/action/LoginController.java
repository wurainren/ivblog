package com.wurainren.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ex-renwu on 2017/12/5.
 */
@RestController
public class LoginController {
    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String login(){
        return"login";
    }
    @RequestMapping({"/","/index"})
    public String index(){
        return"/index";
    }

}
