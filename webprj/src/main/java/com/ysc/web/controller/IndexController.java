package com.ysc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("ww");
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("data","에이치 아이 하이~");
		//mv.setViewName("/WEB-INF/view/index.jsp");
		return mv;
	}
}
