package br.com.neri.hackagrid.business;

import br.com.neri.hackagrid.model.Questoes;
import br.com.neri.hackagrid.repository.QuestoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestoesBusiness {

    @Autowired
    private QuestoesRepository questoesRepository;

    public Questoes createQuestoes(Questoes questoes){
        return questoesRepository.save(questoes);
    }

    public List<Questoes> listQuestoes(){
       return questoesRepository.findAll();
    }


}
