package com.wolken.dependency_Injection.Home;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Home {
	public static void main( String[] args )
    {
      Resource resource=new ClassPathResource("rooms.xml");
     BeanFactory beanFactory=new XmlBeanFactory(resource); 
     Rooms eng=(Rooms) beanFactory.getBean("Rooms");
     eng.PrintName();
     Rooms carname=(Rooms) beanFactory.getBean("RoomsNumber");
     carname.PrintName();
     
    }
}
