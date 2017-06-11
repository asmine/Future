package com.asmine.test.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.asmine.test.dao.PersonDAO;
import com.asmine.test.model.PersonVo;

@Repository
public class PersonDAOImpl implements PersonDAO{

	@Override
	public List<PersonVo> getAllPersons() {
		List<PersonVo> list = new ArrayList<PersonVo>();
		PersonVo person1 = new PersonVo("asmine1", "23");
		PersonVo person2 = new PersonVo("asmine2", "24");
		list.add(person1);
		list.add(person2);
		return list;
	}

}
