package com.example.spring_p7;

public class Account {
    emp_p7 eob;

    public emp_p7 getEob() {
        return eob;
    }

    public void setEob(emp_p7 eob) {
        this.eob = eob;
    }

    void trans(){
        System.out.println(eob.getName()+" transaction process by id "+eob.getId()+" Successfully");
    }
}
