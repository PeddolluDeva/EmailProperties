package com.Deva.spring.data.jpa.entity.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Deva.spring.data.jpa.entity.Student;

import jakarta.transaction.Transactional;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	List<Student> findByFirstName(String firstName);
	List<Student> findByFirstNameContaining(String name);
	List<Student> findByLastNameNotNull();
	List<Student> findByGudrdianName(String guardiaName);
	//List<Student> findByGudrianName(String guardianName);
	Student findByFirstNameAndLastName(String firstName,
										String LastName);
	//JPQL
	@Query("select s.firestName from Student s whare s.emailId = ?1")
	Student getStudentByEmailAddress(String emailId);
	//Native
	@Query( value = "select * from tbl_student s where s.email_address =?1",
			nativeQuery=true
			)
	Student  getStudentByEmailAddressNative(String emilId);
//Native Name Param
	@Query( value = "select * from tbl_student s where s.email_address =?1",
			nativeQuery=true
			)
	Student  getStudentByEmailAddressNativeNameParam(@Param("emailId")String emilId);
	@Modifying   // Imp
	@Transactional   // 1:13:10  
	@Query (value = "update tbl_student set firest_name = ?1 whhere email_address = ?2",
	nativeQuery =true)
	int updataStudentNameByEmailId(String firstName, String emailId);
}

