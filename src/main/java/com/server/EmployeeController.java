package com.server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Employee;

@Controller
@ComponentScan(basePackages= {"com.config"})
public class EmployeeController {
	@Autowired
	private Employee employee1;

	@RequestMapping(value="/")
	public String home(Model model) {
		model.addAttribute("message", "Welcome to the company");
		return "home";
	}
	@RequestMapping(value="/addEmployee")
	public String addEmployee() {
		return "form";
	}
	@RequestMapping(value="/getEmployee")
	public String getEmployee( @ModelAttribute Employee employee) {
		employee1.setId(employee.getId());
		employee1.setName(employee.getName());
		employee1.setSalary(employee.getSalary());
	   return "current";
	}
	@GetMapping(value="/readEmployee", produces= {"application/json"})
	@ResponseBody
	public Employee readEmployee() {
		return employee1;
	}
	@GetMapping(value="/xmlEmployee",produces= {"application/xml"})
	@ResponseBody
	public Employee xmlEmployee() {
		return employee1;
	}
}
