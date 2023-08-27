package com.Deva.spring.data.jpa.entity.Repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Deva.spring.data.jpa.entity.Guardian;
import com.Deva.spring.data.jpa.entity.Student;

import lombok.Builder;

@SpringBootTest
class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;
	private Object object;
	@Test
	@Builder
 public void saveStudent() {
		Student student = student.builder()
//				.emailId("Devanjineyulu803@gmail.com")
				.emailId("Devanjineyulu803@gmail.com")
				.firstName("Deva")
				.lastname("Anjineyulu").build();
			//	.guardiaName("siva").guardianEmail("siva@gmail.com").guardianMobile("7780412140").build();
studentRepository.save(student);
	}
	public void saveStudentWithGuardian() {
		Guardian gurdian = Guardian.builder().email("rame@gamil.com").name("Ram").mobile("8919211433").build();
		
	Student student = Student.builder().firstName("Rakey").emailId("shivensad@gmail.com").lastName("Kumer").
			build();
	}
@Test
public void printAllStudent() {
	List<Student> studentList = studentRepository.findAll();
	System.out.println("dEVANJINEYULU CANE BE :- "+studentList);
	//System.out.println("student list  = "+studentList);
}
@Test
 public void printStudentByFirstName1() {
	 List<Student> students= studentRepository.findByFirstName("Shivem");
	 System.out.println("Studnet firest is :- "+students);
 }
@Test
public void printStudentByFirstName() {
	 List<Student> students= studentRepository.findByFirstNameContaining("Ram");
	 System.out.println("studnet 2 name"+students);
}
  public void printStudentBasedOnGuardianName() {
	  List<Student>students = studentRepository.findByGudrdianName("Balu");
	  System.out.println("student  3 name "+students);
  }
  @Test
  public void printgetStudentByEmailAddress() {
	  Student student = studentRepository.getStudentByEmailAddress("sakthei@gmail.com");
	  System.out.println("sakathe is do intg every thing: -"+student);
  }
  @Test
  public void printgetStudentFirestNameByEmailAddress() {
	  String firestName=studentRepository.getStudentFirestNameByEmailAddress(emailId:"shiva@gmail.com");
	  System.out.println("firestName = "+firestName);
  }
  @Test
  public void printgetStudentByEmailAddressNative(String emailId) {
	  Student student = studentRepository.getStudentByEmailAddressNative(emailId:"sakthei@gmail,com");
	  System.out.println("student :- "+student);
  }
  @Test
  public void printgetStudentByEmailAddersNativeNameParam() {
	  String emailId;
	Student student = studentRepository.getStudentByEmailAddressNativeNameParam(emailId:"sakthei@gmail,com");
	  System.out.println("student :- "+student);
  }
  public void updateStudentNameByEmailIdTest() {
	  String firstName;
	studentRepository.updataStudentNameByEmailId(firstName,"samba siva",emailId:"sakthei@gmail");
  }
  }
