package com.springfundamentals.controller;

import com.springfundamentals.dto.DepartmentRequest;
import com.springfundamentals.dto.DepartmentResponse;
import com.springfundamentals.dto.DepartmentWithEmployeesRequest;
import com.springfundamentals.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
@Tag(name = "Departments", description = "CRUD operations for Department resources")
public class DepartmentController {

    private final DepartmentService departmentService;

    @Operation(summary = "Create a new department")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Department created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request payload"),
            @ApiResponse(responseCode = "409", description = "Department name already exists")
    })
    @PostMapping
    public ResponseEntity<DepartmentResponse> createDepartment(@Valid @RequestBody DepartmentRequest request) {
        // TODO: delegate to service, return 201
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Retrieve all departments")
    @ApiResponse(responseCode = "200", description = "List of departments returned")
    @GetMapping
    public ResponseEntity<List<DepartmentResponse>> getAllDepartments() {
        // TODO: delegate to service, return 200
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Retrieve a department by ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Department found"),
            @ApiResponse(responseCode = "404", description = "Department not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<DepartmentResponse> getDepartmentById(
            @Parameter(description = "Department ID") @PathVariable Long id) {
        // TODO: delegate to service, return 200
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Update an existing department")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Department updated"),
            @ApiResponse(responseCode = "400", description = "Invalid request payload"),
            @ApiResponse(responseCode = "404", description = "Department not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<DepartmentResponse> updateDepartment(
            @Parameter(description = "Department ID") @PathVariable Long id,
            @Valid @RequestBody DepartmentRequest request) {
        // TODO: delegate to service, return 200
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Delete a department")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Department deleted"),
            @ApiResponse(responseCode = "404", description = "Department not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartment(
            @Parameter(description = "Department ID") @PathVariable Long id) {
        // TODO: delegate to service, return 204
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Create a department along with its initial employees in one transaction")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Department and employees created"),
            @ApiResponse(responseCode = "400", description = "Invalid request payload")
    })
    @PostMapping("/with-employees")
    public ResponseEntity<DepartmentResponse> createDepartmentWithEmployees(
            @Valid @RequestBody DepartmentWithEmployeesRequest request) {
        // TODO: delegate to service, return 201
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }
}
