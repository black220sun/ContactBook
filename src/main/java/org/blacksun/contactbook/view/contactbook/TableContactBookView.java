package org.blacksun.contactbook.view.contactbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class TableContactBookView extends JList<Object> implements UpdatableComponent {
    private final ContactBookModel model;

    @Autowired
    public TableContactBookView(ContactBookModel model) {
        this.model = model;
        setModel(model);
        addListSelectionListener(e -> clearSelection()); // dirty hack to preserve icon
    }

    @Override
    public TableContactBookView getComponent() {
        return this;
    }

    @Override
    public void update() {
        model.update();
    }
}
