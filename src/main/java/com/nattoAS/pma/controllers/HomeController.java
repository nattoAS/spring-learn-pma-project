package com.nattoAS.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nattoAS.pma.dao.EmployeeRepository;
import com.nattoAS.pma.dao.ProjectRepository;
import com.nattoAS.pma.entities.Employee;
import com.nattoAS.pma.entities.Project;

@Controller
public class HomeController {

	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) {
		
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projectsList", projects);
		
		List<Employee> employees = empRepo.findAll();
		model.addAttribute("employeesList", employees);
		
		return "home";
		
	}
	
	
}
