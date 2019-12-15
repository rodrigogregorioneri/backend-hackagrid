package br.com.neri.hackagrid.integration.nfe.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numero_item",
    "codigo_produto",
    "descricao",
    "cfop",
    "quantidade_comercial",
    "quantidade_tributavel",
    "valor_unitario_comercial",
    "valor_unitario_tributavel",
    "unidade_comercial",
    "unidade_tributavel",
    "valor_bruto",
    "codigo_ncm",
    "inclui_no_total",
    "icms_origem",
    "icms_situacao_tributaria",
    "cofins_situacao_tributaria",
    "icms_base_calculo",
    "icms_valor_total",
    "icms_base_calculo_st",
    "icms_valor_total_st",
    "valor_produtos",
    "valor_frete",
    "valor_seguro",
    "valor_desconto",
    "valor_ipi",
    "valor_pis",
    "valor_cofins",
    "valor_outras_despesas",
    "valor_total",
    "modalidade_frete"
})
public class Item {

    @JsonProperty("numero_item")
    private Integer numeroItem;
    @JsonProperty("codigo_produto")
    private String codigoProduto;
    @JsonProperty("descricao")
    private String descricao;
    @JsonProperty("cfop")
    private String cfop;
    @JsonProperty("quantidade_comercial")
    private String quantidadeComercial;
    @JsonProperty("quantidade_tributavel")
    private String quantidadeTributavel;
    @JsonProperty("valor_unitario_comercial")
    private String valorUnitarioComercial;
    @JsonProperty("valor_unitario_tributavel")
    private String valorUnitarioTributavel;
    @JsonProperty("unidade_comercial")
    private String unidadeComercial;
    @JsonProperty("unidade_tributavel")
    private String unidadeTributavel;
    @JsonProperty("valor_bruto")
    private String valorBruto;
    @JsonProperty("codigo_ncm")
    private String codigoNcm;
    @JsonProperty("inclui_no_total")
    private String incluiNoTotal;
    @JsonProperty("icms_origem")
    private String icmsOrigem;
    @JsonProperty("icms_situacao_tributaria")
    private String icmsSituacaoTributaria;
    @JsonProperty("cofins_situacao_tributaria")
    private String cofinsSituacaoTributaria;
    @JsonProperty("icms_base_calculo")
    private String icmsBaseCalculo;
    @JsonProperty("icms_valor_total")
    private String icmsValorTotal;
    @JsonProperty("icms_base_calculo_st")
    private String icmsBaseCalculoSt;
    @JsonProperty("icms_valor_total_st")
    private String icmsValorTotalSt;
    @JsonProperty("valor_produtos")
    private String valorProdutos;
    @JsonProperty("valor_frete")
    private String valorFrete;
    @JsonProperty("valor_seguro")
    private String valorSeguro;
    @JsonProperty("valor_desconto")
    private String valorDesconto;
    @JsonProperty("valor_ipi")
    private String valorIpi;
    @JsonProperty("valor_pis")
    private String valorPis;
    @JsonProperty("valor_cofins")
    private String valorCofins;
    @JsonProperty("valor_outras_despesas")
    private String valorOutrasDespesas;
    @JsonProperty("valor_total")
    private String valorTotal;
    @JsonProperty("modalidade_frete")
    private String modalidadeFrete;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("numero_item")
    public Integer getNumeroItem() {
        return numeroItem;
    }

