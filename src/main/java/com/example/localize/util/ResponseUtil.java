package com.example.localize.util;

import com.example.localize.model.ResponseModel;
import com.example.localize.model.StatusModel;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class ResponseUtil {
    private final MessageSource messageSource;

    public ResponseUtil(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public <T> ResponseModel<T> successBuilder(T data) {
        ResponseModel<T> response = new ResponseModel<>();
        StatusModel status = new StatusModel();
        status.setHeader(this.messageSource.getMessage("response.success.header", null, LocaleContextHolder.getLocale()));
        status.setCode(Constant.Response.success);
        status.setDescription(this.messageSource.getMessage("response.success.description", null, LocaleContextHolder.getLocale()));
        response.setStatus(status);
        response.setBody(data);
        return response;
    }

    public <T> ResponseModel<T> genericBuilder(T data) {
        ResponseModel<T> response = new ResponseModel<>();
        StatusModel status = new StatusModel();
        status.setHeader(this.messageSource.getMessage("response.success.header", null ,  LocaleContextHolder.getLocale()));
        status.setCode(Constant.Response.success);
        status.setDescription(this.messageSource.getMessage("response.success.description", null, LocaleContextHolder.getLocale()));
        response.setStatus(status);
        response.setBody(data);
        return response;
    }
}
