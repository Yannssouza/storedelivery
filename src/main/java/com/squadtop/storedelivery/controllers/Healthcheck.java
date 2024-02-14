package com.squadtop.storedelivery.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/api")
public class Healthcheck {
  @GetMapping("/healthcheck")
  public ResponseEntity<String> healthcheck() {
    return ResponseEntity.ok("Ok");
  }
}
