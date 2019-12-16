package com.robert.invoiceproject.Service;

import com.robert.invoiceproject.entity.Usuario;

public interface IUsuarioService {

    public Usuario findByusername(String username);
}
