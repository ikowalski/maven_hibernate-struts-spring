package second_ehcache;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class test {
    SessionFactory sessionFactory;
    @Before
    public void sessionFacroty() {
        Configuration cfg = new Configuration();

        cfg.configure();

        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

        try {
            sessionFactory = cfg.buildSessionFactory(sr);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    @Test
    public void test(){
    	Session session = null;
        try
        {
            session = sessionFactory.openSession();

            Students stu = (Students) session.load(Students.class, 1);
            System.out.println(stu.getStudent_name() + "-----------");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
        	session.close();
        }
        try
        {
            /**
             * 即使当session关闭以后，因为配置了二级缓存，而二级缓存是sessionFactory级别的，所以会从缓存中取出该数据
             * 只会发出一条sql语句
             */
            session = sessionFactory.openSession();
            Students stu = (Students) session.load(Students.class, 1);
            System.out.println(stu.getStudent_name() + "-----------");
            /**
             * 因为设置了二级缓存为read-only，所以不能对其进行修改
             */
            session.beginTransaction();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
    }
   
    @After
    public void destory(){
    	sessionFactory.close();
    }
}


