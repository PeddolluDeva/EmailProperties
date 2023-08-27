package com.Deva.spring.data.jpa.entity.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.Deva.spring.data.jpa.entity.Course;
import com.Deva.spring.data.jpa.entity.Teacher;

import lombok.Builder;

@SpringBootTest

public class TeacherRepositoryTest {
	@Autowired
	// @Builder
private TeacherRepository  teacherRepository;
	@Test
	public void saveTecher() {
		Course courceBSc = Course.builder().title("BSc").creadit(4).build();
		Course courceMSc = Course.builder().title("MSc").creadit(6).build();	
		Teacher teacher = Teacher.builder().firstName("Khane").lastName("shake").courese().build();
	}
}
