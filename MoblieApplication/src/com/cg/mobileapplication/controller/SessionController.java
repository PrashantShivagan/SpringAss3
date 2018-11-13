package com.cg.mobileapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.cg.mobileapplication.Dto.Session;
import com.cg.mobileapplication.Service.OrderMobileService;

@Controller
public class SessionController {
	@Autowired
	OrderMobileService service;
	@RequestMapping(value="show",method=RequestMethod.GET)
	public ModelAndView showData(){
		List<Session> allSession = service.showAllSession();
		return new ModelAndView("ScheduledSessions","temp", allSession);
		
	}
	//@RequestMapping(value="purchase",method=RequestMethod.GET)
	//public ModelAndView dataDisplay(@RequestParam("mobname") String mname){
	//	return new ModelAndView("purchasedetail","ename",mname);
	//}
}
