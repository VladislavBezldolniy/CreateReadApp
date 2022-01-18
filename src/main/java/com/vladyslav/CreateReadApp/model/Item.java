package com.vladyslav.CreateReadApp.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.*;

@Entity
@Data
@Inheritance
@DiscriminatorColumn(
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
}
