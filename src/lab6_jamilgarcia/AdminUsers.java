package lab6_jamilgarcia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminUsers {

    private ArrayList<Users> listaUsers;
    private File archivo = null;

    public AdminUsers(String path) {
        archivo = new File(path);
    }

    public ArrayList<Users> getListaUsers() {
        return listaUsers;
    }

    public void setListaUsers(ArrayList<Users> listaUsers) {
        this.listaUsers = listaUsers;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminUsers{" + "listaUsers=" + listaUsers + '}';
    }

    //Mutador Extra 
    public void setUsers(Users u) {
        this.listaUsers.add(u);
    }

    //Metodos de administracion
    public void EscribirUser() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Users u : listaUsers) {
                bw.write(u.getNombre() + ";");
                bw.write(u.getPass() + ";");
                bw.write(u.getUser() + ";");
                bw.write(u.getEdad() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void CargarArchivo() {
        Scanner sc = null;
        listaUsers = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaUsers.add(new Users(sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.next()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
