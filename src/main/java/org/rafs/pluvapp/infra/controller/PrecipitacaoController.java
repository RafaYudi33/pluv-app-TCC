package org.rafs.pluvapp.infra.controller;

import org.rafs.pluvapp.application.usecase.PrecipitacaoUseCase;
import org.rafs.pluvapp.domain.model.Precipitacao;
import org.rafs.pluvapp.infra.persistence.dto.PrecipitacaoWithPostoId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/precipitacao")
public class PrecipitacaoController {

    private final PrecipitacaoUseCase precipitacaoUseCase;

    public PrecipitacaoController(PrecipitacaoUseCase precipitacaoUseCase) {
        this.precipitacaoUseCase = precipitacaoUseCase;
    }

    @GetMapping("")
    public ResponseEntity<List<Precipitacao>> findByPostoId(@RequestParam String postoId) {
        return ResponseEntity.ok(precipitacaoUseCase.findByPostoId(postoId));
    }

    @GetMapping("/{ano}/{postoId}")
    public ResponseEntity<List<PrecipitacaoWithPostoId>> findByPostoAnoMes(@PathVariable int ano,
                                                                           @PathVariable String postoId
    ){
        return ResponseEntity.ok(precipitacaoUseCase.findByPostoAno(ano, postoId));
    }



}
