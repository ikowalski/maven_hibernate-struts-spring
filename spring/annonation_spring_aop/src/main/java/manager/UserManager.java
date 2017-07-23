package manager;

public interface UserManager {  
	  
    public void addUser(String userName,String password);  
      
    public void delUser(int userId);  
      
    public String findUserById(int userId);  
      
    public void modifyUser(int userId,String userName,String password);  
}  