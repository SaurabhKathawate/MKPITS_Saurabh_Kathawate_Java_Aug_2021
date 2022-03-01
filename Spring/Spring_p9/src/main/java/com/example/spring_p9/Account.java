package com.example.spring_p9;

public class Account {
    emp_p9 eob;

    public emp_p9 getEob() {
        return eob;
    }

    public void setEob(emp_p9 eob) {
        this.eob = eob;
    }

    void trans()
    {
        System.out.println(eob.getName()+" transaction process by id "+eob.getId()+" Successfully");
    }
}
