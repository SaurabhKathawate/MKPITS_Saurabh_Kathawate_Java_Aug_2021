package com.example.spring_p9;

public class emp_p9 {
    int id;
    String name;

    public emp_p9(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public emp_p9(int id) {
        this.id = id;
    }

    public emp_p9(String name) {
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
        return "emp_p9{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
