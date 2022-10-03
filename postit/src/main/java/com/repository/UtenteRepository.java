package com.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.repository.entities.Utente;

@Repository
public interface UtenteRepository extends CrudRepository<Utente, Integer> {
	
	public Optional<Utente> findByUsername(String nomeUtente);

	public Utente findByUsernameAndPassword(String nomeUtente, String password);

}
