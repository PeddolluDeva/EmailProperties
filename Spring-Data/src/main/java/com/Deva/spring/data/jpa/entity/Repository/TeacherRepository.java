package com.Deva.spring.data.jpa.entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Deva.spring.data.jpa.entity.Teacher;

@Repository     // 1:43:30
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
