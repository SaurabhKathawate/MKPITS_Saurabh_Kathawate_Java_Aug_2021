package com.example.spring_p5;

public class emp_p5 {
    int id;
    String name;

    public emp_p5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public emp_p5(int id) {
        this.id = id;
    }

    public emp_p5(String name) {
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
