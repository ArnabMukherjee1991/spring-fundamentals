package com.springfundamentals.service;

import com.springfundamentals.dto.EmployeeRequest;
import com.springfundamentals.dto.EmployeeResponse;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest request);

    List<EmployeeResponse> getAllEmployees();

    EmployeeResponse getEmployeeById(Long id);

    EmployeeResponse updateEmployee(Long id, EmployeeRequest request);

    void deleteEmployee(Long id);

    List<EmployeeResponse> getEmployeesByDepartment(Long departmentId);

    List<EmployeeResponse> getEmployeesBySalaryRange(BigDecimal min, BigDecimal max);

    /**
     * Gives a raise to all employees in the specified department.
     * Wrapped in a transaction so that all updates succeed or none do.
     */
    int giveRaiseToDepartment(Long departmentId, BigDecimal raiseAmount);
}
