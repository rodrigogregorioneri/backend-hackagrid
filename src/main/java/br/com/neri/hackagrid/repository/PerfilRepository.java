package br.com.neri.hackagrid.repository;

import br.com.neri.hackagrid.model.Perfil;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PerfilRepository extends MongoRepository<Perfil, String> {
}
