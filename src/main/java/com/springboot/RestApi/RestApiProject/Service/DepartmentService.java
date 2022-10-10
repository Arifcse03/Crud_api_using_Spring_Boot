package com.springboot.RestApi.RestApiProject.Service;

import com.springboot.RestApi.RestApiProject.Entity.Department;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

  public Department getDepartmentById(Long departmentId);

   public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);
}
