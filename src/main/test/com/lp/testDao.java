package com.lp;

import com.lp.dao.UserDaoInterface;
import com.lp.entity.Student;
import com.lp.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDao {
    @Test
    public void testLogin(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");
        UserDaoInterface userDaoInterface = (UserDaoInterface) applicationContext.getBean("userDaoInterface");
        String username = "刘鹏";
        String password = "1234";
        Student user = userDaoInterface.findStudentByStudentId("161003530107");
        System.out.println(user);
    }

}
