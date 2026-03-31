package com.springfundamentals.controller;

import com.springfundamentals.dto.EmployeeRequest;
import com.springfundamentals.dto.EmployeeResponse;
import com.springfundamentals.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
@Tag(name = "Employees", description = "CRUD operations for Employee resources")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Operation(summary = "Create a new employee")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Employee created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request payload"),
            @ApiResponse(responseCode = "404", description = "Department not found")
    })
    @PostMapping
    public ResponseEntity<EmployeeResponse> createEmployee(@Valid @RequestBody EmployeeRequest request) {
        // TODO: delegate to service, return 201
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Retrieve all employees")
    @ApiResponse(responseCode = "200", description = "List of employees returned")
    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {
        // TODO: delegate to service, return 200
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Retrieve an employee by ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Employee found"),
            @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(
            @Parameter(description = "Employee ID") @PathVariable Long id) {
        // TODO: delegate to service, return 200
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Update an existing employee")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Employee updated"),
            @ApiResponse(responseCode = "400", description = "Invalid request payload"),
            @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponse> updateEmployee(
            @Parameter(description = "Employee ID") @PathVariable Long id,
            @Valid @RequestBody EmployeeRequest request) {
        // TODO: delegate to service, return 200
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Delete an employee")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Employee deleted"),
            @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(
            @Parameter(description = "Employee ID") @PathVariable Long id) {
        // TODO: delegate to service, return 204
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Retrieve employees by department")
    @ApiResponse(responseCode = "200", description = "Employees for given department")
    @GetMapping("/department/{departmentId}")
    public ResponseEntity<List<EmployeeResponse>> getEmployeesByDepartment(
            @Parameter(description = "Department ID") @PathVariable Long departmentId) {
        // TODO: delegate to service, return 200
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Retrieve employees within a salary range")
    @ApiResponse(responseCode = "200", description = "Filtered employees returned")
    @GetMapping("/salary")
    public ResponseEntity<List<EmployeeResponse>> getEmployeesBySalaryRange(
            @Parameter(description = "Minimum salary (inclusive)") @RequestParam BigDecimal min,
            @Parameter(description = "Maximum salary (inclusive)") @RequestParam BigDecimal max) {
        // TODO: delegate to service, return 200
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Give a raise to all employees in a department")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Number of employees updated"),
            @ApiResponse(responseCode = "404", description = "Department not found")
    })
    @PatchMapping("/department/{departmentId}/raise")
    public ResponseEntity<Integer> giveRaiseToDepartment(
            @Parameter(description = "Department ID") @PathVariable Long departmentId,
            @Parameter(description = "Raise amount") @RequestParam BigDecimal amount) {
        // TODO: delegate to service, return 200 with count
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }
}
