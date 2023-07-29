package com.example.coursework2_generateexamquestions.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionAlreadyExistException extends RuntimeException{
    public QuestionAlreadyExistException() {
    }

    public QuestionAlreadyExistException(String message) {
        super(message);
    }

    public QuestionAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionAlreadyExistException(Throwable cause) {
        super(cause);
    }

    public QuestionAlreadyExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
