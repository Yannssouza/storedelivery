package com.squadtop.storedelivery.controllers;

import com.squadtop.storedelivery.model.Pedido;
import com.squadtop.storedelivery.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/lista_pedidos")
    public ResponseEntity<List<Pedido>> getListaPedidos() {
        return ResponseEntity.ok(pedidoRepository.findAll());
    }

    @PostMapping("/cadastrar_pedido")
    public ResponseEntity<Pedido> cadastrarPedido(@RequestBody Pedido pedido) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(pedidoRepository.save(pedido));
    }
}
