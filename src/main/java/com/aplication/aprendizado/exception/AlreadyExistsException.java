package com.aplication.aprendizado.exception;

public class AlreadyExistsException extends Exception {

    public AlreadyExistsException(String entity) {
        super(" já existe um(a) " + entity + " criado");
    }
}
