package com.wurainren.dao;

import com.wurainren.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ex-renwu on 2017/12/11.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
}

