/*
 * 
 * 
 * 
 */
package vistas;

/**
 *
 * @author Muñeca Brava
 */
public class VistaPedidos extends javax.swing.JFrame {

    public VistaPedidos() {
        this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        botonPrecios = new javax.swing.JButton();
        botonMesas = new javax.swing.JButton();
        botonReservas = new javax.swing.JButton();
        botonPedidos = new javax.swing.JButton();
        aboutUs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idPedido = new javax.swing.JTextField();
        buscarPedido = new javax.swing.JButton();
        tomarPedido = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonAgregarPedido = new javax.swing.JButton();
        etiquetaMesa = new javax.swing.JLabel();
        spinnerMesa = new javax.swing.JSpinner();
        botonAtender = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        eAgregarProducto = new javax.swing.JLabel();
        etiquetaCantidad = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        nombreCliente1 = new javax.swing.JTextField();
        botonAgregarPedido1 = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(null);

        botonPrecios.setBackground(new java.awt.Color(0, 0, 0));
        botonPrecios.setFont(new java.awt.Font("Luisa", 1, 36)); // NOI18N
        botonPrecios.setForeground(new java.awt.Color(238, 140, 60));
        botonPrecios.setText("PRECIOS");
        botonPrecios.setToolTipText("");
        botonPrecios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 3, true));
        botonPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPreciosActionPerformed(evt);
            }
        });
        background.add(botonPrecios);
        botonPrecios.setBounds(20, 480, 250, 90);

        botonMesas.setBackground(new java.awt.Color(0, 0, 0));
        botonMesas.setFont(new java.awt.Font("Luisa", 1, 36)); // NOI18N
        botonMesas.setForeground(new java.awt.Color(238, 140, 60));
        botonMesas.setText("MESAS");
        botonMesas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 3, true));
        botonMesas.setOpaque(false);
        botonMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMesasActionPerformed(evt);
            }
        });
        background.add(botonMesas);
        botonMesas.setBounds(20, 180, 250, 90);

        botonReservas.setBackground(new java.awt.Color(0, 0, 0));
        botonReservas.setFont(new java.awt.Font("Luisa", 1, 36)); // NOI18N
        botonReservas.setForeground(new java.awt.Color(238, 140, 60));
        botonReservas.setText("RESERVAS");
        botonReservas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 3, true));
        botonReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservasActionPerformed(evt);
            }
        });
        background.add(botonReservas);
        botonReservas.setBounds(20, 280, 250, 90);

        botonPedidos.setBackground(new java.awt.Color(0, 0, 0));
        botonPedidos.setFont(new java.awt.Font("Luisa", 1, 36)); // NOI18N
        botonPedidos.setForeground(new java.awt.Color(238, 140, 60));
        botonPedidos.setText("PEDIDOS");
        botonPedidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 3, true));
        botonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPedidosActionPerformed(evt);
            }
        });
        background.add(botonPedidos);
        botonPedidos.setBounds(20, 380, 250, 90);

        aboutUs.setBackground(new java.awt.Color(0, 0, 0));
        aboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Captura.JPG"))); // NOI18N
        aboutUs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        aboutUs.setBorderPainted(false);
        aboutUs.setContentAreaFilled(false);
        aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsActionPerformed(evt);
            }
        });
        background.add(aboutUs);
        aboutUs.setBounds(90, 580, 110, 100);

        jLabel1.setFont(new java.awt.Font("Luisa", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("PEDIDOS");
        background.add(jLabel1);
        jLabel1.setBounds(590, 190, 100, 40);
        background.add(idPedido);
        idPedido.setBounds(710, 200, 40, 20);

        buscarPedido.setForeground(new java.awt.Color(102, 0, 0));
        buscarPedido.setText("Buscar");
        buscarPedido.setActionCommand("");
        buscarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarPedido.setContentAreaFilled(false);
        background.add(buscarPedido);
        buscarPedido.setBounds(770, 200, 60, 19);

        tomarPedido.setText("TOMAR PEDIDO");
        background.add(tomarPedido);
        tomarPedido.setBounds(400, 260, 120, 14);

        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });
        background.add(nombreCliente);
        nombreCliente.setBounds(610, 260, 140, 20);

        jLabel2.setText("NOMBRE:");
        background.add(jLabel2);
        jLabel2.setBounds(530, 260, 70, 14);

        botonAgregarPedido.setBackground(new java.awt.Color(0, 102, 102));
        botonAgregarPedido.setForeground(new java.awt.Color(102, 0, 51));
        botonAgregarPedido.setText("AGREGAR");
        botonAgregarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 51), new java.awt.Color(255, 204, 204), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 51)));
        botonAgregarPedido.setContentAreaFilled(false);
        background.add(botonAgregarPedido);
        botonAgregarPedido.setBounds(770, 260, 100, 21);

        etiquetaMesa.setText("MESA");
        background.add(etiquetaMesa);
        etiquetaMesa.setBounds(440, 300, 50, 14);
        background.add(spinnerMesa);
        spinnerMesa.setBounds(530, 300, 50, 18);

        botonAtender.setBackground(new java.awt.Color(255, 204, 204));
        botonAtender.setForeground(new java.awt.Color(102, 0, 0));
        botonAtender.setText("ATENDER");
        botonAtender.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 51), new java.awt.Color(51, 255, 255), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 102)));
        botonAtender.setContentAreaFilled(false);
        background.add(botonAtender);
        botonAtender.setBounds(630, 300, 100, 20);
        background.add(jLabel3);
        jLabel3.setBounds(440, 340, 410, 20);

        eAgregarProducto.setText("AGREGAR PRODUCTO");
        background.add(eAgregarProducto);
        eAgregarProducto.setBounds(440, 380, 110, 20);

        etiquetaCantidad.setText("CANTIDAD");
        background.add(etiquetaCantidad);
        etiquetaCantidad.setBounds(440, 410, 90, 14);
        background.add(spinnerCantidad);
        spinnerCantidad.setBounds(540, 410, 26, 18);

        jLabel4.setText("NOMBRE:");
        background.add(jLabel4);
        jLabel4.setBounds(440, 440, 70, 14);

        nombreCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCliente1ActionPerformed(evt);
            }
        });
        background.add(nombreCliente1);
        nombreCliente1.setBounds(520, 440, 140, 20);

        botonAgregarPedido1.setBackground(new java.awt.Color(0, 102, 102));
        botonAgregarPedido1.setForeground(new java.awt.Color(102, 0, 51));
        botonAgregarPedido1.setText("AGREGAR");
        botonAgregarPedido1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 51), new java.awt.Color(255, 204, 204), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 51)));
        botonAgregarPedido1.setContentAreaFilled(false);
        background.add(botonAgregarPedido1);
        botonAgregarPedido1.setBounds(680, 440, 100, 21);

        imagen.setBackground(new java.awt.Color(204, 70, 0));
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Background.png"))); // NOI18N
        background.add(imagen);
        imagen.setBounds(0, 0, 1440, 896);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1436, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPreciosActionPerformed
        background.removeAll();
        VistaPrecios vistaPrecios=new VistaPrecios();
        vistaPrecios.setVisible(true);
    }//GEN-LAST:event_botonPreciosActionPerformed

    private void botonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMesasActionPerformed
        background.removeAll();
        VistaMesas vistaMesas=new VistaMesas();
        vistaMesas.setVisible(true);
    }//GEN-LAST:event_botonMesasActionPerformed

    private void botonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservasActionPerformed
        background.removeAll();
        VistaReservas vistaReservas=new VistaReservas();
        vistaReservas.setVisible(true);
    }//GEN-LAST:event_botonReservasActionPerformed

    private void botonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidosActionPerformed
       
    }//GEN-LAST:event_botonPedidosActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        background.removeAll();
        AboutUs aboutUs=new AboutUs();
        aboutUs.setVisible(true);
    }//GEN-LAST:event_aboutUsActionPerformed

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

    private void nombreCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCliente1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUs;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAgregarPedido;
    private javax.swing.JButton botonAgregarPedido1;
    private javax.swing.JButton botonAtender;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton buscarPedido;
    private javax.swing.JLabel eAgregarProducto;
    private javax.swing.JLabel etiquetaCantidad;
    private javax.swing.JLabel etiquetaMesa;
    private javax.swing.JTextField idPedido;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField nombreCliente1;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JSpinner spinnerMesa;
    private javax.swing.JLabel tomarPedido;
    // End of variables declaration//GEN-END:variables
}
