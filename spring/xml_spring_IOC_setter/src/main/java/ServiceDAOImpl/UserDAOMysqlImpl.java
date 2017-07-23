package ServiceDAOImpl;

import ServiceDAO.UserDao;

//模拟mysql数据库的useradd过程
public class UserDAOMysqlImpl implements UserDao {  
    public void addUser(String username,String password){  
        System.out.println("UserDao4MySqlImpl.addUser()");  
        System.out.println("userName="+username);  
        System.out.println("password="+password);  
    }  
}  
