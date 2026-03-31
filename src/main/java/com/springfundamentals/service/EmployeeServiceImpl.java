package com.springfundamentals.service;

import com.springfundamentals.dto.EmployeeRequest;
import com.springfundamentals.dto.EmployeeResponse;
import com.springfundamentals.repository.DepartmentRepository;
import com.springfundamentals.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    @Override
    @Transactional
    public EmployeeResponse createEmployee(EmployeeRequest request) {
        // TODO: find department or throw, map to entity, persist, return response
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponse> getAllEmployees() {
        // TODO: fetch all, map to response list
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional(readOnly = true)
    public EmployeeResponse getEmployeeById(Long id) {
        // TODO: find by id or throw ResourceNotFoundException, map to response
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional
    public EmployeeResponse updateEmployee(Long id, EmployeeRequest request) {
        // TODO: find existing, update fields, save, return response
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional
    public void deleteEmployee(Long id) {
        // TODO: find existing or throw, delete
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponse> getEmployeesByDepartment(Long departmentId) {
        // TODO: fetch employees for department, map to response list
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponse> getEmployeesBySalaryRange(BigDecimal min, BigDecimal max) {
        // TODO: fetch employees within salary range, map to response list
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional
    public int giveRaiseToDepartment(Long departmentId, BigDecimal raiseAmount) {
        // TODO: fetch employees, add raiseAmount to each salary, persist, return count
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }
}
