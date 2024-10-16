package com.example.ViacepAPI.Repository;

import com.example.ViacepAPI.Model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClientesRepository extends JpaRepository<Clientes, String>{}

