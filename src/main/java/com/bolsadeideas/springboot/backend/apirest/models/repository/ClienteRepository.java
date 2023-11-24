package com.bolsadeideas.springboot.backend.apirest.models.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Distrito;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    //Aca tenemos que mapear (asignar) este método a una consulta JPQL(JPA Quer

	@Query("from Distrito")
	public List<Distrito>findAllDistrito();
}
