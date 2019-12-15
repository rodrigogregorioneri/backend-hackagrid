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
    "accountHolderId",
    "account",
    "accountStatus"
})
public class Data {

    @JsonProperty("accountHolderId")
    private String accountHolderId;
    @JsonProperty("account")
    private Account account;
    @JsonProperty("accountStatus")
    private String accountStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accountHolderId")
    public String getAccountHolderId() {
        return accountHolderId;
    }

    @JsonProperty("accountHolderId")
    public void setAccountHolderId(String accountHolderId) {
        this.accountHolderId = accountHolderId;
    }

    @JsonProperty("account")
    public Account getAccount() {
        return account;
    }

    @JsonProperty("account")
    public void setAccount(Account account) {
        this.account = account;
    }

    @JsonProperty("accountStatus")
    public String getAccountStatus() {
        return accountStatus;
    }

    @JsonProperty("accountStatus")
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
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
