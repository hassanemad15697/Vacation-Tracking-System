package com.coworks.vacationtrackingsystem.vts.request;

import com.coworks.vacationtrackingsystem.vts.model.enums.VacationStatus;
import com.coworks.vacationtrackingsystem.vts.model.enums.VacationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
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
public class VacationRequest {
    @NotNull
    private Long userId;
    @NotNull(message = "Vacation start date is mandatory")
    private String startDate;
    @NotNull(message = "Vacation end date is mandatory")
    private String endDate;
    @NotNull
    private VacationStatus status;
    private String description;
    @NotNull(message = "Vacation type is mandatory")
    private VacationType vacationType;
}
