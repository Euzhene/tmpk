package com.makuku.tmpk.models.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LegalEntityModel extends  ClientModel {

    @JsonProperty("organization_name")
    private String organization;

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
