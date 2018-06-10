package com.di.test;

import com.di.beans.Division;
import com.di.beans.Students;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		Students students=null;
		Division division,division2=null;
		BeanFactory beanFactory=null;
		
		beanFactory= new XmlBeanFactory(new ClassPathResource("com\\di\\common\\application-context.xml"));
		students=beanFactory.getBean("student1", Students.class);
		
		System.out.println(students);
		
		division=beanFactory.getBean("division", Division.class);
		
		System.out.println(division);
		
		System.out.println(division.getRanks().getClass().getName());
		System.out.println(division.getStudentsInDivision().getClass().getName());
		System.out.println(division.getStus().getClass().getName());
		System.out.println(division.getSubjects().getClass().getName());
		
		division2=beanFactory.getBean("Div2", Division.class);
		
		System.out.println(division2.getSubjects());
		System.out.println(division2.getSubjects().getClass().getName());
	
	}

}
