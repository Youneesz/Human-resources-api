package com.sfeproject.employesystem.controller;

import com.sfeproject.employesystem.model.Role;
import com.sfeproject.employesystem.repository.RoleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
@CrossOrigin
public class RoleController {

    private final RoleRepository roleRepository;

    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostMapping("/add")
    public String add(@RequestBody Map<String, String> body) {
        String name = body.get("INTITULE_ROLE");
        String desc = body.get("DESCRIPTION_ROLE");
        Role nv_role = roleRepository.save(new Role(name, desc));
        return "Role " + nv_role.getIntituleRole() + " added.";
    }

    @GetMapping("/getAll")
    public List<Role> list() {
        return roleRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Role> getRole(@PathVariable int id) {
        return roleRepository.findById(id);
    }
}
