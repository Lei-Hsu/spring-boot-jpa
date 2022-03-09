package com.example.demo2.service;

import com.example.demo2.dao.entity.StaffEntity;
import com.example.demo2.dto.request.StaffRequest;

import java.util.List;
import java.util.Optional;

public interface StaffsService {
    List<StaffEntity> findAll();

    Optional<StaffEntity> addStaff(StaffRequest staffRequest);

    void deleteStaff(StaffRequest staffRequest);

    Optional<StaffEntity> updateStaff(StaffRequest staffRequest);

}
