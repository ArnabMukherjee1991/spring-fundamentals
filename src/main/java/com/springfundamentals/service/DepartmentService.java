package com.springfundamentals.service;

import com.springfundamentals.dto.DepartmentRequest;
import com.springfundamentals.dto.DepartmentResponse;
import com.springfundamentals.dto.EmployeeRequest;

import java.util.List;

public interface DepartmentService {

    DepartmentResponse createDepartment(DepartmentRequest request);

    List<DepartmentResponse> getAllDepartments();

    DepartmentResponse getDepartmentById(Long id);

    DepartmentResponse updateDepartment(Long id, DepartmentRequest request);

    void deleteDepartment(Long id);

    /**
     * Saves a department and its employees in a single transaction.
     * If any employee fails to save, the entire operation rolls back.
     */
    DepartmentResponse saveDepartmentWithEmployees(DepartmentRequest departmentRequest,
                                                   List<EmployeeRequest> employeeRequests);

    /**
     * Demonstrates REQUIRES_NEW propagation: saves a department in an
     * independent transaction even when called within an existing transaction.
     */
    DepartmentResponse saveDepartmentInNewTransaction(DepartmentRequest request);
}
