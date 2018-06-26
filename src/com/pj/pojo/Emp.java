package com.pj.pojo;

import java.util.Date;

public class Emp {
private int empno;
private String ename;
private String job;
private int mgr;
private Date hiredate;
private int sal;
private int comm;
private int deptno;
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public int getMgr() {
	return mgr;
}
public void setMgr(int mgr) {
	this.mgr = mgr;
}
public Date getHiredate() {
	return hiredate;
}
public void setHiredate(Date hiredate) {
	this.hiredate = hiredate;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public int getComm() {
	return comm;
}
public void setComm(int comm) {
	this.comm = comm;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
@Override
public String toString() {
	return "Emp [员工号empno=" + empno + ", 姓名ename=" + ename + ", 工作job=" + job + ", 上司工号mgr=" + mgr + ", 入职日前hiredate=" + hiredate
			+ ", 薪水sal=" + sal + ", 奖金comm=" + comm + ", 部门号deptno=" + deptno + "]";
}


}
