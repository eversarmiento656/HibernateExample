package co.com.hibernate.hibernate.dao;

import java.util.List;

import co.com.hibernate.hibernate.model.Teacher;

public interface TeacherDao {

	void saveTeacher(Teacher teacher);
	
    List<Teacher> findAllTeacher();
    
    void deleteTeacher(long id);
    
    void updateTeacher(Teacher teacher);
	
    Teacher findTeacherById(long id);
    
    Teacher findByName(String name);
}
