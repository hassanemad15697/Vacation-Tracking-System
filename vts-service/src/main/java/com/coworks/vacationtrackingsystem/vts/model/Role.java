package com.coworks.vacationtrackingsystem.vts.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    Long roleId;
    String roleName;
    String description;
    String createdAt;
    String updatedAt;
}
