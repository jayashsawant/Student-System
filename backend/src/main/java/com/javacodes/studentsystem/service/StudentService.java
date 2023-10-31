package com.javacodes.studentsystem.service;

import java.util.List;
import com.javacodes.studentsystem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
}
