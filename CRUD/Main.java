package CRUD;

import CRUD.Model.Usuario;
import CRUD.controller.Controlador;
import CRUD.view.Vista;


public class Main {
    public static void main(String Mex[]){
        Usuario modelo = new Usuario("",0,"");
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo,vista);
    }
}
