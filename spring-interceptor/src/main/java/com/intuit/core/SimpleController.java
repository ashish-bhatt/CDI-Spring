package com.intuit.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class SimpleController {
	
	@RequestMapping(value = "/index")
	public String validate()
					throws Exception {	
		return "index";
	}

}
