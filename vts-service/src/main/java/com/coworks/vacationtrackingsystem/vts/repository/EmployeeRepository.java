package com.coworks.vacationtrackingsystem.vts.repository;

import com.coworks.vacationtrackingsystem.vts.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
