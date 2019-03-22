package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;
import org.blacksun.contactbook.model.Contact;

import javax.swing.*;

class AddButton extends JButton {
    AddButton(ContactBookController controller, JTextField nameField, JTextField phoneField) {
        super("Add");
        addActionListener(e -> {
            final String name = nameField.getText();
            if (!name.isEmpty()) {
                controller.addContact(new Contact(name, phoneField.getText()));
                phoneField.setText("");
            }
        });
    }
}
