package tech.eikona.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import tech.eikona.login.service.DepartmentService;


@Controller
public class HomeController
{
	
	
	@Autowired
    private DepartmentService departmentService;
	
	@GetMapping("/home")
	public String home(Model model)
	{    model.addAttribute("Department", departmentService.getAllDepartment());
			
		return "index1";
	}
	
	
}