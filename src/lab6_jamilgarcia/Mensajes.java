package lab6_jamilgarcia;

import java.util.ArrayList;

public class Mensajes {
    
    private ArrayList mensaje; 

    public Mensajes() {
    }

    public Mensajes(ArrayList mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList getMensaje() {
        return mensaje;
    }

    public void setMensaje(ArrayList mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "" + mensaje + "";
    }

   
    
    
}
