package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;

class ClearButton implements Command {
    private final ContactBookController controller;

    ClearButton(ContactBookController controller) {
        this.controller = controller;
    }

    @Override
    public boolean execute() {
        controller.clear();
        return true;
    }
}
