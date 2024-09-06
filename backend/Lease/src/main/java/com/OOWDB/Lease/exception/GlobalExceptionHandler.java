package com.OOWDB.Lease.exception;


import org.apache.tomcat.util.http.parser.HttpParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.OOWDB.Lease.exception.ErrorResponse;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleUserNotFoundException (UserNotFoundException exception){
        return new ResponseEntity<>(
                ErrorResponse.builder().msg(exception.getMessage()).status(HttpStatus.NOT_FOUND.value())
                        .build(), HttpStatus.NOT_FOUND);
        
    }
    @ExceptionHandler(ApartmentNotFoundException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleApartmentNotFoundException(ApartmentNotFoundException exception){
        return new ResponseEntity<>(
                ErrorResponse.builder()
                        .msg(exception.getMessage())
                        .status(HttpStatus.NOT_FOUND.value())
                        .build(), HttpStatus.NOT_FOUND);
    }
    
}
