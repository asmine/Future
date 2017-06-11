package com.asmine.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asmine.test.dao.PersonDAO;
import com.asmine.test.model.PersonVo;
import com.asmine.test.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDAO personDAO;
	
	@Override
	public List<PersonVo> getAllPersons() {
		return personDAO.getAllPersons();
	}

}
