package com.Deva.spring.data.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;

//import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
	@Id
	@SequenceGenerator(
			name="course_sequence",
			sequenceName = "course_sequence",
			allocationSize=1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator="course_sequence")	
	private long courseId;
	private String title;
	private Integer  credit; //1:37:23	
	@OneToOne(  mappedBy = "course")
	 private CourseMaterial  courceMaterial;

	/*public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}*/
	@ManyToOne	(
			cascade=CascadeType.ALL
			)
	@JoinColumn(
			name="teacher_id",referencedColumnName  = "teacherId"
			)
private Teacher teacher;
@ManyToMany
@JoinTable
(  name = "studnet_course_map",joinColumns = @JoinColumn(name = "course_id",referencedColumnName = "courseId"
), inverseJoinColumns = @JoinColumn(name="student_Id",referencedColumnName = "studentId"))
	private List<Student> students;
	public  void addStudents(Student student) {
		if(students == null) students= new ArrayList<>();
		students .add(student);
	}
	}
