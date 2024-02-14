package com.sfeproject.employesystem.controller;

import com.sfeproject.employesystem.model.Realiser;
import com.sfeproject.employesystem.service.RealiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/affectations")
public class RealiserController {

    @Autowired
    private RealiserService realiserService;

    @GetMapping("/get/{id}")
    public Realiser getAffectation(@PathVariable int id) {
        return realiserService.getAffectation(id);
    }

    @GetMapping("/getall")
    public List<Realiser> getAffectations() {
        return realiserService.getAllAffectations();
    }

    @PostMapping("/add")
    public Realiser addAffectation(@RequestBody Realiser affectation) {
        return realiserService.addAffectation(affectation);
    }

    @PutMapping("/update/{id}")
    public Realiser updateAffectation(@PathVariable int id, @RequestBody Realiser affectation) {
        return realiserService.updateAffectation(id, affectation);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAffectation(@PathVariable int id) {
        return realiserService.deleteAffectation(id);
    }


}
