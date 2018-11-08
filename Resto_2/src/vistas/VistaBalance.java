/*
 * 
 * 
 * 
 */
package vistas;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author Muñeca Brava
 */
public class VistaBalance extends javax.swing.JFrame {
    Conexion conexion;
    private Fuentes fuente;
    private ArrayList<Mesero> meseros;
    private ArrayList<Mesa> mesas;
    private MeseroData meseroData;
    private MesaData mesaData;
    private PedidoData pedidoData;
    private LocalDateTime fecha;
    private DefaultTableModel modelo;
    private DateTimeFormatter d;
    
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
            meseroData=new MeseroData(conexion);
            mesaData=new MesaData(conexion);
            pedidoData=new PedidoData(conexion);
            modelo=new DefaultTableModel();
            d = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            Date utilStartDate = calendario.getDate();
            java.sql.Timestamp fec = new java.sql.Timestamp(utilStartDate.getTime());
            this.setFecha(fec.toLocalDateTime());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
    private void cargarReferenciaMesero(){
        cbReferencias.removeAllItems();
         meseros=meseroData.obtenerMeseros();
         for(Mesero m: meseros) {
            cbReferencias.addItem(m.getNombreMesero());
        }
    }
     
    private void cargarReferenciaMesa(){
        cbReferencias.removeAllItems();
         mesas=mesaData.obtenerMesas();
         for (Mesa m: mesas){
             cbReferencias.addItem(String.valueOf(m.getIdMesa()));
         }
    }
     
     private void cargarTablaMesero(String nombre){
            tablaReservas.setModel(modelo);
            
            modelo.addColumn("FECHA");
            modelo.addColumn("TOTAL"); 
            
            int x=pedidoData.totalDeTotales();
            ArrayList<LocalDateTime> cuentas=new ArrayList<>();
            cuentas=pedidoData.listaDeFechas();
            for (int b=0;b<x;b++){
                Object [] filas = new Object[2];
                LocalDateTime nuevo=cuentas.get(b);
                filas  [0]= nuevo.format(d);
                filas  [1]=pedidoData.cuentaDelDia(filas[0].toString());
                modelo.addRow(filas);
            }
     }
     
    private void cargarTablaMesa(int id){
        
    }
     
    private void cargarTablaIngresos(){
            tablaReservas.setModel(modelo);
            
            //agrega las columnas con las que vamos a trabajar
            modelo.addColumn("FECHA");
            modelo.addColumn("TOTAL"); 
            
            int x=pedidoData.totalDeTotales();
            ArrayList<LocalDateTime> cuentas=new ArrayList<>();
            cuentas=pedidoData.listaDeFechas();
            for (int b=0;b<x;b++){
                Object [] filas = new Object[2];
                LocalDateTime nuevo=cuentas.get(b);
                filas  [0]= nuevo.format(d);
                filas  [1]=pedidoData.cuentaDelDia(filas[0].toString());
                modelo.addRow(filas);
            }
    }

