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
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author Muñeca Brava
 */
public class VistaMesas extends javax.swing.JFrame {
    private Conexion conexion;
    private MesaData mesaData;
    private MeseroData meseroData;
    private PedidoData pedidoData;
    private ReservaData reservaData;
    private List<Mesa> mesas;
    private List<Integer> mesasId;
    private List<Integer> reservas;
    private Fuentes fuente;
    public static int mesaActual;

    public VistaMesas(){
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
        labelMesas.setFont(fuente.fuenteLuisa(1,24));
        
        //campos ocultos que aparecen al ser llamados por los ajustes del usuario
        textoUsuario1.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
        
        //Establecemos la conexion
        try{
            conexion=new Conexion();
            conexion.getConexion();
            mesaData=new MesaData(conexion);
            meseroData=new MeseroData(conexion);
            pedidoData=new PedidoData(conexion);
            reservaData=new ReservaData(conexion);
            
            cargarCbAtendidas();
            cargarCbReservadasHoy();
            cargarCbDisponibles();
            cargarTabla();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VistaMesas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getMesaActual() {
        return mesaActual;
    }
    public static void setMesaActual(int mesaActual) {
        VistaMesas.mesaActual = mesaActual;
    }
    
    private void limpiar(){
        cargarCbDisponibles();
        cargarCbReservadasHoy();
        cargarCbAtendidas();
        textoId.setText("");
        textoCapacidad.setText("");
        avisos.setText("");
        this.cargarTabla();
    }
    
    private void cargarTabla(){
        DefaultTableModel modelo=new DefaultTableModel();
            tablaMesas.setModel(modelo);
            
            modelo.addColumn("NRO DE MESA");
            modelo.addColumn("CAPACIDAD");
            modelo.addColumn("CUENTA");
            
            int x=mesaData.obtenerMesas().size();
            ArrayList<Mesa> lista=mesaData.obtenerMesas();
            for (int b=0;b<x;b++){
            Object [] filas = new Object[3];
            Mesa nuevo=lista.get(b);
            filas  [0]=nuevo.getIdMesa();
            filas  [1]=nuevo.getCapacidad();
            if("Atendida".equals(nuevo.getEstadoMesa())){
                try {
                    filas  [2]=pedidoData.seleccionarPedidoPor("id_mesa",nuevo.getIdMesa()).getCuenta();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VistaMesas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {filas [2]="00.0";}
            modelo.addRow(filas);
            }
        
    }
    
    private void cargarCbDisponibles(){
        mesas=mesaData.obtenerMesas().stream().filter(m->"Libre".equals(m.getEstadoMesa())).collect(Collectors.toList());
        mesas.forEach((m) -> {
            cbDisponibles.addItem(String.valueOf(m.getIdMesa()));
        });
    }
    
    private void cargarCbReservadasHoy(){
        reservas=reservaData.reservasPorMesa();
        reservas.forEach((r) -> {
            cbReservadas.addItem(String.valueOf(r));
        });
    }
    
    private void cargarCbAtendidas(){
        try {
            mesasId=pedidoData.selccionarPedidoPorMesero(Inicio.usuarioRegistrado());
            mesasId.forEach((r) -> {
                cbAtendidas.addItem(String.valueOf(r));
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaMesas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmacion = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        labelConfirmacion = new javax.swing.JLabel();
        textoConfirmacionMesa = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        botonAceptar1 = new javax.swing.JButton();
        confirmacion1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        labelConfirmacion1 = new javax.swing.JLabel();
        textoConfirmacionMesa1 = new javax.swing.JLabel();
        botonAceptar2 = new javax.swing.JButton();
        botonAceptar3 = new javax.swing.JButton();
        confirmacion2 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        labelConfirmacion2 = new javax.swing.JLabel();
        textoConfirmacionMesa2 = new javax.swing.JLabel();
        botonAceptar4 = new javax.swing.JButton();
        botonAceptar5 = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        botonBalance = new javax.swing.JButton();
        botonMesas = new javax.swing.JButton();
        botonReservas = new javax.swing.JButton();
        botonPedidos = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cambiarNombre2 = new javax.swing.JButton();
        textoCapacidad = new javax.swing.JTextField();
        avisos = new javax.swing.JLabel();
        textoUsuario1 = new javax.swing.JTextField();
        nomNu = new javax.swing.JLabel();
        botonAjustes = new javax.swing.JButton();
        labelMesas = new javax.swing.JLabel();
        agregarMesa = new javax.swing.JButton();
        actualizarMesa = new javax.swing.JButton();
        limpiarCasilleros = new javax.swing.JButton();
        eliminarMesa = new javax.swing.JButton();
        botonPrecios = new javax.swing.JButton();
        ocultar = new javax.swing.JButton();
        eActualizar = new javax.swing.JLabel();
        textoId = new javax.swing.JTextField();
        etiquetaId = new javax.swing.JLabel();
        cbDisponibles = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMesas = new javax.swing.JTable();
        cbReservadas = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbAtendidas = new javax.swing.JComboBox<>();
        atenderMesas = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        confirmacion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        confirmacion.setAlwaysOnTop(true);
        confirmacion.setBackground(new java.awt.Color(253, 240, 240));
        confirmacion.setBounds(new java.awt.Rectangle(360, 188, 564, 490));
        confirmacion.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 236, 223));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelConfirmacion.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        labelConfirmacion.setForeground(new java.awt.Color(153, 0, 51));
        labelConfirmacion.setText("CREAR PEDIDO");
        jPanel1.add(labelConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 220, 30));

        textoConfirmacionMesa.setForeground(new java.awt.Color(153, 0, 51));
        textoConfirmacionMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(textoConfirmacionMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 350, 200));

        botonAceptar.setBackground(new java.awt.Color(255, 237, 221));
        botonAceptar.setForeground(new java.awt.Color(102, 0, 0));
        botonAceptar.setText("CANCELAR");
        botonAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 102), new java.awt.Color(204, 51, 0), new java.awt.Color(153, 0, 0)));
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 130, 40));

        botonAceptar1.setBackground(new java.awt.Color(255, 237, 221));
        botonAceptar1.setForeground(new java.awt.Color(102, 0, 0));
        botonAceptar1.setText("ACEPTAR");
        botonAceptar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 102), new java.awt.Color(204, 51, 0), new java.awt.Color(153, 0, 0)));
        botonAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 130, 40));

        javax.swing.GroupLayout confirmacionLayout = new javax.swing.GroupLayout(confirmacion.getContentPane());
        confirmacion.getContentPane().setLayout(confirmacionLayout);
        confirmacionLayout.setHorizontalGroup(
            confirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        confirmacionLayout.setVerticalGroup(
            confirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        confirmacion1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        confirmacion1.setAlwaysOnTop(true);
        confirmacion1.setBackground(new java.awt.Color(253, 240, 240));
        confirmacion1.setBounds(new java.awt.Rectangle(360, 188, 564, 490));
        confirmacion1.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 236, 223));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelConfirmacion1.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        labelConfirmacion1.setForeground(new java.awt.Color(153, 0, 51));
        labelConfirmacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConfirmacion1.setText("AGREGAR UNA MESA");
        jPanel2.add(labelConfirmacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 540, 30));

        textoConfirmacionMesa1.setForeground(new java.awt.Color(153, 0, 51));
        textoConfirmacionMesa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(textoConfirmacionMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 350, 200));

        botonAceptar2.setBackground(new java.awt.Color(255, 237, 221));
        botonAceptar2.setForeground(new java.awt.Color(102, 0, 0));
        botonAceptar2.setText("CANCELAR");
        botonAceptar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 102), new java.awt.Color(204, 51, 0), new java.awt.Color(153, 0, 0)));
        botonAceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptar2ActionPerformed(evt);
            }
        });
        jPanel2.add(botonAceptar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 130, 40));

        botonAceptar3.setBackground(new java.awt.Color(255, 237, 221));
        botonAceptar3.setForeground(new java.awt.Color(102, 0, 0));
        botonAceptar3.setText("ACEPTAR");
        botonAceptar3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 102), new java.awt.Color(204, 51, 0), new java.awt.Color(153, 0, 0)));
        botonAceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptar3ActionPerformed(evt);
            }
        });
        jPanel2.add(botonAceptar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 130, 40));

        javax.swing.GroupLayout confirmacion1Layout = new javax.swing.GroupLayout(confirmacion1.getContentPane());
        confirmacion1.getContentPane().setLayout(confirmacion1Layout);
        confirmacion1Layout.setHorizontalGroup(
            confirmacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        confirmacion1Layout.setVerticalGroup(
            confirmacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        confirmacion2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        confirmacion2.setAlwaysOnTop(true);
        confirmacion2.setBackground(new java.awt.Color(253, 240, 240));
        confirmacion2.setBounds(new java.awt.Rectangle(360, 188, 564, 490));
        confirmacion2.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 236, 223));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelConfirmacion2.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        labelConfirmacion2.setForeground(new java.awt.Color(153, 0, 51));
        labelConfirmacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConfirmacion2.setText("ELIMINAR UNA MESA");
        jPanel3.add(labelConfirmacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 540, 30));

        textoConfirmacionMesa2.setForeground(new java.awt.Color(153, 0, 51));
        textoConfirmacionMesa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(textoConfirmacionMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 350, 200));

        botonAceptar4.setBackground(new java.awt.Color(255, 237, 221));
        botonAceptar4.setForeground(new java.awt.Color(102, 0, 0));
        botonAceptar4.setText("CANCELAR");
        botonAceptar4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 102), new java.awt.Color(204, 51, 0), new java.awt.Color(153, 0, 0)));
        botonAceptar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptar4ActionPerformed(evt);
            }
        });
        jPanel3.add(botonAceptar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 130, 40));

        botonAceptar5.setBackground(new java.awt.Color(255, 237, 221));
        botonAceptar5.setForeground(new java.awt.Color(102, 0, 0));
        botonAceptar5.setText("ACEPTAR");
        botonAceptar5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 102), new java.awt.Color(204, 51, 0), new java.awt.Color(153, 0, 0)));
        botonAceptar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptar5ActionPerformed(evt);
            }
        });
        jPanel3.add(botonAceptar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 130, 40));

        javax.swing.GroupLayout confirmacion2Layout = new javax.swing.GroupLayout(confirmacion2.getContentPane());
        confirmacion2.getContentPane().setLayout(confirmacion2Layout);
        confirmacion2Layout.setHorizontalGroup(
            confirmacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        confirmacion2Layout.setVerticalGroup(
            confirmacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(null);

        botonBalance.setBackground(new java.awt.Color(0, 0, 0));
        botonBalance.setFont(new java.awt.Font("Luisa", 1, 36)); // NOI18N
        botonBalance.setForeground(new java.awt.Color(238, 140, 60));
        botonBalance.setText("INGRESOS");
        botonBalance.setToolTipText("");
        botonBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 3, true));
        botonBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBalanceActionPerformed(evt);
            }
        });
        background.add(botonBalance);
        botonBalance.setBounds(20, 600, 250, 70);

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

        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logout.png"))); // NOI18N
        cerrarSesion.setContentAreaFilled(false);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        background.add(cerrarSesion);
        cerrarSesion.setBounds(240, 40, 30, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1);
        jButton1.setBounds(280, 40, 30, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("MESAS LIBRES:");
        background.add(jLabel11);
        jLabel11.setBounds(380, 270, 170, 30);

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

        textoCapacidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoCapacidad);
        textoCapacidad.setBounds(850, 240, 60, 20);

        avisos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        avisos.setForeground(new java.awt.Color(204, 0, 51));
        avisos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(avisos);
        avisos.setBounds(380, 390, 300, 20);

        textoUsuario1.setForeground(new java.awt.Color(153, 0, 51));
        textoUsuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoUsuario1KeyPressed(evt);
            }
        });
        background.add(textoUsuario1);
        textoUsuario1.setBounds(520, 50, 220, 30);

        nomNu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomNu.setForeground(new java.awt.Color(102, 0, 0));
        nomNu.setText("NUEVO NOMBRE:");
        background.add(nomNu);
        nomNu.setBounds(390, 50, 130, 30);

        botonAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png"))); // NOI18N
        botonAjustes.setContentAreaFilled(false);
        botonAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAjustesActionPerformed(evt);
            }
        });
        background.add(botonAjustes);
        botonAjustes.setBounds(320, 40, 30, 40);

        labelMesas.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        labelMesas.setForeground(new java.awt.Color(153, 0, 51));
        labelMesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMesas.setText("MESAS");
        background.add(labelMesas);
        labelMesas.setBounds(360, 200, 560, 40);

        agregarMesa.setBackground(new java.awt.Color(255, 237, 221));
        agregarMesa.setForeground(new java.awt.Color(102, 0, 0));
        agregarMesa.setText("AGREGAR  MESA");
        agregarMesa.setActionCommand("");
        agregarMesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        agregarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMesaActionPerformed(evt);
            }
        });
        background.add(agregarMesa);
        agregarMesa.setBounds(750, 490, 140, 30);

        actualizarMesa.setBackground(new java.awt.Color(255, 237, 221));
        actualizarMesa.setForeground(new java.awt.Color(102, 0, 0));
        actualizarMesa.setText("ACTUALIZAR");
        actualizarMesa.setActionCommand("");
        actualizarMesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        actualizarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMesaActionPerformed(evt);
            }
        });
        background.add(actualizarMesa);
        actualizarMesa.setBounds(750, 550, 140, 30);

        limpiarCasilleros.setBackground(new java.awt.Color(255, 237, 221));
        limpiarCasilleros.setForeground(new java.awt.Color(102, 0, 0));
        limpiarCasilleros.setText("LIMPIAR");
        limpiarCasilleros.setActionCommand("");
        limpiarCasilleros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        limpiarCasilleros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCasillerosActionPerformed(evt);
            }
        });
        background.add(limpiarCasilleros);
        limpiarCasilleros.setBounds(750, 430, 140, 30);

        eliminarMesa.setBackground(new java.awt.Color(255, 237, 221));
        eliminarMesa.setForeground(new java.awt.Color(102, 0, 0));
        eliminarMesa.setText("ELIMINAR");
        eliminarMesa.setActionCommand("");
        eliminarMesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        eliminarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMesaActionPerformed(evt);
            }
        });
        background.add(eliminarMesa);
        eliminarMesa.setBounds(750, 610, 140, 30);

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
        eActualizar.setBounds(460, 30, 340, 15);

        textoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoId);
        textoId.setBounds(850, 210, 60, 20);

        etiquetaId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId.setText("NRO:");
        background.add(etiquetaId);
        etiquetaId.setBounds(800, 210, 50, 20);

        cbDisponibles.setForeground(new java.awt.Color(102, 102, 102));
        cbDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar" }));
        cbDisponibles.setBorder(null);
        cbDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDisponiblesActionPerformed(evt);
            }
        });
        background.add(cbDisponibles);
        cbDisponibles.setBounds(550, 270, 150, 30);

        tablaMesas.setBackground(new java.awt.Color(254, 247, 230));
        tablaMesas.setForeground(new java.awt.Color(153, 0, 0));
        tablaMesas.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null}
            },
            new String [] {
                "NRO DE MESA", "CAPACIDAD", "CUENTA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMesas.setGridColor(new java.awt.Color(194, 65, 65));
        tablaMesas.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tablaMesas.setSelectionForeground(new java.awt.Color(254, 247, 230));
        tablaMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMesasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMesas);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(390, 420, 320, 240);

        cbReservadas.setForeground(new java.awt.Color(102, 102, 102));
        cbReservadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar" }));
        cbReservadas.setBorder(null);
        cbReservadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReservadasActionPerformed(evt);
            }
        });
        background.add(cbReservadas);
        cbReservadas.setBounds(550, 310, 150, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("RESERVADAS HOY:");
        background.add(jLabel13);
        jLabel13.setBounds(380, 310, 170, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("ATENDIENDO AHORA:");
        background.add(jLabel14);
        jLabel14.setBounds(380, 350, 170, 30);

        cbAtendidas.setForeground(new java.awt.Color(102, 102, 102));
        cbAtendidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar" }));
        cbAtendidas.setBorder(null);
        cbAtendidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtendidasActionPerformed(evt);
            }
        });
        background.add(cbAtendidas);
        cbAtendidas.setBounds(550, 350, 150, 30);

        atenderMesas.setBackground(new java.awt.Color(255, 237, 221));
        atenderMesas.setForeground(new java.awt.Color(102, 0, 0));
        atenderMesas.setText("ATENDER");
        atenderMesas.setActionCommand("");
        atenderMesas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        atenderMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenderMesasActionPerformed(evt);
            }
        });
        background.add(atenderMesas);
        atenderMesas.setBounds(750, 350, 100, 30);

        jLabel15.setForeground(new java.awt.Color(153, 0, 51));
        jLabel15.setText("CAPACIDAD:");
        background.add(jLabel15);
        jLabel15.setBounds(770, 240, 80, 20);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Background.png"))); // NOI18N
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

    private void botonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBalanceActionPerformed
        background.removeAll();
        VistaIngresos vistaBalance=new VistaIngresos();
        vistaBalance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonBalanceActionPerformed

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

    private void textoUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            meseroData.cambiarNombre(Inicio.usuarioRegistrado(), textoUsuario1.getText());
            Inicio.almacenarUsuario(textoUsuario1.getText());
            textoUsuario1.setVisible(false);
            nomNu.setVisible(false);
            cambiarNombre2.setVisible(false);
            textoUsuario1.setText(null);
            eActualizar.setVisible(true);
            ocultar.setVisible(true);
        }
    }//GEN-LAST:event_textoUsuario1KeyPressed

    private void botonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAjustesActionPerformed
        if(!nomNu.isVisible()){
            textoUsuario1.setVisible(true);
            nomNu.setVisible(true);
            cambiarNombre2.setVisible(true);}
        else{
            textoUsuario1.setVisible(false);
            nomNu.setVisible(false);
            cambiarNombre2.setVisible(false);
        }
    }//GEN-LAST:event_botonAjustesActionPerformed

    private void agregarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMesaActionPerformed
        if (textoCapacidad.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,"Por favor indique una capacidad.");
                }else{
        textoConfirmacionMesa1.setText("Desea agregar una mesa para "+textoCapacidad.getText()+" personas?");
        confirmacion1.setVisible(true);}
    }//GEN-LAST:event_agregarMesaActionPerformed

    private void actualizarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMesaActionPerformed
        if(!"".equals(textoId.getText())){int pregunta= JOptionPane.showConfirmDialog(null, "Desea actualizar los datos de la mesa?");
        if (pregunta==0){int filaSeleccionada = tablaMesas.getSelectedRow();
        if (filaSeleccionada != -1){
            mesaData.actualizarIdMesa(Integer.parseInt(tablaMesas.getValueAt(filaSeleccionada, 0).toString()), Integer.parseInt(textoId.getText()));
            tablaMesas.setValueAt(textoId.getText(), filaSeleccionada, 0);
            mesaData.actualizarCapacidad(Integer.parseInt(tablaMesas.getValueAt(filaSeleccionada, 0).toString()), Integer.parseInt(textoCapacidad.getText()));
            tablaMesas.setValueAt(textoCapacidad.getText(), filaSeleccionada, 1);
            limpiar();
            JOptionPane.showMessageDialog(null,"La información se actualizó con éxito");}
        }}
    }//GEN-LAST:event_actualizarMesaActionPerformed

    private void limpiarCasillerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCasillerosActionPerformed
        this.limpiar();
    }//GEN-LAST:event_limpiarCasillerosActionPerformed

    private void eliminarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMesaActionPerformed
        if (textoId.getText().equals("")) {JOptionPane.showMessageDialog(null, "Seleccione una mesa para eliminar");}
            else{
            textoConfirmacionMesa2.setText("Desea eliminar la mesa "+textoId.getText()+" para "+textoCapacidad.getText()+" personas?");
            VistaMesas.setMesaActual(Integer.parseInt(textoId.getText()));
            confirmacion2.setVisible(true);}
    }//GEN-LAST:event_eliminarMesaActionPerformed

    private void botonPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPreciosActionPerformed
        background.removeAll();
        VistaPrecios vistaPrecios=new VistaPrecios();
        vistaPrecios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPreciosActionPerformed

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
    }//GEN-LAST:event_ocultarActionPerformed

    private void tablaMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMesasMouseClicked
        int filaSeleccionada = tablaMesas.getSelectedRow();
        if (filaSeleccionada != -1){
            textoId.setText(tablaMesas.getValueAt(filaSeleccionada, 0).toString());
            textoCapacidad.setText(tablaMesas.getValueAt(filaSeleccionada,1).toString());
            VistaMesas.setMesaActual(Integer.parseInt(textoId.getText()));
        }
    }//GEN-LAST:event_tablaMesasMouseClicked

    private void cbDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDisponiblesActionPerformed
        List<Mesa> me=mesaData.obtenerMesas().stream().filter(m->m.getIdMesa()==Integer.parseInt(cbDisponibles.getSelectedItem().toString())).collect(Collectors.toList());
        me.forEach(m1->{
            textoId.setText(String.valueOf(m1.getIdMesa()));
            textoCapacidad.setText(String.valueOf(m1.getCapacidad()));
                });
    }//GEN-LAST:event_cbDisponiblesActionPerformed

    private void cbReservadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReservadasActionPerformed
        List<Mesa> me=mesaData.obtenerMesas().stream().filter(m->m.getIdMesa()==Integer.parseInt(cbReservadas.getSelectedItem().toString())).collect(Collectors.toList());
        me.forEach(m1->{
            textoId.setText(String.valueOf(m1.getIdMesa()));
            textoCapacidad.setText(String.valueOf(m1.getCapacidad()));
                });
    }//GEN-LAST:event_cbReservadasActionPerformed

    private void cbAtendidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtendidasActionPerformed
       List<Mesa> meee=mesaData.obtenerMesas().stream().filter(m->m.getIdMesa()==Integer.parseInt(cbAtendidas.getSelectedItem().toString())).collect(Collectors.toList());
       meee.forEach(m1->{
           textoId.setText(String.valueOf(m1.getIdMesa()));
           textoCapacidad.setText(String.valueOf(m1.getCapacidad()));
               });
    }//GEN-LAST:event_cbAtendidasActionPerformed

    private void atenderMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenderMesasActionPerformed
        if (textoId.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,"Por favor seleccione una mesa.");
                }else{
        textoConfirmacionMesa.setText("Desea continuar con el pedido para la mesa "+textoId.getText()+"?");
        confirmacion.setVisible(true);}
    }//GEN-LAST:event_atenderMesasActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        confirmacion.dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar1ActionPerformed
        background.removeAll();
        confirmacion.dispose();
        VistaMesas.setMesaActual(Integer.parseInt(textoId.getText()));
        VistaPedidos vistaPedidos=new VistaPedidos();
        this.setVisible(false);
        vistaPedidos.setVisible(true);
    }//GEN-LAST:event_botonAceptar1ActionPerformed

    private void botonAceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar2ActionPerformed
        confirmacion1.dispose();
    }//GEN-LAST:event_botonAceptar2ActionPerformed

    private void botonAceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar3ActionPerformed
        Mesa m=new Mesa("Libre",Integer.parseInt(textoCapacidad.getText()));
        mesaData.guardarMesa(m);
        limpiar();
        cargarTabla();
        JOptionPane.showMessageDialog(null,"Se agregó una nueva mesa");
        confirmacion1.dispose();
    }//GEN-LAST:event_botonAceptar3ActionPerformed

    private void botonAceptar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar4ActionPerformed
        confirmacion2.dispose();
    }//GEN-LAST:event_botonAceptar4ActionPerformed

    private void botonAceptar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar5ActionPerformed
        mesaData.borrarMesa(Integer.parseInt(textoId.getText()));
        limpiar();
        cargarTabla();
        JOptionPane.showMessageDialog(null,"Se eliminó una mesa");
        confirmacion2.dispose();
    }//GEN-LAST:event_botonAceptar5ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarMesa;
    private javax.swing.JButton agregarMesa;
    private javax.swing.JButton atenderMesas;
    private javax.swing.JLabel avisos;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAceptar1;
    private javax.swing.JButton botonAceptar2;
    private javax.swing.JButton botonAceptar3;
    private javax.swing.JButton botonAceptar4;
    private javax.swing.JButton botonAceptar5;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonBalance;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JComboBox<String> cbAtendidas;
    private javax.swing.JComboBox<String> cbDisponibles;
    private javax.swing.JComboBox<String> cbReservadas;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JDialog confirmacion;
    private javax.swing.JDialog confirmacion1;
    private javax.swing.JDialog confirmacion2;
    private javax.swing.JLabel eActualizar;
    private javax.swing.JButton eliminarMesa;
    private javax.swing.JLabel etiquetaId;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConfirmacion;
    private javax.swing.JLabel labelConfirmacion1;
    private javax.swing.JLabel labelConfirmacion2;
    private javax.swing.JLabel labelMesas;
    private javax.swing.JButton limpiarCasilleros;
    private javax.swing.JLabel nomNu;
    private javax.swing.JButton ocultar;
    private javax.swing.JTable tablaMesas;
    private javax.swing.JTextField textoCapacidad;
    private javax.swing.JLabel textoConfirmacionMesa;
    private javax.swing.JLabel textoConfirmacionMesa1;
    private javax.swing.JLabel textoConfirmacionMesa2;
    private javax.swing.JTextField textoId;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
