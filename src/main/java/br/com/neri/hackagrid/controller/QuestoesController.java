package br.com.neri.hackagrid.controller;

import br.com.neri.hackagrid.business.QuestoesBusiness;
import br.com.neri.hackagrid.model.Questoes;
import br.com.neri.hackagrid.repository.QuestoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/questoes")
public class QuestoesController {

    @Autowired
    private QuestoesBusiness questoesBusiness;

    @PostMapping
    public Questoes createQuestoes(@RequestBody Questoes questoes){
        return questoesBusiness.createQuestoes(questoes);
    }

    @GetMapping
    public List<Questoes> listQuestoes(){
        return questoesBusiness.listQuestoes();
    }

   /** @GetMapping("/findById/{id}")
    public Questoes findQuestoesById(String id) {
        return new Questoes();
    }
    **/

    }
