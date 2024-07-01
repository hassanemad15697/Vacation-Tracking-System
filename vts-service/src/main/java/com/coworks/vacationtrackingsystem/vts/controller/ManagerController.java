package com.coworks.vacationtrackingsystem.vts.controller;

import com.coworks.vacationtrackingsystem.vts.servicce.ManagerService;
import com.coworks.vacationtrackingsystem.vts.utils.MapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vts/manager")
@RequiredArgsConstructor
public class ManagerController {

    @Autowired
    private ManagerService managerService;



}
