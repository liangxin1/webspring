package com.text.bll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.text.idal.IUserDAL;
import com.text.model.SearchInfo;

public class UserBll {
	// 创建数据层对象dal
			// 创建容器
			ApplicationContext ac = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
			IUserDAL dal = (IUserDAL) ac.getBean("userService");
			
			public String MySearch(SearchInfo si){
				return dal.MySearch(si);
			}

}
