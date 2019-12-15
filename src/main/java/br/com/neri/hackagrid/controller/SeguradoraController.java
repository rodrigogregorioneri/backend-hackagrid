package br.com.neri.hackagrid.controller;


import br.com.neri.hackagrid.business.SeguradoraBusiness;
import br.com.neri.hackagrid.model.Produtos;
import br.com.neri.hackagrid.model.Seguradora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/seguradora")
public class SeguradoraController {

    @Autowired
    private SeguradoraBusiness seguradoraBusiness;

    @PostMapping
    public Seguradora createSeguradora(@RequestBody Seguradora seguradora){
        return seguradoraBusiness.createSeguradora(seguradora);
    }

    @PutMapping("/{idSeguradora}")
    public void addProdutoSeguradora(@PathVariable(name = "idSeguradora", required = true) String idSeguradora,@RequestBody Produtos produtos){
       seguradoraBusiness.addProdutoSeguradora(idSeguradora, produtos);
    }

    @GetMapping
    public List<Seguradora> listSeguradora(){
        return seguradoraBusiness.listSeguradora();
    }

    @GetMapping("/findById/{id}")
    public Seguradora findSeguradoraById(@PathVariable(name = "id", required = true) String id){
        return seguradoraBusiness.findSeguradora(id);
    }
}
