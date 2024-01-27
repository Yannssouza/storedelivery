package com.apistoredelivery.app.domain.usecase;

import com.apistoredelivery.app.domain.adapter.ClienteAdpter;
import com.apistoredelivery.app.domain.model.Cliente;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CadastrarClienteUseCase {
  private final ClienteAdpter clienteAdpter;

  public Cliente execucao(Cliente cliente) throws Exception {
    if(cliente.getNome() == null) {
      throw new Exception();
    }
    if(cliente.getEndereco() == null) {
      throw new Exception();
    }
    return clienteAdpter.salvarCliente(cliente);
  }


}