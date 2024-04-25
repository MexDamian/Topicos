package CRUD.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Vista extends JFrame{
    public JTextField nombre, edad, correo;
    public JButton btnAgregar, btnModificar, btnBorrar;
    private JTable tabla;
    public DefaultTableModel modeloTabla;
    
    public Vista(){
        setTitle("Gestion de usuario");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel panelentradas = new JPanel(new GridLayout(3,2));
        nombre = new JTextField();
        edad = new JTextField();
        correo = new JTextField();
        panelentradas.add(new JLabel ("Nombre: "));
        panelentradas.add(nombre);
        panelentradas.add(new JLabel ( "Edad: "));
        panelentradas.add(edad);
        panelentradas.add(new JLabel ("Correo: "));
        panelentradas.add(correo);
        
        JPanel panelbotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnModificar = new JButton ("Modificar");
        btnBorrar = new JButton ("Borrar");
        
        panelbotones.add(btnAgregar);
        panelbotones.add(btnModificar);
        panelbotones.add(btnBorrar);
        
        modeloTabla = new DefaultTableModel();
        modeloTabla.setColumnIdentifiers(new String[]{"Nombre" , "Edad", "Correo"});
        tabla = new JTable(modeloTabla);
        
        add(panelentradas, BorderLayout.NORTH);
        add(new JScrollPane(tabla),BorderLayout.CENTER);
        add (panelbotones, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
}
