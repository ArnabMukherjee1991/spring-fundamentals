package com.springfundamentals.repository;

import com.springfundamentals.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartmentId(Long departmentId);

    List<Employee> findBySalaryGreaterThan(BigDecimal salary);

    List<Employee> findBySalaryBetween(BigDecimal min, BigDecimal max);

    boolean existsByNameAndDepartmentId(String name, Long departmentId);

    /** Fetch employees with their department in one query (avoids N+1). */
    @Query("SELECT e FROM Employee e JOIN FETCH e.department WHERE e.department.id = :departmentId")
    List<Employee> findByDepartmentIdWithDepartment(Long departmentId);
}
