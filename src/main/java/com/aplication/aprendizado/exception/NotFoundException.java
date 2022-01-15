package com.aplication.aprendizado.exception;

public class NotFoundException extends Exception {

    public NotFoundException(String message) {
        super(message + " não encontrado");
    }
}
