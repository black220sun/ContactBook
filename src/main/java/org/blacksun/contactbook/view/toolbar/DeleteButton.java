package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;

import javax.swing.*;
import java.awt.*;

class DeleteButton extends JButton {
    DeleteButton(ContactBookController controller, JTextField nameField) {
        super("Delete");
        addActionListener(e -> {
            final String name = nameField.getText();
            if (!name.isEmpty()) {
                controller.removeContact(name);
                nameField.setText("");
            }
        });
    }
}
