package mx.uady.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prueba {

    @GetMapping("/prueba")
    public String prueba() {
        return "Hola";
    }
}