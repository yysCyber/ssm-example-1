package com.yscyber.ssm.api;

import com.yscyber.ssm.pojo.MyObj;
import com.yscyber.ssm.service.MyObjService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyObjApi {

    @Autowired
    private MyObjService myObjService;

    @GetMapping("/obj/all")
    public List<MyObj> listAllMyObjsApi() {
        return myObjService.listAllMyObjs();
    }

}
