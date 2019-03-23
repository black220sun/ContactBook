package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;

import javax.swing.*;
import java.awt.*;

class AddPhoneCommand implements Command {
    private final ContactBookController controller;
    private final JTextField nameField;
    private final JTextField phoneField;

    AddPhoneCommand(ContactBookController controller, JTextField name, JTextField phone) {
        this.controller = controller;
        this.nameField = name;
        this.phoneField = phone;
    }

    @Override
    public void execute() {
        controller.addPhoneNumber(nameField.getText(), phoneField.getText());
        phoneField.setText("");
    }
}
