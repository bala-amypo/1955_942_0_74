package com.example.demo.Serviceimpl;
import com.example.demo.repository.StudentRespository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImple implements StudentService{
    private final StudentRepository studentRespository;
    public StudentServiceImple(StudentRespository studentRespository){
        this.studentResportory=studentRespository;
    }
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}