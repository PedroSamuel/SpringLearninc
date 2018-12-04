package com.aubaysi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.aubaysi.EmployeeRepository;
import com.aubaysi.model.Employee;

@Controller
public class EmployeeListController {

	@Autowired
	private EmployeeRepository repository;

	@RequestMapping("employees")
	public String employees(Model model) {
		// repository.findAll(); // Pertence ao crud repository e faz um find all

		Iterable<Employee> employees = repository.findAll();
		model.addAttribute("employees", employees);
		return "employees";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public RedirectView save(@RequestParam("name") String name, @RequestParam("lastname") String lastname, @RequestParam("email") String email, Model model) {
		Employee employee = new Employee();
				employee.setLastName(lastname);
				employee.setName(name);
				employee.setEmail(email);
				repository.save(employee);
				return new RedirectView("employees");
	}

}
