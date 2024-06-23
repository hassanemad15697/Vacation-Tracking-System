package com.coworks.vacationtrackingsystem.vts.controller;

import com.coworks.vacationtrackingsystem.vts.request.VacationRequest;
import com.coworks.vacationtrackingsystem.vts.response.EmployeeResponse;
import com.coworks.vacationtrackingsystem.vts.response.VacationResponse;
import com.coworks.vacationtrackingsystem.vts.servicce.EmployeeService;
import com.coworks.vacationtrackingsystem.vts.utils.MapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("vts/employee")
@RequiredArgsConstructor
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;
    private final MapperUtil mapper;

    @PostMapping("/submit_vacation")
    public ResponseEntity<?> requestVacation(@RequestBody VacationRequest vacationRequest) {
        employeeService.requestVacation(vacationRequest);
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }

    @PostMapping("/view_vacations/{empId}")
    public ResponseEntity<List<VacationResponse>> viewVacationBalance(@PathVariable("empId") Long employeeId) {
        List<VacationResponse> responseList = mapper.mapList(employeeService.viewVacationBalance(employeeId), VacationResponse.class);
        return new ResponseEntity<>(responseList, HttpStatus.OK);
    }

    @PostMapping("/status/{id}")
    public ResponseEntity<VacationResponse> viewVacationRequestStatus(@PathVariable("id") Long vacationId) {
        return new ResponseEntity<>(mapper.mapEntity(employeeService.viewVacationRequestStatus(vacationId), VacationResponse.class), HttpStatus.OK);
    }

    @PostMapping("/view/{empId}")
    public ResponseEntity<EmployeeResponse> viewEmployeeData(@PathVariable("empId") Long employeeId) {
        return new ResponseEntity<>(mapper.mapEntity(employeeService.viewEmployeeData(employeeId), EmployeeResponse.class), HttpStatus.OK);

    }

}
