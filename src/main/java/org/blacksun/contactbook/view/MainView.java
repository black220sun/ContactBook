package org.blacksun.contactbook.view;

import org.blacksun.contactbook.view.toolbar.ToolBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class MainView extends JFrame {
    @Autowired
    public MainView(String title, Dimension dimension, ViewPanel contacts, ToolBar toolbar) {
        super(title);
        setLayout(new BorderLayout());
        setSize(dimension);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(toolbar, BorderLayout.WEST);
        add(contacts, BorderLayout.EAST);

        setVisible(true);
    }
}
