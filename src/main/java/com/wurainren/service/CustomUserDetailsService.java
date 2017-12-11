package com.wurainren.service;

import com.wurainren.dao.UserRepository;
import com.wurainren.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ex-renwu on 2017/12/11.
 */
public class CustomUserDetailsService implements UserDetailsService {
        @Autowired
        UserRepository userRepository;

        @Override
        public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
            User user = userRepository.findByUserName(userName);
            if(user == null){
                throw new UsernameNotFoundException("not found");
            }
            List<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(user.getRole().name()));
            System.err.println("username is " + userName + ", " + user.getRole().name());
            return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassWord(), authorities);
        }
}
