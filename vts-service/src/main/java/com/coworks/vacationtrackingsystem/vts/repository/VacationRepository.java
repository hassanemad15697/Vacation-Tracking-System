package com.coworks.vacationtrackingsystem.vts.repository;

import com.coworks.vacationtrackingsystem.vts.model.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRepository extends JpaRepository<Vacation,Long> {
}
