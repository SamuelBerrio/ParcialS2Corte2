package com.example.parcialcorte2.service.impl;

import com.example.parcialcorte2.model.Cliente;
import com.example.parcialcorte2.service.ClienteService;

import java.util.ArrayList;

public class ClienteServiceImpl implements ClienteService {
    @Override
    public Cliente newCliente(String name, Integer edad) {
        return  new Cliente(name,edad);
    }

    @Override
    public Cliente searchCliente(String name, ArrayList<Cliente> clientes) {
        Cliente clienteBuscado = null;
        for (Cliente cliente:clientes){
            if (name.equals(cliente.getName())){
                clienteBuscado = cliente;
            }
        }
        return clienteBuscado;
    }

    @Override
    public Integer maxAge(ArrayList<Cliente> clientes) {
        Integer max = 0;
        for (Cliente cliente:clientes){
            if (max<cliente.getEdad()){
                max = cliente.getEdad();
            }
        }
        return max;
    }
}
