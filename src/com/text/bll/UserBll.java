package com.text.bll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.text.idal.IUserDAL;
import com.text.model.SearchInfo;

public class UserBll {
	// �������ݲ����dal
			// ��������
			ApplicationContext ac = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
			IUserDAL dal = (IUserDAL) ac.getBean("userService");
			
			public String MySearch(SearchInfo si){
				return dal.MySearch(si);
			}

}
