package com.example.miapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class MiApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiApiApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "¡Bienvenido a la API!";
    }

    @GetMapping("/api/saludo")
    public Saludo saludo() {
        return new Saludo("¡Hola, mundo!");
    }

    @PostMapping("/api/echo")
    public Object echo(@RequestBody Object data) {
        return data;
    }

    @GetMapping("/api/suma/{a}/{b}")
    public Resultado suma(@PathVariable int a, @PathVariable int b) {
        return new Resultado(a + b);
    }

    @GetMapping("/api/multiplica")
    public Resultado multiplica(@RequestParam int a, @RequestParam int b) {
        return new Resultado(a * b);
    }

    static class Saludo {
        private String mensaje;

        public Saludo(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getMensaje() {
            return mensaje;
        }
    }

    static class Resultado {
        private int resultado;

        public Resultado(int resultado) {
            this.resultado = resultado;
        }

        public int getResultado() {
            return resultado;
        }
    }
}
