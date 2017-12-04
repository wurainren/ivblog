package com.wurainren.action;

import com.wurainren.po.SysUserInfo;
import com.wurainren.service.SysUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/20.
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private SysUserInfoService sysUserInfoService;

    @RequestMapping(value = "/get",method = RequestMethod.GET )
    public SysUserInfo getUserInfo(@RequestParam("id") Long id) throws Exception{
        log.info("============getUserInfo=============");
        return  sysUserInfoService.getUserInfo(id);
    }
}
