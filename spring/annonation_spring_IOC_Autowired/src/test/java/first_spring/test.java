package first_spring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import manager.UserManager;

public class test {
	@Test
	public void test() {
		 //由我们的应用程序负责服务（对象）定位  ，IOC了
        //这是一个组装过程，userManager用userDao，这种关系是手动代码描述的，现在用配置文件描述  
        //UserManager userManager = new UserManagerImpl(new UserDao4MySqlImpl());  
        //userManager.addUser("张三", "123");  
          
        //BeanFactory是一个接口，有不同的实现，ClassPathXmlApplicationContext是对beanFactory的实现  
        //把applicationContext.xml读进来  
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");  
  
        //ApplicationContext都实现了beanFactory的接口  
        //ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");  
          
        //getBean加产品标识，相当与userManager的实现，再转化为userManager的接口  
        UserManager userManager =(UserManager)factory.getBean("UserManagerImpl");  
        userManager.addUser("gongzekun", "123456");  
    }  
	}
