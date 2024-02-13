package com.squadtop.storedelivery.controllers;

import com.squadtop.storedelivery.model.Produto;
import com.squadtop.storedelivery.service.AdministradorService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
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

    @PostMapping("/cadastrar_produto")
    public ResponseEntity<?> cadastrarProduto(@RequestBody Produto produto) {
        administradorService.cadastrarProduto(produto);
        return ResponseEntity.ok("Produto Cadastrado");
    }


}
