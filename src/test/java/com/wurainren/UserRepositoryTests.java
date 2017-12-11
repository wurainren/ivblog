package com.wurainren;

import com.wurainren.service.DataInit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ex-renwu on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    public DataInit dataInit;

    @Test
    public void init(){
        dataInit.dataInit();
    }
}
