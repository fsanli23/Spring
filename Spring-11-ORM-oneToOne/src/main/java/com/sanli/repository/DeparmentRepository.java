package com.sanli.repository;

import com.sanli.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeparmentRepository extends JpaRepository<Department,Integer>{
}
