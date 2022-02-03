package com.vladyslav.CreateReadApp.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Objects;

@Entity
@DiscriminatorValue("MELEE_WEAPON")
public class MeleeWeapon extends Item{
    @Enumerated(value = EnumType.STRING)
    private Dice meleeAttackDice;

    public MeleeWeapon(){}

    public MeleeWeapon(String name, double price, String description, String imageUrl, Dice meleeAttackDice) {
        super(name, price, description, imageUrl);
        this.meleeAttackDice = meleeAttackDice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MeleeWeapon that = (MeleeWeapon) o;
        return meleeAttackDice == that.meleeAttackDice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meleeAttackDice);
    }
}
