package com.vladyslav.CreateReadApp.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

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
}
