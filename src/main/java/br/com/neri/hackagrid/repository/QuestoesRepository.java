package br.com.neri.hackagrid.repository;

import br.com.neri.hackagrid.model.Questoes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestoesRepository extends MongoRepository<Questoes, String> {
}
