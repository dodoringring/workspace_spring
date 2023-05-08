package com.ncs.test.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {
	Logger logger =LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "redirect:index.jsp";
	}
	
	
	
	
	@GetMapping("memberLogin")
	public String memberLogin(Map<String , Object> mmap, HttpSession session) {
		logger.info("memberLogin");
		session.setAttribute("loginUser", "나신입");
		return "forword:index.jsp";
	}
}
