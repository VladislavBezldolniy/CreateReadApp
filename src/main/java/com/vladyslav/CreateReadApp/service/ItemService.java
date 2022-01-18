package com.vladyslav.CreateReadApp.service;

import com.vladyslav.CreateReadApp.model.Item;

import java.util.Collection;

public interface ItemService<T> {
    T create(T item);
    Collection<T> list();
    T get(Long id);
    T update(T item);
    boolean delete(Long id);
}
