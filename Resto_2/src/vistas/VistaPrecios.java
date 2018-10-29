/*
 * 
 * 
 * 
 */
package vistas;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author Muñeca Brava
 */
public class VistaPrecios extends javax.swing.JFrame {
    private Fuentes fuente;
    private ArrayList<Producto> lista=new ArrayList<>();
    private Producto producto;
    Conexion conexion;
    
    public VistaPrecios() {
        
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
        labelPrecios.setFont(fuente.fuenteLuisa(1, 24));
        
        //campos ocultos que aparecen al ser llamados por los ajustes del usuario
        textoUsuario.setVisible(false);
        textoUsuario1.setVisible(false);
        nomOld.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        //Instanciamos la conexion 
        try {
            conexion = new Conexion();
            conexion.getConexion();
                
        } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
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
        labelPrecios = new javax.swing.JLabel();
        crearReserva = new javax.swing.JButton();
        avisos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrecios = new javax.swing.JTable();
        etiquetaAgregar = new javax.swing.JLabel();
        crearReserva1 = new javax.swing.JButton();
        agregarProducto = new javax.swing.JButton();
        crearReserva3 = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        nomNu = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        cambiarNombre2 = new javax.swing.JButton();
        nomOld = new javax.swing.JLabel();
        botonAjustes = new javax.swing.JButton();
        textoUsuario1 = new javax.swing.JTextField();
        botonBalance = new javax.swing.JButton();
        buscarReservaPor1 = new javax.swing.JButton();
        textoId = new javax.swing.JTextField();
        etiquetaId = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaId4 = new javax.swing.JLabel();
        textoMonto = new javax.swing.JTextField();
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

        labelPrecios.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        labelPrecios.setForeground(new java.awt.Color(153, 0, 51));
        labelPrecios.setText("LISTA DE PRECIOS");
        background.add(labelPrecios);
        labelPrecios.setBounds(540, 190, 220, 40);

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
        crearReserva.setBounds(520, 350, 120, 30);

        avisos.setForeground(new java.awt.Color(102, 0, 0));
        avisos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(avisos);
        avisos.setBounds(470, 320, 290, 20);

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
        jScrollPane1.setBounds(390, 390, 510, 280);
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
        crearReserva1.setBounds(390, 350, 120, 30);

        agregarProducto.setBackground(new java.awt.Color(255, 237, 221));
        agregarProducto.setForeground(new java.awt.Color(102, 0, 0));
        agregarProducto.setText("AGREGAR");
        agregarProducto.setActionCommand("");
        agregarProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        agregarProducto.setContentAreaFilled(false);
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });
        background.add(agregarProducto);
        agregarProducto.setBounds(650, 350, 120, 30);

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
        crearReserva3.setBounds(780, 350, 120, 30);

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
        nomNu.setBounds(420, 60, 100, 30);

        textoUsuario.setForeground(new java.awt.Color(153, 0, 51));
        textoUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoUsuario);
        textoUsuario.setBounds(520, 20, 220, 30);

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

        nomOld.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomOld.setForeground(new java.awt.Color(102, 0, 0));
        nomOld.setText("NOMBRE:");
        background.add(nomOld);
        nomOld.setBounds(420, 20, 100, 30);

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
        textoUsuario1.setBounds(520, 60, 220, 30);

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

        buscarReservaPor1.setBackground(new java.awt.Color(255, 237, 221));
        buscarReservaPor1.setForeground(new java.awt.Color(102, 0, 0));
        buscarReservaPor1.setText("BUSCAR");
        buscarReservaPor1.setActionCommand("");
        buscarReservaPor1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        buscarReservaPor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarReservaPor1ActionPerformed(evt);
            }
        });
        background.add(buscarReservaPor1);
        buscarReservaPor1.setBounds(800, 230, 100, 20);

        textoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoId);
        textoId.setBounds(840, 210, 60, 18);

        etiquetaId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId.setText("NRO:");
        background.add(etiquetaId);
        etiquetaId.setBounds(800, 210, 40, 17);

        textoNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        background.add(textoNombre);
        textoNombre.setBounds(470, 240, 270, 30);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaNombre.setText("NOMBRE:");
        etiquetaNombre.setAlignmentY(0.0F);
        background.add(etiquetaNombre);
        etiquetaNombre.setBounds(380, 240, 90, 30);

        etiquetaId4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId4.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId4.setText("MONTO:      $");
        background.add(etiquetaId4);
        etiquetaId4.setBounds(380, 280, 90, 30);

        textoMonto.setText("00.00");
        textoMonto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoMontoActionPerformed(evt);
            }
        });
        background.add(textoMonto);
        textoMonto.setBounds(470, 280, 140, 30);

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

    private void crearReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearReservaActionPerformed

    private void crearReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearReserva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearReserva1ActionPerformed

    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoActionPerformed
        Producto producto=new Producto(textoNombre.getText(),Double.parseDouble(textoMonto.getText()));
        lista.add(producto);
        
        mostrar();
    }//GEN-LAST:event_agregarProductoActionPerformed
    
    private void mostrar(){
        
        String matriz [][]= new String [lista.size()][3];
                for (int i=0; i > lista.size();i++){
                    matriz [i][0]=String.valueOf(i+1);
                    matriz [i][1]=lista.get(i).getNombreProducto();
                    matriz [i][2]=String.valueOf(lista.get(i).getPrecio());
                }
            tablaPrecios.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Código", "Nombre", "Precio"
            }
        ));
    }
    
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

    private void cambiarNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarNombre2ActionPerformed
        MeseroData m1=new MeseroData(conexion);
        m1.cambiarNombre(textoUsuario.getText(), textoUsuario1.getText());
        textoUsuario.setVisible(false);
        textoUsuario1.setVisible(false);
        nomOld.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        textoUsuario.setText(null);
        textoUsuario1.setText(null);
    }//GEN-LAST:event_cambiarNombre2ActionPerformed

    private void botonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAjustesActionPerformed
        textoUsuario.setVisible(true);
        textoUsuario1.setVisible(true);
        nomOld.setVisible(true);
        nomNu.setVisible(true);
        cambiarNombre2.setVisible(true);
    }//GEN-LAST:event_botonAjustesActionPerformed

    private void textoUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            MeseroData m1=new MeseroData(conexion);
            m1.cambiarNombre(textoUsuario.getText(), textoUsuario1.getText());
            textoUsuario.setVisible(false);
            textoUsuario1.setVisible(false);
            nomOld.setVisible(false);
            nomNu.setVisible(false);
            cambiarNombre2.setVisible(false);
            textoUsuario.setText(null);
            textoUsuario1.setText(null);
        }
    }//GEN-LAST:event_textoUsuario1KeyPressed

    private void botonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBalanceActionPerformed
        background.removeAll();
        VistaBalance vistaBalance=new VistaBalance();
        vistaBalance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonBalanceActionPerformed

    private void buscarReservaPor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReservaPor1ActionPerformed

        //Para eso cambiamos el color de background y foreground de la fila a los colores de seleccion

    }//GEN-LAST:event_buscarReservaPor1ActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed

    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoMontoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProducto;
    private javax.swing.JLabel avisos;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonBalance;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton buscarReservaPor1;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton crearReserva;
    private javax.swing.JButton crearReserva1;
    private javax.swing.JButton crearReserva3;
    private javax.swing.JLabel etiquetaAgregar;
    private javax.swing.JLabel etiquetaId;
    private javax.swing.JLabel etiquetaId4;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPrecios;
    private javax.swing.JLabel nomNu;
    private javax.swing.JLabel nomOld;
    private javax.swing.JTable tablaPrecios;
    private javax.swing.JTextField textoId;
    private javax.swing.JTextField textoMonto;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
