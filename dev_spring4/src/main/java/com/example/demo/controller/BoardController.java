package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
//요청 컨트롤러 마다 요청객체와 응답객체를 주입 받을 수 있다.

import com.example.demo.HomeController;
import com.example.demo.logic.BoardLogic;
//왜 나만 상속을 받아야 하나요?-
public class BoardController extends MultiActionController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	private BoardLogic boardLogic=null;
	//setter객체 주입법 - 자바코드에서 객체주입을 처리할 때 사용함
	public void setBoardLogic(BoardLogic boardLogic) {
		this.boardLogic = boardLogic;
	}
	//void deGet(req, res)->ActionForward execute(req,res)->String execute(req,res)-> String XXX(req,res)
	public ModelAndView boardList(HttpServletRequest req, HttpServletResponse res) {
		
		logger.info("boardList호출");
		List<Map<String,Object>> bList=null;
		bList=boardLogic.boardList();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/boardList");//화면에 대한 이름을 넣으면 화면 호출됨
		mav.addObject("bList",bList);
		return mav;
	}
	
}
