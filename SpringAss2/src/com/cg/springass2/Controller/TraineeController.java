package com.cg.springass2.Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import org.springframework.web.servlet.ModelAndView;

import com.cg.springass2.Dto.Trainee;
import com.cg.springass2.Service.TraineeService;

@Controller
public class TraineeController {
	@Autowired
	TraineeService traineeservice;
	@RequestMapping(value="/home")
	public String login(){
		return "login";
		
	}
	
	@RequestMapping(value="menu")
	public String menu(){
		return "menu";
		
	}
	@RequestMapping(value="addtrainee")
	public String adata(@ModelAttribute("y") Trainee trainee,Map<String,Object> modal){
		
		List<String> mylist = new ArrayList<>();
		mylist.add("JEE");
		mylist.add("JFSD");
		mylist.add("WB");
		modal.put("cato",mylist);
	
		return "addtrainee";
		}
	@RequestMapping(value="adddata",method=RequestMethod.POST)
	public String addDetails(@ModelAttribute("y") Trainee trainee,Map<String,Object> modal){
		
		List<String> mylist = new ArrayList<>();
		mylist.add("JEE");
		mylist.add("JFSD");
		mylist.add("WB");
		modal.put("cato",mylist);
		traineeservice.addTrainee(trainee);
		return "welcome";
		
	}
	@RequestMapping(value="deletetrainee",method=RequestMethod.GET)
	public String ddata(@ModelAttribute("z") Trainee trainee){
		return "deletetrainee";
	}
	
	@RequestMapping(value="dedata", method=RequestMethod.POST)
	public ModelAndView showTrainee(@ModelAttribute("z") Trainee trainee){
		Trainee tSearch = traineeservice.showSingle(trainee.getTraineeId());
		System.out.println(tSearch);
		
		return new ModelAndView("deletetrainee1", "temp", trainee);
	
	/*@RequestMapping(value="dedata",method=RequestMethod.POST)
	public ModelAndView Showdata(@ModelAttribute("z") Trainee trainee){
		Trainee train = traineeservice.showSingle(trainee.getTraineeId());
		return new ModelAndView("deletetrainee1","temp",train);
		
		
	}*/
}}

