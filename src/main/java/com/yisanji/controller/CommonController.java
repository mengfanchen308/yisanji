package com.yisanji.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller    
public class CommonController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommonController.class);

	@RequestMapping("/index")
	public String index(Model model, HttpSession session,HttpServletRequest request) {
		LOGGER.debug("index redirected to home page.");
		return "index";
	}
}
