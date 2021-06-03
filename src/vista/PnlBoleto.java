package vista;

import static vista.Estilos.*;

/**
 *
 * @author ivanchiz
 */
public class PnlBoleto extends javax.swing.JPanel {

    /**
     * Creates new form PnlBoleto
     */
    public PnlBoleto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Bsucursal = new javax.swing.JTextField();
        Bfecha = new javax.swing.JTextField();
        Bsala = new javax.swing.JTextField();
        Basiento = new javax.swing.JTextField();
        Bpelicula = new javax.swing.JTextField();

        jPanel1.setBackground(GRIS_BG);
        jPanel1.setPreferredSize(new java.awt.Dimension(622, 228));

        jLabel1.setFont(FUENTE_TITULOS);
        jLabel1.setText("*CINEMA TICKET * CINEMA TICKET * CINEMA TICKET * CINEMA TICKET * CINEMA TICKET * ");

        jLabel2.setFont(FUENTE_TITULOS);
        jLabel2.setText("*CINEMA TICKET * CINEMA TICKET * CINEMA TICKET * CINEMA TICKET * CINEMA TICKET * ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono_cine.jpg"))); // NOI18N

        jLabel4.setFont(FUENTE_LBL);
        jLabel4.setForeground(FG_COLOR);
        jLabel4.setText("Película:");

        jLabel5.setFont(FUENTE_LBL);
        jLabel5.setForeground(FG_COLOR);
        jLabel5.setText("Asiento:");

        jLabel6.setFont(FUENTE_LBL);
        jLabel6.setForeground(FG_COLOR);
        jLabel6.setText("Sala:");

        jLabel7.setFont(FUENTE_LBL);
        jLabel7.setForeground(FG_COLOR);
        jLabel7.setText("Fecha:");

        jLabel8.setFont(FUENTE_LBL);
        jLabel8.setForeground(FG_COLOR);
        jLabel8.setText("Sucursal:");

        Bsucursal.setFont( FUENTE_TXT);
        Bsucursal.setBorder(BORDE_GRIS);
        Bsucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsucursalActionPerformed(evt);
            }
        });

        Bfecha.setFont( FUENTE_TXT);
        Bfecha.setBorder(BORDE_GRIS);
        Bfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfechaActionPerformed(evt);
            }
        });

        Bsala.setFont( FUENTE_TXT);
        Bsala.setBorder(BORDE_GRIS);
        Bsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalaActionPerformed(evt);
            }
        });

        Basiento.setFont( FUENTE_TXT);
        Basiento.setBorder(BORDE_GRIS);
        Basiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasientoActionPerformed(evt);
            }
        });

        Bpelicula.setFont( FUENTE_TXT);
        Bpelicula.setBorder(BORDE_GRIS);
        Bpelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpeliculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bpelicula)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Basiento, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jLabel6))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jLabel7)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(Bfecha)))
                                                .addGap(13, 13, 13)))
                                        .addComponent(Bsala, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bsucursal)))
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Bpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(Bsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Basiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Bsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BpeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BpeliculaActionPerformed

    private void BasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BasientoActionPerformed

    private void BsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BsalaActionPerformed

    private void BfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BfechaActionPerformed

    private void BsucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BsucursalActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Basiento;
    private javax.swing.JTextField Bfecha;
    private javax.swing.JTextField Bpelicula;
    private javax.swing.JTextField Bsala;
    private javax.swing.JTextField Bsucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
