package com.cafe24.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ContainerTest {

	public static void main(String[] args) {
		

	}
	
	public static void testBeanFactory() {
		
		BeanFactory bf =
				new XmlBeanFactory(new ClassPathResource("config/user/applicationContext.xml"));
	}

}
