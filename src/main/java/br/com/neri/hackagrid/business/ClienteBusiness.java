package br.com.neri.hackagrid.business;

import br.com.neri.hackagrid.model.Cliente;
import br.com.neri.hackagrid.model.Perfil;
import br.com.neri.hackagrid.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteBusiness {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente createCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listCliente() {
        return clienteRepository.findAll();
    }

    public Cliente findById(String id){
      return clienteRepository.findById(id).get();
    }

    public void associarPerfil(String id, String idPerfil){
        Cliente cliente = findById(id);
        cliente.setIdProfileCliente(idPerfil);
        clienteRepository.save(cliente);
    }
}
