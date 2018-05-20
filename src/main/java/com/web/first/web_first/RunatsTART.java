package com.web.first.web_first;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class RunatsTART {

    private final RepositoryEmpolyee repositoryEmpolyee;

    public RunatsTART(RepositoryEmpolyee repositoryEmpolyee) {
        this.repositoryEmpolyee = repositoryEmpolyee;
    }

    @PostConstruct
    public void inti(){
       // Employee employee= new Employee();
       // employee.setImie("Opa");
        //repositoryEmpolyee.save(employee);



    }


}

