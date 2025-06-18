package com.example.productservice.models;

public record Producto(
        Long id,
        String nombre,
        Double precio
) {}