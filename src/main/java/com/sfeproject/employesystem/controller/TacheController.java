package com.sfeproject.employesystem.controller;

import com.sfeproject.employesystem.model.Tache;
import com.sfeproject.employesystem.repository.TacheRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;



@RestController
@RequestMapping("/roles")
public class TacheController {

    private final TacheRepository tacheRepository;

    public TacheController(TacheRepository tacheRepository) {
        this.tacheRepository = tacheRepository;
    }

    @GetMapping
    public List<Tache> getTaches(){
        return tacheRepository.findAll();
    }

    @GetMapping("/{id}")
    public Tache getTache(@PathVariable int id){
        return tacheRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @RequestMapping("/add")
    public ResponseEntity addTache(@RequestBody Tache tache) throws URISyntaxException {
        Tache newTache = tacheRepository.save(tache);
        return ResponseEntity.created(new URI("/Taches/add/" + newTache.getCodeTache())).body(newTache);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTache(@PathVariable int id){
        tacheRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    // we still have to add the update method

}
