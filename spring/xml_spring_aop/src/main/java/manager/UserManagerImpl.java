package manager;

import org.springframework.stereotype.Component;

@Component("UserManagerImpl")
public class UserManagerImpl implements UserManager {  
	  
 
    public void addUser(String userName, String password) {  
        System.out.println("----UserManagerImpl.add()----");  
    }
    public void delUser(int userId) {  
        System.out.println("----UserManagerImpl.delUser()----");  
    }  
 
    public String findUserById(int userId) {  
          
        System.out.println("----UserManagerImpl.findUserById()----");  
          
        if(userId <= 0){  
            throw new IllegalArgumentException("该用户不存在");  
        }  
        return "jiuqiyuliang";  
    }  
  
    public void modifyUser(int userId, String userName, String password) {  
        System.out.println("----UserManagerImpl.modifyUser()----");  
    }  
  
}   