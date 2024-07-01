package com.coworks.vacationtrackingsystem.vts.servicce;


import com.coworks.vacationtrackingsystem.vts.model.Employee;
import com.coworks.vacationtrackingsystem.vts.model.enums.VacationStatus;
import com.coworks.vacationtrackingsystem.vts.model.enums.VacationType;
import com.coworks.vacationtrackingsystem.vts.request.VacationRequest;
import com.coworks.vacationtrackingsystem.vts.response.VacationResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface EmployeeService {
    VacationResponse requestVacation(VacationRequest vacationRequest);
    List<VacationResponse> viewAllVacationBalances(Long employeeId);
    Long viewVacationBalance(Long employeeId, VacationType vacationType);
    VacationStatus viewVacationRequestStatus(Long vacationId);
    Employee viewEmployeeData(Long employeeId);
    VacationResponse updateVacation(VacationRequest vacationRequest);
    VacationResponse cancelVacation(VacationRequest vacationId);
    List<VacationResponse> viewAllVacations(Long employeeId);
}
