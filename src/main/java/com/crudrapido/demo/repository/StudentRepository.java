package com.crudrapido.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudrapido.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
