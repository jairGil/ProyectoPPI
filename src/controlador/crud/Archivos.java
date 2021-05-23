package controlador.crud;

import java.io.*;
import java.util.ArrayList;

public class Archivos {

    public static void escribirObjeto(ArrayList pers, String arch){
        // Escritura en archivos
        try {
            // Se encarga de abrir el archivo
            FileOutputStream fo = new FileOutputStream(arch);

            // Para poder enviar objetos a un archivo
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            // Escritura de un objeto en el archivo
            oo.writeObject(pers);

            // Cerrar el archivo
            oo.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList leerObjeto(String arch){
        ArrayList pers = new ArrayList();
        // Leer archivos
        try {
            FileInputStream fi = new FileInputStream(arch);
            ObjectInputStream oi = new ObjectInputStream(fi);
            pers = (ArrayList)oi.readObject();
            oi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pers;
    }
}
