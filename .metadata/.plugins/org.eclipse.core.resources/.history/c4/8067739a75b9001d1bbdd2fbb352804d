package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
//요청 컨트롤러 마다 요청객체와 응답객체를 주입 받을 수 있다.

import com.example.demo.HomeController;
//왜 나만 상속을 받아야 하나요?-
public class BoardController extends MultiActionController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	public ModelAndView boardList(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/boardList");//화면에 대한 이름을 넣으면 화면 호출됨
		return mav;
	}
}
