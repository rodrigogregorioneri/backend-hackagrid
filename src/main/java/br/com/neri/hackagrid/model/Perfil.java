package br.com.neri.hackagrid.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Profile {

    @Id
    @JsonIgnore
    private String id;

    private String nomePerfil;

    private int valorPerfil;

    private String descricaoPerfil;




}
