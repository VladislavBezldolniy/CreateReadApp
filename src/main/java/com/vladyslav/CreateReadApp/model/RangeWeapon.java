package com.vladyslav.CreateReadApp.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@DiscriminatorValue(value = "RANGE_WEAPON")
@NoArgsConstructor
public class RangeWeapon extends Item {

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ammo_id")
    Ammo ammo;

    public RangeWeapon(String name, double price, String description, String imageUrl, Ammo ammo) {
        super(name, price, description, imageUrl);
        this.ammo = ammo;
    }

    public Ammo getAmmo() {
        return ammo;
    }
    public void setAmmo(Ammo ammo) {
        this.ammo = ammo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RangeWeapon that = (RangeWeapon) o;
        return ammo.equals(that.ammo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ammo);
    }
}
