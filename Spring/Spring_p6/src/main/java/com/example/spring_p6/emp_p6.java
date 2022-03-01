package com.example.spring_p6;

public class emp_p6 {
    int id;
    String name;

    public emp_p6(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public emp_p6(int id) {
        this.id = id;
    }

    public emp_p6(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    void display(){
        System.out.println("Hello "+getId()+" "+getName());
    }
}
