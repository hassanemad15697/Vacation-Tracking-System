package com.coworks.vacationtrackingsystem.vts.servicce.impl;

import com.coworks.vacationtrackingsystem.vts.model.Employee;
import com.coworks.vacationtrackingsystem.vts.model.Vacation;
import com.coworks.vacationtrackingsystem.vts.request.VacationRequest;
import com.coworks.vacationtrackingsystem.vts.servicce.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void requestVacation(VacationRequest vacationRequest) {

    }

    @Override
    public List<Vacation> viewVacationBalance(Long employeeId) {
        return null;
    }

    @Override
    public Vacation viewVacationRequestStatus(Long vacationId) {
        return null;
    }

    @Override
    public Employee viewEmployeeData(Long employeeId) {
        return null;
    }



}
