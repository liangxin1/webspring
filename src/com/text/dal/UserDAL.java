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
		//下面就是数据操作JDBC
		System.out.println(age+":"+code+":"+name);
		
		return null;

	}


}
