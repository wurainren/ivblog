package com.wurainren.dao;

import com.wurainren.po.SysUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ex-renwu on 2017/12/4.
 */
public interface SysUserInfoDao extends JpaRepository<SysUserInfo,Long> {
     public SysUserInfo findByUid(Long uid);
}
