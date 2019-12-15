package br.com.neri.hackagrid.integration.matera.dto;

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
    "name",
    "taxIdentifier",
    "mobilePhone",
    "email"
})
public class Client {

    @JsonProperty("name")
    private String name;
    @JsonProperty("taxIdentifier")
    private TaxIdentifier taxIdentifier;
    @JsonProperty("mobilePhone")
    private MobilePhone mobilePhone;
    @JsonProperty("email")
    private String email;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("taxIdentifier")
    public TaxIdentifier getTaxIdentifier() {
        return taxIdentifier;
    }

    @JsonProperty("taxIdentifier")
    public void setTaxIdentifier(TaxIdentifier taxIdentifier) {
        this.taxIdentifier = taxIdentifier;
    }

    @JsonProperty("mobilePhone")
    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    @JsonProperty("mobilePhone")
    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
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
