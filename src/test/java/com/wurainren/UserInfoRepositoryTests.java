package com.wurainren;

import com.wurainren.dao.UserInfoRepository;
import com.wurainren.po.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by ex-renwu on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoRepositoryTests {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        /*userInfoRepository.save(new UserInfo("C01","123456","C01@126.com","张三2",formattedDate,true));
        userInfoRepository.save(new UserInfo("C02","123456","C02@126.com","李四2",formattedDate,true));
        userInfoRepository.save(new UserInfo("C03","123456","C03@126.com","王五2",formattedDate,true));*/

        Assert.assertEquals(6, userInfoRepository.findAll().size());
        Assert.assertEquals("王五1", userInfoRepository.findByUserNameOrEmail("B03", "B03@126.com").getNickName());
        /*userInfoRepository.delete(userInfoRepository.findByUserName("B01"));*/
    }

}