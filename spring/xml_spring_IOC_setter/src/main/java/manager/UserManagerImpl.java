package manager;

import ServiceDAO.UserDao;

public class UserManagerImpl implements UserManager {  
    //定义一个成员变量，使用构造方式赋值  
    private UserDao userDao;  
      
    /** 
     * set注入 
     * @param userDao 
     */  
  public void setUserDao(UserDao userDao) {  
      this.userDao = userDao;  
  }  
  
    public void addUser(String userName, String password) {  
        userDao.addUser(userName, password);  
    }  
  
}  