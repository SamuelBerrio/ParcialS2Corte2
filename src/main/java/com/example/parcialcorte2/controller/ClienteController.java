package com.example.parcialcorte2.controller;

import com.example.parcialcorte2.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ClienteController {

    ModelFactoryController mfc = new ModelFactoryController();

    ArrayList<Cliente> clientes = new ArrayList<>();
    @FXML
    private TextField edadCliente;

    @FXML
    private TextArea listaText;

    @FXML
    private TextField nameCliente;

    @FXML
    void guardarCliente(ActionEvent event) {
        try {
            clientes.add(mfc.newCliente(nameCliente.getText(),Integer.parseInt(edadCliente.getText())));
            System.out.println("Cliente Creado");
            nameCliente.setText("");
            edadCliente.setText("");
        }catch (NumberFormatException e){
            System.out.println("Porfavor ingrese un numero");
            nameCliente.setText("");
            edadCliente.setText("");
        }

    }

    @FXML
    void verListaCliente(ActionEvent event) {
        StringBuilder text = new StringBuilder();
        for (Cliente cliente:clientes){
            text.append("Nombre: ").append(cliente.getName()).append(" - Edad: ").append(cliente.getEdad());
            text.append("\n" +
                    "");
        }
        listaText.setText(String.valueOf(text));
    }

    void buscarCliente(String nameBusqueda){
        System.out.println(mfc.searchCliente(nameBusqueda,clientes).getName()+" Encontrado");
    }

    void mayorEdad(){
        System.out.println(mfc.maxAge(clientes)+" es la edad maxima");
    }
}
