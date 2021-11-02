package com.wolken.dependency_Injection.Bus;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Bus {
	public static void main( String[] args )
    {
      Resource resource=new ClassPathResource("bus.xml");
     BeanFactory beanFactory=new XmlBeanFactory(resource); 
     Passager eng=(Passager) beanFactory.getBean("Passager");
     eng.PrintName();
     Passager busname=(Passager) beanFactory.getBean("Busname");
     busname.PrintName();
     
    }
}
