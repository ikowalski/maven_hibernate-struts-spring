package annonation_onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

public class test_add {
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
	    public void add() {
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	        Classes c = new Classes();
	        c.setClassname("cs_1");
	        for(int i=0;i<5;i++){
	        	Students s = new Students();
	        	s.setName("student"+i);
	        	s.setClasses(c);
	        	session.save(s);
	        }
	        session.getTransaction().commit();
	        session.close();
	    }
	}

