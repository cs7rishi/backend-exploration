package com.spring_security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring_security.entities.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
