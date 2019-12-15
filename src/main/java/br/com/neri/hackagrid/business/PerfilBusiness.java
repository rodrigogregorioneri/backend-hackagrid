package br.com.neri.hackagrid.business;

import br.com.neri.hackagrid.model.Perfil;
import br.com.neri.hackagrid.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilBusiness {

    @Autowired
    private PerfilRepository perfilRepository;

    public Perfil createPerfil(Perfil perfil){
     return perfilRepository.save(perfil);
    }

    public List<Perfil> listPerfil(){
        return perfilRepository.findAll();
    }

    public Perfil getPerfil(String id){
        return perfilRepository.findById(id).get();
    }
}
