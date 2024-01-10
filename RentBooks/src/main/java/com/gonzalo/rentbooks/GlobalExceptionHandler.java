package com.gonzalo.rentbooks;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.gonzalo.rentbooks.model.error.ErrorItem;
import com.gonzalo.rentbooks.model.error.ErrorMessage;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

import java.rmi.NoSuchObjectException;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NoSuchObjectException.class)
    public ResponseEntity<ErrorMessage> handleNoSouchObjectException(NoSuchObjectException ex) {
    	ErrorMessage errorObj = new ErrorMessage();
//        String path = ex.getConstraintViolations().stream()
//                .findFirst()
//                .map(violation -> {
//                    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
//                    return request.getRequestURI();
//                })
//                .orElse("unknown");
//        errorObj.setPath(path);
//        errorObj.setStatus(HttpStatus.BAD_REQUEST.value());
//
//        List<ErrorItem> errors = ex.getConstraintViolations()
//                .stream()
//                .map(this::extractErrorDetails)
//                .collect(Collectors.toList());
//
//        errorObj.setErrors(errors);

        return new ResponseEntity<>(errorObj, HttpStatus.BAD_REQUEST);
    }
	
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorMessage> handleConstraintViolationException(ConstraintViolationException ex) {
    	ErrorMessage errorObj = new ErrorMessage();
        String path = ex.getConstraintViolations().stream()
                .findFirst()
                .map(violation -> {
                    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
                    return request.getRequestURI();
                })
                .orElse("unknown");
        errorObj.setPath(path);
        errorObj.setStatus(HttpStatus.BAD_REQUEST.value());

        List<ErrorItem> errors = ex.getConstraintViolations()
                .stream()
                .map(this::extractErrorDetails)
                .collect(Collectors.toList());

        errorObj.setErrors(errors);

        return new ResponseEntity<>(errorObj, HttpStatus.BAD_REQUEST);
    }

    private ErrorItem extractErrorDetails(ConstraintViolation<?> violation) {
        ErrorItem item = new ErrorItem();
        item.setValidator(violation.getConstraintDescriptor().getAnnotation().annotationType().getSimpleName());
        item.setMessage(violation.getMessage());
        item.setField(violation.getPropertyPath().toString().replaceAll(".+\\.(.+)", "$1"));
        item.setValue(violation.getInvalidValue() != null ? violation.getInvalidValue().toString() : null );
        return item;
    }



}
