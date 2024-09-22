package com.crudrapido.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudrapido.demo.entity.Student;
import com.crudrapido.demo.service.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    
    //inyección de dependencia
    @Autowired
    private StudentService studentService;

    //muestra los estudiante
    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }

    //muestra un estudiante
    @GetMapping("/{studentId}")
    public Optional<Student> getById(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId);
     }

    //guarda o actualiza un estudiante
    @PostMapping
    public String saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return "Datos guardados exitosamente";
    }

    //elimina un estudiante
    @DeleteMapping("/{studentId}")
    public String delate(@PathVariable("studentId") Long studentId){
        studentService.delate(studentId);
        return "Estudiante: " + studentId + ", eliminado exitosamente";
    }
}
