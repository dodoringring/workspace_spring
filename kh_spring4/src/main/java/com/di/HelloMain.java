package com.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloMain {
	public static void main(String[] args) {
		//객체가 xml문서에 등록되어있음.
		Resource resouce = new FileSystemResource("D:\\workspace_spring\\kh_spring4\\src\\main\\java\\com\\di\\helloBean.xml");
		//Spring Container는 두가지 유형의 컨테이너를 제공함
		//spring-beans.jar에 살고 있음
		//모든 빈을 늦게 로딩함 - getBean()호출 될 때 까지 Bean의 생성을 미룸(게으른 인스턴스화)
		BeanFactory factory = new XmlBeanFactory(resouce);
		HelloBean helloBean = (HelloBean)factory.getBean("helloBean");
		System.out.println(helloBean.getGreeting("안녕"));
		//spring-context.jar에 살고 있음
		//Context시작시킬때 모든 singleton 빈을 미리 로딩함으로써
		// 그빈이 필요할때 즉시 사용될 수 있도록 보장해줌
		//어플리케이션 동작시 Bean생성되기를 기다릴 필요가 없게됨
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\di\\helloBean.xml");
		HelloBean helloBean2=(HelloBean)context.getBean("helloBean");
		System.out.println(helloBean2.getGreeting("잘가"));
	}
}