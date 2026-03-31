package com.springfundamentals.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record EmployeeRequest(

        @NotBlank(message = "Employee name must not be blank")
        @Size(min = 2, max = 150, message = "Employee name must be between 2 and 150 characters")
        String name,

        @NotNull(message = "Salary must not be null")
        @DecimalMin(value = "0.00", inclusive = false, message = "Salary must be greater than zero")
        BigDecimal salary,

        @NotNull(message = "Department ID must not be null")
        Long departmentId
) {}
