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
public class DaoSala implements ISala{
    ArrayList<Sala> salas = new ArrayList();
    public void crearSala(Sala s) {
        salas = Archivos.leerObjeto("Salas.dat");
        salas.add(s);
        Archivos.escribirObjeto(salas,"Salas.dat");
    }
    
    public ArrayList<Sala> leerSala() {
        salas = Archivos.leerObjeto("Salas.dat");
        return salas;
    }  
    
    public void actualizarSala(ArrayList<Sala> s) {
        Archivos.escribirObjeto(s,"Salas.dat");
    }
    
    public void eliminarSala(ArrayList<Sala> sl, Sala sa){
        int i;
        boolean b=false;
        for(i=0;i<sl.size();i++){
            if(sl.get(i).getNoSala()==sa.getNoSala()){
                sl.remove(i);
                b=true;
            }
        }
        if(!b){
            throw new RuntimeException("No se encontró la sala indicada");
        }
    }
}
