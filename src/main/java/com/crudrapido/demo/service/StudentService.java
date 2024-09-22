package com.crudrapido.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudrapido.demo.entity.Student;
import com.crudrapido.demo.repository.StudentRepository;

@Service
public class StudentService {

    //inyección de dependencia
    @Autowired
    StudentRepository studentRepository;

    //devuelve los estudiantes cargardos en la base de datos
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    //se pone opcional porque puede no estar el estudiante
    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    //guarda o actualiza un estudiante
    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }

    //borra un estudiante
    public void delate(Long id){
        studentRepository.deleteById(id);
    }
}
