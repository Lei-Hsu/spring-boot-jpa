package com.example.demo2.service;

import com.example.demo2.dao.entity.StaffEntity;
import com.example.demo2.dto.request.RabbitmqRequest;
import com.example.demo2.dto.request.StaffRequest;

import java.util.List;
import java.util.Optional;

public interface RabbitmqService {
    void message(RabbitmqRequest rabbitmqRequest);

}
