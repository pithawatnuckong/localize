package com.example.localize.model;

import lombok.Data;


@Data
public class ResponseModel<T> {
    private StatusModel status;
    private T body;

}
