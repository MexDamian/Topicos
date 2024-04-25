package MVC.src.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LoginView extends JFrame{
    private JTextField name;
    private JPasswordField password;
    private JComboBox <String> eleccion;
    private JButton login;
    
    public LoginView(){
        setTitle("Iniciar sesion");
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        String [] paises = {
            "Seccionar pais",
            "Mexico",
            "España",
            "Colombia",
            "Inglatera",
            "Colombia",
            "Portugal"
        };
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));
        
        panel.add(new JLabel("Usuario: "));
        name= new JTextField();
        panel.add(name);
        
        panel.add(new JLabel ("Contraseña: "));
        password = new JPasswordField();
        panel.add(password);
        
        panel.add (new JLabel ( "Pais: "));
        eleccion= new JComboBox<> (paises);
        panel.add(eleccion);
        
        login = new JButton ("Inicio de Sesion");
        panel.add(login);
        
        setContentPane(panel);
    }
    
    public String getUser(){
        return this.name.getText();
    }
    
    public String getPassword(){
        return new String (this.password.getPassword());
    }
    
    public void addLoginListener(ActionListener listenForLoginButton){
        this.login.addActionListener(listenForLoginButton);
    }
    
    public void displayMessage(String message){
        JOptionPane.showMessageDialog(this, message);
        
    }
}

/*
Creador 
Jesus Alejandro Mex Damian
15 / abril / 2024

Actualizaciones
*/