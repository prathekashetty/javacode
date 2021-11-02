package com.wolken.dependency_Injection.Gallery;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Gallary {
	public static void main( String[] args )
    {
      Resource resource=new ClassPathResource("gallary.xml");
     BeanFactory beanFactory=new XmlBeanFactory(resource); 
     Phots Ph=(Phots) beanFactory.getBean("PhotsName");
     Ph.PrintName();
     Phots Phots=(Phots) beanFactory.getBean("PhotsDetails");
     Phots.PrintName();
     
    }
}
