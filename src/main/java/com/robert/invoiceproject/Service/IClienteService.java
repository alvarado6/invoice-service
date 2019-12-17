package com.robert.invoiceproject.Service;

import com.robert.invoiceproject.entity.Cliente;
import com.robert.invoiceproject.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public List<Producto> findByNameProducto(String name);

}
