package MVC.src.view;

import MVC.src.controller.LoginController;
import javax.swing.*;

public class MainWindow extends JFrame{
    private LoginController logincontroller;
    
    public MainWindow(LoginController logincontroller){
        this.logincontroller = logincontroller;
        
        setTitle("Ventana principal");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");
        JMenuItem menuitem = new JMenuItem("Iniciar Sesion");
        
        menuitem.addActionListener(e -> logincontroller.showLoginView());
        
        menu.add(menuitem);
        menubar.add(menu);
        setJMenuBar(menubar);
    }
    
    
}

/*
Creador 
Jesus Alejandro Mex Damian
16 / abril / 2024

Actualizaciones
*/