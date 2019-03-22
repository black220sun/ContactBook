package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;

import javax.swing.*;
import java.awt.*;

class DeletePhoneButton extends JButton {
    DeletePhoneButton(ContactBookController controller, JTextField nameField, JTextField phoneField) {
        super("Delete phone");
        addActionListener(e -> {
            controller.removePhoneNumber(nameField.getText(), phoneField.getText());
            phoneField.setText("");
        });
    }
}
