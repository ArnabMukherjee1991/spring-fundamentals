package com.springfundamentals.service;

import com.springfundamentals.dto.EmployeeRequest;
import com.springfundamentals.dto.EmployeeResponse;
import com.springfundamentals.exception.ResourceNotFoundException;
import com.springfundamentals.repository.DepartmentRepository;
import com.springfundamentals.repository.EmployeeRepository;
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
 * Unit tests for {@link EmployeeServiceImpl}.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("EmployeeService")
class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private DepartmentRepository departmentRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    // -------------------------------------------------------------------------
    // createEmployee
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("createEmployee")
    class CreateEmployee {

        @Test
        @DisplayName("returns EmployeeResponse when employee is created successfully")
        void shouldReturnResponseOnSuccess() {
            // TODO: given department found, employee saved
            //       when createEmployee called
            //       then response has correct id, name, salary, departmentId
        }

        @Test
        @DisplayName("throws ResourceNotFoundException when department not found")
        void shouldThrowWhenDepartmentNotFound() {
            // TODO: given departmentRepository.findById returns empty
            //       when createEmployee called
            //       then ResourceNotFoundException thrown
        }
    }

    // -------------------------------------------------------------------------
    // getAllEmployees
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("getAllEmployees")
    class GetAllEmployees {

        @Test
        @DisplayName("returns all employees mapped to responses")
        void shouldReturnAllEmployees() {
            // TODO: given employeeRepository.findAll returns list
            //       when getAllEmployees called
            //       then returned list size matches
        }

        @Test
        @DisplayName("returns empty list when no employees exist")
        void shouldReturnEmptyList() {
            // TODO: given empty findAll, assert empty response list
        }
    }

    // -------------------------------------------------------------------------
    // getEmployeeById
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("getEmployeeById")
    class GetEmployeeById {

        @Test
        @DisplayName("returns EmployeeResponse for existing id")
        void shouldReturnResponseWhenFound() {
            // TODO: given findById returns employee, assert response matches
        }

        @Test
        @DisplayName("throws ResourceNotFoundException when id not found")
        void shouldThrowWhenNotFound() {
            // TODO: given findById returns empty, assert exception
        }
    }

    // -------------------------------------------------------------------------
    // updateEmployee
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("updateEmployee")
    class UpdateEmployee {

        @Test
        @DisplayName("updates name and salary and returns response")
        void shouldUpdateEmployee() {
            // TODO: given employee found, department found, save returns updated entity
            //       when updateEmployee called
            //       then response has updated values
        }

        @Test
        @DisplayName("throws ResourceNotFoundException for unknown employee")
        void shouldThrowWhenEmployeeNotFound() {
            // TODO: given findById returns empty, assert exception
        }

        @Test
        @DisplayName("throws ResourceNotFoundException for unknown department")
        void shouldThrowWhenDepartmentNotFound() {
            // TODO: given employee found but department not found, assert exception
        }
    }

    // -------------------------------------------------------------------------
    // deleteEmployee
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("deleteEmployee")
    class DeleteEmployee {

        @Test
        @DisplayName("deletes employee when found")
        void shouldDeleteEmployee() {
            // TODO: given findById returns employee
            //       when deleteEmployee called
            //       then delete invoked once
        }

        @Test
        @DisplayName("throws ResourceNotFoundException when not found")
        void shouldThrowWhenNotFound() {
            // TODO: given findById returns empty, assert exception
        }
    }

    // -------------------------------------------------------------------------
    // getEmployeesByDepartment
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("getEmployeesByDepartment")
    class GetEmployeesByDepartment {

        @Test
        @DisplayName("returns employees for the given department")
        void shouldReturnEmployeesForDepartment() {
            // TODO: given findByDepartmentId returns list, assert mapped responses
        }

        @Test
        @DisplayName("returns empty list when department has no employees")
        void shouldReturnEmptyWhenNone() {
            // TODO: given findByDepartmentId returns empty, assert empty response
        }
    }

    // -------------------------------------------------------------------------
    // getEmployeesBySalaryRange
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("getEmployeesBySalaryRange")
    class GetEmployeesBySalaryRange {

        @Test
        @DisplayName("returns employees whose salary falls in the specified range")
        void shouldReturnEmployeesInRange() {
            // TODO: given findBySalaryBetween returns list, assert mapped responses
        }

        @Test
        @DisplayName("returns empty list when none match the range")
        void shouldReturnEmptyWhenNoneInRange() {
            // TODO: given empty result, assert empty response list
        }
    }

    // -------------------------------------------------------------------------
    // giveRaiseToDepartment
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("giveRaiseToDepartment")
    class GiveRaiseToDepartment {

        @Test
        @DisplayName("adds raise to all employees in department and returns updated count")
        void shouldApplyRaiseToAllEmployees() {
            // TODO: given 3 employees found, raise applied, assert count == 3
        }

        @Test
        @DisplayName("returns 0 when department has no employees")
        void shouldReturnZeroWhenNoEmployees() {
            // TODO: given empty employee list, assert returns 0
        }

        @Test
        @DisplayName("throws when raise amount is negative")
        void shouldThrowForNegativeRaise() {
            // TODO: given negative raiseAmount, assert IllegalArgumentException or custom exception
        }
    }
}
