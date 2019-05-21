package com.bolsadeideas.springboot.backend.apirest.springbootbackendapirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.springbootbackendapirest.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(String username);

    @Query("select u from Usuario u where u.username=?1")
    Usuario findByUsername2(String username);
}
