package com.example.ViacepAPI.Controller;

import com.example.ViacepAPI.Model.ClienteDTO;
import com.example.ViacepAPI.Model.Clientes;
import com.example.ViacepAPI.Repository.ClientesRepository;
import com.example.ViacepAPI.Repository.EnderecoRepository;
import com.example.ViacepAPI.Service.CepService;
import com.example.ViacepAPI.Service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ApiController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<String> criarClienteComEndereco(@RequestBody ClienteDTO clienteDTO) {
        clienteService.salvarClienteComEndereco(clienteDTO);
        return ResponseEntity.ok("Cliente e Endereço cadastrados com sucesso!");
    }

}
