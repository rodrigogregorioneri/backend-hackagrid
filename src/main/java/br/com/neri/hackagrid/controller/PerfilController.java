package br.com.neri.hackagrid.controller;

import br.com.neri.hackagrid.business.PerfilBusiness;
import br.com.neri.hackagrid.model.Perfil;
import br.com.neri.hackagrid.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/perfil")
public class PerfilController {

    @Autowired
    private PerfilBusiness perfilBusiness;

    @PostMapping
    public Perfil createPerfil(@RequestBody Perfil perfil){
        return perfilBusiness.createPerfil(perfil);
    }

    @GetMapping
    public List<Perfil> listPerfil(){
        return perfilBusiness.listPerfil();
    }

    @GetMapping("/findById/{id}")
    public Perfil findPerfilById(@PathVariable(name = "id", required = true) String id){
        return perfilBusiness.getPerfil(id);
    }
}
