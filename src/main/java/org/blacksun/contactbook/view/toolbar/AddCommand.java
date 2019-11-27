package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;
import org.blacksun.contactbook.model.Contact;

import java.util.function.Supplier;

class AddCommand implements Command {
    private final ContactBookController controller;
    private final Supplier<String> nameSupplier;
    private final Supplier<String> phoneSupplier;

    AddCommand(ContactBookController controller, Supplier<String> nameSupplier, Supplier<String> phoneSupplier) {
        this.controller = controller;
        this.nameSupplier = nameSupplier;
        this.phoneSupplier = phoneSupplier;
    }

    @Override
    public boolean execute() {
        final String name = nameSupplier.get();
        if (!name.isEmpty()) {
            controller.addContact(new Contact(name, phoneSupplier.get()));
            return true;
        }
        return false;
    }
}
