package com.coworks.vacationtrackingsystem.vts.controller;

import com.coworks.vacationtrackingsystem.vts.model.Employee;
import com.coworks.vacationtrackingsystem.vts.model.enums.VacationStatus;
import com.coworks.vacationtrackingsystem.vts.model.enums.VacationType;
import com.coworks.vacationtrackingsystem.vts.request.VacationRequest;
import com.coworks.vacationtrackingsystem.vts.response.EmployeeResponse;
import com.coworks.vacationtrackingsystem.vts.response.VacationResponse;
import com.coworks.vacationtrackingsystem.vts.servicce.EmployeeService;
import com.coworks.vacationtrackingsystem.vts.utils.MapperUtil;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("vts/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @PostMapping("/submit_vacation")
    //@Valid validates the request body regarding validation criteria
    public ResponseEntity<VacationResponse> requestVacation(@Valid @RequestBody VacationRequest vacationRequest) {
        return new ResponseEntity<>(employeeService.requestVacation(vacationRequest), HttpStatus.CREATED);
    }

    @GetMapping("/view_all_vacations_balance/{empId}")
    public ResponseEntity<List<VacationResponse>> viewAllVacationBalances(@NotNull @PathVariable("empId") Long employeeId) {
        return new ResponseEntity<>(employeeService.viewAllVacationBalances(employeeId), HttpStatus.OK);
    }

    @GetMapping("/view_vacation_balance")
    public ResponseEntity<Long> viewVacationBalance(@NotNull @RequestParam("empId") Long employeeId, @NotNull @RequestParam("vacationType") VacationType vacationType) {
        return new ResponseEntity<>(employeeService.viewVacationBalance(employeeId, vacationType), HttpStatus.OK);
    }

    @GetMapping("/status/{vacation_id}")
    public ResponseEntity<VacationStatus> viewVacationRequestStatus(@NotNull @PathVariable("vacation_id") Long vacationId) {
        return new ResponseEntity<>(employeeService.viewVacationRequestStatus(vacationId), HttpStatus.OK);
    }

    //return employee data or Employee Response
    @GetMapping("/view/{empId}")
    public ResponseEntity<Employee> viewEmployeeData(@NotNull @PathVariable("empId") Long employeeId) {
        return new ResponseEntity<>(employeeService.viewEmployeeData(employeeId), HttpStatus.OK);

    }

    @PatchMapping("/update_vacation")
    public ResponseEntity<VacationResponse> updateVacationData(@Valid @RequestBody VacationRequest vacationRequest) {
        return new ResponseEntity<>(employeeService.updateVacation(vacationRequest), HttpStatus.OK);
    }

    @PostMapping("/cancel_vacation")
    public ResponseEntity<VacationResponse> cancelVacation(@Valid @RequestBody VacationRequest vacationRequest) {
        return new ResponseEntity<>(employeeService.cancelVacation(vacationRequest), HttpStatus.OK);
    }

    @GetMapping("/view_vacation_history")
    public ResponseEntity<List<VacationResponse>> viewVacationHistory(@NotNull @PathVariable("empId") Long employeeId) {
        return new ResponseEntity<>(employeeService.viewAllVacations(employeeId), HttpStatus.OK);
    }


}
/*
1- maven clean & install
2- create endpoint called test that return my name to check if the app running normally

 */