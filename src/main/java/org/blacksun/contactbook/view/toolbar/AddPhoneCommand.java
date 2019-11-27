package org.blacksun.contactbook.view.toolbar;

import org.blacksun.contactbook.controller.ContactBookController;

import java.util.function.Supplier;

class AddPhoneCommand implements Command {
    private final ContactBookController controller;
    private final Supplier<String> nameSupplier;
    private final Supplier<String> phoneSupplier;

    AddPhoneCommand(ContactBookController controller, Supplier<String> nameSupplier, Supplier<String> phoneSupplier) {
        this.controller = controller;
        this.nameSupplier = nameSupplier;
        this.phoneSupplier = phoneSupplier;
    }

    @Override
    public boolean execute() {
        controller.addPhoneNumber(nameSupplier.get(), phoneSupplier.get());
        return true;
    }
}
