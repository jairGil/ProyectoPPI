/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.crud;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Sala;

/**
 *
 * @author temaz
 */
public class DaoSala implements IDao<Sala>{
    ArrayList<Sala> salas = new ArrayList();
    
    @Override
    public void crear(Sala s) {
        salas = Archivos.leerObjeto("Salas.dat");
        salas.add(s);
        Archivos.escribirObjeto(salas,"Salas.dat");
    }
    
    @Override
    public ArrayList<Sala> leer() {
        salas = Archivos.leerObjeto("Salas.dat");
        return salas;
    }  
    
    @Override
    public void actualizar(ArrayList<Sala> s) {
        Archivos.escribirObjeto(s,"Salas.dat");
    }
    
    @Override
    public void eliminar(ArrayList<Sala> sl, Sala sa){
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
    
    @Override
    public void mostrar(JTable tSal, String[] columnas, int n){
        DefaultTableModel model;
        model = new DefaultTableModel(null, columnas);
        String[] filas = new String[n];
        salas = Archivos.leerObjeto("Salas.dat");
        for(Sala s : salas){
            filas[0] = s.getNoSala()+"";
            filas[1] = s.getNoAsientos()+"";
            filas[2] = s.getCostoBoleto()+"";
            model.addRow(filas);
        }
        
        tSal.setModel(model);
    }
}
