package com.example.demo2.service.Impl;

import com.example.demo2.dao.entity.StaffEntity;
import com.example.demo2.dao.repository.StaffRepository;
import com.example.demo2.service.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffsServiceImpl implements StaffsService {


    @Autowired
    StaffRepository staffRepository;

    @Override
    public List<StaffEntity> findAll() {
        List<StaffEntity> staffList = staffRepository.findAll();
        System.out.println(staffList);
        return staffList;
    }
}
