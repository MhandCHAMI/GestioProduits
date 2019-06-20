package com.cmconsulting.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class Operation {


    @Autowired
    public Addition addition;

    public int additionIncremente(int a, int b){
        return addition.add(a,b)+ 1;
    }
}
