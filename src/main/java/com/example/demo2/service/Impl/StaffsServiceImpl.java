package com.example.demo2.service.Impl;

import com.example.demo2.dao.entity.StaffEntity;
import com.example.demo2.dao.repository.StaffRepository;
import com.example.demo2.dto.request.StaffRequest;
import com.example.demo2.service.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<StaffEntity> addStaff(StaffRequest staffRequest) {
        StaffEntity staffEntity = new StaffEntity();

        staffEntity.setEmail(staffRequest.getEmail());
        staffEntity.setPassword(staffRequest.getPassword());
        staffEntity.setPhone(staffRequest.getPhone());
        staffEntity.setPosition(staffRequest.getPosition());

        staffRepository.save(staffEntity);

        int staffId = staffEntity.getId();

        return staffRepository.findById(staffId);

    }

    ;

}
