package org.blacksun.contactbook.view.contactbook;

import org.blacksun.contactbook.model.ContactBook;
import org.blacksun.contactbook.view.contact.ContactWrapper;
import org.blacksun.contactbook.view.contact.ContactWrapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleContactBookModel extends ContactBookModel {
    private final ContactBook contactBook;
    private final ContactWrapperFactory factory;

    @Autowired
    public SimpleContactBookModel(ContactBook contactBook, ContactWrapperFactory factory) {
        this.contactBook = contactBook;
        this.factory = factory;
    }

    @Override
    public int getSize() {
        return contactBook.size();
    }

    @Override
    public ContactWrapper getElementAt(int index) {
        return factory.wrap(contactBook.getContacts().get(index));
    }
}
