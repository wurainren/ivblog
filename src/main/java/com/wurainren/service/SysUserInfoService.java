package com.wurainren.service;

import com.wurainren.dao.SysUserInfoDao;
import com.wurainren.po.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ex-renwu on 2017/12/4.
 */
@Service
public class SysUserInfoService {
    @Autowired
    private SysUserInfoDao sysUserInfoDao;

    public SysUser getUserInfo(Long uid){
        SysUser sysUserInfo = sysUserInfoDao.findByUid(uid);
        return sysUserInfo;
    }
}
