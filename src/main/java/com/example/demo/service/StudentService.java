package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.PracticeProject.entity.Stuentity;

@Service
public interface StudentService {
    Stuentity saveStudent(Stuentity student);
}