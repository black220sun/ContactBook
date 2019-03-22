package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;

import javax.swing.*;
import java.awt.*;

class ClearButton extends JButton {
    ClearButton(ContactBookController controller) {
        super("Clear");
        addActionListener(e -> controller.clear());
    }
}
