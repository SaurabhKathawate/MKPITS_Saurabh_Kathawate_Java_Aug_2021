package com.example.spring_p16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Account {
    emp_p16 eob;

    public emp_p16 getEob() {
        return eob;
    }

    @Autowired
    @Qualifier("mybean")
    public void setEob(emp_p16 eob) {
        this.eob = eob;
    }

    void display(){
        System.out.println("Hello "+eob.getId()+" "+eob.getName()+" "+eob.getCity());
    }
}
