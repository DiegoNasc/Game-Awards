package me.dio.gameawards.service.exception;

import java.io.Serial;

public class BusinessException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public BusinessException(String message) { //Construtor
        super(message);
    }
}
