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
	        Set students = new HashSet();
	        Students s = new Students();
	        s.setName("stu1");students.add(s);
	        Students s1 = new Students();
	        s1.setName("stu2");students.add(s1);
	        Students s3 = new Students();
	        s3.setName("stu3");students.add(s3);
	        Students s4 = new Students();
	        s4.setName("stu4");students.add(s4);
	        Courses c1= new Courses();
	        Courses c2 = new Courses();
	        c1.setCourse_name("cs_1");
	        c2.setCourse_name("cs_2");
	        c1.setStudents(students);
	        c2.setStudents(students);
	        session.save(c1);
	      //  session.clear();
	        session.save(c2);
	        session.getTransaction().commit();
	        session.close();
	    }
	}

