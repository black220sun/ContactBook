package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;

import javax.swing.*;

class DeleteCommand implements Command {
    private final ContactBookController controller;
    private final JTextField nameField;

    DeleteCommand(ContactBookController controller, JTextField nameField) {
        this.controller = controller;
        this.nameField = nameField;
    }

    @Override
    public void execute() {
        final String name = nameField.getText();
        if (!name.isEmpty()) {
            controller.removeContact(name);
            nameField.setText("");
        }
    }
}
