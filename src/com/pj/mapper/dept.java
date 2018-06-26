package com.pj.mapper;

import java.util.List;

import com.pj.pojo.Dept;

public interface dept {
	// 遵循四个原则
	//1.接口的方法名==dept.xml的id名
	//2.返回值的类型和Mapper.xml文件中的返回值类型一致
	//3.方法入参的类型要与Mapper.xml中入参的类型保持一致
	//4.Mapper.xml需要与本接口邦定
  public List<Dept> findDept();
}
