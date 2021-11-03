package com.yscyber.ssm.service.impl;

import com.yscyber.ssm.pojo.MyObj;
import com.yscyber.ssm.repo.MyObjRepo;
import com.yscyber.ssm.service.MyObjService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyObjServiceImpl implements MyObjService {

    @Autowired
    private MyObjRepo myObjRepo;

    @Override
    public List<MyObj> listAllMyObjs() {
        return myObjRepo.listAllMyObjs();
    }

}