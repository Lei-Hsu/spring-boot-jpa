package com.example.demo2.dao.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@DynamicInsert
@Data
@Entity(name = "staff_info")
@Table(name = "staff_info")
public class StaffEntity {

    @Id
    @Column(name="ID")
    private int id;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PHONE")
    private String phone;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="POSITION")
    private String position;

}