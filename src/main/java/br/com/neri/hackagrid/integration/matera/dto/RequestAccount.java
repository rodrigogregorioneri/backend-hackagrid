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
    "externalIdentifier",
    "sharedAccount",
    "creditDate",
    "client",
    "billingAddress",
    "clientType",
    "accountType",
    "additionalDetailsPerson"
})
public class RequestAccount {

    @JsonProperty("externalIdentifier")
    private String externalIdentifier;
    @JsonProperty("sharedAccount")
    private Boolean sharedAccount;
    @JsonProperty("creditDate")
    private Integer creditDate;
    @JsonProperty("client")
    private Client client;
    @JsonProperty("billingAddress")
    private BillingAddress billingAddress;
    @JsonProperty("clientType")
    private String clientType;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("additionalDetailsPerson")
    private AdditionalDetailsPerson additionalDetailsPerson;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("externalIdentifier")
    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    @JsonProperty("externalIdentifier")
    public void setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    @JsonProperty("sharedAccount")
    public Boolean getSharedAccount() {
        return sharedAccount;
    }

    @JsonProperty("sharedAccount")
    public void setSharedAccount(Boolean sharedAccount) {
        this.sharedAccount = sharedAccount;
    }

    @JsonProperty("creditDate")
    public Integer getCreditDate() {
        return creditDate;
    }

    @JsonProperty("creditDate")
    public void setCreditDate(Integer creditDate) {
        this.creditDate = creditDate;
    }

    @JsonProperty("client")
    public Client getClient() {
        return client;
    }

    @JsonProperty("client")
    public void setClient(Client client) {
        this.client = client;
    }

    @JsonProperty("billingAddress")
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    @JsonProperty("billingAddress")
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    @JsonProperty("clientType")
    public String getClientType() {
        return clientType;
    }

    @JsonProperty("clientType")
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("additionalDetailsPerson")
    public AdditionalDetailsPerson getAdditionalDetailsPerson() {
        return additionalDetailsPerson;
    }

    @JsonProperty("additionalDetailsPerson")
    public void setAdditionalDetailsPerson(AdditionalDetailsPerson additionalDetailsPerson) {
        this.additionalDetailsPerson = additionalDetailsPerson;
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
