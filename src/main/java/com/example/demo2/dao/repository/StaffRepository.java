package com.example.demo2.dao.repository;

import com.example.demo2.dao.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Integer> {
}
