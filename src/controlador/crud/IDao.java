/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.crud;

import java.util.ArrayList;
import javax.swing.JTable;
import modelos.Sala;

/**
 *
 * @author temaz
 */
public interface IDao<T> {
    void crear(T t);
    ArrayList<T> leer();
    void actualizar(ArrayList<T> tl);
    void eliminar(ArrayList<T> tl, T t);
    void mostrar(JTable tabla, String[] columnas, int n);
}
