package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PracticeProject.entity.Stuentity;
import com.example.PracticeProject.repository.StudentRepository;
import com.example.PracticeProject.service.StudentService;

@Service
public class StudentServiceImple implements StudentService{
    // private final StudentRepository studentRepository;
    // public StudentServiceImplement(StudentRepository studentRepository){
    //     this.studentRepository=studentRepository;
    // }
    @Autowired
    StudentRepository studentRepository;

    public Stuentity saveStudent(Stuentity student){
        return studentRepository.save(student);
    }
}