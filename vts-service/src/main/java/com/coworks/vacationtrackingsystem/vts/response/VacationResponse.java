package com.coworks.vacationtrackingsystem.vts.response;


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
public class VacationResponse {
    private Long vacationId;
    private Long userId;
    private String startDate;
    private String endDate;
    private String status;
    private String description;
    private String vacationType;
    private int approvedBy;
    private String approvedAt;
    private String rejectedReason;
}
