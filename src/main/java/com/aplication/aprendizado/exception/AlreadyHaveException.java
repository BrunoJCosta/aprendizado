package com.aplication.aprendizado.exception;

public class AlreadyHaveException extends Exception {

    public AlreadyHaveException(String message) {
        super(message + " já existe um na Instituição");
    }
}
