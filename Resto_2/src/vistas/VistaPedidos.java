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
        ePedidos = new javax.swing.JLabel();
        idPedido = new javax.swing.JTextField();
        cobrarPedido = new javax.swing.JButton();
        eTomarPedido = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JTextField();
        eNombreCliente = new javax.swing.JLabel();
        botonAtenderMesa = new javax.swing.JButton();
        eMesa = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        propiedadesPedido = new javax.swing.JLabel();
        eAgregarProducto = new javax.swing.JLabel();
        eCantidad = new javax.swing.JLabel();
        eIdProducto = new javax.swing.JLabel();
        idProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botonAgregarProducto = new javax.swing.JButton();
        botonCrearPedido = new javax.swing.JButton();
        spinnerMesa = new javax.swing.JSpinner();
        ePagaCon = new javax.swing.JLabel();
        textoCambio = new javax.swing.JTextField();
        eCambio = new javax.swing.JLabel();
        textoPagaCon = new javax.swing.JTextField();
        cancelarPedido = new javax.swing.JButton();
        buscarPedido = new javax.swing.JButton();
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

        ePedidos.setFont(new java.awt.Font("Luisa", 1, 18)); // NOI18N
        ePedidos.setForeground(new java.awt.Color(153, 0, 51));
        ePedidos.setText("PEDIDOS");
        background.add(ePedidos);
        ePedidos.setBounds(590, 190, 100, 40);

        idPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(idPedido);
        idPedido.setBounds(760, 200, 70, 20);

        cobrarPedido.setBackground(new java.awt.Color(255, 237, 221));
        cobrarPedido.setForeground(new java.awt.Color(102, 0, 0));
        cobrarPedido.setText("COBRAR");
        cobrarPedido.setActionCommand("");
        cobrarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        cobrarPedido.setContentAreaFilled(false);
        background.add(cobrarPedido);
        cobrarPedido.setBounds(750, 570, 120, 30);

        eTomarPedido.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        eTomarPedido.setForeground(new java.awt.Color(153, 0, 51));
        eTomarPedido.setText("TOMAR PEDIDO");
        background.add(eTomarPedido);
        eTomarPedido.setBounds(390, 230, 210, 14);

        nombreCliente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        nombreCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });
        background.add(nombreCliente);
        nombreCliente.setBounds(500, 290, 240, 20);

        eNombreCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        eNombreCliente.setForeground(new java.awt.Color(179, 3, 62));
        eNombreCliente.setText("NOMBRE CLIENTE:");
        background.add(eNombreCliente);
        eNombreCliente.setBounds(380, 290, 120, 20);

        botonAtenderMesa.setBackground(new java.awt.Color(255, 237, 221));
        botonAtenderMesa.setForeground(new java.awt.Color(102, 0, 51));
        botonAtenderMesa.setText("ATENDER");
        botonAtenderMesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 51), new java.awt.Color(255, 204, 204), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 51)));
        botonAtenderMesa.setContentAreaFilled(false);
        botonAtenderMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtenderMesaActionPerformed(evt);
            }
        });
        background.add(botonAtenderMesa);
        botonAtenderMesa.setBounds(610, 260, 110, 20);

        eMesa.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        eMesa.setForeground(new java.awt.Color(179, 3, 62));
        eMesa.setText("MESA:");
        background.add(eMesa);
        eMesa.setBounds(440, 260, 60, 20);

        spinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerCantidad.setBorder(null);
        spinnerCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(spinnerCantidad);
        spinnerCantidad.setBounds(500, 370, 70, 30);

        propiedadesPedido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        background.add(propiedadesPedido);
        propiedadesPedido.setBounds(420, 320, 430, 20);

        eAgregarProducto.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        eAgregarProducto.setForeground(new java.awt.Color(153, 0, 51));
        eAgregarProducto.setText("AGREGAR PRODUCTO");
        background.add(eAgregarProducto);
        eAgregarProducto.setBounds(380, 340, 200, 30);

        eCantidad.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        eCantidad.setForeground(new java.awt.Color(179, 3, 62));
        eCantidad.setText("CANTIDAD:");
        background.add(eCantidad);
        eCantidad.setBounds(420, 380, 80, 20);

        eIdProducto.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        eIdProducto.setForeground(new java.awt.Color(179, 3, 62));
        eIdProducto.setText("ID:");
        background.add(eIdProducto);
        eIdProducto.setBounds(610, 380, 30, 20);

        idProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        idProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductoActionPerformed(evt);
            }
        });
        background.add(idProducto);
        idProducto.setBounds(640, 380, 70, 20);

        jLabel5.setForeground(new java.awt.Color(179, 3, 62));
        jLabel5.setText("ID:");
        background.add(jLabel5);
        jLabel5.setBounds(740, 200, 20, 20);

        botonAgregarProducto.setBackground(new java.awt.Color(255, 237, 221));
        botonAgregarProducto.setForeground(new java.awt.Color(102, 0, 51));
        botonAgregarProducto.setText("AGREGAR");
        botonAgregarProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 51), new java.awt.Color(255, 204, 204), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 51)));
        botonAgregarProducto.setContentAreaFilled(false);
        botonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProductoActionPerformed(evt);
            }
        });
        background.add(botonAgregarProducto);
        botonAgregarProducto.setBounds(750, 380, 110, 20);

        botonCrearPedido.setBackground(new java.awt.Color(255, 237, 221));
        botonCrearPedido.setForeground(new java.awt.Color(102, 0, 51));
        botonCrearPedido.setText("CREAR PEDIDO");
        botonCrearPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 51), new java.awt.Color(255, 204, 204), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 51)));
        botonCrearPedido.setContentAreaFilled(false);
        botonCrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPedidoActionPerformed(evt);
            }
        });
        background.add(botonCrearPedido);
        botonCrearPedido.setBounds(750, 290, 110, 20);

        spinnerMesa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerMesa.setBorder(null);
        spinnerMesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(spinnerMesa);
        spinnerMesa.setBounds(500, 250, 70, 30);

        ePagaCon.setForeground(new java.awt.Color(179, 3, 62));
        ePagaCon.setText("PAGA CON:");
        background.add(ePagaCon);
        ePagaCon.setBounds(710, 490, 70, 15);

        textoCambio.setForeground(new java.awt.Color(153, 0, 51));
        textoCambio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoCambio);
        textoCambio.setBounds(780, 520, 90, 30);

        eCambio.setForeground(new java.awt.Color(179, 3, 62));
        eCambio.setText("CAMBIO:");
        eCambio.setToolTipText("");
        background.add(eCambio);
        eCambio.setBounds(720, 520, 60, 30);

        textoPagaCon.setForeground(new java.awt.Color(153, 0, 51));
        textoPagaCon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoPagaCon);
        textoPagaCon.setBounds(780, 480, 90, 30);

        cancelarPedido.setBackground(new java.awt.Color(255, 255, 255));
        cancelarPedido.setForeground(new java.awt.Color(102, 0, 0));
        cancelarPedido.setText("CANCELAR PEDIDO");
        cancelarPedido.setActionCommand("");
        cancelarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelarPedido.setContentAreaFilled(false);
        cancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPedidoActionPerformed(evt);
            }
        });
        background.add(cancelarPedido);
        cancelarPedido.setBounds(730, 630, 170, 20);

        buscarPedido.setForeground(new java.awt.Color(102, 0, 0));
        buscarPedido.setText("Buscar");
        buscarPedido.setActionCommand("");
        buscarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarPedido.setContentAreaFilled(false);
        background.add(buscarPedido);
        buscarPedido.setBounds(840, 200, 60, 19);

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
        this.setVisible(false);
    }//GEN-LAST:event_botonPreciosActionPerformed

    private void botonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMesasActionPerformed
        background.removeAll();
        VistaMesas vistaMesas=new VistaMesas();
        vistaMesas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonMesasActionPerformed

    private void botonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservasActionPerformed
        background.removeAll();
        VistaReservas vistaReservas=new VistaReservas();
        vistaReservas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonReservasActionPerformed

    private void botonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidosActionPerformed
       
    }//GEN-LAST:event_botonPedidosActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        background.removeAll();
        AboutUs aboutUs=new AboutUs();
        aboutUs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aboutUsActionPerformed

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

    private void idProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProductoActionPerformed

    private void botonAtenderMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtenderMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAtenderMesaActionPerformed

    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarProductoActionPerformed

    private void botonCrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearPedidoActionPerformed

    private void cancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarPedidoActionPerformed

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
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton botonAtenderMesa;
    private javax.swing.JButton botonCrearPedido;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton buscarPedido;
    private javax.swing.JButton cancelarPedido;
    private javax.swing.JButton cobrarPedido;
    private javax.swing.JLabel eAgregarProducto;
    private javax.swing.JLabel eCambio;
    private javax.swing.JLabel eCantidad;
    private javax.swing.JLabel eIdProducto;
    private javax.swing.JLabel eMesa;
    private javax.swing.JLabel eNombreCliente;
    private javax.swing.JLabel ePagaCon;
    private javax.swing.JLabel ePedidos;
    private javax.swing.JLabel eTomarPedido;
    private javax.swing.JTextField idPedido;
    private javax.swing.JTextField idProducto;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JLabel propiedadesPedido;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JSpinner spinnerMesa;
    private javax.swing.JTextField textoCambio;
    private javax.swing.JTextField textoPagaCon;
    // End of variables declaration//GEN-END:variables
}
