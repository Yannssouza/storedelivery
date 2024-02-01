//package com.squadtop.storedelivery.controller;
//
//import com.squadtop.storedelivery.model.Cliente;
//import com.squadtop.storedelivery.repository.ClienteRepository;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//class ClienteControllerTest {
//
//    @Autowired
//    private TestRestTemplate testRestTemplate;
//
//    @Autowired
//    private ClienteRepository clienteRepository;
//
//    @BeforeAll
//    void start() {
//
//        clienteRepository.deleteAll();
//
//    }
//
//    @Test
//    @DisplayName("Cadastrar um Cliente")
//    void deveCadastrarUmCliente() {
//        HttpEntity<Cliente> corpoRequisicao = new HttpEntity<>(new Cliente(0L, "Paulo Antunes", 13465278L));
//
//        ResponseEntity<String> corpoResposta = testRestTemplate
//                .exchange("/api/cadastrar/cliente", HttpMethod.POST, corpoRequisicao, String.class);
//
//        assertEquals(HttpStatus.CREATED, corpoResposta.getStatusCode());
//    }
//}