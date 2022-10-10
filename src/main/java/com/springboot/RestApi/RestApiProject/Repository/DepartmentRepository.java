package com.springboot.RestApi.RestApiProject.Repository;

import com.springboot.RestApi.RestApiProject.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
