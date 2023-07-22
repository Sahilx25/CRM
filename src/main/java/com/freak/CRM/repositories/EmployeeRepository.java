package com.freak.CRM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freak.CRM.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
