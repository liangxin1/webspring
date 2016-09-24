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
	//处理静态页面的工作方式
		// 执行的方法action 

@RequestMapping("/index") //提交的action
 public String Index(){
	// 返回的View页面 index=index.jsp
	return "index";
}
//第二种方式
	//前端和控制器交互的

@RequestMapping("/test")
public ModelAndView mytest(String name,String age )
{
	ModelAndView view=new ModelAndView();
	//相当于封装了request.setArribute("test")

	view.addObject("test",name+":"+age);
	

	view.setViewName("test");//这里的test=test.jsp，跳转页面地址
	return view;
}

//第三种方式
	//
	@RequestMapping("/test01")
	public String mytest01(HttpServletRequest request){
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		request.setAttribute("test",name+":"+age);
		
		
		return "test01";
	}


	//登录的静态页面

@RequestMapping("/login")
public String Login(){
	return "login";
}

@RequestMapping("/result") //这是action
public ModelAndView mytest(UserInfo u)
{    //实例化时添加跳转页面
	ModelAndView view=new ModelAndView("jieguo");//这是JSP
	view.addObject("abc",u.getUsername()+":"+u.getPassword());
	
	return view;
}
//静态搜索页面
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
