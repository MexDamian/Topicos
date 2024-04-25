package Hilos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.SwingWorker;


public class Ejemplo02 extends JFrame {
    private JButton boton;
    private JComboBox <String> item;
    
    public Ejemplo02 (){
        super ("Hola Jesus");
        setLayout (new FlowLayout());
        add(boton = new JButton ("Preciona tardare un poco"));
        boton.addActionListener(new Escucha());
        item = new JComboBox (new String []{"item 1", "item 2"});
        add(item);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    class Escucha implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>(){
                @Override
                protected Void doInBackground() throws Exception {
                    Thread.sleep(5000);
                    return null;
                }
                
                @Override
                protected void done(){
                    System.out.println("Termino");
                }
                
            };
            worker.execute();
        }
        
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(Ejemplo02::new);
    }
}
/*

Creador
Jesus Alejandro Mex Damian
17 / Abril / 2024

*/
