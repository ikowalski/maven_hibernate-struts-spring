package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.User;

public class loginAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();

	public String excute() {
		System.out.println(user.getUsername());
		System.out.println(user.getHobby().get(0));
		System.out.println(user.getHobby().get(1));
		System.out.println(user.getAge());
		return SUCCESS;
	}

	public User getModel() {
		return user;
	}

	public void validate() {
       if(user.getUsername()==null||"".equals(user.getUsername())){
    	    this.addFieldError("username", "用户名不能为空");
       }
	}
}
