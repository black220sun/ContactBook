package org.blacksun.contactbook.view;

import org.blacksun.contactbook.view.contactbook.UpdatableComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class ViewPanel extends JScrollPane {
    @Autowired
    public ViewPanel(UpdatableComponent bookView) {
        super();
        setViewportView(bookView.getComponent());
    }
}
