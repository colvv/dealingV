package com.vv.dealingV.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	@RequestMapping("/")
//	@ResponseBody
	public ModelAndView defaultAccess(){
//		return "Hey,gay?";
		ModelAndView mav = new ModelAndView("redirect:/index.do");
		System.out.println(321);
		return mav;
	}
	@RequestMapping("index")
	public ModelAndView indexEnter(){
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message", "alaways know");
		return mav;
	}
	@RequestMapping("need_login")
	public String jumpToLogin(){
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	@RequestMapping("login",method=Request)
	@ResponseBody
	public String dealLogin(HttpServletRequest request){
		System.out.println(request.getParameter("user_ID"));
		System.out.println(request.getParameter("user_password"));
		return "success";
	}
	@RequestMapping(value="/regist")
	@ResponseBody
	public String dealRegist(){
		return "regist success , jump would be execute after 3 seconds";
	}
	
}
