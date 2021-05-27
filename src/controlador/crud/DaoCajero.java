package controlador.crud;

import java.util.ArrayList;
import modelos.Cajero;

public class DaoCajero implements ICajero {
    
    private static ArrayList<Cajero> cajeros;

    public DaoCajero() {
        cajeros = Archivos.leerObjeto("Cajeros.dat");
    }

    @Override
    public void insertaCajero(Cajero c) {
        cajeros.add(c);
    }

    @Override
    public ArrayList<Cajero> obtenGCajero() {
        return cajeros;
    }

    @Override
    public void actualizarCajero(Cajero c) {
        for (int i = 0; i < cajeros.size(); i++) {
            if (c.equals(cajeros.indexOf(i))) {
                break;
            }
        }
    }

    @Override
    public void eliminarCajero(Cajero c) {
        for (int i = 0; i < cajeros.size(); i++) {
            if (c.equals(cajeros.indexOf(i))) {
                cajeros.remove(i);
                break;
            }
        }
    }
}
