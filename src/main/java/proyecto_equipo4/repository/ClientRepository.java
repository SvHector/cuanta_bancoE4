package proyecto_equipo4.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import proyecto_equipo4.model.Cliente4;

@RepositoryRestResource(collectionResourceRel = "cliente4", path="cliente4")
public interface ClientRepository extends PagingAndSortingRepository<Cliente4, Long>{ 

	
}
 	 	