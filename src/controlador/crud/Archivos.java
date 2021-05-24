package controlador.crud;

import java.io.*;
import java.util.ArrayList;

public class Archivos {

    public static void escribirObjeto(ArrayList datos, String arch){
        // Escritura en archivos
        try {
            // Se encarga de abrir el archivo
            FileOutputStream fo = new FileOutputStream(arch);

            // Escritura de un objeto en el archivo
            try ( 
                // Para poder enviar objetos a un archivo
                ObjectOutputStream oo = new ObjectOutputStream(fo)) {
                // Escritura de un objeto en el archivo
                oo.writeObject(datos);
                // Cerrar el archivo
                oo.close();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList leerObjeto(String arch){
        ArrayList datos = new ArrayList();
        ObjectInputStream oi;
        // Leer archivos
        try {
            FileInputStream fi = new FileInputStream(arch);
            oi = new ObjectInputStream(fi);
            datos = (ArrayList)oi.readObject();
            oi.close();
        } catch (IOException | ClassNotFoundException e) {
        }
        return datos;
    }
}
