package com.sfeproject.employesystem.controller;


import com.sfeproject.employesystem.model.Realiser;
import com.sfeproject.employesystem.repository.RealiserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/affectations")
public class RealiserController {

    private final RealiserRepository realiserRepository;

    public RealiserController(RealiserRepository realiserRepository) {
        this.realiserRepository = realiserRepository;
    }

    @GetMapping
    public List<Realiser> getAffectations(){
        return realiserRepository.findAll();
    }

    @GetMapping("/{id}")
    public Realiser getAffectation(@PathVariable int id){
        return realiserRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping("/add")
    public ResponseEntity addAffectation(Realiser affectation) throws URISyntaxException {
        Realiser newAffectation = realiserRepository.save(affectation);
        return ResponseEntity.created(new URI("/affectations/add/" + newAffectation.getNumAffectation())).body(newAffectation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAffectation(@PathVariable int id){
        realiserRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    //we still need to add the update method here
}
