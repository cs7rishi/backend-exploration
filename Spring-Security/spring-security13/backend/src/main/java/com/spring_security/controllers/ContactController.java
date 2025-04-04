package com.spring_security.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.spring_security.entities.Contact;
import com.spring_security.repository.ContactRepository;
import com.spring_security.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/contact")
    public List<Contact> saveContactInquiryDetails(@RequestBody List<Contact> contacts) {
        Contact contact = contacts.get(0);
        contact.setContactId(getServiceReqNumber());
        contact.setCreateDt(new Date(System.currentTimeMillis()));
        contact = contactRepository.save(contact);
        List<Contact> returnContacts = new ArrayList();
        returnContacts.add(contact);
        return returnContacts;
    }

    public String getServiceReqNumber() {
        Random random = new Random();
        int ranNum = random.nextInt(999999999 - 9999) + 9999;
        return "SR"+ranNum;
    }
}
