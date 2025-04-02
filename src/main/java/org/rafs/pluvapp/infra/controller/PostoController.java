package org.rafs.pluvapp.infra.controller;

import org.rafs.pluvapp.application.usecase.PostoUsecase;
import org.rafs.pluvapp.domain.model.Posto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/posto")
public class PostoController {

    private final PostoUsecase postoUsecase;

    public PostoController(PostoUsecase postoUsecase) {
        this.postoUsecase = postoUsecase;
    }

    @GetMapping("")
    public ResponseEntity<Posto> findById(@RequestParam String id){
        return ResponseEntity.ok(postoUsecase.findById(id));
    }

}
