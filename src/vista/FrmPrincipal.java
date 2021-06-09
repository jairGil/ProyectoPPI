package vista;

import controlador.CtrlInicio;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.UIManager;
import static vista.Estilos.*;

public class FrmPrincipal extends javax.swing.JFrame {
    
    private final CtrlInicio control;
    private final FrmLogin ventana;

    public FrmPrincipal(CtrlInicio control, FrmLogin ventana) {
        this.control = control;
        this.ventana = ventana;
        initEstilos();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPnl = new javax.swing.JSplitPane();
        PnlIzquierdo = new javax.swing.JPanel();
        btnSucursal = new javax.swing.JToggleButton();
        btnSala = new javax.swing.JToggleButton();
        btnGerente = new javax.swing.JToggleButton();
        PnlDerecho = new javax.swing.JPanel();
        PnlEncabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        splitPnl.setBorder(null);
        splitPnl.setDividerLocation(180);
        splitPnl.setDividerSize(1);
        splitPnl.setContinuousLayout(true);

        PnlIzquierdo.setBackground(GRIS_BG);

        btnSucursal.setText("Sucursal");
        btnSucursal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSucursal.setFocusPainted(false);
        btnSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursalActionPerformed(evt);
            }
        });

        btnSala.setText("Sala");
        btnSala.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSala.setFocusPainted(false);
        btnSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaActionPerformed(evt);
            }
        });

        btnGerente.setText("Gerente");
        btnGerente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnGerente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerente.setFocusPainted(false);
        btnGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlIzquierdoLayout = new javax.swing.GroupLayout(PnlIzquierdo);
        PnlIzquierdo.setLayout(PnlIzquierdoLayout);
        PnlIzquierdoLayout.setHorizontalGroup(
            PnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSala, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(btnGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PnlIzquierdoLayout.setVerticalGroup(
            PnlIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlIzquierdoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSala, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        splitPnl.setLeftComponent(PnlIzquierdo);

        PnlDerecho.setBackground(ROJO_OBS);
        PnlDerecho.setLayout(new java.awt.GridLayout());
        splitPnl.setRightComponent(PnlDerecho);

        PnlEncabezado.setBackground(GRIS_BG);
        PnlEncabezado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(FUENTE_TITULOS);
        jLabel1.setForeground(FG_COLOR);
        jLabel1.setText("Gestión de Cine");

        javax.swing.GroupLayout PnlEncabezadoLayout = new javax.swing.GroupLayout(PnlEncabezado);
        PnlEncabezado.setLayout(PnlEncabezadoLayout);
        PnlEncabezadoLayout.setHorizontalGroup(
            PnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlEncabezadoLayout.setVerticalGroup(
            PnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPnl)
            .addComponent(PnlEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PnlEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(splitPnl))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        control.intercambiaVista(ventana);
    }//GEN-LAST:event_formWindowClosing

    private void btnSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursalActionPerformed
        control.botonSeleccionado(this, btnSucursal);
    }//GEN-LAST:event_btnSucursalActionPerformed

    private void btnSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaActionPerformed
        control.botonSeleccionado(this, btnSala);
    }//GEN-LAST:event_btnSalaActionPerformed

    private void btnGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenteActionPerformed
        control.botonSeleccionado(this, btnGerente);
    }//GEN-LAST:event_btnGerenteActionPerformed
    
    private void initEstilos() {
        UIManager.put("ToggleButton.font", FUENTE_LBL);
        UIManager.put("ToggleButton.foreground", FG_COLOR);
        UIManager.put("ToggleButton.background", GRIS_BG);
        UIManager.put("ToggleButton.select", GRIS_SEL);
        UIManager.put("ToggleButton.focuspainted", false);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("iconos/logo.jpg"));
        return retValue;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PnlDerecho;
    private javax.swing.JPanel PnlEncabezado;
    private javax.swing.JPanel PnlIzquierdo;
    public javax.swing.JToggleButton btnGerente;
    public javax.swing.JToggleButton btnSala;
    public javax.swing.JToggleButton btnSucursal;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JSplitPane splitPnl;
    // End of variables declaration//GEN-END:variables
}
