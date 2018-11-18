package co.com.hibernate.hibernate.dao.impl;

import java.util.List;

import co.com.hibernate.hibernate.dao.SessionHibernate;
import co.com.hibernate.hibernate.dao.TeacherDao;
import co.com.hibernate.hibernate.model.Teacher;

public class TeacherDaoImpl extends SessionHibernate implements TeacherDao{

	private SessionHibernate seccion;
	
	public TeacherDaoImpl() {
		seccion = new SessionHibernate();
	}

	public void saveTeacher(Teacher teacher) {
		seccion.openSession().persist(teacher);
		commit();
	}

	private void commit() {
		seccion.openSession().getTransaction().commit();
	}

	public List<Teacher> findAllTeacher() {
		return seccion.openSession().createQuery("from Teacher").list();
	}

	public void deleteTeacher(long id) {
		
	}

	public void updateTeacher(Teacher teacher) {
		
	}

	public Teacher findTeacherById(long id) {
		return null;
	}

	public Teacher findByName(String name) {
		return null;
	}

}
