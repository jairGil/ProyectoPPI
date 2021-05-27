package controlador.crud;

import java.util.ArrayList;
import modelos.Cajero;

public interface ICajero {
    void insertaCajero(Cajero c);
    ArrayList<Cajero> obtenGCajero();
    void actualizarCajero(Cajero c);
    void eliminarCajero(Cajero c);
}
