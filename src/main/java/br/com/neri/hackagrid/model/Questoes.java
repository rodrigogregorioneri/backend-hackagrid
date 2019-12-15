package br.com.neri.hackagrid.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Question {

    @Id
    @JsonIgnore
    private String id;

    private String raca;

    private int peso;

    private int idade;

    private String cor;

    private String vacinado;

    private int qtdVacinas;

    private String ultimaTosa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getVacinado() {
        return vacinado;
    }

    public void setVacinado(String vacinado) {
        this.vacinado = vacinado;
    }

    public int getQtdVacinas() {
        return qtdVacinas;
    }

    public void setQtdVacinas(int qtdVacinas) {
        this.qtdVacinas = qtdVacinas;
    }

    public String getUltimaTosa() {
        return ultimaTosa;
    }

    public void setUltimaTosa(String ultimaTosa) {
        this.ultimaTosa = ultimaTosa;
    }
}
