package com.springfundamentals.repository;

import com.springfundamentals.domain.Department;
import com.springfundamentals.domain.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;

/**
 * Repository-slice tests for {@link EmployeeRepository}.
 */
@DataJpaTest
@ActiveProfiles("test")
@DisplayName("EmployeeRepository")
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    private Department savedDepartment;

    @BeforeEach
    void setUp() {
        employeeRepository.deleteAll();
        departmentRepository.deleteAll();
        savedDepartment = departmentRepository.save(Department.builder().name("Engineering").build());
    }

    // -------------------------------------------------------------------------
    // CRUD
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("save")
    class Save {

        @Test
        @DisplayName("persists employee and assigns auto-generated ID")
        void shouldPersistEmployeeWithGeneratedId() {
            // TODO: build Employee linked to savedDepartment, save, assert id not null
        }

        @Test
        @DisplayName("updates employee salary")
        void shouldUpdateEmployeeSalary() {
            // TODO: save employee, update salary, save again, fetch, assert new salary
        }
    }

    @Nested
    @DisplayName("findByDepartmentId")
    class FindByDepartmentId {

        @Test
        @DisplayName("returns all employees belonging to the given department")
        void shouldReturnEmployeesForDepartment() {
            // TODO: save 2 employees in department, save 1 in another,
            //       findByDepartmentId, assert size == 2
        }

        @Test
        @DisplayName("returns empty list when department has no employees")
        void shouldReturnEmptyWhenNoEmployees() {
            // TODO: findByDepartmentId for empty department, assert empty
        }
    }

    @Nested
    @DisplayName("findBySalaryGreaterThan")
    class FindBySalaryGreaterThan {

        @Test
        @DisplayName("returns employees with salary above the threshold")
        void shouldReturnEmployeesAboveSalaryThreshold() {
            // TODO: save employees with various salaries, assert only high earners returned
        }

        @Test
        @DisplayName("returns empty list when no employee earns above threshold")
        void shouldReturnEmptyWhenNoneAboveThreshold() {
            // TODO: save employees all below threshold, assert empty
        }
    }

    @Nested
    @DisplayName("findBySalaryBetween")
    class FindBySalaryBetween {

        @Test
        @DisplayName("returns employees whose salary falls within the given range")
        void shouldReturnEmployeesInSalaryRange() {
            // TODO: save employees, findBySalaryBetween, assert correct subset returned
        }

        @Test
        @DisplayName("returns empty list when no salary in range")
        void shouldReturnEmptyWhenNoneInRange() {
            // TODO: findBySalaryBetween with range that matches no employee, assert empty
        }
    }

    @Nested
    @DisplayName("existsByNameAndDepartmentId")
    class ExistsByNameAndDepartmentId {

        @Test
        @DisplayName("returns true when employee with given name exists in department")
        void shouldReturnTrueWhenEmployeeExists() {
            // TODO: save employee, existsByNameAndDepartmentId, assert true
        }

        @Test
        @DisplayName("returns false when name matches but department differs")
        void shouldReturnFalseWhenDepartmentDiffers() {
            // TODO: save employee in dept A, check in dept B, assert false
        }
    }

    @Nested
    @DisplayName("findByDepartmentIdWithDepartment")
    class FindByDepartmentIdWithDepartment {

        @Test
        @DisplayName("returns employees with department fetched in one query")
        void shouldReturnEmployeesWithDepartment() {
            // TODO: save employees, call method, assert department is accessible (no LazyInit)
        }
    }

    @Nested
    @DisplayName("delete")
    class Delete {

        @Test
        @DisplayName("removes employee from the database")
        void shouldDeleteEmployee() {
            // TODO: save, deleteById, findById, assert isEmpty
        }
    }
}
