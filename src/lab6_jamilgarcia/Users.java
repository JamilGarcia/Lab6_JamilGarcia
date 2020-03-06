package lab6_jamilgarcia;

import java.util.Date;

public class Users {
    
    private String user;
    private String pass;
    private int edad;
    private String nombre;

    public Users() {
    }

    public Users(String user, String pass, int edad, String nombre) {
        this.user = user;
        this.pass = pass;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Users{" + "user=" + user + ", pass=" + pass + ", edad=" + edad + ", nombre=" + nombre + '}';
    }

    
    
    
    
    
}
