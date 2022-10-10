package com.springboot.RestApi.RestApiProject.Controller;

import com.springboot.RestApi.RestApiProject.Entity.Department;
import com.springboot.RestApi.RestApiProject.Service.DepartmentService;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    private  final org.slf4j.Logger LOGGER = (org.slf4j.Logger) LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("/save")
public Department saveDepartment(@Valid @RequestBody Department department){
return  departmentService.saveDepartment(department);
}
@GetMapping("/departments")
    public List <Department> getDepartment(){
       LOGGER.info("inside fetch");
      return departmentService.fetchDepartmentList();

}
@GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
}
    @DeleteMapping("/delete/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully!!";
    }
    @PutMapping("/update/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return  departmentService.updateDepartmentById(departmentId,department);
    }
}
