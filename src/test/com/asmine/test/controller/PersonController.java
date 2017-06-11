package com.asmine.test.controller;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asmine.test.model.PersonVo;
import com.asmine.test.service.PersonService;

@Controller
public class PersonController implements InitializingBean{

	@Autowired
	PersonService personService;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
	}

	@ResponseBody
	@RequestMapping("/persons")
	public List<PersonVo> listPersons()
	{
		return personService.getAllPersons();
	}
	
}
