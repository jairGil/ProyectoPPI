/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.CtrlSala;
import javax.swing.JTextField;
import static vista.Estilos.*;


/**
 *
 * @author Dell
 */
public class PnSala extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    
    private CtrlSala ctrlsala;
    String[] cols = {"No. Sala","No. Asientos","Costo Boleto","No. Filas","No. Columnas"};
    public PnSala() {
        initComponents();
    }
    
    public PnSala(CtrlSala ctrl) {
        this.ctrlsala = ctrl;
        initComponents();
        ctrl.mostrarSalasCB(cbxNoSalaM);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNoAsientosM = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCostoBoletoM = new javax.swing.JTextField();
        cbxNoSalaM = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        txtNoFilasM = new javax.swing.JTextField();
        txtNoColsM = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtNoSalaB = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSalaC = new javax.swing.JTable();
        txtNoSalaC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtNoSala = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNoAsientos = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCostoBoleto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtNoFilas = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtNoCol = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(Estilos.FUENTE_TITULOS);
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SALAS - MODIFICACIONES");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setText("Ingrese el número de SALA para hacer la modificación de la misma");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(Estilos.FUENTE_LBL);
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Número de sala");

        jLabel10.setFont(Estilos.FUENTE_LBL);
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Número de asientos");

        txtNoAsientosM.setBackground(new java.awt.Color(255, 255, 255));
        txtNoAsientosM.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtNoAsientosM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoAsientosMActionPerformed(evt);
            }
        });

        jLabel17.setFont(Estilos.FUENTE_LBL);
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Costo por boleto");

        txtCostoBoletoM.setBackground(new java.awt.Color(255, 255, 255));
        txtCostoBoletoM.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtCostoBoletoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoBoletoMActionPerformed(evt);
            }
        });

        cbxNoSalaM.setBackground(new java.awt.Color(255, 255, 255));
        cbxNoSalaM.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        cbxNoSalaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNoSalaMActionPerformed(evt);
            }
        });

        btnModificar.setFont(Estilos.FUENTE_LBL);
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtNoFilasM.setBackground(new java.awt.Color(255, 255, 255));
        txtNoFilasM.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N

        txtNoColsM.setBackground(new java.awt.Color(255, 255, 255));
        txtNoColsM.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N

        jLabel27.setFont(Estilos.FUENTE_LBL);
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Número de filas");

        jLabel28.setFont(Estilos.FUENTE_LBL);
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Número de columnas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(btnModificar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoFilasM, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtNoColsM, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(txtNoAsientosM, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoBoletoM, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNoSalaM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(0, 269, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addGap(7, 7, 7)
                .addComponent(cbxNoSalaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoAsientosM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoColsM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoFilasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCostoBoletoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificaciones", jPanel3);

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(51, 51, 51));
        jTextField12.setText("Ingrese el número de SALA para hacer la baja de la misma");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel26.setFont(Estilos.FUENTE_LBL);
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Número de sala");

        btnEliminar.setFont(Estilos.FUENTE_LBL);
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel24.setFont(Estilos.FUENTE_TITULOS);
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("SALAS - BAJAS");

        txtNoSalaB.setBackground(new java.awt.Color(255, 255, 255));
        txtNoSalaB.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel24))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(txtNoSalaB, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNoSalaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnEliminar)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BAJAS", jPanel4);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(51, 51, 51));
        jTextField9.setText("Ingrese el número de sucursal o su ubicación para realizar la búsqueda");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel15.setFont(Estilos.FUENTE_LBL);
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Resultados:");

        tbSalaC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tbSalaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbSalaC);

        txtNoSalaC.setBackground(new java.awt.Color(255, 255, 255));
        txtNoSalaC.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N

        jLabel14.setFont(Estilos.FUENTE_LBL);
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Número de sala");

        jLabel25.setFont(Estilos.FUENTE_TITULOS);
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("SALAS - CONSULTAS");

        btnConsultar.setFont(Estilos.FUENTE_LBL);
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel15))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoSalaC, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(btnConsultar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel25)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addGap(4, 4, 4)
                .addComponent(txtNoSalaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnConsultar)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultas", jPanel2);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pnicono.png"))); // NOI18N

        jLabel18.setFont(Estilos.FUENTE_TITULOS);
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SALAS - ALTAS");

        jLabel19.setFont(Estilos.FUENTE_LBL);
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Número de sala");

        txtNoSala.setBackground(new java.awt.Color(255, 255, 255));
        txtNoSala.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N

        jLabel20.setFont(Estilos.FUENTE_LBL);
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Número de asientos");

        txtNoAsientos.setBackground(new java.awt.Color(255, 255, 255));
        txtNoAsientos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtNoAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoAsientosActionPerformed(evt);
            }
        });

        jLabel21.setFont(Estilos.FUENTE_LBL);
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Costo por boleto");

        txtCostoBoleto.setBackground(new java.awt.Color(255, 255, 255));
        txtCostoBoleto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtCostoBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoBoletoActionPerformed(evt);
            }
        });

        jLabel22.setFont(Estilos.FUENTE_LBL);
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Número de filas");

        txtNoFilas.setBackground(new java.awt.Color(255, 255, 255));
        txtNoFilas.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtNoFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoFilasActionPerformed(evt);
            }
        });

        jLabel23.setFont(Estilos.FUENTE_LBL);
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Número de columnas");

        txtNoCol.setBackground(new java.awt.Color(255, 255, 255));
        txtNoCol.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtNoCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoColActionPerformed(evt);
            }
        });

        btnGuardar.setFont(Estilos.FUENTE_LBL);
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel11)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txtNoFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(txtNoAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCostoBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txtNoCol, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoSala, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnGuardar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel9)))
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(309, 309, 309))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel18)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel19)
                        .addGap(4, 4, 4)
                        .addComponent(txtNoSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCostoBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)))
                .addGap(268, 268, 268)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ALTAS", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoAsientosMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoAsientosMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoAsientosMActionPerformed

    private void txtCostoBoletoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoBoletoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoBoletoMActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void txtNoAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoAsientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoAsientosActionPerformed

    private void txtCostoBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoBoletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoBoletoActionPerformed

    private void txtNoFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoFilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoFilasActionPerformed

    private void txtNoColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoColActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.ctrlsala.agregarSala(evt);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.ctrlsala.eliminarSala(evt);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        this.ctrlsala.consultarSala(evt, tbSalaC, cols);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.ctrlsala.modificarSala(evt);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cbxNoSalaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNoSalaMActionPerformed
        this.ctrlsala.obtenerDatos(evt);
    }//GEN-LAST:event_cbxNoSalaMActionPerformed

    public String getCostoBoleto() {
        return txtCostoBoleto.getText();
    }

    public String getNoAsientos() {
        return txtNoAsientos.getText();
    }

    public String getNoCol() {
        return txtNoCol.getText();
    }

    public String getNoFilas() {
        return txtNoFilas.getText();
    }

    public String getNoSala() {
        return txtNoSala.getText();
    }

    public String getNoSalaB() {
        return txtNoSalaB.getText();
    }
    
    public String getNoSalaC() {
        return txtNoSalaC.getText();
    }
    
    public void setCtrl(CtrlSala ctrl) {
        this.ctrlsala = ctrl;
    }

    public void setCostoBoletoM(String txtCostoBoletoM) {
        this.txtCostoBoletoM.setText(txtCostoBoletoM);
    }

    public void setNoColsM(String txtNoColsM) {
        this.txtNoColsM.setText(txtNoColsM);
    }

    public void setNoFilasM(String txtNoFilasM) {
        this.txtNoFilasM.setText(txtNoFilasM);
    }

    public void setNoAsientosM(String txtNoAsientosM) {
        this.txtNoAsientosM.setText(txtNoAsientosM);
    }
    
    public String getCostoBoletoM() {
        return this.txtCostoBoletoM.getText();
    }

    public String getNoAsientosM() {
        return this.txtNoAsientosM.getText();
    }
    
    public String getNoFilasM() {
        return this.txtNoFilasM.getText();
    }
    
    public String getNoColsM() {
        return this.txtNoColsM.getText();
    }
    
    
    public String getCbxNoSalaM(){
        return cbxNoSalaM.getSelectedItem()+"";
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxNoSalaM;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tbSalaC;
    private javax.swing.JTextField txtCostoBoleto;
    private javax.swing.JTextField txtCostoBoletoM;
    private javax.swing.JTextField txtNoAsientos;
    private javax.swing.JTextField txtNoAsientosM;
    private javax.swing.JTextField txtNoCol;
    private javax.swing.JTextField txtNoColsM;
    private javax.swing.JTextField txtNoFilas;
    private javax.swing.JTextField txtNoFilasM;
    private javax.swing.JTextField txtNoSala;
    private javax.swing.JTextField txtNoSalaB;
    private javax.swing.JTextField txtNoSalaC;
    // End of variables declaration//GEN-END:variables


}

