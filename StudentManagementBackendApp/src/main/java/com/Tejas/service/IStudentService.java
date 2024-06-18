package com.Tejas.service;

import java.util.List;

import com.Tejas.Student;

public interface IStudentService
{
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id);
    public void deleteStudentById(Integer id);
}
