package com.codingdojo.counterdemo;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	// import the Spring "Model" object that allows you to save information to be available in the view (lives per request)
	public String index(HttpSession session) {
		
		// declare variable to hold session count
		Integer count = (Integer) session.getAttribute("count");
		// check if counter has started
		if(count == null) {
			// set counter to start at 1
			session.setAttribute("count",  1);
		} else {
			// increment count
			session.setAttribute("count", count+1);
		}
		return "index.jsp";
	}
		
	
	@RequestMapping("/counter")
	// import the Spring "Model" object that allows you to save information to be available in the view (lives per request)
	public String counter(Model model, HttpSession session) {

		// declare variable to hold session count
		Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			// if counter has not started set to 0
			model.addAttribute("count", 0);
		} else {
			// get session count and add to model object
			model.addAttribute("counter", session.getAttribute("count"));
		}
		return "counter.jsp";
	}
	
	
}
