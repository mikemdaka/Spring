package com.mnkateko.studentsystem.service;

import com.mnkateko.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
