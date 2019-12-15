package br.com.neri.hackagrid.repository;

import br.com.neri.hackagrid.model.Seguradora;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeguradoraRepository extends MongoRepository<Seguradora, String> {
}
