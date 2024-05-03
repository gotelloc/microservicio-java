package com.example.testingweb;

import org.springframework.beans.factory.annotation.Autowired; // Importa la clase Autowired
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

    @Autowired
    private GreetingService service;

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return service.greet();
    }

}
