package com.example.ViacepAPI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Endereco")
@Entity(name = "Endereco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    @ManyToOne
    private Clientes clientes;

    public Endereco(ClienteDTO clienteDTO){
        this.cep = clienteDTO.endereco_cep();

    }


}
