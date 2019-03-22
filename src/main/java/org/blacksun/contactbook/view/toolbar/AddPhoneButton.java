package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;

import javax.swing.*;
import java.awt.*;

class AddPhoneButton extends JButton {
    AddPhoneButton(ContactBookController controller, JTextField nameField, JTextField phoneField) {
        super("Add phone");
        addActionListener( e -> {
            controller.addPhoneNumber(nameField.getText(), phoneField.getText());
            phoneField.setText("");
        });
    }
}
