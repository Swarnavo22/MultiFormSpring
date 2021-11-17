package com.example.MultiFormSpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class FormService {
	@Autowired
	FormRepository repository;

	 public void save(User user) {
	      repository.save(user); 
	  }  
}
