package com.springfundamentals.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springfundamentals.dto.EmployeeRequest;
import com.springfundamentals.dto.EmployeeResponse;
import com.springfundamentals.exception.ResourceNotFoundException;
import com.springfundamentals.service.EmployeeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.List;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Web-layer slice tests for {@link EmployeeController}.
 */
@WebMvcTest(EmployeeController.class)
@ActiveProfiles("test")
@DisplayName("EmployeeController")
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private EmployeeService employeeService;

    // -------------------------------------------------------------------------
    // POST /api/v1/employees
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("POST /api/v1/employees")
    class CreateEmployee {

        @Test
        @DisplayName("returns 201 and EmployeeResponse on valid input")
        void shouldReturn201OnSuccess() throws Exception {
            // TODO: given service returns EmployeeResponse
            //       when POST /api/v1/employees with valid body
            //       then status 201, body contains id, name, salary, departmentId
        }

        @Test
        @DisplayName("returns 400 when name is blank")
        void shouldReturn400WhenNameBlank() throws Exception {
            // TODO: when POST with blank name, then 400 with field error
        }

        @Test
        @DisplayName("returns 400 when salary is null")
        void shouldReturn400WhenSalaryNull() throws Exception {
            // TODO: when POST with null salary, then 400 with field error
        }

        @Test
        @DisplayName("returns 400 when salary is zero or negative")
        void shouldReturn400WhenSalaryNotPositive() throws Exception {
            // TODO: when POST with salary == 0, then 400 with field error
        }

        @Test
        @DisplayName("returns 400 when departmentId is null")
        void shouldReturn400WhenDepartmentIdNull() throws Exception {
            // TODO: when POST with null departmentId, then 400 with field error
        }

        @Test
        @DisplayName("returns 404 when department not found")
        void shouldReturn404WhenDepartmentNotFound() throws Exception {
            // TODO: given service throws ResourceNotFoundException
            //       when POST, then status 404
        }
    }

    // -------------------------------------------------------------------------
    // GET /api/v1/employees
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("GET /api/v1/employees")
    class GetAllEmployees {

        @Test
        @DisplayName("returns 200 with list of employees")
        void shouldReturn200WithList() throws Exception {
            // TODO: given service returns list, when GET, then 200 with JSON array
        }

        @Test
        @DisplayName("returns 200 with empty array when no employees")
        void shouldReturn200WithEmptyArray() throws Exception {
            // TODO: given empty service response, then 200 []
        }
    }

    // -------------------------------------------------------------------------
    // GET /api/v1/employees/{id}
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("GET /api/v1/employees/{id}")
    class GetEmployeeById {

        @Test
        @DisplayName("returns 200 and employee when found")
        void shouldReturn200WhenFound() throws Exception {
            // TODO: given service returns employee, then status 200
        }

        @Test
        @DisplayName("returns 404 when employee not found")
        void shouldReturn404WhenNotFound() throws Exception {
            // TODO: given service throws ResourceNotFoundException, then 404
        }
    }

    // -------------------------------------------------------------------------
    // PUT /api/v1/employees/{id}
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("PUT /api/v1/employees/{id}")
    class UpdateEmployee {

        @Test
        @DisplayName("returns 200 and updated employee on success")
        void shouldReturn200OnSuccess() throws Exception {
            // TODO: given service returns updated response, then 200
        }

        @Test
        @DisplayName("returns 400 on validation failure")
        void shouldReturn400OnValidationFailure() throws Exception {
            // TODO: blank name → 400
        }

        @Test
        @DisplayName("returns 404 when employee not found")
        void shouldReturn404WhenNotFound() throws Exception {
            // TODO: ResourceNotFoundException → 404
        }
    }

    // -------------------------------------------------------------------------
    // DELETE /api/v1/employees/{id}
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("DELETE /api/v1/employees/{id}")
    class DeleteEmployee {

        @Test
        @DisplayName("returns 204 when employee deleted")
        void shouldReturn204OnSuccess() throws Exception {
            // TODO: delete without error → 204
        }

        @Test
        @DisplayName("returns 404 when employee not found")
        void shouldReturn404WhenNotFound() throws Exception {
            // TODO: ResourceNotFoundException → 404
        }
    }

    // -------------------------------------------------------------------------
    // GET /api/v1/employees/department/{departmentId}
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("GET /api/v1/employees/department/{departmentId}")
    class GetEmployeesByDepartment {

        @Test
        @DisplayName("returns 200 with employees for the given department")
        void shouldReturn200WithEmployees() throws Exception {
            // TODO: given service returns list for department, then 200 with array
        }

        @Test
        @DisplayName("returns 200 with empty array when no employees in department")
        void shouldReturn200WithEmptyArray() throws Exception {
            // TODO: given empty service response, then 200 []
        }
    }

    // -------------------------------------------------------------------------
    // GET /api/v1/employees/salary
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("GET /api/v1/employees/salary")
    class GetEmployeesBySalaryRange {

        @Test
        @DisplayName("returns 200 with filtered employees")
        void shouldReturn200WithFilteredEmployees() throws Exception {
            // TODO: given ?min=X&max=Y returns list, then 200 with filtered array
        }
    }

    // -------------------------------------------------------------------------
    // PATCH /api/v1/employees/department/{departmentId}/raise
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("PATCH /api/v1/employees/department/{departmentId}/raise")
    class GiveRaiseToDepartment {

        @Test
        @DisplayName("returns 200 with count of updated employees")
        void shouldReturn200WithCount() throws Exception {
            // TODO: given service returns 3, when PATCH ?amount=500, then 200 body is 3
        }

        @Test
        @DisplayName("returns 404 when department not found")
        void shouldReturn404WhenDepartmentNotFound() throws Exception {
            // TODO: ResourceNotFoundException → 404
        }
    }
}
