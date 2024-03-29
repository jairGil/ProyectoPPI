/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import excepciones.ExSucursal;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Sucursal implements Serializable{
    private int noSucursal;
    private String ubicacion;
    private ArrayList<Sala> salas = new ArrayList();
    private ArrayList<Empleado> empleados = new ArrayList();
    
    public Sucursal(int noSucursal, String ubicacion, ArrayList<Sala> salas, ArrayList<Empleado> empleados) throws ExSucursal{
        setNoSucursal(noSucursal);
        setUbicacion(ubicacion);
        this.salas=salas;
        this.empleados=empleados;
    }
    
    public void agregarSala(Sala sala){
        salas.add(sala);
    }
    
    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }

    public void setNoSucursal(int noSucursal) throws ExSucursal {
        if(noSucursal<0)
            throw new ExSucursal("Número de sucursal inválido");
        this.noSucursal = noSucursal;
        
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public int getNoSucursal() {
        return noSucursal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    
    
}
