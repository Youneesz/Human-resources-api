package com.sfeproject.employesystem.controller;


import com.sfeproject.employesystem.model.PieceJointe;
import com.sfeproject.employesystem.repository.PieceJointeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/pieces jointes")
public class PieceJointeController {

    private final PieceJointeRepository pieceJointeRepository;

    public PieceJointeController(PieceJointeRepository pieceJointeRepository) {
        this.pieceJointeRepository = pieceJointeRepository;
    }

    @GetMapping("/{id}")
    public PieceJointe getPieceJointe(@PathVariable int id){
        return pieceJointeRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping("/add")
    public ResponseEntity createPieceJointe(@RequestBody PieceJointe pieceJointe) throws URISyntaxException {
        PieceJointe newPieceJointe = pieceJointeRepository.save(pieceJointe);
        return ResponseEntity.created(new URI("pieces jointes/add" + newPieceJointe.getCodePieceJ())).body(newPieceJointe);


    }

    @GetMapping
    public List<PieceJointe> getAll(){
        return pieceJointeRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePieceJointe(@PathVariable int id){
        pieceJointeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    //we still need the update method here
}
