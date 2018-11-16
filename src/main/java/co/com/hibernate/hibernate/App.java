package co.com.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.com.hibernate.hibernate.model.Course;
import co.com.hibernate.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		SessionFactory session;
		Configuration conf = new Configuration();
		conf.configure();
		session = conf.buildSessionFactory();
		Session se = session.openSession();
		
//		Teacher teacher = new Teacher("Everson Sarmiento", "Avatar");
//		se.beginTransaction();
//		se.save(teacher);
//		se.getTransaction().commit();
		
		Course curso = new Course("Java", "Rest", "Rest Api");
		se.beginTransaction();
		se.save(curso);
		se.getTransaction().commit();

    }
}
