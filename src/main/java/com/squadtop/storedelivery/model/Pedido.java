package com.squadtop.storedelivery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Pedido {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @OneToOne
  private Cliente cliente;
  @OneToMany
  private List<Produto> produtos;
  @OneToOne
  private Entregador entregador;
  @OneToOne
  private Endereco endereco;
  private boolean entrega;
  private BigDecimal desconto;
  private BigDecimal taxaEntrega;
  private BigDecimal valor;
  private String formaPagamento;
  private BigDecimal troco;
  private LocalDateTime data;
  private String status;
}
