package com.springfundamentals.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

/**
 * Composite request for creating a department together with its initial employees
 * in a single transactional HTTP call.
 */
public record DepartmentWithEmployeesRequest(

        @NotNull(message = "Department details must not be null")
        @Valid
        DepartmentRequest department,

        @NotNull(message = "Employee list must not be null")
        @Size(min = 1, message = "At least one employee must be provided")
        @Valid
        List<EmployeeRequest> employees
) {}
