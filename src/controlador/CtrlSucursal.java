/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.crud.DaoGen;
import excepciones.ExEmpleado;
import excepciones.ExPersona;
import excepciones.ExSala;
import excepciones.ExSucursal;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Cajero;
import modelos.Empleado;
import modelos.Gerente;
import modelos.Sala;
import modelos.Sucursal;
import vista.PnSucursal;

/**
 *
 * @author Dell
 */
public class CtrlSucursal {
    private PnSucursal scrsl;
    private DaoGen<Sucursal> dscrsl;
    private DefaultTableModel ts,tc,tg; //Tablas de salas, cajeros y gerentes, respectivamente
    private int i,sa,nums,ns,nc,ng; //Número de salas, cajeros y gerentes, respectivamente
    private boolean sc=false,ec=false; //Banderas para activar el botón de registro de la sucursal
    private JButton btnreg; //Botón de registro de la sucursal
    
    public void setVista(PnSucursal scrsl){
        this.scrsl=scrsl;
        btnreg=this.scrsl.getBoton((short)2);
    }
    
    //Pestaña de modificaciones
    public void buscarSucursales(ActionEvent ae){
        ts=this.scrsl.getSalas((short)1);
        tc=this.scrsl.getCajeros((short)1);
        tg=this.scrsl.getGerentes((short)1);
        ArrayList<Sucursal> tsuc = new ArrayList();
        tsuc= dscrsl.leerT("Sucs.dat"); //Lectura de las sucursales registradas
        //Comprobación de los campos al presionar el botón
        if(this.scrsl.getNoSucursal((short)1).isEmpty() && !(this.scrsl.getUbicacion((short)1).isEmpty())){
            for(i=0;i<tsuc.size();i++){
                if(tsuc.get(i).getUbicacion()==this.scrsl.getUbicacion((short)1)){
                    sa=i;
                }
            }
        }
        else if(this.scrsl.getUbicacion((short)1).isEmpty() && !(this.scrsl.getNoSucursal((short)1).isEmpty())){
            for(i=0;i<tsuc.size();i++){
                if(tsuc.get(i).getNoSucursal()==Integer.parseInt(this.scrsl.getNoSucursal((short)1))){
                    sa=i;
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(scrsl,"Ingrese los datos de la sucursal que desea modificar");
        }
        for (int i = 0; i < tsuc.get(sa).getSalas().size(); i++) { //Salas de la sucursal consultada
            if (ts.getRowCount() == 0) {
                Object e[];
                e = new Object[5];
                e[0] = tsuc.get(sa).getSalas().get(i).getNoSala();
                e[1] = tsuc.get(sa).getSalas().get(i).getNoAsientos();
                e[2] = tsuc.get(sa).getSalas().get(i).getNoFilas();
                e[3] = tsuc.get(sa).getSalas().get(i).getNoColumnas();
                e[4] = tsuc.get(sa).getSalas().get(i).getCostoBoleto();
                ts.addRow(e);
            }
        }
        for (int i = 0; i < tsuc.get(sa).getEmpleados().size(); i++) { //Empleados de la sucursal consultada
            if (tc.getRowCount() == 0 && tg.getRowCount()==0) {
                Object e[];
                e = new Object[5];
                e[0] = tsuc.get(sa).getEmpleados().get(i).getNombre();
                e[1] = tsuc.get(sa).getEmpleados().get(i).getApellidoPaterno();
                e[2] = tsuc.get(sa).getEmpleados().get(i).getApellidoMaterno();
                e[3] = tsuc.get(sa).getEmpleados().get(i).getNoTelefono();
                e[4] = tsuc.get(sa).getEmpleados().get(i).getSalario();
                if(tsuc.get(sa).getEmpleados().get(i) instanceof Cajero){
                    tc.addRow(e);
                }else{
                    tg.addRow(e);
                }
                
            }
        }
    }   
    
    //Pestaña de registro
    
    public void agregarSalas(ActionEvent ae){ //Comenzar el llenado de los datos de las salas
        ts=this.scrsl.getSalas((short)3);
        if(!(this.scrsl.getNumSalas().isEmpty())){
            ns = Integer.parseInt(this.scrsl.getNumSalas());
            ts.setRowCount(ns);
            sc=true;
            if(ec){
                btnreg.setEnabled(true);
            }
        }else{
            ts.setRowCount(0);
            JOptionPane.showMessageDialog(scrsl,"Ingrese el número de salas a registrar");
        }
    }
    
    public void agregarEmpleados(ActionEvent ae){ //Comenzar el llenado de los datos de los empleados
        tc=this.scrsl.getCajeros((short)3);
        tg=this.scrsl.getGerentes((short)3);
        if(!(this.scrsl.getNumCajeros().isEmpty()) && !(this.scrsl.getNumGerentes().isEmpty())){
            nc = Integer.parseInt(this.scrsl.getNumCajeros());
            ng = Integer.parseInt(this.scrsl.getNumGerentes());
            tc.setRowCount(nc);
            tg.setRowCount(ng);
            ec=true;
            if(sc){
                btnreg.setEnabled(true);
            }
        }else{
            tc.setRowCount(0);
            tg.setRowCount(0);
            JOptionPane.showMessageDialog(scrsl,"Ingrese completamente el número de empleados a registrar");
        }
    }
    
    public void agregarSucursal(ActionEvent ae){
        
        Sucursal suc;
        if(this.scrsl.getNoSucursal((short)3).isEmpty() || this.scrsl.getUbicacion((short)3).isEmpty() || tablaIncompleta(ts,ns) || tablaIncompleta(tc,nc) || tablaIncompleta(tg,ng)){
            JOptionPane.showMessageDialog(scrsl, "Llene los campos vacios.");
        }else{
            try{
                ArrayList<Sala> s = new ArrayList();
                ArrayList<Empleado> e = new ArrayList();
                Sala sal;
                Cajero caj;
                Gerente ger;
                int numsal,numasi,numfil,numcol;
                float cosbol,salario;
                String numtel,nom,ap,am;
                nums = Integer.parseInt(this.scrsl.getNoSucursal((short)3));
                String u = (this.scrsl.getUbicacion((short)3));
                for(i=0;i<ns;i++){//Recuperación de datos de las salas
                    numsal=(int)ts.getValueAt(i,0);
                    numasi=(int)ts.getValueAt(i,1);
                    numfil=(int)ts.getValueAt(i,2);
                    numcol=(int)ts.getValueAt(i,3);
                    cosbol=(float)ts.getValueAt(i,4);
                    sal = new Sala(numsal,numasi,numfil,numcol,cosbol);
                    s.add(sal);
                }
                for(i=0;i<nc;i++){//Recuperación de datos de los cajeros
                    nom=(String)tc.getValueAt(i,0);
                    ap=(String)tc.getValueAt(i,1);
                    am=(String)tc.getValueAt(i,2);
                    numtel=(String)tc.getValueAt(i,3);
                    salario=(float)tc.getValueAt(i,4);
                    caj = new Cajero(numtel,salario,nom,ap,am);
                    e.add(caj);
                }
                for(i=0;i<ng;i++){//Recuperación de datos de los gerentes
                    nom=(String)tg.getValueAt(i,0);
                    ap=(String)tg.getValueAt(i,1);
                    am=(String)tg.getValueAt(i,2);
                    numtel=(String)tg.getValueAt(i,3);
                    salario=(float)tg.getValueAt(i,4);
                    ger = new Gerente(numtel,salario,nom,ap,am);
                    e.add(ger);
                }
                suc = new Sucursal(nums,u,s,e);
                dscrsl.crearT(suc,"Sucs.dat");
            }catch(ExSucursal | ExSala | ExPersona |ExEmpleado ex){
                JOptionPane.showMessageDialog(scrsl, "Error al agregar la sucursal.");
            }
        }
    }
    
    static boolean tablaIncompleta(DefaultTableModel t, int n){ //Revisa si a la tabla le falta algún registro
        int i;
        for(i=0;i<n;i++){
            if(t.getValueAt(i, 0)==null)
                return false;
        }
        return true;
    }
    
}
