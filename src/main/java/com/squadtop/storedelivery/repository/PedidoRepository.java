package com.squadtop.storedelivery.repository;

import com.squadtop.storedelivery.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
