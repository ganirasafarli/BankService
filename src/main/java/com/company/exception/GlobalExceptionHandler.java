package com.company.exception;

import com.company.util.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<Object> handleSQLException(SQLIntegrityConstraintViolationException exception) {
        logger.error(exception);
        GenericResponse genericResponse = new GenericResponse(exception.getMessage(),"One of the data has not been included.");
        return new ResponseEntity<>(genericResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> handleRuntimeException(RuntimeException exception) {
        logger.error(exception);
        GenericResponse genericResponse = new GenericResponse(exception.getMessage(),"Data is not included correctly");
        return new ResponseEntity<>(genericResponse, HttpStatus.NOT_FOUND);
    }

//    @ExceptionHandler(MyException.class)
//    public ResponseEntity<Object> handleMyException(MyException myException) {
//        logger.error(myException);
//        GenericResponse genericResponse = new GenericResponse();
//        genericResponse.setMessage(myException.getMessage());
//        return new ResponseEntity<>(genericResponse, HttpStatus.BAD_REQUEST);
//    }

}
