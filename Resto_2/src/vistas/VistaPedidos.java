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
    private Conexion conexion;
    private Fuentes fuente;

    public VistaPedidos() {
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
        labelPedidos.setFont(fuente.fuenteLuisa(1,24));
        
        //campos ocultos que aparecen al ser llamados por los ajustes del usuario
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
        eTomarPedido = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        avisos = new javax.swing.JLabel();
        eAgregarProducto = new javax.swing.JLabel();
        eCantidad = new javax.swing.JLabel();
        eIdProducto = new javax.swing.JLabel();
        idProducto = new javax.swing.JTextField();
        ePagaCon = new javax.swing.JLabel();
        textoCambio = new javax.swing.JTextField();
        eCambio = new javax.swing.JLabel();
        textoPagaCon = new javax.swing.JTextField();
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
        labelPedidos = new javax.swing.JLabel();
        buscarReservaPor1 = new javax.swing.JButton();
        textoId = new javax.swing.JTextField();
        etiquetaId = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        emesa = new javax.swing.JLabel();
        spinnerMesas = new javax.swing.JSpinner();
        textoNombre = new javax.swing.JTextField();
        buscarReservaPor2 = new javax.swing.JButton();
        buscarReservaPor3 = new javax.swing.JButton();
        btnCrearPedido = new javax.swing.JButton();
        buscarReservaPor5 = new javax.swing.JButton();
        buscarReservaPor6 = new javax.swing.JButton();
        ePagaCon1 = new javax.swing.JLabel();
        textoPagaCon1 = new javax.swing.JTextField();
        botonBalance = new javax.swing.JButton();
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

        eTomarPedido.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        eTomarPedido.setForeground(new java.awt.Color(153, 0, 51));
        eTomarPedido.setText("TOMAR PEDIDO");
        background.add(eTomarPedido);
        eTomarPedido.setBounds(390, 240, 210, 14);

        spinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerCantidad.setBorder(null);
        spinnerCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(spinnerCantidad);
        spinnerCantidad.setBounds(470, 390, 70, 30);

        avisos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        background.add(avisos);
        avisos.setBounds(420, 340, 430, 20);

        eAgregarProducto.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        eAgregarProducto.setForeground(new java.awt.Color(153, 0, 51));
        eAgregarProducto.setText("AGREGAR PRODUCTO");
        background.add(eAgregarProducto);
        eAgregarProducto.setBounds(380, 360, 200, 30);

        eCantidad.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        eCantidad.setForeground(new java.awt.Color(179, 3, 62));
        eCantidad.setText("CANTIDAD:");
        background.add(eCantidad);
        eCantidad.setBounds(380, 390, 80, 30);

        eIdProducto.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        eIdProducto.setForeground(new java.awt.Color(179, 3, 62));
        eIdProducto.setText("ID:");
        background.add(eIdProducto);
        eIdProducto.setBounds(580, 390, 30, 30);

        idProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        idProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductoActionPerformed(evt);
            }
        });
        background.add(idProducto);
        idProducto.setBounds(610, 390, 90, 30);

        ePagaCon.setForeground(new java.awt.Color(179, 3, 62));
        ePagaCon.setText("PAGA CON:");
        background.add(ePagaCon);
        ePagaCon.setBounds(730, 490, 80, 30);

        textoCambio.setForeground(new java.awt.Color(153, 0, 51));
        textoCambio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoCambio);
        textoCambio.setBounds(810, 530, 90, 30);

        eCambio.setForeground(new java.awt.Color(179, 3, 62));
        eCambio.setText("CAMBIO:");
        eCambio.setToolTipText("");
        background.add(eCambio);
        eCambio.setBounds(730, 530, 80, 30);

        textoPagaCon.setForeground(new java.awt.Color(153, 0, 51));
        textoPagaCon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoPagaCon);
        textoPagaCon.setBounds(810, 490, 90, 30);

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

        tablaPedido.setBackground(new java.awt.Color(254, 247, 230));
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
        jScrollPane1.setBounds(380, 440, 320, 220);

        labelPedidos.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        labelPedidos.setForeground(new java.awt.Color(153, 0, 51));
        labelPedidos.setText("PEDIDOS");
        background.add(labelPedidos);
        labelPedidos.setBounds(580, 190, 130, 40);

        buscarReservaPor1.setBackground(new java.awt.Color(255, 237, 221));
        buscarReservaPor1.setForeground(new java.awt.Color(102, 0, 0));
        buscarReservaPor1.setText("ATENDER");
        buscarReservaPor1.setToolTipText("");
        buscarReservaPor1.setActionCommand("");
        buscarReservaPor1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        buscarReservaPor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarReservaPor1ActionPerformed(evt);
            }
        });
        background.add(buscarReservaPor1);
        buscarReservaPor1.setBounds(630, 260, 110, 30);

        textoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoId);
        textoId.setBounds(840, 210, 60, 18);

        etiquetaId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId.setText("NRO:");
        background.add(etiquetaId);
        etiquetaId.setBounds(800, 210, 40, 17);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaNombre.setText("NOMBRE:");
        etiquetaNombre.setAlignmentY(0.0F);
        background.add(etiquetaNombre);
        etiquetaNombre.setBounds(380, 300, 90, 30);

        emesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emesa.setForeground(new java.awt.Color(153, 0, 51));
        emesa.setText("MESA:");
        background.add(emesa);
        emesa.setBounds(380, 260, 90, 30);

        spinnerMesas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerMesas.setBorder(null);
        spinnerMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(spinnerMesas);
        spinnerMesas.setBounds(470, 260, 140, 30);

        textoNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        background.add(textoNombre);
        textoNombre.setBounds(470, 300, 310, 30);

        buscarReservaPor2.setBackground(new java.awt.Color(255, 237, 221));
        buscarReservaPor2.setForeground(new java.awt.Color(102, 0, 0));
        buscarReservaPor2.setText("BUSCAR");
        buscarReservaPor2.setActionCommand("");
        buscarReservaPor2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        buscarReservaPor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarReservaPor2ActionPerformed(evt);
            }
        });
        background.add(buscarReservaPor2);
        buscarReservaPor2.setBounds(800, 230, 100, 20);

        buscarReservaPor3.setBackground(new java.awt.Color(255, 237, 221));
        buscarReservaPor3.setForeground(new java.awt.Color(102, 0, 0));
        buscarReservaPor3.setText("CANCELAR PEDIDO");
        buscarReservaPor3.setToolTipText("");
        buscarReservaPor3.setActionCommand("");
        buscarReservaPor3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        buscarReservaPor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarReservaPor3ActionPerformed(evt);
            }
        });
        background.add(buscarReservaPor3);
        buscarReservaPor3.setBounds(740, 640, 150, 20);

        btnCrearPedido.setBackground(new java.awt.Color(255, 237, 221));
        btnCrearPedido.setForeground(new java.awt.Color(102, 0, 0));
        btnCrearPedido.setText("CREAR PEDIDO");
        btnCrearPedido.setToolTipText("");
        btnCrearPedido.setActionCommand("");
        btnCrearPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        btnCrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPedidoActionPerformed(evt);
            }
        });
        background.add(btnCrearPedido);
        btnCrearPedido.setBounds(790, 300, 110, 30);

        buscarReservaPor5.setBackground(new java.awt.Color(255, 237, 221));
        buscarReservaPor5.setForeground(new java.awt.Color(102, 0, 0));
        buscarReservaPor5.setText("AGREGAR");
        buscarReservaPor5.setToolTipText("");
        buscarReservaPor5.setActionCommand("");
        buscarReservaPor5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        buscarReservaPor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarReservaPor5ActionPerformed(evt);
            }
        });
        background.add(buscarReservaPor5);
        buscarReservaPor5.setBounds(740, 390, 110, 30);

        buscarReservaPor6.setBackground(new java.awt.Color(255, 237, 221));
        buscarReservaPor6.setForeground(new java.awt.Color(102, 0, 0));
        buscarReservaPor6.setText("COBRAR");
        buscarReservaPor6.setToolTipText("");
        buscarReservaPor6.setActionCommand("");
        buscarReservaPor6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        buscarReservaPor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarReservaPor6ActionPerformed(evt);
            }
        });
        background.add(buscarReservaPor6);
        buscarReservaPor6.setBounds(760, 570, 110, 30);

        ePagaCon1.setForeground(new java.awt.Color(179, 3, 62));
        ePagaCon1.setText("CUENTA:");
        background.add(ePagaCon1);
        ePagaCon1.setBounds(730, 450, 80, 30);

        textoPagaCon1.setForeground(new java.awt.Color(153, 0, 51));
        textoPagaCon1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoPagaCon1);
        textoPagaCon1.setBounds(810, 450, 90, 30);

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

        imagen.setBackground(new java.awt.Color(204, 70, 0));
        imagen.setForeground(new java.awt.Color(1, 1, 1));
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

    private void idProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProductoActionPerformed

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
                textoUsuario.setText(null);
                textoUsuario1.setText(null);

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
            textoUsuario.setText(null);
            textoUsuario1.setText(null);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cambiarNombre2ActionPerformed

    private void buscarReservaPor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReservaPor1ActionPerformed

        //Para eso cambiamos el color de background y foreground de la fila a los colores de seleccion

    }//GEN-LAST:event_buscarReservaPor1ActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed

    }//GEN-LAST:event_textoNombreActionPerformed

    private void buscarReservaPor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReservaPor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarReservaPor2ActionPerformed

    private void buscarReservaPor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReservaPor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarReservaPor3ActionPerformed

    private void btnCrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPedidoActionPerformed
        String nombre=textoNombre.getText();
        String mesa=spinnerMesas.getValue().toString();
        
        
        
        
    }//GEN-LAST:event_btnCrearPedidoActionPerformed

    private void buscarReservaPor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReservaPor5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarReservaPor5ActionPerformed

    private void buscarReservaPor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReservaPor6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarReservaPor6ActionPerformed

    private void botonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBalanceActionPerformed
        background.removeAll();
        VistaBalance vistaBalance=new VistaBalance();
        vistaBalance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonBalanceActionPerformed

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
    private javax.swing.JLabel avisos;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonBalance;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton btnCrearPedido;
    private javax.swing.JButton buscarReservaPor1;
    private javax.swing.JButton buscarReservaPor2;
    private javax.swing.JButton buscarReservaPor3;
    private javax.swing.JButton buscarReservaPor5;
    private javax.swing.JButton buscarReservaPor6;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JLabel eAgregarProducto;
    private javax.swing.JLabel eCambio;
    private javax.swing.JLabel eCantidad;
    private javax.swing.JLabel eIdProducto;
    private javax.swing.JLabel ePagaCon;
    private javax.swing.JLabel ePagaCon1;
    private javax.swing.JLabel eTomarPedido;
    private javax.swing.JLabel emesa;
    private javax.swing.JLabel etiquetaId;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JTextField idProducto;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPedidos;
    private javax.swing.JLabel nomNu;
    private javax.swing.JLabel nomOld;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JSpinner spinnerMesas;
    private javax.swing.JTable tablaPedido;
    private javax.swing.JTextField textoCambio;
    private javax.swing.JTextField textoId;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoPagaCon;
    private javax.swing.JTextField textoPagaCon1;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
