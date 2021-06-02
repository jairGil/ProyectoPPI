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
public class DaoGen<T> implements IGen<T> {
    ArrayList<T> lista = new ArrayList();
    
    @Override
    public void crearT(T o,String n) {
        lista = Archivos.leerObjeto(n);
        lista.add(o);
        Archivos.escribirObjeto(lista,n);
    }
    
    @Override
    public ArrayList<T> leerT(String n) {
        lista = Archivos.leerObjeto(n);
        return lista;
    }  
    
    @Override
    public void actualizarT(ArrayList<T> o, String n) {
        Archivos.escribirObjeto(o,n);
    }
    
    @Override
    public void eliminarT(ArrayList<T> ol, T oe){
       
    }
}
