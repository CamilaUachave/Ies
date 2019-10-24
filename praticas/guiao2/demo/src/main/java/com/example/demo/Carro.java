package com.example.demo;

public class Carro {
    private static long count = 1;
    private final long id;
    private final String marca;

    public Carro(String marca) {
        this.id = count;
        this.marca = marca;
        count ++;
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

}