package br.com.klasrak.javaregisterapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SourceController {
    @GetMapping(value = "/source")
    public String getSource() {
        return "https://github.com/klasrak/java-register-api";
    }
}
