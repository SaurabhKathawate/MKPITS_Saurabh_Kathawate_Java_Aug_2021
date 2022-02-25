package com.example.spring_p4;

public class Account {
    emp_p4 eob;

    public emp_p4 getEob() {
        return eob;
    }

    public void setEob(emp_p4 eob) {
        this.eob = eob;
    }

    void trans()
    {
        System.out.println(eob.getName()+" transaction process by id "+eob.getId()+" Successfully");
    }
}
