package com.example.testingweb;

import org.springframework.stereotype.Service;

/**
 * Servicio que proporciona un saludo simple.
 */
@Service
public class GreetingService {

    /**
     * Retorna un saludo simple.
     * @return El saludo
     */
    public String greet() {
        return "Hola, soy Gonzalo Tello";
    }
}
