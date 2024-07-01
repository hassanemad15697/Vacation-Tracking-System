package com.coworks.vacationtrackingsystem.vts.servicce.impl;

import com.coworks.vacationtrackingsystem.vts.model.Employee;
import com.coworks.vacationtrackingsystem.vts.model.Vacation;
import com.coworks.vacationtrackingsystem.vts.model.enums.VacationStatus;
import com.coworks.vacationtrackingsystem.vts.model.enums.VacationType;
import com.coworks.vacationtrackingsystem.vts.repository.EmployeeRepository;
import com.coworks.vacationtrackingsystem.vts.request.VacationRequest;
import com.coworks.vacationtrackingsystem.vts.response.VacationResponse;
import com.coworks.vacationtrackingsystem.vts.servicce.EmployeeService;
import com.coworks.vacationtrackingsystem.vts.utils.MapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final MapperUtil mapper;
    private final EmployeeRepository employeeRepository;
    @Override
    public VacationResponse requestVacation(VacationRequest vacationRequest) {
    return  mapper.mapEntity(employeeRepository.saveVacationRequest(mapper.mapEntity(vacationRequest,Vacation.class)), VacationResponse.class);
    }

    @Override
    public List<VacationResponse> viewAllVacationBalances(Long employeeId) {
        return mapper.mapList(employeeRepository.findAllVacationBalances(employeeId), VacationResponse.class);
    }

    @Override
    public Long viewVacationBalance(Long employeeId, VacationType vacationType) {
        return employeeRepository.findVacationBalance(employeeId, vacationType);
    }


    @Override
    public VacationStatus viewVacationRequestStatus(Long vacationId) {
        return employeeRepository.findByVacationStatus(vacationId);
    }

    @Override
    public Employee viewEmployeeData(Long employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public VacationResponse updateVacation(VacationRequest vacationRequest) {
        return  mapper.mapEntity(employeeRepository.saveVacationRequest(mapper.mapEntity(vacationRequest,Vacation.class)), VacationResponse.class);
    }

    @Override
    public VacationResponse cancelVacation(VacationRequest vacationRequest) {
        //need to find a way to cancel the vacation by vacation id
        vacationRequest.setStatus(VacationStatus.CANCELLED);
        return mapper.mapEntity(employeeRepository.saveVacationRequest(mapper.mapEntity(vacationRequest,Vacation.class)), VacationResponse.class);

    }

    @Override
    public List<VacationResponse> viewAllVacations(Long employeeId) {
        return employeeRepository.findAllVacation(employeeId).stream().map(vacation -> mapper.mapEntity(vacation, VacationResponse.class)).collect(Collectors.toList());
    }


}
