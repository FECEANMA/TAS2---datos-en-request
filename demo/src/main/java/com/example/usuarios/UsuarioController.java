package com.example.usuarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @PostMapping("/{id}")
    public String crearUsuario(@PathVariable("id") String id,
                                @RequestParam(value = "origen", defaultValue = "desconocido") String origen,
                                @RequestBody Usuario usuario) {
        // Procesar el usuario y devolver un mensaje
        return String.format("Usuario con ID: %s, Nombre: %s, Edad: %d, Origen: %s creado exitosamente.",
                id, usuario.getNombre(), usuario.getEdad(), origen);
    }
}
