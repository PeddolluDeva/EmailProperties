package com.Deva.spring.data.jpa.entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Deva.spring.data.jpa.entity.CourseMaterial;
@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long >{

	Object builder();

	void save(CourseMaterialRepository courseMaterial);

	
}
