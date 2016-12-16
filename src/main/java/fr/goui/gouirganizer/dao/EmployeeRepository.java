package fr.goui.gouirganizer.dao;

import fr.goui.gouirganizer.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Data access object for the employees.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
