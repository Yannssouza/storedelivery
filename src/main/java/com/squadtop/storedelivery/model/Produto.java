package com.squadtop.storedelivery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private Double preco;
  @OneToOne(cascade = CascadeType.PERSIST)
  private Categoria categoria;
}
