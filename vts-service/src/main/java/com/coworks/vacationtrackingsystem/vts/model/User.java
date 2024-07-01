package com.coworks.vacationtrackingsystem.vts.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotNull(message = "First name is mandatory")
    private String firstName;
    @NotNull(message = "Last name is mandatory")
    private String lastName;
    @NotNull(message = "Email is mandatory")
    private String email;
    @NotNull(message = "Password is mandatory")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;
    @Pattern(regexp = "^(?:\\+?88)?01[13-9]\\d{8}$", message = "Invalid phone number")
    @NotNull(message = "Phone number is mandatory")
    private String phone;
    @OneToMany(mappedBy = "role")
    private Role role;
    @ManyToOne
    private int Department;
    private int managerId;
    private String dateJoined;
    private String createdAt;
    private String updatedAt;
}
