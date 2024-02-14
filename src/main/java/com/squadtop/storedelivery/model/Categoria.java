package com.squadtop.storedelivery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Categoria {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
  private List<Produto> produtos;
}
