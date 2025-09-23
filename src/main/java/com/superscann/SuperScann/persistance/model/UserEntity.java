package com.superscann.SuperScann.persistance.model;

import com.superscann.SuperScann.domain.model.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int rol; //0 -> Master, 1 -> Modder, 2 -> User
    private String name;
    private String password;
    private String email;

    public UserEntity () {

    }

    public UserEntity (int id, int rol, String name, String password, String email) {

        this.id = id;
        this.rol = rol;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
