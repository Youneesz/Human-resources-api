package com.sfeproject.employesystem.controller;

import com.sfeproject.employesystem.model.Employe;
import com.sfeproject.employesystem.repository.EmployeRepository;
import com.sfeproject.employesystem.repository.RoleRepository;
import com.sfeproject.employesystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/employes")
public class EmployeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/all")
    public List<Employe> getEmployes() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employe getEmploye(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/add")
    public Employe createEmploye(@RequestBody Employe employe) {
        return employeeService.addEmployee(employe);
    }

    @PutMapping("/update/{id}")
    public Employe updateEmploye(@PathVariable int id, @RequestBody Employe employe) {
        return employeeService.updateEmployee(id, employe);
    }

    @DeleteMapping("/{id}")
    public String deleteEmploye(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
}
