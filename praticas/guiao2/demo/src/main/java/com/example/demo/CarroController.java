package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarroController {

    private static final String template = "CarName, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/carro")
    public ResponseEntity getCar(@RequestParam String marca) {
        return new ResponseEntity <> (new Carro(marca), HttpStatus.OK);
    }
}