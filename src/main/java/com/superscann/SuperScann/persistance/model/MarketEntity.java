package com.superscann.SuperScann.persistance.model;

import jakarta.persistence.*;

@Entity
@Table(name = "supermarket")
public class MarketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;

    public MarketEntity () {

    }

    public MarketEntity (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
