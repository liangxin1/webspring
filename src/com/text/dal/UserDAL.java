package com.text.dal;

import com.text.idal.IUserDAL;
import com.text.model.SearchInfo;


public  class UserDAL implements IUserDAL {

	@Override
	public String MySearch(SearchInfo si) {
		// TODO Auto-generated method stub
		String age=si.getAge();
		String code=si.getCode();
		String name=si.getName();
		//����������ݲ���JDBC
		System.out.println(age+":"+code+":"+name);
		
		return null;

	}


}
