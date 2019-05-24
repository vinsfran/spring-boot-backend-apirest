package com.bolsadeideas.springboot.backend.apirest.springbootbackendapirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

    Page<Cliente> findAllByOrderByIdAsc(Pageable pageable);
}
