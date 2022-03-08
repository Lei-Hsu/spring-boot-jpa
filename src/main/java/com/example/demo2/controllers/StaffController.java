package com.example.demo2.controllers;

import com.example.demo2.dao.entity.AA;
import com.example.demo2.dao.entity.StaffEntity;
import com.example.demo2.dao.repository.ARepository;
import com.example.demo2.dto.request.StaffRequest;
import com.example.demo2.service.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class StaffController {


    @Autowired
    StaffsService staffService;


    @Autowired
    ARepository aRepository;

    @GetMapping("/findAll")
    public List<StaffEntity> findStaff() {
        return staffService.findAll();
    }

    @PostMapping("/addStaff")
    public Optional<StaffEntity> addStaff(@RequestBody StaffRequest staffRequest){
        return staffService.addStaff(staffRequest);
    }

    @GetMapping("/findA")
    public List<AA> A() {
        return aRepository.findAll();
    }

}
