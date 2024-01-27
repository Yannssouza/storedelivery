package com.apistoredelivery.app.domain;

import com.apistoredelivery.app.domain.adapter.ClienteAdpter;
import com.apistoredelivery.app.domain.model.Cliente;
import com.apistoredelivery.app.domain.usecase.CadastrarClienteUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CadastrarClienteTest {

  final CadastrarClienteUseCase salvarCliente() {
    final var mockSalvaCliente = new MockSalvaCliente();
    return new CadastrarClienteUseCase(mockSalvaCliente);
  }

  @Test
  @DisplayName("Deve cadastrar um cliente")
  void testeUm() throws Exception {
    final var salvarCliente = salvarCliente();
    final var cliente = new Cliente();
    cliente.setEndereco("End Test");
    cliente.setNome("Joao");
    cliente.setTelefone("93291932921");
    Cliente execucao = salvarCliente.execucao(cliente);
    Assertions.assertNotNull(execucao);
  }


  @Test
  @DisplayName("Deve falhar ao tentar salvar cliente com o nome nulo")
  void testeDois() {
    final var salvarCliente = salvarCliente();
    final var cliente = new Cliente();
    cliente.setEndereco("End Test");
    cliente.setTelefone("93291932921");
    Assertions.assertThrows(Exception.class, () -> salvarCliente.execucao(cliente));
  }

  @Test
  @DisplayName("Deve falhar ao tentar salvar cliente com o endereco nulo")
  void testeTres() {
    final var salvarCliente = salvarCliente();
    final var cliente = new Cliente();
    cliente.setNome("Joao");
    cliente.setTelefone("93291932921");
    Assertions.assertThrows(Exception.class, () -> salvarCliente.execucao(cliente));
  }
}

class MockSalvaCliente implements ClienteAdpter {
  @Override
  public Cliente salvarCliente(Cliente cliente) {
    return cliente;
  }
}