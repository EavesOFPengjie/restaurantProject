package com.pj.pojo;

public class User {
private String userid;
private String username;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "User info is [用户帐号userid=" + userid + ", 用户名username=" + username + "]";
}

}
