package com.wurainren.dao;

import com.wurainren.po.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ex-renwu on 2017/12/4.
 */
public interface SysUserInfoDao extends JpaRepository<SysUser,Long> {
     SysUser findByUid(Long uid);
     SysUser findByUsername(String userName);

}
