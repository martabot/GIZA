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
public class Background extends javax.swing.JFrame {

    public Background() {
        this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        
        textoUsuario.setVisible(false);
        cambiarNombre.setVisible(false);
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
        textoBienvenida = new javax.swing.JLabel();
        tB2 = new javax.swing.JLabel();
        tB3 = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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

        textoBienvenida.setFont(new java.awt.Font("Luisa", 0, 36)); // NOI18N
        textoBienvenida.setForeground(new java.awt.Color(153, 0, 51));
        textoBienvenida.setText("BIENVENIDO");
        textoBienvenida.setBorder(null);
        background.add(textoBienvenida);
        textoBienvenida.setBounds(540, 310, 220, 70);

        tB2.setFont(new java.awt.Font("Luisa", 0, 36)); // NOI18N
        tB2.setForeground(new java.awt.Color(153, 0, 51));
        tB2.setText("AL SISTEMA DE ATENCIÓN");
        background.add(tB2);
        tB2.setBounds(430, 400, 440, 40);

        tB3.setFont(new java.awt.Font("Luisa", 0, 36)); // NOI18N
        tB3.setForeground(new java.awt.Color(153, 0, 51));
        tB3.setText("DE GIZA RESTO");
        background.add(tB3);
        tB3.setBounds(510, 470, 250, 60);

        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Logout-512.png"))); // NOI18N
        cerrarSesion.setContentAreaFilled(false);
        background.add(cerrarSesion);
        cerrarSesion.setBounds(240, 40, 30, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/ajustes.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        background.add(jButton2);
        jButton2.setBounds(320, 40, 30, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/salir.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        background.add(jButton1);
        jButton1.setBounds(280, 40, 30, 40);

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
        background.repaint();
        VistaPrecios vistaPrecios=new VistaPrecios();
        vistaPrecios.setVisible(true);
    }//GEN-LAST:event_botonPreciosActionPerformed

    private void botonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMesasActionPerformed
        background.removeAll();
        background.repaint();
        VistaMesas vistaMesas=new VistaMesas();
        vistaMesas.setVisible(true);
    }//GEN-LAST:event_botonMesasActionPerformed

    private void botonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservasActionPerformed
        background.removeAll();
        background.repaint();
        VistaReservas vistaReservas=new VistaReservas();
        vistaReservas.setVisible(true);
    }//GEN-LAST:event_botonReservasActionPerformed

    private void botonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidosActionPerformed
        background.removeAll();
        background.repaint();
        VistaPedidos vistaPedidos=new VistaPedidos();
        vistaPedidos.setVisible(true);
    }//GEN-LAST:event_botonPedidosActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        background.removeAll();
        background.repaint();
        AboutUs aboutUs=new AboutUs();
        aboutUs.setVisible(true);
    }//GEN-LAST:event_aboutUsActionPerformed

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
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Background().setVisible(true);
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
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel tB2;
    private javax.swing.JLabel tB3;
    private javax.swing.JLabel textoBienvenida;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
