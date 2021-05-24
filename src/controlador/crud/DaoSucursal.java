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
public class DaoSucursal implements ISucursal{
    ArrayList<Sucursal> sucursales = new ArrayList();
    public void crearSucursal(Sucursal s) {
        sucursales = Archivos.leerObjeto("Scrsl.dat");
        sucursales.add(s);
        Archivos.escribirObjeto(sucursales,"Scrsl.dat");
    }
    
    public ArrayList<Sucursal> leerSucursal() {
        sucursales = Archivos.leerObjeto("Scrsl.dat");
        return sucursales;
    }  
    
    public void actualizarSucursal(ArrayList<Sucursal> s) {
        Archivos.escribirObjeto(s,"Scrsl.dat");
    }
    
    public void eliminarSucursal(ArrayList<Sucursal> sl, Sucursal se){
        int i;
        boolean b=false;
        for(i=0;i<sl.size();i++){
            if(sl.get(i).getNoSucursal()==se.getNoSucursal()){
                sl.remove(i);
                b=true;
            }
        }
        if(!b){
            throw new RuntimeException("No se encontró la sucursal indicada");
        }
    }
    
}
