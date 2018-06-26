package com.pj.pojo;

public class Dept {
private int deptno;
private String dname;
private String loc;
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "Dept [部门号deptno=" + deptno + ", 部门名dname=" + dname + ", 地址loc=" + loc + "]";
}


}
