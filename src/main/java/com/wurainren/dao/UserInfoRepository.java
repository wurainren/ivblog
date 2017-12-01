package com.wurainren.dao;

import com.wurainren.po.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/11/20.
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    UserInfo findById(Long id);
    UserInfo findByUserName(String userName);
    UserInfo findByUserNameOrEmail(String username, String email);
}
