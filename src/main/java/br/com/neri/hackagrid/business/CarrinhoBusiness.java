package br.com.neri.hackagrid.business;

import br.com.neri.hackagrid.dto.RequestAddCarrinho;
import br.com.neri.hackagrid.model.Carrinho;
import br.com.neri.hackagrid.model.Produtos;
import br.com.neri.hackagrid.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoBusiness {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public void addProdutoCarrinho(RequestAddCarrinho requestAddCarrinho){
        if(carrinhoRepository.findAll().get(0) == null){
            carrinhoRepository.save(new Carrinho());
        }
        Carrinho carrinho = carrinhoRepository.findAll().get(0);
        carrinho.setIdCliente(requestAddCarrinho.getIdCliente());
        carrinho.setIdProduto(requestAddCarrinho.getIdProduto());
        carrinho.setNomeProduto(requestAddCarrinho.getNomeProduto());
        carrinho.setValorTotal(requestAddCarrinho.getValorTotal());
        carrinhoRepository.save(carrinho);

    }
}