    private void limpiar(){
         cbReferencias.removeAllItems();
         cbReferencias.addItem("seleccionar");
         cbBuscarPor.setSelectedIndex(0);
         calendario.setDate(null);
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
        calendario1 = new com.toedter.calendar.JDateChooser();
        calendario = new com.toedter.calendar.JDateChooser();
        eActualizar = new javax.swing.JLabel();
        cbBuscarPor = new javax.swing.JComboBox<>();
        cbReferencias = new javax.swing.JComboBox<>();
        filtrar = new javax.swing.JButton();
        listarTodos = new javax.swing.JButton();
        emesa4 = new javax.swing.JLabel();
        emesa2 = new javax.swing.JLabel();
        emesa = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        eTotal = new javax.swing.JLabel();
        ePagaCon1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
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
        labelBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBalance.setText("INGRESOS");
        background.add(labelBalance);
        labelBalance.setBounds(360, 190, 560, 40);

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
        botonBalance.setText("INGRESOS");
        botonBalance.setToolTipText("");
        botonBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 3, true));
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
        ocultar.setBounds(550, 60, 120, 30);

        calendario1.setDateFormatString("yyyy-mm-dd");
        background.add(calendario1);
        calendario1.setBounds(490, 340, 200, 30);

        calendario.setDateFormatString("yyyy-mm-dd");
        background.add(calendario);
        calendario.setBounds(490, 300, 200, 30);

        eActualizar.setForeground(new java.awt.Color(102, 0, 0));
        eActualizar.setText("EL NOMBRE DE USUARIO SE ACTUALIZO CON EXITO");
        background.add(eActualizar);
        eActualizar.setBounds(480, 30, 300, 14);

        cbBuscarPor.setForeground(new java.awt.Color(102, 102, 102));
        cbBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "INGRESOS", "MESERO", "MESA" }));
        cbBuscarPor.setBorder(null);
        cbBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarPorActionPerformed(evt);
            }
        });
        background.add(cbBuscarPor);
        cbBuscarPor.setBounds(490, 260, 90, 30);

        cbReferencias.setForeground(new java.awt.Color(102, 102, 102));
        cbReferencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar" }));
        cbReferencias.setBorder(null);
        cbReferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReferenciasActionPerformed(evt);
            }
        });
        background.add(cbReferencias);
        cbReferencias.setBounds(600, 260, 90, 30);

        filtrar.setBackground(new java.awt.Color(255, 237, 221));
        filtrar.setForeground(new java.awt.Color(102, 0, 0));
        filtrar.setText("FILTRAR");
        filtrar.setToolTipText("");
        filtrar.setActionCommand("");
        filtrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarActionPerformed(evt);
            }
        });
        background.add(filtrar);
        filtrar.setBounds(760, 300, 110, 30);

        listarTodos.setBackground(new java.awt.Color(255, 237, 221));
        listarTodos.setForeground(new java.awt.Color(102, 0, 0));
        listarTodos.setText("LISTAR TODOS");
        listarTodos.setToolTipText("");
        listarTodos.setActionCommand("");
        listarTodos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        listarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarTodosActionPerformed(evt);
            }
        });
        background.add(listarTodos);
        listarTodos.setBounds(760, 260, 110, 30);

        emesa4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emesa4.setForeground(new java.awt.Color(153, 0, 51));
        emesa4.setText("FECHA MIN:");
        background.add(emesa4);
        emesa4.setBounds(400, 300, 80, 30);

        emesa2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emesa2.setForeground(new java.awt.Color(153, 0, 51));
        emesa2.setText("FECHA MAX:");
        background.add(emesa2);
        emesa2.setBounds(400, 340, 90, 30);

        emesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emesa.setForeground(new java.awt.Color(153, 0, 51));
        emesa.setText("FILTRAR:");
        background.add(emesa);
        emesa.setBounds(410, 260, 80, 30);

        limpiar.setBackground(new java.awt.Color(255, 237, 221));
        limpiar.setForeground(new java.awt.Color(102, 0, 0));
        limpiar.setText("LIMPIAR");
        limpiar.setToolTipText("");
        limpiar.setActionCommand("");
        limpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        background.add(limpiar);
        limpiar.setBounds(760, 340, 110, 30);

        eTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eTotal.setForeground(new java.awt.Color(153, 0, 51));
        background.add(eTotal);
        eTotal.setBounds(790, 640, 90, 30);

        ePagaCon1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ePagaCon1.setForeground(new java.awt.Color(153, 0, 51));
        ePagaCon1.setText("TOTAL:");
        background.add(ePagaCon1);
        ePagaCon1.setBounds(730, 640, 60, 30);

        tablaReservas.setBackground(new java.awt.Color(254, 247, 230));
        tablaReservas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaReservas.setForeground(new java.awt.Color(153, 0, 51));
        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PEDIDO", "MESERO", "MESA", "FECHA", "CUENTA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaReservas.setSelectionBackground(new java.awt.Color(153, 0, 51));
        tablaReservas.setSelectionForeground(new java.awt.Color(254, 247, 230));
        tablaReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReservasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaReservas);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(390, 390, 500, 250);

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
        meseroData.cambiarNombre(Inicio.usuarioRegistrado(), textoUsuario1.getText());
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
        meseroData.cambiarNombre(Inicio.usuarioRegistrado(), textoUsuario1.getText());
        Inicio.almacenarUsuario(textoUsuario1.getText());
        textoUsuario1.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        eActualizar.setVisible(true);
        ocultar.setVisible(true);
        }
    }//GEN-LAST:event_textoUsuario1KeyPressed

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
    }//GEN-LAST:event_ocultarActionPerformed

    private void cbBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarPorActionPerformed
        calendario.setDate(null);
        if ("MESA".equals(cbBuscarPor.getSelectedItem().toString())){
            cargarReferenciaMesa();
        }else if("MESERO".equals(cbBuscarPor.getSelectedItem().toString())){
            cargarReferenciaMesero();
        }  
    }//GEN-LAST:event_cbBuscarPorActionPerformed

    private void cbReferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReferenciasActionPerformed
        
    }//GEN-LAST:event_cbReferenciasActionPerformed

    private void filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarActionPerformed
        if("INGRESOS".equals(cbBuscarPor.getSelectedItem().toString())){
            
        }
    }//GEN-LAST:event_filtrarActionPerformed

    private void listarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarTodosActionPerformed
        if("INGRESOS".equals(cbBuscarPor.getSelectedItem().toString())){
            cargarTablaIngresos();
        }
    }//GEN-LAST:event_listarTodosActionPerformed

    private void tablaReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservasMouseClicked
       
    }//GEN-LAST:event_tablaReservasMouseClicked

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonBalance;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private com.toedter.calendar.JDateChooser calendario;
    private com.toedter.calendar.JDateChooser calendario1;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JComboBox<String> cbBuscarPor;
    private javax.swing.JComboBox<String> cbReferencias;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JLabel eActualizar;
    private javax.swing.JLabel ePagaCon1;
    private javax.swing.JLabel eTotal;
    private javax.swing.JLabel emesa;
    private javax.swing.JLabel emesa2;
    private javax.swing.JLabel emesa4;
    private javax.swing.JButton filtrar;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBalance;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton listarTodos;
    private javax.swing.JLabel nomNu;
    private javax.swing.JButton ocultar;
    private javax.swing.JTable tablaReservas;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
