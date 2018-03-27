package com.equipo4.principal.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.equipo4.principal.model.Cuenta4;

@RepositoryRestResource(collectionResourceRel = "cuenta4", path="cuenta4")
public interface CuentaRepository extends PagingAndSortingRepository<Cuenta4, Long>{ 
	
}