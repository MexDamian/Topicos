package MVC.src.model;

public class Usuario {
    private String user; 
    private String password;
    
    public Usuario(String user, String password){
        this.user = user;
        this.password = password;
    }
    
    public String getUser (){
        return this.user;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void serPassword(String password){
        this.password = password;
    }
    
    public boolean verificar (String user, String password){
        return this.user.equals(user) && this.password.equals(password);
    }
}

/*
Credo
Jesus Alejandro Mex Damian
12 / abril / 2024

Actualizado
*/