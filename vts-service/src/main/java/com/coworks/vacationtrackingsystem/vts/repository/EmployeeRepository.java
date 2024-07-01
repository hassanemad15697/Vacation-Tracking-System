package com.coworks.vacationtrackingsystem.vts.repository;

import com.coworks.vacationtrackingsystem.vts.model.Employee;
import com.coworks.vacationtrackingsystem.vts.model.Vacation;
import com.coworks.vacationtrackingsystem.vts.model.enums.VacationStatus;
import com.coworks.vacationtrackingsystem.vts.model.enums.VacationType;
import com.coworks.vacationtrackingsystem.vts.response.VacationResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Vacation> findAllVacationBalances(Long employeeId);
    Vacation saveVacationRequest(Vacation vacation);
    Long findVacationBalance(Long employeeId, VacationType vacationType);
    VacationStatus findByVacationStatus(Long vacationId);
    List<VacationResponse> findAllVacation(Long employeeId);
}
