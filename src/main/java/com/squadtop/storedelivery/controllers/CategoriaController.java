package com.squadtop.storedelivery.controllers;

import com.squadtop.storedelivery.model.Categoria;
import com.squadtop.storedelivery.service.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CategoriaController {

  private final CategoriaService categoriaService;
  public ResponseEntity<?> cadastrarCategoria(@RequestBody Categoria categoria) {
    categoriaService.cadastrarCategoria(categoria);
    return ResponseEntity.ok("Categoria foi salva com sucesso");
  }
}
