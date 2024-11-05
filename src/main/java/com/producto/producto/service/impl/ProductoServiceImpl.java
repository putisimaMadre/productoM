package com.producto.producto.service.impl;

import com.producto.producto.entity.Producto;
import com.producto.producto.repository.ProductoRepository;
import com.producto.producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository productoRepository;
    private final Environment environment;

    public ProductoServiceImpl(ProductoRepository productoRepository, Environment environment) {
        this.productoRepository = productoRepository;
        this.environment = environment;
    }


    @Override
    public List<Producto> productos() {
        return productoRepository.findAll()
                .stream()
                .map(p -> {
                    p.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
                            return p;
                }).collect(Collectors.toList());
    }

    @Override
    public Optional<Producto> producto(BigInteger id) {
        return productoRepository.findById(id)
                .map(p -> {p.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
                    return p;
                });
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

}
