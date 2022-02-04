package com.vladyslav.CreateReadApp.repo;

import com.vladyslav.CreateReadApp.model.Ammo;
import com.vladyslav.CreateReadApp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmmoRepo extends JpaRepository<Ammo, Long> {
}
