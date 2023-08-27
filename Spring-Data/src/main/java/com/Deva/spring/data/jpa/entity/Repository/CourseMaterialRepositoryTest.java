package com.Deva.spring.data.jpa.entity.Repository;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.Deva.spring.data.jpa.entity.Course;
import com.Deva.spring.data.jpa.entity.CourseMaterial;

import lombok.Builder;

@SpringBootTest
public class CourseMaterialRepositoryTest {
@Autowired
private CourseMaterialRepository repository;
@Test
@Builder
public void  saveCourseMaterial() {
	Course cource = Course.builder()
			.title("DSA")
		.credit(6)
		.build();	
	CourseMaterial courseMaterial = 
			((Object) CourseMaterial.builder())
			.url("www.devanjineyulu.com")
			.course(cource)
			.build();
	repository.save(courseMaterial);
}
@Test
public  void printAllCoursesMaterals() {
	List<CourseMaterial> courceMaterials = repository.findAll();
	System.out.println("cource meterial "+courceMaterials);
}
}
