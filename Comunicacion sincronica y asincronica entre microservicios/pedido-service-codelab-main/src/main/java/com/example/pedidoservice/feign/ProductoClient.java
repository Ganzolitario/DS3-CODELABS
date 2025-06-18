package com.example.pedidoservice.feign;

import com.example.pedidoservice.models.ProductoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "product-service")  // Nombre en Eureka
public interface ProductoClient {
    @GetMapping("/productos")
    List<ProductoDTO> obtenerProductos();
}