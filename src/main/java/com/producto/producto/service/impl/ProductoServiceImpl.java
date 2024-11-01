package com.producto.producto.service.impl;

import com.producto.producto.entity.Producto;
import com.producto.producto.repository.ProductoRepository;
import com.producto.producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private  ProductoRepository productoRepository;


    @Override
    public List<Producto> productos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto producto(BigInteger id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

}
