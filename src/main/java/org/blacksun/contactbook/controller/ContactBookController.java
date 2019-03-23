package org.blacksun.contactbook.controller;

import org.blacksun.contactbook.model.Contact;
import org.blacksun.contactbook.model.ContactBook;
import org.blacksun.contactbook.view.contactbook.UpdatableComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactBookController {
    private final ContactBook contactBook;
    private final UpdatableComponent view;

    @Autowired
    public ContactBookController(ContactBook contactBook, UpdatableComponent view) {
        this.contactBook = contactBook;
        this.view = view;
    }

    public void addContact(Contact contact) {
        if (contactBook.addOne(contact)) {
            view.update();
        }
    }

    public void removeContact(String name) {
        if (contactBook.remove(name)) {
            view.update();
        }
    }

    public void clear() {
        contactBook.clear();
        view.update();
    }

    public void addPhoneNumber(String name, String phone) {
        contactBook.getOne(name).ifPresent(it -> {
            if (it.addPhoneNumber(phone)) {
                view.update();
            }
        });
    }

    public void removePhoneNumber(String name, String phone) {
        contactBook.getOne(name).ifPresent(it -> {
            if (it.removePhoneNumber(phone)) {
                view.update();
            }
        });
    }
}
