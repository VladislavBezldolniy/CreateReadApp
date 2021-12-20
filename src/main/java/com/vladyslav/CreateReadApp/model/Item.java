package com.vladyslav.CreateReadApp.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.*;
@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;
    @NotEmpty(message = "Name cannot be empty or null")
    private String name;
    private String description;
    private String imageUrl;

}
