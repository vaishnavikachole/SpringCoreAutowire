package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
        Employee employee = context.getBean("emp",Employee.class);
        System.out.println(employee);
     
        Employee employee1 = context.getBean("emp1",Employee.class);
        System.out.println(employee1);
     
        Employee employee2 = context.getBean("emp2",Employee.class);
        System.out.println(employee2);
     
    }
}
