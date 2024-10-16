package com.example.ViacepAPI.Service;

import com.example.ViacepAPI.Model.ClienteDTO;
import com.example.ViacepAPI.Model.Clientes;
import com.example.ViacepAPI.Model.Endereco;
import com.example.ViacepAPI.Repository.ClientesRepository;
import com.example.ViacepAPI.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {

    @Autowired
    private ClientesRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private CepService cepService; // Injetando o serviço da ViaCep

    @Transactional
    public void salvarClienteComEndereco(ClienteDTO clienteDTO) {
        // Salvar Cliente
        Clientes cliente = new Clientes(clienteDTO);
        clienteRepository.save(cliente);

        // Buscar Endereço pelo CEP usando o CepService
        Endereco endereco = cepService.buscaEnderecoPorCep(clienteDTO.endereco_cep());

        // Associar o cliente ao endereço e salvar
        endereco.setClientes(cliente); // Associar o cliente ao endereço

        // Salvar Endereço no banco de dados
        enderecoRepository.save(endereco);
    }
}