package com.coworks.vacationtrackingsystem.vts.servicce;


import com.coworks.vacationtrackingsystem.vts.model.Employee;
import com.coworks.vacationtrackingsystem.vts.model.Vacation;
import com.coworks.vacationtrackingsystem.vts.request.VacationRequest;

import java.util.List;


public interface EmployeeService {
    void requestVacation(VacationRequest vacationRequest);
    List<Vacation> viewVacationBalance(Long employeeId);
    Vacation viewVacationRequestStatus(Long vacationId);
    Employee viewEmployeeData(Long employeeId);

}
