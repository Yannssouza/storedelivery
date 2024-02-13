package com.squadtop.storedelivery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  @OneToMany(cascade = CascadeType.PERSIST)
  private List<Endereco> endereco;
  private String email;
  private Long telefone;
}
