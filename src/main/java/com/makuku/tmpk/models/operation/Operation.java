package com.makuku.tmpk.models.operation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public abstract class Operation {
    protected int id;
    protected Date operationDate;
    @JsonProperty("service")
    protected String name;

    @JsonProperty("service_cost")
    private int serviceCost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(int serviceCost) {
        this.serviceCost = serviceCost;
    }
}
