package com.pcsgpl.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcsgpl.entity.BaseBranch;

@Repository
public interface BaseBranchDao extends JpaRepository<BaseBranch, Integer>{

}
