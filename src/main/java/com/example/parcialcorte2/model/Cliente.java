package com.example.parcialcorte2.model;

public class Cliente {
    private String name;
    private Integer edad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Cliente(String name, Integer edad) {
        this.name = name;
        this.edad = edad;
    }
}
