package com.BikkadIT.PhoneBookApplication.service;

import java.util.List;

import com.BikkadIT.PhoneBookApplication.entities.Contact;

public interface ContactServiceI {

	boolean saveContact(Contact contact);
	
	public List<Contact> getAllContact();
	
	public Contact getContactById(Integer contactId);
	
	public boolean updateContact(Contact contact);
	
	public boolean deleteContact(Integer contactId);
}
