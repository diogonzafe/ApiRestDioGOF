package com.example.ViacepAPI.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Clientes")
@Entity(name = "Clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private String cpf;

    private String email;


    public Clientes(ClienteDTO clienteDTO){

        this.cpf = clienteDTO.cpf();
        this.nome = clienteDTO.nome();
        this.email = clienteDTO.email();
    }

}
