package com.robert.invoiceproject.repository;

import com.robert.invoiceproject.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(String username);

    @Query("select u From Usuario u where u.username = ?1")
    Usuario findByUsername2(String username);
}
