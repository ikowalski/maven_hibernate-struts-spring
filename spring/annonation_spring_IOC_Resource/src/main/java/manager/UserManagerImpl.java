package manager;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ServiceDAO.UserDao;
@Component("UserManagerImpl")
public class UserManagerImpl implements UserManager {  
    //定义一个成员变量，使用构造方式赋值 
	@Resource(name="UserDAOracleImpl",type=UserDao.class)
    private UserDao UserDAOMysqlImpl;  
     
//  @Resource(name="UserDAOMysqlImpl",type=UserDao.class)
  public void setUserDao(UserDao userDao) {  
      this.UserDAOMysqlImpl = userDao;  
  }  
  
    public void addUser(String userName, String password) {  
    	UserDAOMysqlImpl.addUser(userName, password);  
    }  
  
}  