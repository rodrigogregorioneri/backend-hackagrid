package br.com.neri.hackagrid.business;

import br.com.neri.hackagrid.model.Produtos;
import br.com.neri.hackagrid.model.Seguradora;
import br.com.neri.hackagrid.repository.SeguradoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SeguradoraBusiness {

    @Autowired
    private SeguradoraRepository seguradoraRepository;

    public Seguradora createSeguradora(Seguradora seguradora){
        return seguradoraRepository.save(seguradora);
    }

    public List<Seguradora> listSeguradora(){
        return seguradoraRepository.findAll();
    }

   public Seguradora findSeguradora(String id){
      return  seguradoraRepository.findById(id).get();
   }

    public void addProdutoSeguradora(String idSeguradora, Produtos produtos){
        produtos.setId(UUID.randomUUID().toString());
        Seguradora seguradora = findSeguradora(idSeguradora);
        List<Produtos> prod = seguradora.getListaProdutos();
        prod.add(produtos);

        seguradora.setListaProdutos(prod);
        seguradoraRepository.save(seguradora);
    }

    public List<Produtos> listProdutosByIdSeguradora(String idSeguradora){
       Seguradora seguradora = findSeguradora(idSeguradora);
       return  seguradora.getListaProdutos();
    }
}
