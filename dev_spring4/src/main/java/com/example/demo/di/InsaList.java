package com.example.demo.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class InsaList {
	//@Autowired 대신에 지금은 수동으로 setter 메소드 쓴다.
	public List<String> insaBean=null;//properties랑 맞춰줘야된다.
//setter 생성자 객체(car.xml) 주입법 코드와 setter객체 주입법 코드가 있다.
	//spring boot에서는 @Autowired 어노테이션으로 필요가 없어졌다.
	//insaBean= new ArraryList<>();대신에 수동으로 setter씀
	//스프링 컨테이너가 라이프사이클에서 미리 객체를 메모리에 띄어 놓는다. 이른 인스턴스화. 그 컨테이너가 어플리케이션 컨택스트이다.
	public void setInsaBean(List<String> insaBean) {
		this.insaBean = insaBean;
	}
	
	
	
}
