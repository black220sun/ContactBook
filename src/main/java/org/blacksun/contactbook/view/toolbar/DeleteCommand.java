package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;

import java.util.function.Supplier;

class DeleteCommand implements Command {
    private final ContactBookController controller;
    private final Supplier<String> nameSupplier;

    DeleteCommand(ContactBookController controller, Supplier<String> nameSupplier) {
        this.controller = controller;
        this.nameSupplier = nameSupplier;
    }

    @Override
    public boolean execute() {
        final String name = nameSupplier.get();
        if (!name.isEmpty()) {
            controller.removeContact(name);
            return true;
        }
        return false;
    }
}
