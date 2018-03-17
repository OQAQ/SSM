package com.shsxt.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shsxt.model.Test;
import com.shsxt.service.ITestService;

@Controller
public class TestController {
	@Autowired
	private ITestService testService ;  
	@RequestMapping(value="/demo",method=RequestMethod.GET)
	@ResponseBody
	public Test queryTestByname( String name) {
		
		return testService.queryTestByName(name);
		
	}
}
