package com.equipo4.principal.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.equipo4.principal.model.Cliente4;

@RepositoryRestResource(collectionResourceRel = "cliente4", path="cliente4")
public interface ClientRepository extends PagingAndSortingRepository<Cliente4, Long>{ 

	
}
 	 	