package br.com.neri.hackagrid.controller;

import br.com.neri.hackagrid.business.CarrinhoBusiness;
import br.com.neri.hackagrid.dto.RequestAddCarrinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoBusiness carrinhoBusiness;

    public void addCarrinho(@RequestBody RequestAddCarrinho requestAddCarrinho){
        carrinhoBusiness.addProdutoCarrinho(requestAddCarrinho);
    }
}
