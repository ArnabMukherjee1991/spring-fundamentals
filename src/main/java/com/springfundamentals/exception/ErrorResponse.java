package com.springfundamentals.exception;

import java.time.Instant;
import java.util.List;

/**
 * Uniform error response body returned by {@link GlobalExceptionHandler}.
 *
 * @param timestamp  when the error occurred (UTC)
 * @param status     HTTP status code
 * @param error      HTTP reason phrase
 * @param message    human-readable description
 * @param path       request URI that triggered the error
 * @param fieldErrors per-field validation errors (null unless a validation failure)
 */
public record ErrorResponse(
        Instant timestamp,
        int status,
        String error,
        String message,
        String path,
        List<FieldError> fieldErrors
) {
    /**
     * A single field-level validation error.
     *
     * @param field   the name of the field that failed validation
     * @param message the constraint violation message
     */
    public record FieldError(String field, String message) {}
}
