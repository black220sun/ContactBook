package org.blacksun.contactbook.view;

import org.blacksun.contactbook.view.contactbook.ContactBookView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class ViewPanel extends JScrollPane {
    @Autowired
    public ViewPanel(ContactBookView bookView) {
        super();
        setViewportView(bookView.getComponent());
    }
}
