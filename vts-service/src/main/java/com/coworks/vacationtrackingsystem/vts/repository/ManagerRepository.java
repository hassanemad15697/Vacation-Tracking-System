package com.coworks.vacationtrackingsystem.vts.repository;

import com.coworks.vacationtrackingsystem.vts.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Long> {
}
