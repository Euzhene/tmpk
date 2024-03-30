package com.makuku.tmpk.pages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class MainPage {
    @GetMapping("/main/")
    String getClientMainPage(Model model) {
        return "client_main";
    }

    @GetMapping("/main-operator/")
    String getOperatorMainPage(Model model) {
        return "operator_main";
    }

    @GetMapping("/main-operator/add/")
    String addClientMainPage(Model model) {
        return "add_client";
    }

    @GetMapping("/main-operator/client/detail/")
    String getClientDetailMainPage(Model model) {
        return "client_detail";
    }

    @GetMapping("/main/client/pay/")
    String payMainPage(Model model) {
        return "client_pay";
    }

    @GetMapping("/client/service/")
    String getClientServicePage(Model model) {
        return "client_service";
    }

}
