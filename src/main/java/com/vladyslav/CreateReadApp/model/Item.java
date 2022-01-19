package com.vladyslav.CreateReadApp.model;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import java.util.Objects;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Getter @Setter @ToString
@Inheritance @DiscriminatorColumn(
        name = "ITEM_TYPE",
        discriminatorType = DiscriminatorType.STRING)

public abstract class Item {
    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;
    @NotEmpty(message = "Name cannot be empty or null")
    private String name;
    private double price;
    private String description;
    private String imageUrl;

    public Item(){}

    public Item(String name, double price, String description, String imageUrl) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 && name.equals(item.name) && Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description);
    }
}
