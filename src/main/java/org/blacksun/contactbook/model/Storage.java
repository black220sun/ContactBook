package org.blacksun.contactbook.model;

import java.util.List;
import java.util.Optional;

public interface Storage<ID, T extends Identifiable<ID>> {
    List<T> getAll();

    Optional<T> getOne(ID id);

    boolean addOne(T entity);

    boolean remove(ID id);

    void clear();
}
