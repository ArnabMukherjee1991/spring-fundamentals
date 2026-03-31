package com.springfundamentals.service;

import com.springfundamentals.dto.DepartmentRequest;
import com.springfundamentals.dto.DepartmentResponse;
import com.springfundamentals.dto.EmployeeRequest;
import com.springfundamentals.exception.DuplicateResourceException;
import com.springfundamentals.exception.ResourceNotFoundException;
import com.springfundamentals.repository.DepartmentRepository;
import com.springfundamentals.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;

/**
 * Unit tests for {@link DepartmentServiceImpl}.
 * <p>
 * Uses Mockito to isolate the service from the database.
 * Fill in each test body as part of the TDD exercise.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("DepartmentService")
class DepartmentServiceTest {

    @Mock
    private DepartmentRepository departmentRepository;

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private DepartmentServiceImpl departmentService;

    // -------------------------------------------------------------------------
    // createDepartment
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("createDepartment")
    class CreateDepartment {

        @Test
        @DisplayName("returns DepartmentResponse when department is created successfully")
        void shouldReturnResponseOnSuccess() {
            // TODO: given repository.existsByName returns false, repository.save returns entity
            //       when createDepartment called
            //       then response has correct id, name, employeeCount == 0
        }

        @Test
        @DisplayName("throws DuplicateResourceException when name already taken")
        void shouldThrowWhenNameAlreadyExists() {
            // TODO: given repository.existsByName returns true
            //       when createDepartment called
            //       then DuplicateResourceException is thrown
        }
    }

    // -------------------------------------------------------------------------
    // getAllDepartments
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("getAllDepartments")
    class GetAllDepartments {

        @Test
        @DisplayName("returns mapped list of DepartmentResponse")
        void shouldReturnListOfResponses() {
            // TODO: given repository.findAll returns list of departments
            //       when getAllDepartments called
            //       then returned list size matches and names match
        }

        @Test
        @DisplayName("returns empty list when no departments exist")
        void shouldReturnEmptyListWhenNoDepartments() {
            // TODO: given repository.findAll returns empty list
            //       when getAllDepartments called
            //       then empty list returned
        }
    }

    // -------------------------------------------------------------------------
    // getDepartmentById
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("getDepartmentById")
    class GetDepartmentById {

        @Test
        @DisplayName("returns DepartmentResponse for existing id")
        void shouldReturnResponseWhenFound() {
            // TODO: given repository.findById returns Optional.of(department)
            //       when getDepartmentById called
            //       then response matches entity
        }

        @Test
        @DisplayName("throws ResourceNotFoundException when id not found")
        void shouldThrowWhenNotFound() {
            // TODO: given repository.findById returns Optional.empty()
            //       when getDepartmentById called
            //       then ResourceNotFoundException thrown
        }
    }

    // -------------------------------------------------------------------------
    // updateDepartment
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("updateDepartment")
    class UpdateDepartment {

        @Test
        @DisplayName("updates and returns modified department")
        void shouldUpdateAndReturnResponse() {
            // TODO: given existing department found, new name not taken
            //       when updateDepartment called with new name
            //       then response has updated name
        }

        @Test
        @DisplayName("throws ResourceNotFoundException when id not found")
        void shouldThrowWhenNotFound() {
            // TODO: given repository.findById returns empty
            //       when updateDepartment called
            //       then ResourceNotFoundException thrown
        }

        @Test
        @DisplayName("throws DuplicateResourceException when new name already taken by another")
        void shouldThrowWhenNewNameTaken() {
            // TODO: given existsByName returns true for new name
            //       when updateDepartment called
            //       then DuplicateResourceException thrown
        }
    }

    // -------------------------------------------------------------------------
    // deleteDepartment
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("deleteDepartment")
    class DeleteDepartment {

        @Test
        @DisplayName("deletes department without error when found")
        void shouldDeleteSuccessfully() {
            // TODO: given repository.findById returns department
            //       when deleteDepartment called
            //       then repository.delete invoked once
        }

        @Test
        @DisplayName("throws ResourceNotFoundException when id not found")
        void shouldThrowWhenNotFound() {
            // TODO: given repository.findById returns empty
            //       when deleteDepartment called
            //       then ResourceNotFoundException thrown, delete never called
        }
    }

    // -------------------------------------------------------------------------
    // saveDepartmentWithEmployees (transaction rollback experiment)
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("saveDepartmentWithEmployees")
    class SaveDepartmentWithEmployees {

        @Test
        @DisplayName("persists department and employees in one transaction")
        void shouldPersistDepartmentAndEmployees() {
            // TODO: given valid department and employee requests
            //       when saveDepartmentWithEmployees called
            //       then both saved and response returned
        }

        @Test
        @DisplayName("rolls back department save when employee save throws")
        void shouldRollbackWhenEmployeeSaveFails() {
            // TODO: given employee save throws RuntimeException
            //       when saveDepartmentWithEmployees called
            //       then transaction rolls back, department not persisted
            //       (Integration test level — may be better in an @SpringBootTest slice)
        }
    }

    // -------------------------------------------------------------------------
    // saveDepartmentInNewTransaction (REQUIRES_NEW)
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("saveDepartmentInNewTransaction")
    class SaveDepartmentInNewTransaction {

        @Test
        @DisplayName("saves in independent transaction regardless of outer transaction")
        void shouldSaveInOwnTransaction() {
            // TODO: given valid request
            //       when saveDepartmentInNewTransaction called from within another transaction
            //       then department persisted even if outer transaction rolls back
            //       (Integration test level — may be better in an @SpringBootTest slice)
        }
    }
}
