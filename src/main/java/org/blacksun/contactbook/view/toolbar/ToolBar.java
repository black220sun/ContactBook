package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;

@Component
public class ToolBar extends JPanel {
    private HashSet<Character> usedMnemonics;
    @Autowired
    public ToolBar(ContactBookController controller) {
        super();
        usedMnemonics = new HashSet<>();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JTextField nameField = addTextField("Name:");
        JTextField phoneField = addTextField("Phone:");
        addButton("Add", new AddCommand(controller, nameField, phoneField));
        addButton("Delete", new DeleteCommand(controller, nameField));
        addButton("Clear", new ClearButton(controller));
        addButton("Add phone", new AddPhoneCommand(controller, nameField, phoneField));
        addButton("Delete phone", new DeletePhoneCommand(controller, nameField, phoneField));
    }

    private JTextField addTextField(String label) {
        add(new JLabel(label));
        JTextField field = new JTextField();
        field.setPreferredSize(new Dimension(100, 24));
        add(field);
        return field;
    }

    @SuppressWarnings("UnusedReturnValue")
    private JButton addButton(String name, Command command) {
        JButton button = new JButton(name);
        char mnemonic = name.charAt(0);
        if (!usedMnemonics.contains(mnemonic)) {
            button.setMnemonic(mnemonic);
            usedMnemonics.add(mnemonic);
        }
        button.addActionListener(e -> command.execute());
        add(button);
        return button;
    }
}
