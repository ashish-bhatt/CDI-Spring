package com.intuit.core;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class SimpleController {
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    binder.setValidator(new SimpleValidator());
	}
	@RequestMapping(value = "/indexValidate")
	public ModelAndView validate(@Valid @ModelAttribute("connection") ItemServerConnection connection, BindingResult errors)
					throws Exception {	
		return new ModelAndView("index","connection",connection);
	}
	@RequestMapping(value="/index")
	public String displayForm(ModelMap model) {
		model.addAttribute("connection", new ItemServerConnection());
		return "index";
	}
}
