package com.example.localize.controller;

import com.example.localize.model.ResponseModel;
import com.example.localize.service.LocaleService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api")
@Slf4j
public class LocaleDemoController {

    private final LocaleService localeService;

    public LocaleDemoController(LocaleService localeService) {
        this.localeService = localeService;
    }


    @GetMapping
    public ResponseModel<String> sayHello(HttpServletResponse response) {
        return localeService.getGreeting("hello");
    }
}
