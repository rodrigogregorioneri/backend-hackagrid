package br.com.neri.hackagrid.controller;

import br.com.neri.hackagrid.integration.matera.AuthenticateMatera;
import br.com.neri.hackagrid.integration.matera.dto.RequestAccount;
import br.com.neri.hackagrid.integration.matera.dto.ResponseAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/teste")
public class TestController {

    @Autowired
    private AuthenticateMatera authenticateMatera;

    @PostMapping
    public ResponseAccount createAccount(@RequestBody RequestAccount request){
        return authenticateMatera.criaContaFisica(request);
    }
}
