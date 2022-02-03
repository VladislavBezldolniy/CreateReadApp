package com.vladyslav.CreateReadApp.model;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Getter @Setter @ToString
@Inheritance @DiscriminatorColumn(
        name = "ITEM_TYPE",
        discriminatorType = DiscriminatorType.STRING)

public abstract class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "item_id")
    private long id;
    @NotEmpty(message = "Name cannot be empty or null")
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "description")
    private String description;
    @Column(name = "image_url")
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
