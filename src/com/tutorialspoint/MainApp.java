package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

      obj.getMessage();
 
      Employee emp1 = (Employee) context.getBean("employee");
      	emp1.setId(1);
      	emp1.setName("Anish");
      	emp1.getId();
      	emp1.getName();
      
      Employee emp2 = (Employee) context.getBean("employee");
      emp2.getId();
      emp2.getName();
      

      Employee emp3 = (Employee) context.getBean("employee");
      	emp3.setId(2);
    	emp3.setName("Aubrey");
    	emp3.getId();
    	emp3.getName();
   
   }
}