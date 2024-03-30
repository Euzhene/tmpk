package com.makuku.tmpk.models.client;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class PersonModel extends ClientModel {
    @JsonProperty("birthday_date")
    private Date birthday;
    @JsonProperty("person_name")
    private String firstName;
    @JsonProperty("person_surname")
    private String lastName;
    @JsonProperty("person_daddyname")
    private String patronymic;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
