package com.sfeproject.employesystem.controller;


import com.sfeproject.employesystem.model.Piece;
import com.sfeproject.employesystem.repository.PieceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/pieces")
public class PieceController {

    PieceRepository pieceRepository;

    public PieceController(PieceRepository pieceRepository) {
        this.pieceRepository = pieceRepository;
    }


    @GetMapping("/{id}")
    public Piece getPiece(@PathVariable int id){
        return pieceRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping
    public List<Piece> getAll(){
        return pieceRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity createPiece(@RequestBody Piece piece) throws URISyntaxException {
        Piece newPiece = pieceRepository.save(piece);
        return ResponseEntity.created(new URI("pieces/add" + newPiece.getCodePiece())).body(newPiece);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePiece(@PathVariable int id){
        pieceRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    // we still have to add the update method

}
