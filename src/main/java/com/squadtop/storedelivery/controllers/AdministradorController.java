package com.squadtop.storedelivery.controllers;

import com.squadtop.storedelivery.service.AdministradorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AdministradorController {
    private final AdministradorService administradorService;


}
