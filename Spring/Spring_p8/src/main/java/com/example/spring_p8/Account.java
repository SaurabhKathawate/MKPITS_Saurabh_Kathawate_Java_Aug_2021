package com.example.spring_p8;

public class Account {
    emp_p8 eob;

    public emp_p8 getEob() {
        return eob;
    }

    public Account(emp_p8 eob) {
        this.eob = eob;
    }

    void trans()
    {
        System.out.println(eob.getName()+" transaction process by id "+eob.getId()+" Successfully");
    }
}
