package action;

import com.opensymphony.xwork2.ActionSupport;

import model.User;

public class loginAction extends ActionSupport{
private User user;
public String excute(){
	System.out.println(user.getUsername());
	return SUCCESS;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
 
}
