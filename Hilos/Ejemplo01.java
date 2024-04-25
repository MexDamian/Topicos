package Hilos;

import java.awt.*;
import java.awt.event.*;

public class Ejemplo01 extends Frame {
    private Button boton;
    private Choice compo;
    
    public Ejemplo01(){
        setLayout (new FlowLayout());
        boton = new Button("Este va atardar.......");
        add(boton);
        boton.addActionListener(new EscuchaBoton());
        compo = new Choice();
        compo.addItem("item 1");
        compo.addItem("item 2");
        compo.addItem("item 3");
        add(compo);
        setSize(300,300);
        setVisible(true);
    }
    
    class EscuchaBoton implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            try {
                Thread.sleep(10000);
                System.out.print("Termino");
            } catch(Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    
    }
    
    public static void main(String args[]){
        new Ejemplo01();
    }
}
/*

Creador
Jesus Alejandro Mex Damian
17 / Abril / 2024

*/