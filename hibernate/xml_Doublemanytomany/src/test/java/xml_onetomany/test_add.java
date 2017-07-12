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

import xml_manytomany.Courses;
import xml_manytomany.Students;

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
	        Set courses = new HashSet();
	        Courses c1= new Courses();
	        Courses c2 = new Courses();
	        c1.setCourse_name("cs_1");courses.add(c1);
	        c2.setCourse_name("cs_2");courses.add(c2);
	        Students s = new Students();
	        s.setName("stu1");s.setCourses(courses);
	        Students s1 = new Students();
	        s1.setName("stu2");s1.setCourses(courses);
	        Students s3 = new Students();
	        s3.setName("stu3");s3.setCourses(courses);
	        Students s4 = new Students();
	        s4.setName("stu4");s4.setCourses(courses);
	        session.save(s);
	        session.save(s1);
            session.save(s3);
            session.save(s4);
	        session.getTransaction().commit();
	        session.close();
	    }
	}

