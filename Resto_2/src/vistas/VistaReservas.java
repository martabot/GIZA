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
public class VistaReservas extends javax.swing.JFrame {

    public VistaReservas() {
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
        jLabel2 = new javax.swing.JLabel();
        textoIdReserva = new javax.swing.JTextField();
        buscarReserva = new javax.swing.JButton();
        eNombre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        eDNI = new javax.swing.JLabel();
        textoDNI = new javax.swing.JTextField();
        eFecha = new javax.swing.JLabel();
        textoFecha = new javax.swing.JTextField();
        textoHora = new javax.swing.JTextField();
        eMesa = new javax.swing.JLabel();
        eHora = new javax.swing.JLabel();
        cobrarPedido = new javax.swing.JButton();
        buscarReservaPor = new javax.swing.JButton();
        crearReserva = new javax.swing.JButton();
        eliminarReserva = new javax.swing.JButton();
        eFormato2 = new javax.swing.JLabel();
        eFormato3 = new javax.swing.JLabel();
        eFormato1 = new javax.swing.JLabel();
        estadoMesaReserva = new javax.swing.JLabel();
        spinnerMesas = new javax.swing.JSpinner();
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

        jLabel1.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("RESERVAS");
        background.add(jLabel1);
        jLabel1.setBounds(570, 210, 190, 40);

        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("ID:");
        background.add(jLabel2);
        jLabel2.setBounds(440, 290, 44, 20);

        textoIdReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoIdReserva);
        textoIdReserva.setBounds(470, 290, 60, 20);

        buscarReserva.setForeground(new java.awt.Color(102, 0, 0));
        buscarReserva.setText("Buscar");
        buscarReserva.setActionCommand("");
        buscarReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarReserva.setContentAreaFilled(false);
        background.add(buscarReserva);
        buscarReserva.setBounds(560, 290, 60, 19);

        eNombre.setForeground(new java.awt.Color(153, 0, 51));
        eNombre.setText("NOMBRE:");
        background.add(eNombre);
        eNombre.setBounds(440, 360, 80, 20);

        textoNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoNombre);
        textoNombre.setBounds(530, 360, 290, 20);

        eDNI.setForeground(new java.awt.Color(153, 0, 51));
        eDNI.setText("DNI:");
        background.add(eDNI);
        eDNI.setBounds(440, 390, 80, 20);

        textoDNI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoDNI);
        textoDNI.setBounds(530, 390, 130, 20);

        eFecha.setForeground(new java.awt.Color(153, 0, 51));
        eFecha.setText("FECHA:");
        background.add(eFecha);
        eFecha.setBounds(440, 420, 80, 20);

        textoFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoFecha);
        textoFecha.setBounds(530, 420, 130, 20);

        textoHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoHora);
        textoHora.setBounds(530, 450, 130, 20);

        eMesa.setForeground(new java.awt.Color(153, 0, 51));
        eMesa.setText("MESA:");
        background.add(eMesa);
        eMesa.setBounds(440, 480, 80, 30);

        eHora.setForeground(new java.awt.Color(153, 0, 51));
        eHora.setText("HORA:");
        background.add(eHora);
        eHora.setBounds(440, 450, 80, 20);

        cobrarPedido.setBackground(new java.awt.Color(255, 237, 221));
        cobrarPedido.setForeground(new java.awt.Color(102, 0, 0));
        cobrarPedido.setText("LIMPIAR");
        cobrarPedido.setActionCommand("");
        cobrarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        cobrarPedido.setContentAreaFilled(false);
        background.add(cobrarPedido);
        cobrarPedido.setBounds(500, 600, 120, 30);

        buscarReservaPor.setBackground(new java.awt.Color(255, 237, 221));
        buscarReservaPor.setForeground(new java.awt.Color(102, 0, 0));
        buscarReservaPor.setText("BUSCAR");
        buscarReservaPor.setActionCommand("");
        buscarReservaPor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        buscarReservaPor.setContentAreaFilled(false);
        background.add(buscarReservaPor);
        buscarReservaPor.setBounds(660, 550, 120, 30);

        crearReserva.setBackground(new java.awt.Color(255, 237, 221));
        crearReserva.setForeground(new java.awt.Color(102, 0, 0));
        crearReserva.setText("CREAR");
        crearReserva.setActionCommand("");
        crearReserva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        crearReserva.setContentAreaFilled(false);
        background.add(crearReserva);
        crearReserva.setBounds(500, 550, 120, 30);

        eliminarReserva.setBackground(new java.awt.Color(255, 237, 221));
        eliminarReserva.setForeground(new java.awt.Color(102, 0, 0));
        eliminarReserva.setText("ELIMINAR");
        eliminarReserva.setActionCommand("");
        eliminarReserva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        eliminarReserva.setContentAreaFilled(false);
        background.add(eliminarReserva);
        eliminarReserva.setBounds(660, 600, 120, 30);

        eFormato2.setForeground(new java.awt.Color(153, 0, 51));
        eFormato2.setText("* Formato dd-mm-aaaa");
        background.add(eFormato2);
        eFormato2.setBounds(660, 420, 160, 20);

        eFormato3.setForeground(new java.awt.Color(153, 0, 51));
        eFormato3.setText("* Formato hh:mm");
        background.add(eFormato3);
        eFormato3.setBounds(660, 450, 160, 20);

        eFormato1.setForeground(new java.awt.Color(153, 0, 51));
        eFormato1.setText("* DNI sin puntos");
        background.add(eFormato1);
        eFormato1.setBounds(660, 390, 160, 20);

        estadoMesaReserva.setForeground(new java.awt.Color(153, 0, 51));
        background.add(estadoMesaReserva);
        estadoMesaReserva.setBounds(640, 480, 170, 30);

        spinnerMesas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerMesas.setBorder(null);
        spinnerMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(spinnerMesas);
        spinnerMesas.setBounds(530, 480, 90, 30);

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
            java.util.logging.Logger.getLogger(VistaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaReservas().setVisible(true);
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
    private javax.swing.JButton buscarReserva;
    private javax.swing.JButton buscarReservaPor;
    private javax.swing.JButton cobrarPedido;
    private javax.swing.JButton crearReserva;
    private javax.swing.JLabel eDNI;
    private javax.swing.JLabel eFecha;
    private javax.swing.JLabel eFormato1;
    private javax.swing.JLabel eFormato2;
    private javax.swing.JLabel eFormato3;
    private javax.swing.JLabel eHora;
    private javax.swing.JLabel eMesa;
    private javax.swing.JLabel eNombre;
    private javax.swing.JButton eliminarReserva;
    private javax.swing.JLabel estadoMesaReserva;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner spinnerMesas;
    private javax.swing.JTextField textoDNI;
    private javax.swing.JTextField textoFecha;
    private javax.swing.JTextField textoHora;
    private javax.swing.JTextField textoIdReserva;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
