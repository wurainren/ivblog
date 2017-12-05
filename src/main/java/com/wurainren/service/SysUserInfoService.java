package com.wurainren.service;

import com.wurainren.dao.SysUserInfoDao;
import com.wurainren.po.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    public SysUser getUserInfo(String  userName){
        SysUser sysUserInfo = sysUserInfoDao.findByUsername(userName);
        return sysUserInfo;
    }

    public boolean hasUser(SysUser user){
        boolean flag = false;
       if(!StringUtils.isEmpty(user)){
           SysUser sysUserInfo = sysUserInfoDao.findByUsername(user.getUsername());
           if(sysUserInfo.getUid()!=0){
               flag = true;
           }
       }
        return flag;
    }
}
