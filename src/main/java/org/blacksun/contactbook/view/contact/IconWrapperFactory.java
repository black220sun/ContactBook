package org.blacksun.contactbook.view.contact;

import org.blacksun.contactbook.model.Contact;
import org.springframework.stereotype.Component;

@Component
public class IconWrapperFactory implements ContactWrapperFactory {
    @Override
    public IconWrapper wrap(Contact contact) {
        return new IconWrapper(contact);
    }
}
