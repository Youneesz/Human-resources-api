package com.sfeproject.employesystem.controller;

import com.sfeproject.employesystem.model.Employe;
import com.sfeproject.employesystem.repository.EmployeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/employes")
public class EmployeController {
    private final EmployeRepository employeRepository;

    public EmployeController(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @GetMapping
    public List<Employe> getEmployes() {
        return employeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employe getEmploye(@PathVariable int id) {
        return employeRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping("/add")
    public ResponseEntity createEmploye(@RequestBody Employe employe) throws URISyntaxException {
        Employe savedEmploye = employeRepository.save(employe);
        return ResponseEntity.created(new URI("/employes/add/" + savedEmploye.getCodeEmp())).body(savedEmploye);
    }

    @PostMapping("/{id}")
    public ResponseEntity updateEmploye(@PathVariable int id, @RequestBody Employe employe) {
        Employe currentEmploye = employeRepository.findById(id).orElseThrow(RuntimeException::new);
        currentEmploye.setNomEmp(employe.getNomEmp());
        currentEmploye.setAdresseEmp(employe.getAdresseEmp());
        currentEmploye.setCinEmp(employe.getCinEmp());
        currentEmploye.setAdresseTravail(employe.getAdresseTravail());
        currentEmploye.setDateRecrutement(employe.getDateRecrutement());
        currentEmploye.setMotPasse(employe.getMotPasse());
        currentEmploye.setPrenomEmp(employe.getPrenomEmp());
        currentEmploye.setSexeEmp(employe.getSexeEmp());
        currentEmploye.setTelEmp(employe.getTelEmp());

        //code role, code employe, code SOM to be added later
        //need to add a logic to the service package to reduce the nbre lines

        return ResponseEntity.ok(currentEmploye);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteClient(@PathVariable int id) {
        employeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
