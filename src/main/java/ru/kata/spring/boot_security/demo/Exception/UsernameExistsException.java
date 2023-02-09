package ru.kata.spring.boot_security.demo.Exception;

import org.springframework.dao.DataIntegrityViolationException;

public class UsernameExistsException extends DataIntegrityViolationException {
    public UsernameExistsException(String msg) {
        super(msg);
    }
}
