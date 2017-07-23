package manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ServiceDAO.UserDao;
@Component("UserManagerImpl")
public class UserManagerImpl implements UserManager {  
    //定义一个成员变量，使用构造方式赋值  
    @Autowired
    private UserDao UserDAOMysqlImpl;  
     

  public void setUserDao(UserDao userDao) {  
      this.UserDAOMysqlImpl = userDao;  
  }  
  
    public void addUser(String userName, String password) {  
    	UserDAOMysqlImpl.addUser(userName, password);  
    }  
  
}  