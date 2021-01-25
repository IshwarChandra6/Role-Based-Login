package tech.eikona.login.service;
import java.util.List;

import tech.eikona.login.entity.Department;


public interface DepartmentService
{
 List<Department> getAllDepartment();
 
 void saveDepartment(Department dept);
 
 Department getDepartmentById(long id);
 
 void deleteDepartmentById(long id);
 
}
