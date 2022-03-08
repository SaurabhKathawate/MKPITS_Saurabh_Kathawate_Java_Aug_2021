package com.example.spring_jdbc_p23.dao;

import com.example.spring_jdbc_p23.stud;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class studDaoImpl implements studDao{
    JdbcTemplate template;
    @Override
    public void insert(stud sob) {
        String query="INSERT INTO student(id,name,address) VALUES(?,?,?);";
        int status = template.update(query,sob.getId(),sob.getName(),sob.getAddress());
        System.out.println("Record Inserted "+status);
    }

    @Override
    public void display(int id) {

    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
