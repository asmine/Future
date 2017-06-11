package com.asmine.test.model;

import java.io.Serializable;

public class PersonVo implements Serializable 
{
	private static final long serialVersionUID = 909008572818234531L;
	private String name;
	private String age;
	
	public PersonVo()
	{
		
	}
	
	public PersonVo(String name, String age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PersonVo[name="+name+", age="+age+"]";
	}
}
