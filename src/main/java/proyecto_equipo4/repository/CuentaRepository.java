package proyecto_equipo4.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import proyecto_equipo4.model.Cuenta4;

@RepositoryRestResource(collectionResourceRel = "cuenta4", path="cuenta4")
public interface CuentaRepository extends PagingAndSortingRepository<Cuenta4, Long>{ 
	
}