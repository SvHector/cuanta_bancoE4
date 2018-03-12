package proyecto_equipo4.service;
import proyecto_equipo4.repository.RepositoryCLient;
import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClientService
{
	private RepositoryCLient repositoryClient;

	public RepositoryCLient getRepositoryClient() {
		return repositoryClient;
	}

	public void setRepositoryClient(RepositoryCLient repositoryClient) {
		this.repositoryClient = repositoryClient;
	}	
}

