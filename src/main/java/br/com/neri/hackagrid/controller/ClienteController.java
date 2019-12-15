package br.com.neri.hackagrid.controller;

import br.com.neri.hackagrid.business.ClienteBusiness;
import br.com.neri.hackagrid.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/cliente")
public class ClienteController {

    @Autowired
    private ClienteBusiness clienteBusiness;

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteBusiness.createCliente(cliente);
    }

    @GetMapping
    public List<Cliente> listCliente(){
        return clienteBusiness.listCliente();
    }

    @GetMapping("/findById/{id}")
    public Cliente findClienteById(@PathVariable(name = "id", required = true) String id){
        return new Cliente();
    }

    @PutMapping("/perfil/{idCliente}/{idPerfil}")
    public void associarPerfilCliente(@PathVariable(name = "idCliente", required = true)String idCliente, @PathVariable(name = "idPerfil", required = true) String idPerfil){
        clienteBusiness.associarPerfil(idCliente, idPerfil);
    }
}
