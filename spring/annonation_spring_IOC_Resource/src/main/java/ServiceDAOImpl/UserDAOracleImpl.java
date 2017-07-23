package ServiceDAOImpl;

import org.springframework.stereotype.Component;

import ServiceDAO.UserDao;
@Component("UserDAOracleImpl")
//模拟oracle数据库的useradd过程
public class UserDAOracleImpl implements UserDao{
	 public void addUser(String username,String password){  
	        System.out.println("UserDAOracleImpl.addUser()");  
	        System.out.println("userName="+username);  
	        System.out.println("password="+password);  
	    } 
}
