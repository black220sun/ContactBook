package org.blacksun.contactbook.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ContactBook {
    private final HashMap<String, Contact> contacts;

    public ContactBook() {
        contacts = new HashMap<>();
    }

    public List<Contact> getContacts() {
        return new ArrayList<>(contacts.values());
    }

    public Optional<Contact> getContact(String name) {
        return Optional.ofNullable(contacts.get(name));
    }

    public boolean addContact(Contact contact) {
        final String name = contact.getName();
        if (contacts.containsKey(name))
            return false;
        contacts.put(name, contact);
        return true;
    }

    public boolean removeContact(String name) {
        return contacts.remove(name) != null;
    }

    public void clear() {
        contacts.clear();
    }

    public List<Contact> contactsByPhoneNumber(String phoneNumber) {
        return contacts.values().stream()
                .filter(it -> it.getName().equals(phoneNumber))
                .collect(Collectors.toList());
    }

    public int size() {
        return contacts.size();
    }
}
