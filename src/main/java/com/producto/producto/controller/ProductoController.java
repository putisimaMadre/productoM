package com.producto.producto.controller;

import com.producto.producto.entity.Producto;
import com.producto.producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;

@RestController
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public ResponseEntity<?> productos(){
        return ResponseEntity.ok(productoService.productos());
    }

    @GetMapping("/{id}")
    public Producto producto(@PathVariable BigInteger id){
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
