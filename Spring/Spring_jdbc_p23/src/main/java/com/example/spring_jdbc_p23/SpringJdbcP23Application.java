package com.example.spring_jdbc_p23;

import com.example.spring_jdbc_p23.dao.studDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcP23Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("bean.xml");

//        try{
//            DriverManagerDataSource source1 = appcont.getBean("datasource1", DriverManagerDataSource.class);
//            Connection con = source1.getConnection();
//            System.out.println("Connection Established");
//        }catch (Exception e){System.out.println(e);}

        studDaoImpl template = appcont.getBean("stDao", studDaoImpl.class);
        stud ob=new stud();
        ob.setId(15);
        ob.setName("SK");
        ob.setAddress("Ind");
        template.insert(ob);
    }
}
