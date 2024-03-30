package com.makuku.tmpk.pages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorizationPage {
    @GetMapping("/client/")
    String getClientLoginPage(Model model) {
        return "client_authorization";
    }
    @GetMapping("/operator/")
    String getOperatorLoginPage(Model model) {
        return "operator_authorization";
    }

}
