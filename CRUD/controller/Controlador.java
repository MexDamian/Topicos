package CRUD.controller;

import CRUD.Model.Usuario;
import CRUD.view.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.*;



public class Controlador {
    private Usuario usuario;
    private Vista vista;
    
    public Controlador (Usuario usuario , Vista vista){
        this.usuario = usuario;
        this.vista = vista;
        
        // Añadimos escucas a los botones
        this.vista.btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                agregraUsuario();
            }
        
        });
        
        this.vista.btnModificar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Modifico el registro");
            }
        
        });
        
        this.vista.btnBorrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Borrarmos usuario");
            }
            
        });
        
        
    }
    
    private void agregraUsuario(){
        String nombre = vista.nombre.getText();
        int edad = Integer.parseInt(vista.edad.getText());
        String correo = vista.correo.getText();
        
        usuario = new Usuario(nombre, edad, correo);
        
        vista.modeloTabla.addRow(new Object[]{
            usuario.getNombre(), usuario.getEdad(), usuario.getCorreo()
        
        });
        
        vista.nombre.setText("");
        vista.edad.setText("");
        vista.correo.setText("");
    }
}
