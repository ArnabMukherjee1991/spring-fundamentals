package com.springfundamentals.dto;

public record DepartmentResponse(
        Long id,
        String name,
        int employeeCount
) {}
