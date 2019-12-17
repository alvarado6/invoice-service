package com.robert.invoiceproject.repository;

import com.robert.invoiceproject.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductoRepository extends CrudRepository<Producto, Long> {

    List<Producto> findByNombreContainingIgnoreCase(String term);
}