    @JsonProperty("numero_item")
    public void setNumeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
    }

    @JsonProperty("codigo_produto")
    public String getCodigoProduto() {
        return codigoProduto;
    }

    @JsonProperty("codigo_produto")
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    @JsonProperty("descricao")
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @JsonProperty("cfop")
    public String getCfop() {
        return cfop;
    }

    @JsonProperty("cfop")
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    @JsonProperty("quantidade_comercial")
    public String getQuantidadeComercial() {
        return quantidadeComercial;
    }

    @JsonProperty("quantidade_comercial")
    public void setQuantidadeComercial(String quantidadeComercial) {
        this.quantidadeComercial = quantidadeComercial;
    }

    @JsonProperty("quantidade_tributavel")
    public String getQuantidadeTributavel() {
        return quantidadeTributavel;
    }

    @JsonProperty("quantidade_tributavel")
    public void setQuantidadeTributavel(String quantidadeTributavel) {
        this.quantidadeTributavel = quantidadeTributavel;
    }

    @JsonProperty("valor_unitario_comercial")
    public String getValorUnitarioComercial() {
        return valorUnitarioComercial;
    }

    @JsonProperty("valor_unitario_comercial")
    public void setValorUnitarioComercial(String valorUnitarioComercial) {
        this.valorUnitarioComercial = valorUnitarioComercial;
    }

    @JsonProperty("valor_unitario_tributavel")
    public String getValorUnitarioTributavel() {
        return valorUnitarioTributavel;
    }

    @JsonProperty("valor_unitario_tributavel")
    public void setValorUnitarioTributavel(String valorUnitarioTributavel) {
        this.valorUnitarioTributavel = valorUnitarioTributavel;
    }

    @JsonProperty("unidade_comercial")
    public String getUnidadeComercial() {
        return unidadeComercial;
    }

    @JsonProperty("unidade_comercial")
    public void setUnidadeComercial(String unidadeComercial) {
        this.unidadeComercial = unidadeComercial;
    }

    @JsonProperty("unidade_tributavel")
    public String getUnidadeTributavel() {
        return unidadeTributavel;
    }

    @JsonProperty("unidade_tributavel")
    public void setUnidadeTributavel(String unidadeTributavel) {
        this.unidadeTributavel = unidadeTributavel;
    }

    @JsonProperty("valor_bruto")
    public String getValorBruto() {
        return valorBruto;
    }

    @JsonProperty("valor_bruto")
    public void setValorBruto(String valorBruto) {
        this.valorBruto = valorBruto;
    }

    @JsonProperty("codigo_ncm")
    public String getCodigoNcm() {
        return codigoNcm;
    }

    @JsonProperty("codigo_ncm")
    public void setCodigoNcm(String codigoNcm) {
        this.codigoNcm = codigoNcm;
    }

    @JsonProperty("inclui_no_total")
    public String getIncluiNoTotal() {
        return incluiNoTotal;
    }

    @JsonProperty("inclui_no_total")
    public void setIncluiNoTotal(String incluiNoTotal) {
        this.incluiNoTotal = incluiNoTotal;
    }

    @JsonProperty("icms_origem")
    public String getIcmsOrigem() {
        return icmsOrigem;
    }

    @JsonProperty("icms_origem")
    public void setIcmsOrigem(String icmsOrigem) {
        this.icmsOrigem = icmsOrigem;
    }

    @JsonProperty("icms_situacao_tributaria")
    public String getIcmsSituacaoTributaria() {
        return icmsSituacaoTributaria;
    }

    @JsonProperty("icms_situacao_tributaria")
    public void setIcmsSituacaoTributaria(String icmsSituacaoTributaria) {
        this.icmsSituacaoTributaria = icmsSituacaoTributaria;
    }

    @JsonProperty("cofins_situacao_tributaria")
    public String getCofinsSituacaoTributaria() {
        return cofinsSituacaoTributaria;
    }

    @JsonProperty("cofins_situacao_tributaria")
    public void setCofinsSituacaoTributaria(String cofinsSituacaoTributaria) {
        this.cofinsSituacaoTributaria = cofinsSituacaoTributaria;
    }

    @JsonProperty("icms_base_calculo")
    public String getIcmsBaseCalculo() {
        return icmsBaseCalculo;
    }

    @JsonProperty("icms_base_calculo")
    public void setIcmsBaseCalculo(String icmsBaseCalculo) {
        this.icmsBaseCalculo = icmsBaseCalculo;
    }

    @JsonProperty("icms_valor_total")
    public String getIcmsValorTotal() {
        return icmsValorTotal;
    }

    @JsonProperty("icms_valor_total")
    public void setIcmsValorTotal(String icmsValorTotal) {
        this.icmsValorTotal = icmsValorTotal;
    }

    @JsonProperty("icms_base_calculo_st")
    public String getIcmsBaseCalculoSt() {
        return icmsBaseCalculoSt;
    }

    @JsonProperty("icms_base_calculo_st")
    public void setIcmsBaseCalculoSt(String icmsBaseCalculoSt) {
        this.icmsBaseCalculoSt = icmsBaseCalculoSt;
    }

    @JsonProperty("icms_valor_total_st")
    public String getIcmsValorTotalSt() {
        return icmsValorTotalSt;
    }

    @JsonProperty("icms_valor_total_st")
    public void setIcmsValorTotalSt(String icmsValorTotalSt) {
        this.icmsValorTotalSt = icmsValorTotalSt;
    }

    @JsonProperty("valor_produtos")
    public String getValorProdutos() {
        return valorProdutos;
    }

    @JsonProperty("valor_produtos")
    public void setValorProdutos(String valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    @JsonProperty("valor_frete")
    public String getValorFrete() {
        return valorFrete;
    }

    @JsonProperty("valor_frete")
    public void setValorFrete(String valorFrete) {
        this.valorFrete = valorFrete;
    }

    @JsonProperty("valor_seguro")
    public String getValorSeguro() {
        return valorSeguro;
    }

    @JsonProperty("valor_seguro")
    public void setValorSeguro(String valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    @JsonProperty("valor_desconto")
    public String getValorDesconto() {
        return valorDesconto;
    }

    @JsonProperty("valor_desconto")
    public void setValorDesconto(String valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @JsonProperty("valor_ipi")
    public String getValorIpi() {
        return valorIpi;
    }

    @JsonProperty("valor_ipi")
    public void setValorIpi(String valorIpi) {
        this.valorIpi = valorIpi;
    }

    @JsonProperty("valor_pis")
    public String getValorPis() {
        return valorPis;
    }

    @JsonProperty("valor_pis")
    public void setValorPis(String valorPis) {
        this.valorPis = valorPis;
    }

    @JsonProperty("valor_cofins")
    public String getValorCofins() {
        return valorCofins;
    }

    @JsonProperty("valor_cofins")
    public void setValorCofins(String valorCofins) {
        this.valorCofins = valorCofins;
    }

    @JsonProperty("valor_outras_despesas")
    public String getValorOutrasDespesas() {
        return valorOutrasDespesas;
    }

    @JsonProperty("valor_outras_despesas")
    public void setValorOutrasDespesas(String valorOutrasDespesas) {
        this.valorOutrasDespesas = valorOutrasDespesas;
    }

    @JsonProperty("valor_total")
    public String getValorTotal() {
        return valorTotal;
    }

    @JsonProperty("valor_total")
    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    @JsonProperty("modalidade_frete")
    public String getModalidadeFrete() {
        return modalidadeFrete;
    }

    @JsonProperty("modalidade_frete")
    public void setModalidadeFrete(String modalidadeFrete) {
        this.modalidadeFrete = modalidadeFrete;
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
