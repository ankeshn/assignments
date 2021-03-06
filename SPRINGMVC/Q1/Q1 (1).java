package com.capgemini.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewHelloController {
	 @RequestMapping(value="/index.html", method = RequestMethod.GET)
	  public ModelAndView index() {
	  
	  ModelAndView model = new ModelAndView("index"); 
	  return model; 
	  }
	 

	  @RequestMapping(value="/welcome.html", method = RequestMethod.POST)
	  public ModelAndView welcome() {
	  
	  ModelAndView model = new ModelAndView("helloWorld"); 
	  model.addObject("msg","HELLO WORLD");
	  
	  return model; 
	  }

}
