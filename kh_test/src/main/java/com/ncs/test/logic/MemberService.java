package com.ncs.test.logic;


import java.util.Map;

public interface MemberService {
	public String memberLogin();

	String memberLogin(Map<String, Object> pMap); 
}