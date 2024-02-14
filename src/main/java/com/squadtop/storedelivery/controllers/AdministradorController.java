package com.squadtop.storedelivery.controllers;

import com.squadtop.storedelivery.model.Categoria;
import com.squadtop.storedelivery.model.Produto;
import com.squadtop.storedelivery.service.AdministradorService;
import com.squadtop.storedelivery.service.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AdministradorController {
  private final AdministradorService administradorService;
  private final CategoriaService categoriaService;

  @PostMapping("/cadastrar_produto")
  public ResponseEntity<?> cadastrarProduto(@RequestBody Produto produto) {
    administradorService.cadastrarProduto(produto);
    return ResponseEntity.ok("Produto Cadastrado");
  }

  @PostMapping("cadastrar_categoria")
  public ResponseEntity<?> cadastrarCategoria(@RequestBody Categoria categoria) {
    categoriaService.cadastrarCategoria(categoria);
    return ResponseEntity.ok("Categoria foi salva com sucesso");
  }
}
