package br.com.neri.hackagrid.repository;

import br.com.neri.hackagrid.model.Carrinho;
import br.com.neri.hackagrid.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarrinhoRepository extends MongoRepository<Carrinho, String> {
}
