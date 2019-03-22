package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ToolBar extends JPanel {
    @Autowired
    public ToolBar(ContactBookController controller) {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(100, 24));
        add(nameField);
        add(new JLabel("Phone:"));
        JTextField phoneField = new JTextField();
        phoneField.setPreferredSize(new Dimension(100, 24));
        add(phoneField);
        add(new AddButton(controller, nameField, phoneField));
        add(new DeleteButton(controller, nameField));
        add(new ClearButton(controller));
        add(new AddPhoneButton(controller, nameField, phoneField));
        add(new DeletePhoneButton(controller, nameField, phoneField));
    }
}
