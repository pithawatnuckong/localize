package com.example.localize.service;

import com.example.localize.model.ResponseModel;
import com.example.localize.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@Slf4j
public class LocaleService {
    private final ResponseUtil responseUtil;

    public LocaleService(ResponseUtil responseUtil) {
        this.responseUtil = responseUtil;
    }

    public ResponseModel<String> getGreeting(String message) {
        return responseUtil.successBuilder(message);
    }
}
