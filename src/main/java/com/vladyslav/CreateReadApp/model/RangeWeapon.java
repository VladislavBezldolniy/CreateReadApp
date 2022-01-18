package com.vladyslav.CreateReadApp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "RANGE_WEAPON")
public class RangeWeapon extends Item {

    public RangeWeapon(){}

    public RangeWeapon(String name, double price, String description, String imageUrl) {
        super(name, price, description, imageUrl);
    }
}
