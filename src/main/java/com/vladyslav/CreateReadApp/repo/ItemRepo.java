package com.vladyslav.CreateReadApp.repo;

import com.vladyslav.CreateReadApp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Long> {
}
