package com.makuku.tmpk.models.operation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class PaymentOperation extends Operation {
    @JsonProperty("operation_id")
    private int id;
    @JsonProperty("operation_date")
    private Date operationDate;

}
