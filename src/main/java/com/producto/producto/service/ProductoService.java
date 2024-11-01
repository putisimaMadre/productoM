package com.producto.producto.service;

import com.producto.producto.entity.Producto;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> productos();
    Producto producto(BigInteger id);

    Producto saveProducto(Producto producto);
}
