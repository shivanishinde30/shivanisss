package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.beans.Bike;
import com.training.service.BikeService;
@Controller
public class BikeController {
	
	@Autowired
	BikeService bikeService; 
	
	@RequestMapping("/")
	public String bk() {
		
		return "index";
	}
	@RequestMapping("/sellbike")
	public ModelAndView sellBike() {
		return new ModelAndView("sellbike"); 
	}
	@RequestMapping("/addBike1")
	public String show()
	{
		return "sellbike";
	}
	@RequestMapping("/addBike")
	public ModelAndView registerBike(@RequestParam("oname") String oname,@RequestParam("bname") String bname,
			@RequestParam("rate") int rate,@RequestParam("disc") String disc,@RequestParam("color") String color,@RequestParam("type") String type)
	{
Bike b=new Bike(oname, bname,  rate,disc, color,type);
int n=bikeService.registerBike(b);
		if
		(n>0) {
			System.out.println("Bike Added Successfully");
		}
		else
		{
			System.out.println("kahitari chuklay rao");
		}
	return new	ModelAndView("redirect:/getBike");
	}

	
	@RequestMapping("/getBike")
	public ModelAndView getBikes()
	{
		List<Bike> blist=bikeService.getBike();
		return new ModelAndView("getBike","blist",blist);
	}
	@RequestMapping("delete/${oname}")
	public ModelAndView deleteBike(@PathVariable("oname") String oname)
	{
		bikeService.deleteBike(oname);
		return new ModelAndView("redirect:/getBike")
	}
}

  
 