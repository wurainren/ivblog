package com.wurainren;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ex-renwu on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserInfoRepositoryTests {

  /*  @Autowired
    private UserInfoRepository userInfoRepository;*/

    @Test
    public void test() throws Exception {
     /*   Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        *//*userInfoRepository.save(new UserInfo("D01","123456","D01@126.com","张三3",formattedDate,true));
        userInfoRepository.save(new UserInfo("D02","123456","D02@126.com","李四3",formattedDate,true));
        userInfoRepository.save(new UserInfo("D03","123456","D03@126.com","王五3",formattedDate,true));*//*

        Assert.assertEquals(6, userInfoRepository.findAll().size());
        Assert.assertEquals("王五2", userInfoRepository.findByUserNameOrEmail("C03", "C03@126.com").getNickName());
        *//*userInfoRepository.delete(userInfoRepository.findByUserName("B01"));*/
    }

}