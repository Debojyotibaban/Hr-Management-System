package com.pcsgpl.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcsgpl.entity.Supervisor;

@Repository
public interface SupervisorDao extends JpaRepository<Supervisor, Integer> {

}
