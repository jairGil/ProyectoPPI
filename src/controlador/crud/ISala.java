/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.crud;

import java.util.ArrayList;
import modelos.Sala;

/**
 *
 * @author temaz
 */
public interface ISala {
    void crearSala(Sala s);
    ArrayList<Sala> leerSala();
    void actualizarSala(ArrayList<Sala> s);
    void eliminarSala(ArrayList<Sala> salaList, Sala sala);
}
