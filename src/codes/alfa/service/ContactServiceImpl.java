package codes.alfa.service;

import codes.alfa.domain.Contact;

import java.util.List;

public class ContactServiceImpl implements ContactService {

    @Override
    public void addContact(String name, String phone, List<Contact> contactList) {
        Contact contact = new Contact(name,phone);
        contactList.add(contact);
    }
}
