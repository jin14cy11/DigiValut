package com.Spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Spring.entity.documents;



@Repository
@EnableJpaRepositories
public interface DocumentRepository  extends JpaRepository<documents, Integer>{
	
	List<documents> findByEmail(String userEmail);

}
