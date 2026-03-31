package com.springfundamentals.exception;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
import java.util.List;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(
            ResourceNotFoundException ex, HttpServletRequest request) {
        // TODO: build ErrorResponse with 404, log at WARN level, return ResponseEntity
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @ExceptionHandler(DuplicateResourceException.class)
    public ResponseEntity<ErrorResponse> handleDuplicateResourceException(
            DuplicateResourceException ex, HttpServletRequest request) {
        // TODO: build ErrorResponse with 409, log at WARN level, return ResponseEntity
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(
            MethodArgumentNotValidException ex, HttpServletRequest request) {
        // TODO: extract field errors from binding result, build ErrorResponse with 400
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(
            Exception ex, HttpServletRequest request) {
        // TODO: build ErrorResponse with 500, log at ERROR level, return ResponseEntity
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    // ---------------------------------------------------------------------------
    // Helper
    // ---------------------------------------------------------------------------

    private ErrorResponse buildErrorResponse(HttpStatus status, String message,
                                              String path, List<ErrorResponse.FieldError> fieldErrors) {
        // TODO: construct ErrorResponse record
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }
}
