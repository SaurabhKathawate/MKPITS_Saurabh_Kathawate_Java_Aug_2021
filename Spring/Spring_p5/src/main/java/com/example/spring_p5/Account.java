package com.example.spring_p5;

public class Account {
    emp_p5 eob;

    public emp_p5 getEob() {
        return eob;
    }

    public void setEob(emp_p5 eob) {
        this.eob = eob;
    }

    void trans()
    {
        System.out.println(eob.getName()+" transaction process by id "+eob.getId()+" Successfully");
    }
}
