package com.producto.producto.repository;

import com.producto.producto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, BigInteger> {
}
