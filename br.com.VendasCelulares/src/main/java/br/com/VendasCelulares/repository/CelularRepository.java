package br.com.VendasCelulares.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.VendasCelulares.model.Celular;

@Repository
public interface CelularRepository extends CrudRepository<Celular, Integer>{

}
