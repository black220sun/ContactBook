package org.blacksun.contactbook.view.contact;

import org.blacksun.contactbook.model.Contact;

public interface ContactWrapperFactory {
    ContactWrapper wrap(Contact contact);
}
