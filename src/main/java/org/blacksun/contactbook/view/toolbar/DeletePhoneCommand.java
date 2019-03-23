package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;

import javax.swing.*;

class DeletePhoneCommand implements Command {
    private final ContactBookController controller;
    private final JTextField nameField;
    private final JTextField phoneField;

    DeletePhoneCommand(ContactBookController controller, JTextField name, JTextField phone) {
        this.controller = controller;
        this.nameField = name;
        this.phoneField = phone;
    }

    @Override
    public void execute() {
        controller.removePhoneNumber(nameField.getText(), phoneField.getText());
        phoneField.setText("");
    }
}
