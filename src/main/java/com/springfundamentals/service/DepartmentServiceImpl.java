package com.springfundamentals.service;

import com.springfundamentals.dto.DepartmentRequest;
import com.springfundamentals.dto.DepartmentResponse;
import com.springfundamentals.dto.EmployeeRequest;
import com.springfundamentals.repository.DepartmentRepository;
import com.springfundamentals.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    @PostConstruct
    public void init() {
        log.info("DepartmentServiceImpl initialized — instance hash: {}", System.identityHashCode(this));
    }

    @PreDestroy
    public void destroy() {
        log.info("DepartmentServiceImpl about to be destroyed — instance hash: {}", System.identityHashCode(this));
    }

    @Override
    @Transactional
    public DepartmentResponse createDepartment(DepartmentRequest request) {
        // TODO: validate uniqueness, map to entity, persist, map to response
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional(readOnly = true)
    public List<DepartmentResponse> getAllDepartments() {
        // TODO: fetch all departments, map to response list
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional(readOnly = true)
    public DepartmentResponse getDepartmentById(Long id) {
        // TODO: find by id or throw ResourceNotFoundException, map to response
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional
    public DepartmentResponse updateDepartment(Long id, DepartmentRequest request) {
        // TODO: find existing, update fields, save, return response
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional
    public void deleteDepartment(Long id) {
        // TODO: find existing or throw, delete
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional
    public DepartmentResponse saveDepartmentWithEmployees(DepartmentRequest departmentRequest,
                                                          List<EmployeeRequest> employeeRequests) {
        // TODO: save department, then save each employee
        //       deliberately throw after department save to demonstrate rollback
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public DepartmentResponse saveDepartmentInNewTransaction(DepartmentRequest request) {
        // TODO: runs in its own transaction regardless of caller's transaction
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }
}
