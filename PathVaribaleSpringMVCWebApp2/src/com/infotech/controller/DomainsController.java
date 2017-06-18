package com.infotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/domains")
public class DomainsController {

	@RequestMapping(value="/domain/{domainName:.+}",method=RequestMethod.GET)
	public ModelAndView domain(@PathVariable("domainName") String domain){
		return new ModelAndView("welcomePage", "welcomeMessage", "Domain Name is:"+domain);
	}
}
