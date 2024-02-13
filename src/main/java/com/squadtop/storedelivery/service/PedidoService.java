package com.squadtop.storedelivery.service;

import com.squadtop.storedelivery.model.Pedido;
import com.squadtop.storedelivery.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public void cadastrarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }
}