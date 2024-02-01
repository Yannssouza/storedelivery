package com.squadtop.storedelivery.controllers;

//import com.squadtop.storedelivery.model.Cliente;
//import com.squadtop.storedelivery.repository.ClienteRepository;
//import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class ClienteController {

//  @Autowired
//  private ClienteRepository clienteRepository;

//  @GetMapping
//  public ResponseEntity<List<Cliente>> getClientes() {
//    return ResponseEntity.ok(clienteRepository.findAll());
//  }

//  @PostMapping("/cadastrar/cliente")
//  public ResponseEntity<String> cadastrarCliente(@Valid @RequestBody Cliente cliente) {
//    try {
//      clienteRepository.save(cliente);
//      return ResponseEntity.status(HttpStatus.CREATED).body("Cliente Cadastrado");
//    } catch (Exception e) {
//      return ResponseEntity.badRequest().body("Erro ao cadastrar o cliente");
//    }
//  }

  @GetMapping("/healthcheck")
  public ResponseEntity<String> Healthcheck() {
    return ResponseEntity.ok("Ok");
  }
}
