package org.blacksun.contactbook.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ContactBook implements Storage<String, Contact> {
    private final HashMap<String, Contact> contacts;

    public ContactBook() {
        contacts = new HashMap<>();
    }

    @Override
    public List<Contact> getAll() {
        return new ArrayList<>(contacts.values());
    }

    @Override
    public Optional<Contact> getOne(String name) {
        return Optional.ofNullable(contacts.get(name));
    }

    @Override
    public boolean addOne(Contact contact) {
        final String name = contact.getId();
        if (contacts.containsKey(name))
            return false;
        contacts.put(name, contact);
        return true;
    }

    @Override
    public boolean remove(String name) {
        return contacts.remove(name) != null;
    }

    @Override
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
