package com.pcsgpl.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcsgpl.entity.ParentDetails;

@Repository
public interface ParentDetailsDao extends JpaRepository<ParentDetails, Integer> {

}
