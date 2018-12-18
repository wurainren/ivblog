package cc.wurainren.ivblog.web.user.controller;

import cc.wurainren.ivblog.core.util.ajax.R;
import cc.wurainren.ivblog.web.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService iUserService;

    @RequestMapping("/get")
    public R getUsers(){
        return R.ok().content(iUserService.queryAllUser());
    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("測試spring boot devtools 123");
        return "hello,world.......123";
    }
}
