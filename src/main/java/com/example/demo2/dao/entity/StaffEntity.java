package com.example.demo2.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@DynamicInsert
@Data
@Entity(name = "staff_info")
@Table(name = "staff_info")
public class StaffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @JsonIgnore
    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "POSITION")
    private String position;


}