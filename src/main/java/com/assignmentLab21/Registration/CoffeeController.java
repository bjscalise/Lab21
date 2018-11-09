package com.assignmentLab21.Registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {

	@RequestMapping("/")
	public ModelAndView landing() {
		ModelAndView mv = new ModelAndView("landing", "firstPage", "Please register");
		mv.addObject("ImageTest", "https://images-na.ssl-images-amazon.com/images/I/61uy-R6AzDL._SL1000_.jpg");
		return mv;
		
	}
	
//	@RequestMapping("/register")
//	public ModelAndView registration() {
//		return new ModelAndView("register");
//	}
//	
//	@RequestMapping("/formresults")
//	public ModelAndView summary(@RequestParam("firstname") String fname, @RequestParam("lastname") String lname) {
//	//p.setFirstName(fname);
//	//p.setLastName(lname);
//		String sayHello = "Hello, " + fname + " " + lname;
//		return new ModelAndView("formPage", "userData", sayHello);
//	}
	

}
