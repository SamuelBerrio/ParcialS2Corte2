package com.example.parcialcorte2.service.impl;

import com.example.parcialcorte2.service.ClienteService;

public class Drogueria {

    private final ClienteService clienteService;

    public Drogueria(){
        clienteService = (ClienteService) new ClienteServiceImpl();
    }
    public ClienteService getClienteService() {return clienteService;}
}
