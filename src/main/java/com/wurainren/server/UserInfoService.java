package com.wurainren.server;

import com.wurainren.dao.UserInfoRepository;
import com.wurainren.po.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/20.
 */
@Slf4j
@Service
public class UserInfoService {
    @Autowired
    private UserInfoRepository dao;

    public UserInfo getUserInfo(Long id) throws  Exception{
        UserInfo userInfo = dao.findById(id);
        log.info("用户姓名："+userInfo.getUsername());
        return userInfo;
    }

}
