package com.makuku.tmpk.models.operation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class ChargeOperation {
    @JsonProperty("expense_id")
    private int id;
    @JsonProperty("expense_date") private Date operationDate;

}
