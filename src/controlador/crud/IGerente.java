package controlador.crud;

import java.util.ArrayList;
import modelos.Gerente;

public interface IGerente {
    void insertaGerente(Gerente g);
    ArrayList<Gerente> obtenGerentes();
    void actualizarGerente(Gerente g);
    void eliminarGerente(Gerente g);
}
