/*
 * 
 * 
 * 
 */
package vistas;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

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
        
        textoUsuario.setVisible(false);
        textoUsuario1.setVisible(false);
        nomOld.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
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
        cerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botonAjustes = new javax.swing.JButton();
        nomOld = new javax.swing.JLabel();
        nomNu = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        textoUsuario1 = new javax.swing.JTextField();
        cambiarNombre2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();
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
        eTomarPedido.setBounds(390, 220, 210, 14);

        nombreCliente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        nombreCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });
        background.add(nombreCliente);
        nombreCliente.setBounds(500, 280, 240, 30);

        eNombreCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        eNombreCliente.setForeground(new java.awt.Color(179, 3, 62));
        eNombreCliente.setText("NOMBRE CLIENTE:");
        background.add(eNombreCliente);
        eNombreCliente.setBounds(380, 280, 120, 30);

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
        botonAtenderMesa.setBounds(610, 250, 110, 20);

        eMesa.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        eMesa.setForeground(new java.awt.Color(179, 3, 62));
        eMesa.setText("MESA:");
        background.add(eMesa);
        eMesa.setBounds(440, 250, 60, 20);

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
        eIdProducto.setBounds(610, 370, 30, 30);

        idProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        idProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductoActionPerformed(evt);
            }
        });
        background.add(idProducto);
        idProducto.setBounds(640, 370, 70, 30);

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
        spinnerMesa.setBounds(500, 240, 90, 30);

        ePagaCon.setForeground(new java.awt.Color(179, 3, 62));
        ePagaCon.setText("PAGA CON:");
        background.add(ePagaCon);
        ePagaCon.setBounds(710, 490, 70, 14);

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

        botonAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/ajustes.png"))); // NOI18N
        botonAjustes.setContentAreaFilled(false);
        botonAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAjustesActionPerformed(evt);
            }
        });
        background.add(botonAjustes);
        botonAjustes.setBounds(320, 40, 30, 40);

        nomOld.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomOld.setForeground(new java.awt.Color(102, 0, 0));
        nomOld.setText("NOMBRE:");
        background.add(nomOld);
        nomOld.setBounds(420, 20, 100, 30);

        nomNu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomNu.setForeground(new java.awt.Color(102, 0, 0));
        nomNu.setText("NUEVO NOMBRE:");
        background.add(nomNu);
        nomNu.setBounds(420, 60, 100, 30);

        textoUsuario.setForeground(new java.awt.Color(153, 0, 51));
        textoUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoUsuario);
        textoUsuario.setBounds(520, 20, 220, 30);

        textoUsuario1.setForeground(new java.awt.Color(153, 0, 51));
        textoUsuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoUsuario1KeyPressed(evt);
            }
        });
        background.add(textoUsuario1);
        textoUsuario1.setBounds(520, 60, 220, 30);

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
        cambiarNombre2.setBounds(770, 60, 120, 30);

        tablaPedido.setForeground(new java.awt.Color(153, 0, 0));
        tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
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
                "Cantidad", "Producto", "Sub-total"
            }
        ));
        jScrollPane1.setViewportView(tablaPedido);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(390, 420, 310, 240);

        imagen.setBackground(new java.awt.Color(204, 70, 0));
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

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        background.removeAll();
        background.repaint();
        Inicio inicio=new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAjustesActionPerformed
        textoUsuario.setVisible(true);
        textoUsuario1.setVisible(true);
        nomOld.setVisible(true);
        nomNu.setVisible(true);
        cambiarNombre2.setVisible(true);
    }//GEN-LAST:event_botonAjustesActionPerformed

    private void textoUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){

            try {
                Conexion conexion = new Conexion();
                conexion.getConexion();
                MeseroData m1=new MeseroData(conexion);
                m1.cambiarNombre(textoUsuario.getText(), textoUsuario1.getText());
                textoUsuario.setVisible(false);
                textoUsuario1.setVisible(false);
                nomOld.setVisible(false);
                nomNu.setVisible(false);
                cambiarNombre2.setVisible(false);

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_textoUsuario1KeyPressed

    private void cambiarNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarNombre2ActionPerformed

        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
            MeseroData m1=new MeseroData(conexion);
            m1.cambiarNombre(textoUsuario.getText(), textoUsuario1.getText());
            textoUsuario.setVisible(false);
            textoUsuario1.setVisible(false);
            nomOld.setVisible(false);
            nomNu.setVisible(false);
            cambiarNombre2.setVisible(false);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cambiarNombre2ActionPerformed

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
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonAtenderMesa;
    private javax.swing.JButton botonCrearPedido;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton buscarPedido;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JButton cancelarPedido;
    private javax.swing.JButton cerrarSesion;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomNu;
    private javax.swing.JLabel nomOld;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JLabel propiedadesPedido;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JSpinner spinnerMesa;
    private javax.swing.JTable tablaPedido;
    private javax.swing.JTextField textoCambio;
    private javax.swing.JTextField textoPagaCon;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
