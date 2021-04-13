package br.com.klasrak.javaregisterapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends RuntimeException {
    private static final long seriaLVersionUID = 1L;
    private String message;

    public PersonNotFoundException(String message) {
        this.message = message;
    }
}
