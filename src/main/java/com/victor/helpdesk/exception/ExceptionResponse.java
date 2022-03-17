package com.victor.helpdesk.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ExceptionResponse {

    private int status;
    private String message;
    private String error;
    private String path;


}
