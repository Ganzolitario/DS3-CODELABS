package com.example.pedidoservice.models;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}