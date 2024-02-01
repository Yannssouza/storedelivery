//package com.squadtop.storedelivery.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotNull;
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "tb_cliente")
//public class Cliente {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @NotNull(message = "O Atributo Nome é Obrigatório!")
//    private String nome;
//
//    @NotNull(message = "O Atributo Telefone é Obrigatório!")
//    private Long telefone;
//
//    public Cliente(Long id, String nome, Long telefone) {
//        this.id = id;
//        this.nome = nome;
//        this.telefone = telefone;
//    }
//
//    public Cliente() {
//
//    }
//}