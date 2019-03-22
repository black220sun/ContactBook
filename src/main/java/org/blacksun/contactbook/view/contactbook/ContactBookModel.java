package org.blacksun.contactbook.view.contactbook;

import javax.swing.AbstractListModel;

public abstract class ContactBookModel extends AbstractListModel<Object> {
    void update() {
        fireContentsChanged(this, 0, getSize());
    }
}
