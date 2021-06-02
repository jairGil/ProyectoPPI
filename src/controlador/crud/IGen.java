/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.crud;

import java.util.ArrayList;

/**
 *
 * @author Dell
 * @param <T>
 */
public interface IGen<T>{
    void crearT(T o,String n);
    ArrayList<T> leerT(String n);
    void actualizarT(ArrayList<T> o,String n);
    void eliminarT(ArrayList<T> ol, T oe);
}
