package com.makuku.tmpk.controllers;

import com.makuku.tmpk.TmpkApplication;
import com.makuku.tmpk.models.client.LegalEntityModel;
import com.makuku.tmpk.models.client.PersonModel;
import com.makuku.tmpk.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientRepo clientRepo;

    @GetMapping("/clients/person/")
    public List<PersonModel> getPersonModelList() {
        List<PersonModel> personModelList = clientRepo.getPersonModelList();
        return personModelList;
    }
}
