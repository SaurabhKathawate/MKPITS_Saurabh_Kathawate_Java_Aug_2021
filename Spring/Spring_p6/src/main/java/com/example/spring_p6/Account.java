package com.example.spring_p6;

public class Account {
    emp_p6 eob;            //object name should be match with bean name

    public emp_p6 getEob() {
        return eob;
    }

    public void setEob(emp_p6 eob) {
        this.eob = eob;
    }

    void trans()
    {
        System.out.println(eob.getName()+" transaction process by id "+eob.getId()+" Successfully");
    }
}
