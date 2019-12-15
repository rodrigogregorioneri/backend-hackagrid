package br.com.neri.hackagrid.integration.nfe.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "natureza_operacao",
        "data_emissao",
        "tipo_documento",
        "local_destino",
        "finalidade_emissao",
        "consumidor_final",
        "presenca_comprador",
        "cnpj_emitente",
        "inscricao_estadual_emitente",
        "logradouro_emitente",
        "numero_emitente",
        "bairro_emitente",
        "municipio_emitente",
        "uf_emitente",
        "regime_tributario_emitente",
        "nome_destinatario",
        "cnpj_destinatario",
        "cpf_destinatario",
        "inscricao_estadual_destinatario",
        "logradouro_destinatario",
        "numero_destinatario",
        "bairro_destinatario",
        "municipio_destinatario",
        "uf_destinatario",
        "indicador_inscricao_estadual_destinatario",
        "Items"
})
public class RequestNfe {

    @JsonProperty("natureza_operacao")
    private String naturezaOperacao;
    @JsonProperty("data_emissao")
    private String dataEmissao;
    @JsonProperty("tipo_documento")
    private Integer tipoDocumento;
    @JsonProperty("local_destino")
    private Integer localDestino;
    @JsonProperty("finalidade_emissao")
    private Integer finalidadeEmissao;
    @JsonProperty("consumidor_final")
    private Integer consumidorFinal;
    @JsonProperty("presenca_comprador")
    private Integer presencaComprador;
    @JsonProperty("cnpj_emitente")
    private String cnpjEmitente;
    @JsonProperty("inscricao_estadual_emitente")
    private String inscricaoEstadualEmitente;
    @JsonProperty("logradouro_emitente")
    private String logradouroEmitente;
    @JsonProperty("numero_emitente")
    private String numeroEmitente;
    @JsonProperty("bairro_emitente")
    private String bairroEmitente;
    @JsonProperty("municipio_emitente")
    private String municipioEmitente;
    @JsonProperty("uf_emitente")
    private String ufEmitente;
    @JsonProperty("regime_tributario_emitente")
    private Integer regimeTributarioEmitente;
    @JsonProperty("nome_destinatario")
    private String nomeDestinatario;
    @JsonProperty("cnpj_destinatario")
    private String cnpjDestinatario;
    @JsonProperty("cpf_destinatario")
    private String cpfDestinatario;
    @JsonProperty("inscricao_estadual_destinatario")
    private String inscricaoEstadualDestinatario;
    @JsonProperty("logradouro_destinatario")
    private String logradouroDestinatario;
    @JsonProperty("numero_destinatario")
    private String numeroDestinatario;
    @JsonProperty("bairro_destinatario")
    private String bairroDestinatario;
    @JsonProperty("municipio_destinatario")
    private String municipioDestinatario;
    @JsonProperty("uf_destinatario")
    private String ufDestinatario;
    @JsonProperty("indicador_inscricao_estadual_destinatario")
    private Integer indicadorInscricaoEstadualDestinatario;
    @JsonProperty("Items")
    private List<Item> items = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("natureza_operacao")
    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    @JsonProperty("natureza_operacao")
    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    @JsonProperty("data_emissao")
    public String getDataEmissao() {
        return dataEmissao;
    }

