package com.wurainren.service;

import com.wurainren.dao.UserRepository;
import com.wurainren.dto.RoleType;
import com.wurainren.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by ex-renwu on 2017/12/11.
 */
@Service
public class DataInit {

    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void dataInit(){
        User admin = new User();
        admin.setUserName("admin");
        admin.setPassWord("123456");
        admin.setRole(RoleType.Admin);
        userRepository.save(admin);

        User user = new User();
        user.setUserName("tourists");
        user.setPassWord("123456");
        user.setRole(RoleType.Tourists);
        userRepository.save(user);
    }

}