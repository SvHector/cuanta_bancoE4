package proyecto_equipo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.stereotype.Repository;
import proyecto_equipo4.model.Client4;

@Repository
public interface RepositoryCLient extends JpaRepository <Client4, String>
{
	
}
 	 	