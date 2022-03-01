package com.example.spring_p11;

public class emp_p11 {
    int id;
    String name;

    public emp_p11(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public emp_p11(int id) {
        this.id = id;
    }

    public emp_p11(String name) {
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

    @Override
    public String toString() {
        return "emp_p11{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
