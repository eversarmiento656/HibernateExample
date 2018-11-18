package co.com.hibernate.hibernate;

import co.com.hibernate.hibernate.dao.TeacherDao;
import co.com.hibernate.hibernate.dao.impl.TeacherDaoImpl;
import co.com.hibernate.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	  TeacherDao dao = new TeacherDaoImpl();
      dao.saveTeacher(new Teacher("Edixon Sarmiento Santos", "Avatar"));
      for(Teacher tea : dao.findAllTeacher()) {
    	  System.out.println(tea.getName());
      }
    }
}
