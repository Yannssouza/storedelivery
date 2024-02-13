package com.squadtop.storedelivery.service;

import com.squadtop.storedelivery.exceptionserrors.ExecaoMensagem;
import com.squadtop.storedelivery.model.Cliente;
import com.squadtop.storedelivery.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

  private final ClienteRepository clienteRepository;

  public void cadastrarCliente(Cliente cliente) {
    if (cliente.getNome() == null) throw new ExecaoMensagem("Nome nao pode ser nulo");
    if (cliente.getEndereco().isEmpty()) throw new ExecaoMensagem("Deve informar um endereco");
    if (cliente.getEmail() == null || cliente.getEmail().isEmpty()) throw new ExecaoMensagem("Deve informar um email");
    clienteRepository.save(cliente);
  }
}
