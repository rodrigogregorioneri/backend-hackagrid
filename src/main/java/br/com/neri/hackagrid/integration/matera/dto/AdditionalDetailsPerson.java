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
    "gender",
    "father",
    "mother",
    "birthDate",
    "birthCity",
    "birthState",
    "birthCountry",
    "rg",
    "maritalStatus"
})
public class AdditionalDetailsPerson {

    @JsonProperty("gender")
    private String gender;
    @JsonProperty("father")
    private String father;
    @JsonProperty("mother")
    private String mother;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("birthCity")
    private String birthCity;
    @JsonProperty("birthState")
    private String birthState;
    @JsonProperty("birthCountry")
    private String birthCountry;
    @JsonProperty("rg")
    private Rg rg;
    @JsonProperty("maritalStatus")
    private String maritalStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("father")
    public String getFather() {
        return father;
    }

    @JsonProperty("father")
    public void setFather(String father) {
        this.father = father;
    }

    @JsonProperty("mother")
    public String getMother() {
        return mother;
    }

    @JsonProperty("mother")
    public void setMother(String mother) {
        this.mother = mother;
    }

    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("birthCity")
    public String getBirthCity() {
        return birthCity;
    }

    @JsonProperty("birthCity")
    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    @JsonProperty("birthState")
    public String getBirthState() {
        return birthState;
    }

    @JsonProperty("birthState")
    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    @JsonProperty("birthCountry")
    public String getBirthCountry() {
        return birthCountry;
    }

    @JsonProperty("birthCountry")
    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    @JsonProperty("rg")
    public Rg getRg() {
        return rg;
    }

    @JsonProperty("rg")
    public void setRg(Rg rg) {
        this.rg = rg;
    }

    @JsonProperty("maritalStatus")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    @JsonProperty("maritalStatus")
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
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
