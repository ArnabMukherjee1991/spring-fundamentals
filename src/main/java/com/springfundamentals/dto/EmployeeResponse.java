package com.springfundamentals.dto;

import java.math.BigDecimal;

public record EmployeeResponse(
        Long id,
        String name,
        BigDecimal salary,
        Long departmentId,
        String departmentName
) {}
