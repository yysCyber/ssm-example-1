package com.yscyber.ssm.web.test;

import com.yscyber.ssm.pojo.MyObj;
import com.yscyber.ssm.repo.MyObjRepo;
import com.yscyber.ssm.service.MyObjService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyTest {

    @Autowired
    private MyObjService myObjService;

    @Autowired
    private MyObjRepo myObjRepo;

    @Test
    public void test1() {
        List<MyObj> myObjList = myObjRepo.listAllMyObjs();
        for (MyObj obj : myObjList) {
            System.out.println(obj);
        }
    }

}