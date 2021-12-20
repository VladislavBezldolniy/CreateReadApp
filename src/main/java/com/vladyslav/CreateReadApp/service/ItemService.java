package com.vladyslav.CreateReadApp.service;

import com.vladyslav.CreateReadApp.model.Item;

import java.util.Collection;

public interface ItemService {
    Item create(Item item);
    Collection<Item> list();
    Item get(Long id);
    Item update(Item item);
    boolean delete(Long id);

}
