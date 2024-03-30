package com.makuku.tmpk.models.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class ClientModel {
    @JsonProperty("client_id")
    private int id;
    @JsonProperty("email")
    protected String email;
    @JsonProperty("address")
    protected String address;
    @JsonProperty("phone")
    protected String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
