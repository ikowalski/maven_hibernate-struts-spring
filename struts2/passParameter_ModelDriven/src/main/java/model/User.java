package model;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
public class User extends ActionSupport{
 private String username;
 private String password;
 private List<String> hobby;
public List<String> getHobby() {
	return hobby;
}
public void setHobby(List<String> hobby) {
	this.hobby = hobby;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
