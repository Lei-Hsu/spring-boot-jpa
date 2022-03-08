package com.example.demo2.dao.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "apple")
@Table(name = "apple")
@Data
public class AA {

    @Id
    private Integer id;

    private String A;
}
