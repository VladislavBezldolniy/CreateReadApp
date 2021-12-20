package com.vladyslav.CreateReadApp.service;

import com.vladyslav.CreateReadApp.model.Item;
import com.vladyslav.CreateReadApp.repo.ItemRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ItemServiceImpl implements ItemService{

    private final ItemRepo itemRepo;

    @Override
    public Item create(Item item) {
        item.setImageUrl(setItemUrl());
        return itemRepo.save(item);
    }

    @Override
    public Collection<Item> list() {
        return itemRepo.findAll();
    }

    @Override
    public Item get(Long id) {
        return itemRepo.findById(id).get();
    }

    @Override
    public Item update(Item item) {
        return itemRepo.save(item);
    }

    @Override
    public boolean delete(Long id) {
        itemRepo.deleteById(id);
        return true;
    }

    private String setItemUrl() {
        return null;
    }
}
