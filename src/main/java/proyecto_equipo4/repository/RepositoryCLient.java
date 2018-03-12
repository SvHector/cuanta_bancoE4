package proyecto_equipo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import proyecto_equipo4.model.Cliente4;

@Repository
public interface RepositoryCLient extends JpaRepository <Cliente4, String>
{
	
}
 	 	