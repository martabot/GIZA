/*
 * 
 * 
 * 
 */
package vistas;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author Muñeca Brava
 */
public class VistaBalance extends javax.swing.JFrame {
    Conexion conexion;
    private Fuentes fuente;
    private ArrayList<Mesero> meseros;
    
    public VistaBalance() {
        
        //Propiedades de la pantalla completa
        this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        
        initComponents();
        //setteamos las fuentes personalizadas
        fuente=new Fuentes();
        botonBalance.setFont(fuente.fuenteLuisa(1,36));
        botonMesas.setFont(fuente.fuenteLuisa(1,36));
        botonReservas.setFont(fuente.fuenteLuisa(1,36));
        botonPedidos.setFont(fuente.fuenteLuisa(1,36));
        botonPrecios.setFont(fuente.fuenteLuisa(1,36));
        labelBalance.setFont(fuente.fuenteLuisa(1, 24));
        
        //campos ocultos que aparecen al ser llamados por los ajustes del usuario
        textoUsuario1.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
        
        //Instanciamos la conexion
        try {
            conexion = new Conexion();
            conexion.getConexion();    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void cargarCb(){
        for(Mesero m: meseros) {
            cbmeseros.addItem(m.getNombreMesero());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        botonPrecios = new javax.swing.JButton();
        botonMesas = new javax.swing.JButton();
        botonReservas = new javax.swing.JButton();
        botonPedidos = new javax.swing.JButton();
        labelBalance = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        nomNu = new javax.swing.JLabel();
        cambiarNombre2 = new javax.swing.JButton();
        botonAjustes = new javax.swing.JButton();
        textoUsuario1 = new javax.swing.JTextField();
        botonBalance = new javax.swing.JButton();
        ocultar = new javax.swing.JButton();
        eActualizar = new javax.swing.JLabel();
        etiquetaListar = new javax.swing.JLabel();
        cbmeseros = new javax.swing.JComboBox<>();
        tablaBalance = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonListar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();
        spninnerFecha = new javax.swing.JSpinner();
        spinnerHora = new javax.swing.JSpinner();
        comboBoxListar1 = new javax.swing.JComboBox<>();
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
        botonPrecios.setBounds(20, 500, 250, 70);

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
        botonMesas.setBounds(20, 200, 250, 70);

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
        botonReservas.setBounds(20, 300, 250, 70);

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
        botonPedidos.setBounds(20, 400, 250, 70);

        labelBalance.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        labelBalance.setForeground(new java.awt.Color(153, 0, 51));
        labelBalance.setText("BALANCE");
        background.add(labelBalance);
        labelBalance.setBounds(590, 190, 170, 40);

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

        nomNu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomNu.setForeground(new java.awt.Color(102, 0, 0));
        nomNu.setText("NUEVO NOMBRE:");
        background.add(nomNu);
        nomNu.setBounds(420, 50, 100, 30);

        cambiarNombre2.setBackground(new java.awt.Color(255, 237, 221));
        cambiarNombre2.setForeground(new java.awt.Color(102, 0, 0));
        cambiarNombre2.setText("Cambiar Nombre");
        cambiarNombre2.setActionCommand("");
        cambiarNombre2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        cambiarNombre2.setBorderPainted(false);
        cambiarNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarNombre2ActionPerformed(evt);
            }
        });
        background.add(cambiarNombre2);
        cambiarNombre2.setBounds(770, 50, 120, 30);

        botonAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/ajustes.png"))); // NOI18N
        botonAjustes.setContentAreaFilled(false);
        botonAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAjustesActionPerformed(evt);
            }
        });
        background.add(botonAjustes);
        botonAjustes.setBounds(320, 40, 30, 40);

        textoUsuario1.setForeground(new java.awt.Color(153, 0, 51));
        textoUsuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoUsuario1KeyPressed(evt);
            }
        });
        background.add(textoUsuario1);
        textoUsuario1.setBounds(520, 50, 220, 30);

        botonBalance.setBackground(new java.awt.Color(0, 0, 0));
        botonBalance.setFont(new java.awt.Font("Luisa", 1, 36)); // NOI18N
        botonBalance.setForeground(new java.awt.Color(238, 140, 60));
        botonBalance.setText("BALANCE");
        botonBalance.setToolTipText("");
        botonBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 3, true));
        botonBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBalanceActionPerformed(evt);
            }
        });
        background.add(botonBalance);
        botonBalance.setBounds(20, 600, 250, 70);

        ocultar.setBackground(new java.awt.Color(255, 237, 221));
        ocultar.setForeground(new java.awt.Color(102, 0, 0));
        ocultar.setText("OCULTAR");
        ocultar.setActionCommand("");
        ocultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        ocultar.setBorderPainted(false);
        ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultarActionPerformed(evt);
            }
        });
        background.add(ocultar);
        ocultar.setBounds(570, 60, 120, 30);

        eActualizar.setForeground(new java.awt.Color(102, 0, 0));
        eActualizar.setText("EL NOMBRE DE USUARIO SE ACTUALIZO CON EXITO");
        background.add(eActualizar);
        eActualizar.setBounds(480, 30, 300, 14);

        etiquetaListar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaListar.setForeground(new java.awt.Color(204, 0, 0));
        etiquetaListar.setText("Consulta Por:");
        background.add(etiquetaListar);
        etiquetaListar.setBounds(430, 250, 110, 30);

        cbmeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmeserosActionPerformed(evt);
            }
        });
        background.add(cbmeseros);
        cbmeseros.setBounds(540, 300, 130, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        tablaBalance.setViewportView(jTable1);

        background.add(tablaBalance);
        tablaBalance.setBounds(420, 440, 450, 220);

        botonListar.setText("LISTAR");
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });
        background.add(botonListar);
        botonListar.setBounds(770, 280, 80, 30);

        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        background.add(botonLimpiar);
        botonLimpiar.setBounds(770, 340, 80, 30);

        etiquetaFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaFecha.setForeground(new java.awt.Color(204, 0, 0));
        etiquetaFecha.setText("Fecha y Hora Min:");
        background.add(etiquetaFecha);
        etiquetaFecha.setBounds(410, 350, 130, 30);

        etiquetaHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaHora.setForeground(new java.awt.Color(204, 0, 0));
        etiquetaHora.setText("Fecha y Hora Max:");
        background.add(etiquetaHora);
        etiquetaHora.setBounds(410, 400, 130, 30);

        spninnerFecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1541196679131L), null, null, java.util.Calendar.HOUR));
        background.add(spninnerFecha);
        spninnerFecha.setBounds(540, 350, 130, 30);

        spinnerHora.setModel(new javax.swing.SpinnerDateModel());
        background.add(spinnerHora);
        spinnerHora.setBounds(540, 400, 130, 30);

        comboBoxListar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesero", "Mesa" }));
        comboBoxListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxListar1ActionPerformed(evt);
            }
        });
        background.add(comboBoxListar1);
        comboBoxListar1.setBounds(540, 250, 130, 30);

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
        background.removeAll();
        VistaPedidos vistaPedidos=new VistaPedidos();
        vistaPedidos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPedidosActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        background.removeAll();
        background.repaint();
        Inicio inicio=new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cambiarNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarNombre2ActionPerformed
        MeseroData m1=new MeseroData(conexion);
        m1.cambiarNombre(Inicio.usuarioRegistrado(), textoUsuario1.getText());
        Inicio.almacenarUsuario(textoUsuario1.getText());
        textoUsuario1.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        textoUsuario1.setText(null);  
        eActualizar.setVisible(true);
        ocultar.setVisible(true);
    }//GEN-LAST:event_cambiarNombre2ActionPerformed

    private void botonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAjustesActionPerformed
        textoUsuario1.setVisible(true);
        nomNu.setVisible(true);
        cambiarNombre2.setVisible(true);
    }//GEN-LAST:event_botonAjustesActionPerformed

    private void textoUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){

        MeseroData m1=new MeseroData(conexion);
        m1.cambiarNombre(Inicio.usuarioRegistrado(), textoUsuario1.getText());
        Inicio.almacenarUsuario(textoUsuario1.getText());
        textoUsuario1.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        eActualizar.setVisible(true);
        ocultar.setVisible(true);
        }
    }//GEN-LAST:event_textoUsuario1KeyPressed

    private void botonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBalanceActionPerformed

    }//GEN-LAST:event_botonBalanceActionPerformed

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
    }//GEN-LAST:event_ocultarActionPerformed

    private void cbmeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmeserosActionPerformed
       MeseroData m1= new MeseroData(conexion);
       List<Mesero>meseros=m1.obtenerMeseros();
    }//GEN-LAST:event_cbmeserosActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonListarActionPerformed

    private void comboBoxListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxListar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxListar1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonBalance;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonListar;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JComboBox<String> cbmeseros;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JComboBox<String> comboBoxListar1;
    private javax.swing.JLabel eActualizar;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaListar;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelBalance;
    private javax.swing.JLabel nomNu;
    private javax.swing.JButton ocultar;
    private javax.swing.JSpinner spinnerHora;
    private javax.swing.JSpinner spninnerFecha;
    private javax.swing.JScrollPane tablaBalance;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
