package com.Deva.spring.data.jpa.entity.Repository;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.Deva.spring.data.jpa.entity.Course;
import com.Deva.spring.data.jpa.entity.Teacher;

import lombok.Builder;

@SpringBootTest
public class CourseRepositoryTest {
   private static final Pageable Sort = null;
@Autowired
	 private CourseRepository courserepository ;
		 @Test
	public void printCourses() {
		 // public void printCourses() {
			 List<Course> courses = CourseRepositoryTest.findAll();
	 System.out.println("courses = "+courses);
	 }//1:37:49

private static List<Course> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
		 @Test
		 @Builder
		 public void saveCourseseWithTeacher() {
			 Teacher teacher = ((Object) Teacher.builder()).firstName("Ram").lastName("Kumer").build(); //1:53:47
			 Course cource = ((Object) Course
					 .builder()).title("Mathes").crediti(8).teacher().build();  
			 CourseRepositoryTest.save(cource);
		 }
		 private static void save(Course cource) {
	// TODO Auto-generated method stub
}
@Test
		public void findAllPagination() {
			 Pageable firestPagewithThreeRecords =// Sort sort;
			 PageRequest.of(0, 4);
			 Pageable secondPageWithTwoRecords =
					 PageRequest.of(1,3);
			 List<Course> courses =
					 courserepository.findAll(firestPagewithThreeRecords).getContent();
			 long totalElements = courserepository.findAll(firestPagewithThreeRecords).getTotalElements();
			 long totalPages = courserepository.findAll(firestPagewithThreeRecords).getTotalPages();
		
			 
			 System.out.println("cources :- "+totalPages);
					 System.out.println("cources :- "+totalElements);
			 
			 System.out.println("cources :- "+courses);
		 }
		 public void findAllSoring() {
			 Pageable sortByTitle = 
					 PageRequest.of(0, 2,( (org.springframework.data.domain.Sort) Sort).by("title"));
							// Sort.by("title"));
			 Pageable sorByCreditDesc = 
					 PageRequest.of(0, 2,org.springframework.data.domain.Sort.by("creadit").descending());
			
			 Pageable sorByTitleAndcreaditDesc = 
					 PageRequest.of(0, 2,( (org.springframework.data.domain.Sort) Sort).by("creadit"));
			 List<Course> courses =
					 courserepository.findAll(sortByTitle).getContent();
			System.out.println("cources :- "+courses);
		 }
		 @Test
		 public void printfindByTitleContaining() {
			 Pageable firstPageTenRecords =  PageRequest.of(0,10 );
			 
		 List<Course> courses = courserepository.findByTitleContaining("D",firstPageTenRecords).getContent();		 
		 System.out.println("course can be :- "+courses);
		 }
} //1:37:49
