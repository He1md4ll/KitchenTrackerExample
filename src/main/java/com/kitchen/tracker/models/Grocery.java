package com.kitchen.tracker.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "groveries")
public class Grocery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private int value;

    public Grocery(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
