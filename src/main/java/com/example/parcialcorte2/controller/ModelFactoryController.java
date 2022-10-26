package com.example.parcialcorte2.controller;

import com.example.parcialcorte2.model.Cliente;
import com.example.parcialcorte2.service.ModelFactoryControllerService;
import com.example.parcialcorte2.service.impl.Drogueria;

import java.util.ArrayList;

public class ModelFactoryController implements ModelFactoryControllerService {
    Drogueria drogueria;

    @Override
    public Cliente newCliente(String name, Integer edad) {
        return drogueria.getClienteService().newCliente(name,edad);
    }

    @Override
    public Cliente searchCliente(String name, ArrayList<Cliente>clientes) {
        return drogueria.getClienteService().searchCliente(name,clientes);
    }

    @Override
    public Integer maxAge(ArrayList<Cliente> clientes) {
        return drogueria.getClienteService().maxAge(clientes);
    }

    //------------------------------ Singleton ------------------------------------------------
// Clase estatica oculta. Tan solo se instanciara el singleton una vez
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }
    public ModelFactoryController() {
        drogueria = new Drogueria();
    }
}
