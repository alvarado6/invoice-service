package com.robert.invoiceproject.repository;

import com.robert.invoiceproject.entity.Cliente;
import com.robert.invoiceproject.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("FROM Region")
    public List<Region> findAllRegiones();
}
