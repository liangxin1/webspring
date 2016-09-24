package com.text.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.text.bll.UserBll;
import com.text.model.SearchInfo;
import com.text.model.UserInfo;




@Controller
@RequestMapping("/")
public class HomeController {
	UserBll userBLL=new UserBll();
	//����̬ҳ��Ĺ�����ʽ
		// ִ�еķ���action 

@RequestMapping("/index") //�ύ��action
 public String Index(){
	// ���ص�Viewҳ�� index=index.jsp
	return "index";
}
//�ڶ��ַ�ʽ
	//ǰ�˺Ϳ�����������

@RequestMapping("/test")
public ModelAndView mytest(String name,String age )
{
	ModelAndView view=new ModelAndView();
	//�൱�ڷ�װ��request.setArribute("test")

	view.addObject("test",name+":"+age);
	

	view.setViewName("test");//�����test=test.jsp����תҳ���ַ
	return view;
}

//�����ַ�ʽ
	//
	@RequestMapping("/test01")
	public String mytest01(HttpServletRequest request){
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		request.setAttribute("test",name+":"+age);
		
		
		return "test01";
	}


	//��¼�ľ�̬ҳ��

@RequestMapping("/login")
public String Login(){
	return "login";
}

@RequestMapping("/result") //����action
public ModelAndView mytest(UserInfo u)
{    //ʵ����ʱ�����תҳ��
	ModelAndView view=new ModelAndView("jieguo");//����JSP
	view.addObject("abc",u.getUsername()+":"+u.getPassword());
	
	return view;
}
//��̬����ҳ��
@RequestMapping("/search")
public String Search(){
	
	return "searchpage";
}


@RequestMapping("/searchresult")
public ModelAndView GetSearch(SearchInfo si){
	
	ModelAndView view=new ModelAndView("searchresult");
	
	userBLL.MySearch(si);
	return view;
}


}
