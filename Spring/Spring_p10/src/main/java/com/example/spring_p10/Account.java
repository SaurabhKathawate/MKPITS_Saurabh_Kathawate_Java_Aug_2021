package com.example.spring_p10;

public class Account {
    emp_p10 eob;

    public emp_p10 getEob() {
        return eob;
    }

    public void setEob(emp_p10 eob) {
        this.eob = eob;
    }

    void trans()
    {
        System.out.println(eob.getName()+" transaction process by id "+eob.getId()+" Successfully");
    }
}
