package com.example.spring_jdbc_p24.dao;

import com.example.spring_jdbc_p24.stud;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class studDaoImpl implements studDao{
    JdbcTemplate template;
    @Override
    public void insert(stud sob) {
        String query="INSERT INTO student(id,name,address) VALUES(?,?,?);";
        int status = this.template.update(query,sob.getId(),sob.getName(),sob.getAddress());
        System.out.println("Record Inserted "+status);
    }

//    @Override
//    public void displaybyid(int id) {
//        String query="select name from student where id=?";
//        String s = this.template.queryForObject(query, new Object[]{id}, String.class);
//        System.out.println(s);
//    }

    @Override
    public void displaybyid(int id) {
        String query="select * from student where id=?";
        stud sob = (stud) this.template.queryForObject(query, new Object[]{id},new RowDemo());
        System.out.println(sob.toString());
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    class RowDemo implements RowMapper <stud>{
        @Override
        public stud mapRow(ResultSet rs, int rowNum) throws SQLException {
            return null;
        }
    }

}
