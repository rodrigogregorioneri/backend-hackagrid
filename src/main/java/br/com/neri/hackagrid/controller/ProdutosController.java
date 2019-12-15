package br.com.neri.hackagrid.controller;

import br.com.neri.hackagrid.business.SeguradoraBusiness;
import br.com.neri.hackagrid.model.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/produtos")
public class ProdutosController {

    @Autowired
    private SeguradoraBusiness seguradoraBusiness;

    @GetMapping("/{id}")
    public List<Produtos> listProdutosByIdSeguradora(@PathVariable(name = "id", required = true) String id){
        return seguradoraBusiness.listProdutosByIdSeguradora(id);
    }
}