    @JsonProperty("data_emissao")
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @JsonProperty("tipo_documento")
    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    @JsonProperty("tipo_documento")
    public void setTipoDocumento(Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @JsonProperty("local_destino")
    public Integer getLocalDestino() {
        return localDestino;
    }

    @JsonProperty("local_destino")
    public void setLocalDestino(Integer localDestino) {
        this.localDestino = localDestino;
    }

    @JsonProperty("finalidade_emissao")
    public Integer getFinalidadeEmissao() {
        return finalidadeEmissao;
    }

    @JsonProperty("finalidade_emissao")
    public void setFinalidadeEmissao(Integer finalidadeEmissao) {
        this.finalidadeEmissao = finalidadeEmissao;
    }

    @JsonProperty("consumidor_final")
    public Integer getConsumidorFinal() {
        return consumidorFinal;
    }

    @JsonProperty("consumidor_final")
    public void setConsumidorFinal(Integer consumidorFinal) {
        this.consumidorFinal = consumidorFinal;
    }

    @JsonProperty("presenca_comprador")
    public Integer getPresencaComprador() {
        return presencaComprador;
    }

    @JsonProperty("presenca_comprador")
    public void setPresencaComprador(Integer presencaComprador) {
        this.presencaComprador = presencaComprador;
    }

    @JsonProperty("cnpj_emitente")
    public String getCnpjEmitente() {
        return cnpjEmitente;
    }

    @JsonProperty("cnpj_emitente")
    public void setCnpjEmitente(String cnpjEmitente) {
        this.cnpjEmitente = cnpjEmitente;
    }

    @JsonProperty("inscricao_estadual_emitente")
    public String getInscricaoEstadualEmitente() {
        return inscricaoEstadualEmitente;
    }

    @JsonProperty("inscricao_estadual_emitente")
    public void setInscricaoEstadualEmitente(String inscricaoEstadualEmitente) {
        this.inscricaoEstadualEmitente = inscricaoEstadualEmitente;
    }

    @JsonProperty("logradouro_emitente")
    public String getLogradouroEmitente() {
        return logradouroEmitente;
    }

    @JsonProperty("logradouro_emitente")
    public void setLogradouroEmitente(String logradouroEmitente) {
        this.logradouroEmitente = logradouroEmitente;
    }

    @JsonProperty("numero_emitente")
    public String getNumeroEmitente() {
        return numeroEmitente;
    }

    @JsonProperty("numero_emitente")
    public void setNumeroEmitente(String numeroEmitente) {
        this.numeroEmitente = numeroEmitente;
    }

    @JsonProperty("bairro_emitente")
    public String getBairroEmitente() {
        return bairroEmitente;
    }

    @JsonProperty("bairro_emitente")
    public void setBairroEmitente(String bairroEmitente) {
        this.bairroEmitente = bairroEmitente;
    }

    @JsonProperty("municipio_emitente")
    public String getMunicipioEmitente() {
        return municipioEmitente;
    }

    @JsonProperty("municipio_emitente")
    public void setMunicipioEmitente(String municipioEmitente) {
        this.municipioEmitente = municipioEmitente;
    }

    @JsonProperty("uf_emitente")
    public String getUfEmitente() {
        return ufEmitente;
    }

    @JsonProperty("uf_emitente")
    public void setUfEmitente(String ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    @JsonProperty("regime_tributario_emitente")
    public Integer getRegimeTributarioEmitente() {
        return regimeTributarioEmitente;
    }

    @JsonProperty("regime_tributario_emitente")
    public void setRegimeTributarioEmitente(Integer regimeTributarioEmitente) {
        this.regimeTributarioEmitente = regimeTributarioEmitente;
    }

    @JsonProperty("nome_destinatario")
    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    @JsonProperty("nome_destinatario")
    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    @JsonProperty("cnpj_destinatario")
    public String getCnpjDestinatario() {
        return cnpjDestinatario;
    }

    @JsonProperty("cnpj_destinatario")
    public void setCnpjDestinatario(String cnpjDestinatario) {
        this.cnpjDestinatario = cnpjDestinatario;
    }

    @JsonProperty("cpf_destinatario")
    public String getCpfDestinatario() {
        return cpfDestinatario;
    }

    @JsonProperty("cpf_destinatario")
    public void setCpfDestinatario(String cpfDestinatario) {
        this.cpfDestinatario = cpfDestinatario;
    }

    @JsonProperty("inscricao_estadual_destinatario")
    public String getInscricaoEstadualDestinatario() {
        return inscricaoEstadualDestinatario;
    }

    @JsonProperty("inscricao_estadual_destinatario")
    public void setInscricaoEstadualDestinatario(String inscricaoEstadualDestinatario) {
        this.inscricaoEstadualDestinatario = inscricaoEstadualDestinatario;
    }

    @JsonProperty("logradouro_destinatario")
    public String getLogradouroDestinatario() {
        return logradouroDestinatario;
    }

    @JsonProperty("logradouro_destinatario")
    public void setLogradouroDestinatario(String logradouroDestinatario) {
        this.logradouroDestinatario = logradouroDestinatario;
    }

    @JsonProperty("numero_destinatario")
    public String getNumeroDestinatario() {
        return numeroDestinatario;
    }

    @JsonProperty("numero_destinatario")
    public void setNumeroDestinatario(String numeroDestinatario) {
        this.numeroDestinatario = numeroDestinatario;
    }

    @JsonProperty("bairro_destinatario")
    public String getBairroDestinatario() {
        return bairroDestinatario;
    }

    @JsonProperty("bairro_destinatario")
    public void setBairroDestinatario(String bairroDestinatario) {
        this.bairroDestinatario = bairroDestinatario;
    }

    @JsonProperty("municipio_destinatario")
    public String getMunicipioDestinatario() {
        return municipioDestinatario;
    }

    @JsonProperty("municipio_destinatario")
    public void setMunicipioDestinatario(String municipioDestinatario) {
        this.municipioDestinatario = municipioDestinatario;
    }

    @JsonProperty("uf_destinatario")
    public String getUfDestinatario() {
        return ufDestinatario;
    }

    @JsonProperty("uf_destinatario")
    public void setUfDestinatario(String ufDestinatario) {
        this.ufDestinatario = ufDestinatario;
    }

    @JsonProperty("indicador_inscricao_estadual_destinatario")
    public Integer getIndicadorInscricaoEstadualDestinatario() {
        return indicadorInscricaoEstadualDestinatario;
    }

    @JsonProperty("indicador_inscricao_estadual_destinatario")
    public void setIndicadorInscricaoEstadualDestinatario(Integer indicadorInscricaoEstadualDestinatario) {
        this.indicadorInscricaoEstadualDestinatario = indicadorInscricaoEstadualDestinatario;
    }

    @JsonProperty("Items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("Items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
