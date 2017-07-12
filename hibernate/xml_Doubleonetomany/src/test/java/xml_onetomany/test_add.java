package xml_onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

import xml_Doubleonetomany.Classes;
import xml_Doubleonetomany.Students;

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
	        Students s = new Students();
	        s.setName("stu1");
	        Classes c = new Classes();
	        c.setClassname("cs_1");
	        s.setClasses(c);
	        session.save(s);
	        session.getTransaction().commit();
	        session.close();
	    }
	}

