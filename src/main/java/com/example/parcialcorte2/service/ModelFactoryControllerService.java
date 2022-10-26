package com.example.parcialcorte2.service;

import com.example.parcialcorte2.model.Cliente;

import java.util.ArrayList;

public interface ModelFactoryControllerService {
    Cliente newCliente(String name, Integer edad);
    Cliente searchCliente(String name, ArrayList<Cliente>clientes);

    Integer maxAge(ArrayList<Cliente>clientes);
}
