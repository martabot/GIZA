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
public class VistaPrecios extends javax.swing.JFrame {

    public VistaPrecios() {
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
        jLabel2 = new javax.swing.JLabel();
        etiquetaId = new javax.swing.JLabel();
        textoId = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        crearReserva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrecios = new javax.swing.JTable();
        etiquetaNpedido = new javax.swing.JLabel();
        textNpedido = new javax.swing.JTextField();
        etiquetaAgregar = new javax.swing.JLabel();
        crearReserva1 = new javax.swing.JButton();
        crearReserva2 = new javax.swing.JButton();
        crearReserva3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textoUsuario = new javax.swing.JTextField();
        cambiarNombre = new javax.swing.JButton();
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

        jLabel2.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("LISTA DE PRECIOS");
        background.add(jLabel2);
        jLabel2.setBounds(540, 190, 220, 40);

        etiquetaId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId.setText("ID:");
        background.add(etiquetaId);
        etiquetaId.setBounds(460, 250, 70, 17);

        textoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoId);
        textoId.setBounds(530, 250, 60, 18);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaNombre.setText("NOMBRE:");
        background.add(etiquetaNombre);
        etiquetaNombre.setBounds(460, 280, 70, 20);

        textNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        background.add(textNombre);
        textNombre.setBounds(530, 280, 300, 18);

        crearReserva.setBackground(new java.awt.Color(255, 237, 221));
        crearReserva.setForeground(new java.awt.Color(102, 0, 0));
        crearReserva.setText("LIMPIAR");
        crearReserva.setActionCommand("");
        crearReserva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        crearReserva.setContentAreaFilled(false);
        crearReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearReservaActionPerformed(evt);
            }
        });
        background.add(crearReserva);
        crearReserva.setBounds(520, 340, 120, 30);

        tablaPrecios.setForeground(new java.awt.Color(153, 0, 0));
        tablaPrecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaPrecios);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(390, 380, 510, 290);

        etiquetaNpedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaNpedido.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaNpedido.setText("MONTO:");
        background.add(etiquetaNpedido);
        etiquetaNpedido.setBounds(630, 250, 70, 17);

        textNpedido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textNpedido);
        textNpedido.setBounds(700, 250, 130, 18);
        background.add(etiquetaAgregar);
        etiquetaAgregar.setBounds(380, 390, 520, 30);

        crearReserva1.setBackground(new java.awt.Color(255, 237, 221));
        crearReserva1.setForeground(new java.awt.Color(102, 0, 0));
        crearReserva1.setText("BUSCAR");
        crearReserva1.setActionCommand("");
        crearReserva1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        crearReserva1.setContentAreaFilled(false);
        crearReserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearReserva1ActionPerformed(evt);
            }
        });
        background.add(crearReserva1);
        crearReserva1.setBounds(390, 340, 120, 30);

        crearReserva2.setBackground(new java.awt.Color(255, 237, 221));
        crearReserva2.setForeground(new java.awt.Color(102, 0, 0));
        crearReserva2.setText("CREAR");
        crearReserva2.setActionCommand("");
        crearReserva2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        crearReserva2.setContentAreaFilled(false);
        crearReserva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearReserva2ActionPerformed(evt);
            }
        });
        background.add(crearReserva2);
        crearReserva2.setBounds(650, 340, 120, 30);

        crearReserva3.setBackground(new java.awt.Color(255, 237, 221));
        crearReserva3.setForeground(new java.awt.Color(102, 0, 0));
        crearReserva3.setText("BORRAR");
        crearReserva3.setActionCommand("");
        crearReserva3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        crearReserva3.setContentAreaFilled(false);
        crearReserva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearReserva3ActionPerformed(evt);
            }
        });
        background.add(crearReserva3);
        crearReserva3.setBounds(780, 340, 120, 30);
        background.add(jLabel1);
        jLabel1.setBounds(470, 260, 370, 20);

        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Logout-512.png"))); // NOI18N
        cerrarSesion.setContentAreaFilled(false);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        background.add(cerrarSesion);
        cerrarSesion.setBounds(240, 40, 30, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/salir.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1);
        jButton1.setBounds(280, 40, 30, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/ajustes.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        background.add(jButton2);
        jButton2.setBounds(320, 40, 30, 40);

        textoUsuario.setForeground(new java.awt.Color(153, 0, 51));
        textoUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoUsuario);
        textoUsuario.setBounds(380, 40, 220, 30);

        cambiarNombre.setBackground(new java.awt.Color(255, 237, 221));
        cambiarNombre.setForeground(new java.awt.Color(102, 0, 0));
        cambiarNombre.setText("Cambiar Nombre");
        cambiarNombre.setActionCommand("");
        cambiarNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        cambiarNombre.setBorderPainted(false);
        background.add(cambiarNombre);
        cambiarNombre.setBounds(610, 40, 120, 30);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Background.png"))); // NOI18N
        imagen.setAlignmentY(0.0F);
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
        background.removeAll();
        VistaPedidos vistaPedidos=new VistaPedidos();
        vistaPedidos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPedidosActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        background.removeAll();
        AboutUs aboutUs=new AboutUs();
        aboutUs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aboutUsActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void crearReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearReservaActionPerformed

    private void crearReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearReserva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearReserva1ActionPerformed

    private void crearReserva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearReserva2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearReserva2ActionPerformed

    private void crearReserva3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearReserva3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearReserva3ActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        background.removeAll();
        background.repaint();
        Inicio inicio=new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        textoUsuario.setVisible(true);
        cambiarNombre.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaPrecios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUs;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton cambiarNombre;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton crearReserva;
    private javax.swing.JButton crearReserva1;
    private javax.swing.JButton crearReserva2;
    private javax.swing.JButton crearReserva3;
    private javax.swing.JLabel etiquetaAgregar;
    private javax.swing.JLabel etiquetaId;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNpedido;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPrecios;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNpedido;
    private javax.swing.JTextField textoId;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
