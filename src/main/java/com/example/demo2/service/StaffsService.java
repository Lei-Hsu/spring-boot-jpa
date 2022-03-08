package com.example.demo2.service;

import com.example.demo2.dao.entity.StaffEntity;
import com.example.demo2.service.Impl.StaffsServiceImpl;

import java.util.List;

public interface StaffsService {
    List<StaffEntity> findAll();

}
