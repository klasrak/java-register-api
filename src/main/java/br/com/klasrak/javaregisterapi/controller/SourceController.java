package br.com.klasrak.javaregisterapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("Source Controller")
@RequestMapping("/api")
public class SourceController {
    @ApiOperation(value = "Get source code")
    @GetMapping(value = "/source")
    public String getSource() {
        return "https://github.com/klasrak/java-register-api";
    }
}
