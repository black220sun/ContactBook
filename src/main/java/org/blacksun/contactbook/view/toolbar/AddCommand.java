package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;
import org.blacksun.contactbook.model.Contact;

import javax.swing.*;

class AddCommand implements Command {
    private final ContactBookController controller;
    private final JTextField nameField;
    private final JTextField phoneField;

    AddCommand(ContactBookController controller, JTextField name, JTextField phone) {
        this.controller = controller;
        this.nameField = name;
        this.phoneField = phone;
    }

    @Override
    public void execute() {
        final String name = nameField.getText();
        if (!name.isEmpty()) {
            controller.addContact(new Contact(name, phoneField.getText()));
            phoneField.setText("");
        }
    }
}
