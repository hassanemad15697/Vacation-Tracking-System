package com.coworks.vacationtrackingsystem.vts.model;

import jakarta.persistence.Id;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Slf4j
@Builder
public class Employee {
    @Id
    private Long employeeId;
    private String employeeName;
    private String employeeEmail;
    private Long employeePhone;
    private String employeeGender;
    private String employeeSalary;
    private String employeeRole;
}
