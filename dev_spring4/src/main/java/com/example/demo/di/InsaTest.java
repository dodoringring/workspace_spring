package com.example.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class InsaTest {
	InsaTest(){}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\example\\demo\\di\\insaBean.xml");
		InsaList insaList = (InsaList)context.getBean("insa");//getBean은 주입 받을때 쓰는 메소드. id로 가져옴
		System.out.println(insaList.insaBean);
		//
		for(int i=0; i<insaList.insaBean.size();i++) {
			System.out.println(insaList.insaBean.get(i));
		}
		
		ClassPathResource resource = new ClassPathResource("com\\\\example\\\\demo\\\\di\\\\insaBean.xml");
		
	}
}
