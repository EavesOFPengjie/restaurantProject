package com.pj.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pj.pojo.Emp;
import com.pj.pojo.User;

@Controller
public class jspcontroller  {
  int a =0;
  int b =0;
	@RequestMapping(name="/test",method=RequestMethod.GET)
	public String index(Model model) {
		a++;
		model.addAttribute("message", "fisrt, Hello Spring MVC Framework!");
		System.out.println("第"+a+"次进入了test GET Method!");
		return "login";
	}
	
	@RequestMapping(name="/login",method=RequestMethod.POST)
	public String login(Model model, Emp emp) throws IOException {
		b++;
		model.addAttribute("message", "second, Hello Spring MVC Framework!");
		System.out.println("第"+b+"次进入了login POST Method!");
		
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Emp> empList = sqlSession.selectList("findEmp");
     	
		model.addAttribute("deptno", empList.get(0).getDeptno());
		model.addAttribute("ename", empList.get(0).getEname());
		model.addAttribute("sal", empList.get(0).getSal());
		model.addAttribute("userid", emp.getEmpno());
		model.addAttribute("username", emp.getEname());
		
		int userid = emp.getEmpno();
		String username = emp.getEname();
		System.out.println(userid +"::"+ username);
		
		
		
			
		
//		
//		
//		for(Emp empl : empList) {
//		 int	userid = empl.getEmpno();
//		String username = empl.getEname();
//			 
//				if (username != null && !"".equals(username.trim())) {
//					System.out.println("帐号密码无误，跳转到信息界面！");
//					model.addAttribute("message", "successfull login, Hello Spring MVC Framework!");
//					return "login";
//				} else {
//					System.out.println("密码错误！");
//					return "error";
//				}
			 
//		}
		return "login";
	}
	 
}
