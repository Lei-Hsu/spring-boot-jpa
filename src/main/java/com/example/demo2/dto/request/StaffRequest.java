package com.example.demo2.dto.request;

import lombok.Data;

@Data
public class StaffRequest {
    private int id;

    private String email;

    private String phone;

    private String password;

    private String position;
}
