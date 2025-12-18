package com.example.demo.Serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.emtity.Student;
import com.example.demo.repository.StudentRespository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImple implements StudentService{
    // private final StudentRepository studentRespository;
    // public StudentServiceImple(StudentRespository studentRespository){
    //     this.studentResportory=studentRespository;
    // }
    @Autowired

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}