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
public class Vacation {
    private Long vacationId;
    private Long userId;
    private String startDate;
    private String endDate;
    private String status;
    private String requestedAt;
    private String updatedAt;
    private String description;
    private String vacationType;
    private int approvedBy;
    private String approvedAt;
    private String rejectedReason;
}
