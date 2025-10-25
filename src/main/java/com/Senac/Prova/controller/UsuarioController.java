package com.Senac.Prova.controller;

import com.Senac.Prova.service.UsuarioService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    //todo criar usuario
}
