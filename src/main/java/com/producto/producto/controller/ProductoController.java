package com.producto.producto.controller;

import com.producto.producto.entity.Producto;
import com.producto.producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public List<Producto> productos(){
        return productoService.productos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> producto(@PathVariable BigInteger id){
        /*if (productoService.producto(id).isPresent()){
            return ResponseEntity.ok(productoService.producto(id));
        }*/
        return productoService.producto(id);
    }

    /*@PostMapping("/productos")
    public Producto saveProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }*/
}
