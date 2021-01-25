package tech.eikona.login.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.eikona.login.entity.Department;
import tech.eikona.login.repository.DepartmentRepository;
import tech.eikona.login.service.DepartmentService;



@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAllByIsDeleteFalse();
    }

	
	@Override
    public void saveDepartment(Department dept) {
		dept.setDelete(false);
        this.departmentRepository.save(dept);
    }

    @Override
    public Department getDepartmentById(long id) {
    	 Optional < Department > optional = departmentRepository.findById(id);
        Department dept = null;
        if (optional.isPresent()) {
            dept = optional.get();
        }
        else 
        {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return dept;
    }
    
    
  @Override
 public void deleteDepartmentById(long id) 
 {
 Optional < Department > optional = departmentRepository.findById(id);
    Department dept= null;
    if (optional.isPresent())
    {
        dept = optional.get();
        dept.setDelete(true);
    }
    else 
    {
        throw new RuntimeException(" Employee not found for id :: " + id);
    }
    this.departmentRepository.save(dept);
}
    
}
