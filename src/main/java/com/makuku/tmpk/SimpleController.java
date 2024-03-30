package com.makuku.tmpk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @Autowired
    TestRepository testRepository;

    @GetMapping("/")
    public String homePage() {
        testRepository.getById(1);
        return "home";
    }
}
