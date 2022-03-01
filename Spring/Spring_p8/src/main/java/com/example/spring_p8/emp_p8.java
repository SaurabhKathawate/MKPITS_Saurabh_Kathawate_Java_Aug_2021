package com.example.spring_p8;

public class emp_p8 {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display(){
        System.out.println("Hello "+getId()+" "+getName());
    }
}
