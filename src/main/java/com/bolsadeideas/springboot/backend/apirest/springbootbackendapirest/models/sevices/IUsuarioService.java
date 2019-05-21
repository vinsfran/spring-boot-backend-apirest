package com.bolsadeideas.springboot.backend.apirest.springbootbackendapirest.models.sevices;

import com.bolsadeideas.springboot.backend.apirest.springbootbackendapirest.models.entity.Usuario;

public interface IUsuarioService {

    Usuario findByUsername(String username);
}
