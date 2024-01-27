package com.apistoredelivery.app.controllers;

import com.apistoredelivery.app.domain.model.Cliente;
import com.apistoredelivery.app.domain.usecase.CadastrarClienteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
@RequiredArgsConstructor
public class ControllerCliente {
  private CadastrarClienteUseCase cadastrarClienteUseCase;

  @PostMapping("/cadastro/cliente")
  public ResponseEntity<?> cadastro(ClienteDTO clienteDTO) {
    final var cliente = converteDTOParaCliente(clienteDTO);
    try {
      cadastrarClienteUseCase.execucao(cliente);
    } catch (Exception e) {
      return (ResponseEntity<?>) ResponseEntity.badRequest();
    }
    return (ResponseEntity<?>) ResponseEntity.ok();
  }

  private Cliente converteDTOParaCliente(ClienteDTO dto) {
    final var cliente = new Cliente();
    cliente.setTelefone(dto.getTelefone());
    cliente.setEndereco(dto.getEndereco());
    cliente.setNome(dto.getNome());
    return cliente;
  }
}

