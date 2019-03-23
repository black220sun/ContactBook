package org.blacksun.contactbook.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Contact implements Identifiable<String> {
    private final String name;
    private final List<String> phoneNumbers;

    public Contact(String name, String... phoneNumbers) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>(Arrays.asList(phoneNumbers));
    }

    @Override
    public String getId() {
        return name;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public boolean addPhoneNumber(String phoneNumber) {
        if (phoneNumbers.contains(phoneNumber))
            return false;
        phoneNumbers.add(phoneNumber);
        return true;
    }

    public boolean removePhoneNumber(String phoneNumber) {
        return phoneNumbers.remove(phoneNumber);
    }

    public void removeAll() {
        phoneNumbers.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(phoneNumbers, contact.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumbers);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumbers='" + phoneNumbers + '\'' +
                '}';
    }
}
