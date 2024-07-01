package com.coworks.vacationtrackingsystem.vts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    private Long departmentId;
    private String departmentName;
    private String createdAt;
    private String updatedAt;
}
