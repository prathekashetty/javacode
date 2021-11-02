package com.wolken.dependency_Injection.Car;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Car {
	public static void main( String[] args )
    {
      Resource resource=new ClassPathResource("car.xml");
     BeanFactory beanFactory=new XmlBeanFactory(resource); 
     Engine eng=(Engine) beanFactory.getBean("Engine");
     eng.PrintName();
     Engine carname=(Engine) beanFactory.getBean("Carname");
     carname.PrintName();
     
    }

}
