package com.aplication.aprendizado.configuracao;

import com.aplication.aprendizado.exception.AlreadyExistsException;
import org.hibernate.exception.SQLGrammarException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.PersistenceException;

@RestControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ResponseEntity exception(Exception exception) {
        Throwable cause = exception.getCause();
        return ResponseEntity.badRequest().body(cause.getMessage());
    }

    @ExceptionHandler(SQLGrammarException.class)
    public ResponseEntity GrammarException(PersistenceException exception) {
        if (exception.getCause() instanceof SQLGrammarException) {
            var cause = (SQLGrammarException) exception.getCause();
            return ResponseEntity.badRequest().body(cause.getSQLException().getMessage());
        }
        return ResponseEntity.badRequest().body(exception.getLocalizedMessage());
    }

    @ExceptionHandler(AlreadyExistsException.class)
    public ResponseEntity alreadyExist(AlreadyExistsException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }
}
