/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.crud;

import java.util.ArrayList;
import modelos.Sucursal;

/**
 *
 * @author Dell
 */
public interface ISucursal {
    void crearSucursal(Sucursal s);
    ArrayList<Sucursal> leerSucursal();
    void actualizarSucursal(ArrayList<Sucursal> s);
    void eliminarSucursal(ArrayList<Sucursal> sl, Sucursal se);
}
