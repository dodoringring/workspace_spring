package com.ncs.test.controller;

import java.util.Map;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ncs.test.logic.MemberServiceImpl;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	private MemberServiceImpl memberServiceImpl;
	@PostMapping("memberLogin")
	public String memberLogin(@RequestParam Map<String,Object>pMap, HttpSession session) {
		logger.info("memberLogin");
		String name =memberServiceImpl.memberLogin(pMap);
		return "redirect:/";		
	}
}