package codes.alfa.service;

import codes.alfa.domain.Contact;

import java.util.List;

public interface ContactService {

    public void addContact(String name, String phone, List<Contact> contactList);
}
