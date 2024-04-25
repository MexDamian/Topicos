package MVC.src.controller;

import MVC.src.model.Usuario;
import MVC.src.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private Usuario usuario;
    private LoginView loginview;
    
    public LoginController(Usuario usuario, LoginView loginview){
        this.loginview = loginview;
        this.usuario = usuario;
        
        this.loginview.addLoginListener(new LoginListener());
        
    }
    
    class LoginListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String us = loginview.getUser();
            String pass = loginview.getPassword();
            
            if(usuario.verificar(us, pass)){
                loginview.displayMessage("Inicio de sesion exitoso");
            } else {
                loginview.displayMessage("Datos incorectos");
            }
        }       
    }
    
    public void showLoginView(){
        loginview.setVisible(true);
    }
    
    
}

/*
Creador 
Jesus Alejandro Mex Damian
15 / abril / 2024

Actualizaciones
*/
