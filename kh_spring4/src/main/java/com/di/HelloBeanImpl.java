package com.di;

public class HelloBeanImpl implements HelloBean {
 String msg=null;
 public void setMsg(String msg) {
	 this.msg=msg;
 }
	@Override
 public String getGreeting(String msg) {
	 return "spring "+this.msg;
 }
}
