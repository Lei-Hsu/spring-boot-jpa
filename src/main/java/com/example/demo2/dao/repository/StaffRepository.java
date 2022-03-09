package com.example.demo2.dao.repository;

import com.example.demo2.dao.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Integer> {

//    @Query(value = "UPDATE staff_info SET email = :email , phone = :phone, position = :position  where id = :id" , nativeQuery = true )
//    List<String> updateStaff(@Param("email")String email , @Param("phone")String phone ,  @Param("position")String position ,  @Param("id")int id);

}
