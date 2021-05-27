package controlador.crud;

import java.util.ArrayList;
import modelos.Gerente;

public class DaoGerente implements IGerente {
    private static ArrayList<Gerente> gerentes;

    public DaoGerente() {
        gerentes = Archivos.leerObjeto("gerentes.dat");
    }

    @Override
    public void insertaGerente(Gerente g) {
        gerentes.add(g);
    }

    @Override
    public ArrayList<Gerente> obtenGerentes() {
        return gerentes;
    }

    @Override
    public void actualizarGerente(Gerente g) {
        for (int i = 0; i < gerentes.size(); i++) {
            if (g.equals(gerentes.indexOf(i))) {
                break;
            }
        }
    }

    @Override
    public void eliminarGerente(Gerente g) {
        for (int i = 0; i < gerentes.size(); i++) {
            if (g.equals(gerentes.indexOf(i))) {
                gerentes.remove(i);
                break;
            }
        }
    }
    
}
