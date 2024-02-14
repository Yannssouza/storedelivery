package com.squadtop.storedelivery.controllers;

import com.squadtop.storedelivery.model.Cliente;
import com.squadtop.storedelivery.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ClienteController {
  private final ClienteService clienteService;

  @PostMapping("/cadastrar_cliente")
  public ResponseEntity<?> cadastrarCliente(@RequestBody Cliente cliente) {
    clienteService.cadastrarCliente(cliente);
    return ResponseEntity.ok("Cliente Cadastrado");
  }
}
