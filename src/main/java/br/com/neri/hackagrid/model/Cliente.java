package br.com.neri.hackagrid.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Cliente {

    private String id;

    private String nomeAnimalCliente;

    private String responsavelAnimal;

    private String idProfileCliente;

    private String idProdutoCliente;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeAnimalCliente() {
        return nomeAnimalCliente;
    }

    public void setNomeAnimalCliente(String nomeAnimalCliente) {
        this.nomeAnimalCliente = nomeAnimalCliente;
    }

    public String getResponsavelAnimal() {
        return responsavelAnimal;
    }

    public void setResponsavelAnimal(String responsavelAnimal) {
        this.responsavelAnimal = responsavelAnimal;
    }

    public String getIdProfileCliente() {
        return idProfileCliente;
    }

    public void setIdProfileCliente(String idProfileCliente) {
        this.idProfileCliente = idProfileCliente;
    }

    public String getIdProdutoCliente() {
        return idProdutoCliente;
    }

    public void setIdProdutoCliente(String idProdutoCliente) {
        this.idProdutoCliente = idProdutoCliente;
    }
}
