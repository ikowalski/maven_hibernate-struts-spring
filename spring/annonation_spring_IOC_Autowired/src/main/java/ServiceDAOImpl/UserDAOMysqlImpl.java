package ServiceDAOImpl;

import org.springframework.stereotype.Component;

import ServiceDAO.UserDao;

@Component("UserDAOMysqlImpl")
//模拟mysql数据库的useradd过程
public class UserDAOMysqlImpl implements UserDao {  
    public void addUser(String username,String password){  
        System.out.println("UserDao4MySqlImpl.addUser()");  
        System.out.println("userName="+username);  
        System.out.println("password="+password);  
    }  
}  
