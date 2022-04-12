package lt.ku.klientai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.ku.klientai.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
