package PStudentDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import Configuration.studentConfiguration;
import pStudent.Student;

public class StudentDAO {

	public StudentDAO() {
	
		// TODO Auto-generated constructor stub
	}
	
	public void addDetails(Student st) throws Exception {
		try {
		
		studentConfiguration cfg = new studentConfiguration();	
		Session session = cfg.getSession();
		session.beginTransaction();
		session.persist(st);
		session.getTransaction().commit();
		session.close();
		System.out.println("Details added");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Don't enter the student with duplicate Id!");
		}
	}
	
	public Student getDetails(Integer rollno) {
		try {
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
	        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
	       
	        Session session = factory.openSession();
			session.beginTransaction();
			Student st1 = session.get(Student.class, rollno);
			session.getTransaction().commit();
			session.close();
			return st1;
	}
		catch(Exception e) {
			System.out.println("Enter the valid rollno!");
		}
		return new Student();
	}

}
