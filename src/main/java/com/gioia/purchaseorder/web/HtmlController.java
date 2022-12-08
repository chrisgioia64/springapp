package com.gioia.purchaseorder.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }

}
