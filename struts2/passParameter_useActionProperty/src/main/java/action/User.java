package action;

import com.opensymphony.xwork2.ActionSupport;
public class User extends ActionSupport{
 private String username;
 
 public String excute(){
	 System.out.println(username);
	 return SUCCESS;
 }
 
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
	
}
}
