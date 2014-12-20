package com.vv.dealingV.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.vv.dealingV.bean.SysUser;
import com.vv.dealingV.service.SysUserService;
import com.vv.dealingV.utils.PubFun;

@Controller
public class DefaultController {
	private HttpSession tHttpSession;
	@Autowired
	private SysUserService tSysUserService;
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
	public String dealLogin(String login_user_ID,String login_user_password){
		System.out.println("******login_user_ID"+login_user_ID);
		System.out.println("******login_user_password"+login_user_password);
		return "success";
	}
	@RequestMapping(value="/regist")
	@ResponseBody
	public String dealRegist(){
		return "regist success , jump would be execute after 3 seconds";
	}
	
	@RequestMapping("/json/tabledata")
	@ResponseBody
	public String getJsonResult(){
		List<SysUser> tSysUsers = tSysUserService.getAllUsers();
//		List<SysUser> tSysUsers = new ArrayList<SysUser>();
//		int recyle = (int) (Math.random()*25);
//		SysUser tSysUser;
		
//		for (int i = 0; i < recyle; i++) {
//			tSysUser = new SysUser();
//			tSysUser.setId(String.valueOf(Math.random()*1500));
//			tSysUser.setUserCode("col_vv"+Math.random()*1500);
//			tSysUser.setUserName("王毅");
//			tSysUser.setState("0");
//			tSysUser.setManageCom("86");
//			tSysUser.setPhone("13403517100");
//			tSysUser.setEmail("5vwy89@163.com");
//			tSysUsers.add(tSysUser);
//		}
		// @wangyi 2014-12-14 阿里巴巴。。 Json工具
		return JSON.toJSONString(tSysUsers);
	}
	@RequestMapping("/text/tabledata")
	@ResponseBody
	public String getTextResult(){
		int recyle = (int) (Math.random()*25);
		StringBuilder tSB = PubFun.init_StringBuilder();
		for (int i = 0; i < recyle; i++) {
			tSB.append(String.valueOf(Math.random()*1500));
			tSB.append(PubFun.SYS_SPLIT_PARAM);
			tSB.append("col_vv"+Math.random()*1500);
			tSB.append(PubFun.SYS_SPLIT_PARAM);
			tSB.append("王毅");
			tSB.append(PubFun.SYS_SPLIT_PARAM);
			tSB.append("0");
			tSB.append(PubFun.SYS_SPLIT_PARAM);
			tSB.append("86");
			tSB.append(PubFun.SYS_SPLIT_PARAM);
			tSB.append("13403517100");
			tSB.append(PubFun.SYS_SPLIT_PARAM);
			tSB.append("5vwy89@163.com");
			tSB.append(PubFun.SYS_SPLIT_OBJECT);
		}
		System.out.println("sb+le"+tSB.length());
		tSB.deleteCharAt(tSB.length()-1);
		return tSB.toString();
	}
	public static void main(String[] args) {
		new DefaultController().getJsonResult();
	}
	
	
}
