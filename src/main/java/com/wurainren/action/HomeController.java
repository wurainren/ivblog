package com.wurainren.action;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ex-renwu on 2017/12/4.
 */
@Slf4j
@RestController
public class HomeController {
    @RequestMapping({"/","/index"})
    public String index(){
        return"/index";
    }

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String login(){
        return"login";
    }

    @RequestMapping(value="/queryUserInfo",method= RequestMethod.GET)
    public String userInfo(){
        return"userInfo";
    }

}
