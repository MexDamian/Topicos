package MVC.src;

import MVC.src.controller.LoginController;
import MVC.src.model.Usuario;
import MVC.src.view.LoginView;
import MVC.src.view.MainWindow;

public class Main {
    public static void main(String args[]){
        Usuario usuario = new Usuario("Jesus" , "1234");
        LoginView loginview = new LoginView();
        LoginController logincontroller = new LoginController(usuario, loginview);
        
        MainWindow mainwindow = new MainWindow(logincontroller);
        mainwindow.setVisible(true);
    }
}
