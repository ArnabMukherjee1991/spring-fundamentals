package com.springfundamentals.repository;

import com.springfundamentals.domain.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Repository-slice tests for {@link DepartmentRepository}.
 * <p>
 * Uses {@code @DataJpaTest} which spins up an in-memory H2 database,
 * configures Hibernate, and rolls back each test in a transaction.
 * Fill in each test body as part of the TDD exercise.
 */
@DataJpaTest
@ActiveProfiles("test")
@DisplayName("DepartmentRepository")
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        departmentRepository.deleteAll();
    }

    // -------------------------------------------------------------------------
    // CRUD
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("save")
    class Save {

        @Test
        @DisplayName("persists a new department and assigns an auto-generated ID")
        void shouldPersistDepartmentWithGeneratedId() {
            // TODO: build a Department, save it, assert id is not null and name matches
        }

        @Test
        @DisplayName("updates department name when saved with existing ID")
        void shouldUpdateDepartmentName() {
            // TODO: save, modify name, save again, fetch, assert updated name
        }
    }

    @Nested
    @DisplayName("findById")
    class FindById {

        @Test
        @DisplayName("returns department when it exists")
        void shouldReturnDepartmentWhenFound() {
            // TODO: save, findById, assert isPresent and fields match
        }

        @Test
        @DisplayName("returns empty Optional when department does not exist")
        void shouldReturnEmptyOptionalWhenNotFound() {
            // TODO: findById(999L), assert isEmpty
        }
    }

    @Nested
    @DisplayName("findByName")
    class FindByName {

        @Test
        @DisplayName("returns department by its name")
        void shouldFindDepartmentByName() {
            // TODO: save with name, findByName, assert isPresent
        }

        @Test
        @DisplayName("returns empty Optional when name does not match")
        void shouldReturnEmptyWhenNameNotFound() {
            // TODO: findByName("Unknown"), assert isEmpty
        }
    }

    @Nested
    @DisplayName("existsByName")
    class ExistsByName {

        @Test
        @DisplayName("returns true when department with given name exists")
        void shouldReturnTrueWhenNameExists() {
            // TODO: save, existsByName, assert true
        }

        @Test
        @DisplayName("returns false when no department with given name")
        void shouldReturnFalseWhenNameAbsent() {
            // TODO: existsByName("Missing"), assert false
        }
    }

    @Nested
    @DisplayName("findByIdWithEmployees")
    class FindByIdWithEmployees {

        @Test
        @DisplayName("fetches department with employees eagerly in one query")
        void shouldFetchDepartmentWithEmployees() {
            // TODO: save department + employees, call findByIdWithEmployees,
            //       assert employees list size > 0 (no LazyInitializationException)
        }

        @Test
        @DisplayName("returns empty Optional when id not found")
        void shouldReturnEmptyWhenNotFound() {
            // TODO: findByIdWithEmployees(999L), assert isEmpty
        }
    }

    @Nested
    @DisplayName("findAllWithEmployees")
    class FindAllWithEmployees {

        @Test
        @DisplayName("returns all departments with their employees")
        void shouldReturnAllDepartmentsWithEmployees() {
            // TODO: save multiple departments with employees, call findAllWithEmployees,
            //       assert size and employee lists are populated
        }

        @Test
        @DisplayName("returns empty list when no departments exist")
        void shouldReturnEmptyListWhenNoDepartments() {
            // TODO: findAllWithEmployees() on empty DB, assert empty
        }
    }

    @Nested
    @DisplayName("delete")
    class Delete {

        @Test
        @DisplayName("removes department from the database")
        void shouldDeleteDepartment() {
            // TODO: save, deleteById, findById, assert isEmpty
        }
    }
}
