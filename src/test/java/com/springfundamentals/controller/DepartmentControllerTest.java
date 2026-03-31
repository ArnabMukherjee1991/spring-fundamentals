package com.springfundamentals.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springfundamentals.dto.DepartmentRequest;
import com.springfundamentals.dto.DepartmentResponse;
import com.springfundamentals.exception.DuplicateResourceException;
import com.springfundamentals.exception.ResourceNotFoundException;
import com.springfundamentals.service.DepartmentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Web-layer slice tests for {@link DepartmentController}.
 * <p>
 * Uses {@code @WebMvcTest} to load only the web layer.
 * Fill in each test body as part of the TDD exercise.
 */
@WebMvcTest(DepartmentController.class)
@ActiveProfiles("test")
@DisplayName("DepartmentController")
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private DepartmentService departmentService;

    // -------------------------------------------------------------------------
    // POST /api/v1/departments
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("POST /api/v1/departments")
    class CreateDepartment {

        @Test
        @DisplayName("returns 201 and DepartmentResponse on valid input")
        void shouldReturn201OnSuccess() throws Exception {
            // TODO: given service returns a DepartmentResponse
            //       when POST /api/v1/departments with valid body
            //       then status 201, response body contains id and name
        }

        @Test
        @DisplayName("returns 400 when name is blank")
        void shouldReturn400WhenNameBlank() throws Exception {
            // TODO: when POST with blank name
            //       then status 400, field error for 'name'
        }

        @Test
        @DisplayName("returns 409 when department name already exists")
        void shouldReturn409WhenNameDuplicate() throws Exception {
            // TODO: given service throws DuplicateResourceException
            //       when POST
            //       then status 409
        }
    }

    // -------------------------------------------------------------------------
    // GET /api/v1/departments
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("GET /api/v1/departments")
    class GetAllDepartments {

        @Test
        @DisplayName("returns 200 with list of departments")
        void shouldReturn200WithList() throws Exception {
            // TODO: given service returns list
            //       when GET /api/v1/departments
            //       then status 200, body is JSON array
        }

        @Test
        @DisplayName("returns 200 with empty array when no departments")
        void shouldReturn200WithEmptyArray() throws Exception {
            // TODO: given service returns empty list
            //       when GET
            //       then status 200, body is []
        }
    }

    // -------------------------------------------------------------------------
    // GET /api/v1/departments/{id}
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("GET /api/v1/departments/{id}")
    class GetDepartmentById {

        @Test
        @DisplayName("returns 200 and department when found")
        void shouldReturn200WhenFound() throws Exception {
            // TODO: given service returns department
            //       when GET /api/v1/departments/1
            //       then status 200 and body matches
        }

        @Test
        @DisplayName("returns 404 when department not found")
        void shouldReturn404WhenNotFound() throws Exception {
            // TODO: given service throws ResourceNotFoundException
            //       when GET /api/v1/departments/999
            //       then status 404
        }
    }

    // -------------------------------------------------------------------------
    // PUT /api/v1/departments/{id}
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("PUT /api/v1/departments/{id}")
    class UpdateDepartment {

        @Test
        @DisplayName("returns 200 and updated department on success")
        void shouldReturn200OnSuccess() throws Exception {
            // TODO: given service returns updated response
            //       when PUT with valid body
            //       then status 200 and body has updated name
        }

        @Test
        @DisplayName("returns 400 when request body fails validation")
        void shouldReturn400OnValidationFailure() throws Exception {
            // TODO: when PUT with blank name
            //       then status 400
        }

        @Test
        @DisplayName("returns 404 when department not found")
        void shouldReturn404WhenNotFound() throws Exception {
            // TODO: given service throws ResourceNotFoundException
            //       when PUT
            //       then status 404
        }
    }

    // -------------------------------------------------------------------------
    // DELETE /api/v1/departments/{id}
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("DELETE /api/v1/departments/{id}")
    class DeleteDepartment {

        @Test
        @DisplayName("returns 204 when department deleted")
        void shouldReturn204OnSuccess() throws Exception {
            // TODO: given service deletes without error
            //       when DELETE /api/v1/departments/1
            //       then status 204
        }

        @Test
        @DisplayName("returns 404 when department not found")
        void shouldReturn404WhenNotFound() throws Exception {
            // TODO: given service throws ResourceNotFoundException
            //       when DELETE
            //       then status 404
        }
    }
}
