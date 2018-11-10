/*
 * 
 * 
 * 
 */
package vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author Muñeca Brava
 */
public class VistaReservas extends javax.swing.JFrame {
    //Declaramos los atributos encapsulados
    private int idReserva;
    private String nombre;
    private int dni;
    private LocalDateTime fecha;
    private int nroMesa;
    private List<Reserva> reservaMesa;
    private ArrayList<Reserva> reservasLista=new ArrayList<>();
    private Fuentes fuente;
    private ReservaData reservaData;
    private Conexion conexion;
    private MesaData mesaData;
    private PedidoData pedidoData;
    
    
    //Constructor
    public VistaReservas(){
        
        //propiedades de la pantalla completa
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
        labelReservas.setFont(fuente.fuenteLuisa(1, 24));
        labelConfirmacion.setFont(fuente.fuenteLuisa(1, 24));
        
        //campos ocultos que aparecen al ser llamados por los ajustes del usuario
        textoUsuario1.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
        
        //instanciamos la conexion
        try {
                conexion = new Conexion();
                conexion.getConexion();
                reservaData=new ReservaData(conexion);
                mesaData=new MesaData(conexion);
                pedidoData=new PedidoData(conexion);
                
                //cargamos la tabla con las reservas existentes
                this.cargarTabla();
                
                //autocancelamos las reservas que pierden vigencia
                reservaData.obtenerReservas().forEach(r -> reservaData.autoCancelarReserva(r.getIdReserva()));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //algunos getters y setters necesarios
    public int getIdReserva() {
        return idReserva;
    }
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni=Integer.parseInt(dni);
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getNroMesa() {
        return nroMesa;
    }
    public void setNroMesa(String nroMesa) {
        this.nroMesa = Integer.parseInt(nroMesa);
    }

    //este metodo limpia los casilleros y busquedas realizadas
    private void limpiar(){
        textoId.setText("");
        textoNombre.setText("");
        textoDni.setText("");
        calendario.setDate(null);
        spinnerMesas.setValue(0);
        avisos.setText("");
        rbActiva.setSelected(false);
        rbInactiva.setSelected(false);
    }
    
    //cargamos la tabla con la información de nuestras reservas
    private void cargarTabla() throws ClassNotFoundException{
            
            //nos ayuda a editar una tabla con modelo personalizado
            DefaultTableModel modelo=new DefaultTableModel();
            tablaReservas.setModel(modelo);
            
            //agrega las columnas con las que vamos a trabajar
            modelo.addColumn("RESERVA");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("DNI");
            modelo.addColumn("FECHA");
            modelo.addColumn("MESA");
            
            //acomodamos el formato para que se vea bonito en nuestra tabla
            DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
            
            
            int x=reservaData.obtenerReservas().size();
            ArrayList<Reserva> lista=new ArrayList<>();
            lista=reservaData.obtenerReservas();
            for (int b=0;b<x;b++){
                //para una lista de tamaño x(que es nuestra cantidad de filas) llenamos los datos de cada columna, los contadores de fila empiezan en 0
                Object [] filas = new Object[5];
                Reserva nuevo=lista.get(b);
                filas  [0]=nuevo.getIdReserva();
                filas  [1]=nuevo.getNombreCliente();
                filas  [2]=nuevo.getDniCliente();
                filas  [3]=nuevo.getFechaReserva().format(d);
                filas  [4]=nuevo.getMesa().getIdMesa();
                modelo.addRow(filas);
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmacion = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        labelConfirmacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreConfirmacion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dniConfirmacion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaConfirmacion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mesaConfirmacion = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        botonAceptar1 = new javax.swing.JButton();
        estadoConfirmacion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        confirmacion1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        labelConfirmacion1 = new javax.swing.JLabel();
        nombreConfirmacion1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dniConfirmacion1 = new javax.swing.JLabel();
        fechaConfirmacion1 = new javax.swing.JLabel();
        mesaConfirmacion1 = new javax.swing.JLabel();
        botonAceptar2 = new javax.swing.JButton();
        botonAceptar3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        botonPrecios = new javax.swing.JButton();
        botonMesas = new javax.swing.JButton();
        botonReservas = new javax.swing.JButton();
        botonPedidos = new javax.swing.JButton();
        labelReservas = new javax.swing.JLabel();
        darDeBaja = new javax.swing.JButton();
        crearReserva = new javax.swing.JButton();
        eliminarReserva = new javax.swing.JButton();
        spinnerMesas = new javax.swing.JSpinner();
        cerrarSesion = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        cambiarNombre2 = new javax.swing.JButton();
        textoUsuario1 = new javax.swing.JTextField();
        botonAjustes = new javax.swing.JButton();
        nomNu = new javax.swing.JLabel();
        etiquetaId = new javax.swing.JLabel();
        textoId = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoDni = new javax.swing.JTextField();
        emesa = new javax.swing.JLabel();
        etiquetaId2 = new javax.swing.JLabel();
        etiquetaId3 = new javax.swing.JLabel();
        etiquetaId4 = new javax.swing.JLabel();
        rbInactiva = new javax.swing.JRadioButton();
        calendario = new com.toedter.calendar.JDateChooser();
        avisos = new javax.swing.JLabel();
        limpiarCasilleros1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        botonBalance = new javax.swing.JButton();
        eActualizar = new javax.swing.JLabel();
        ocultar = new javax.swing.JButton();
        emesa1 = new javax.swing.JLabel();
        rbActiva = new javax.swing.JRadioButton();
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
        labelConfirmacion.setText("CREAR RESERVA");
        jPanel1.add(labelConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 220, 30));

        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("NOMBRE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 60, 30));

        nombreConfirmacion.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(nombreConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 300, 30));

        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("DNI:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 60, 30));

        dniConfirmacion.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(dniConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 300, 30));

        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("FECHA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 60, 30));

        fechaConfirmacion.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(fechaConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 300, 30));

        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("MESA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 60, 30));

        mesaConfirmacion.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(mesaConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 300, 30));

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

        estadoConfirmacion.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(estadoConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 300, 30));

        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("ESTADO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 60, 30));

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
        labelConfirmacion1.setText("ELIMINAR RESERVA");
        jPanel2.add(labelConfirmacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 460, 30));

        nombreConfirmacion1.setForeground(new java.awt.Color(153, 0, 51));
        jPanel2.add(nombreConfirmacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 300, 30));

        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("DNI:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 60, 30));

        dniConfirmacion1.setForeground(new java.awt.Color(153, 0, 51));
        jPanel2.add(dniConfirmacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 300, 30));

        fechaConfirmacion1.setForeground(new java.awt.Color(153, 0, 51));
        jPanel2.add(fechaConfirmacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 300, 30));

        mesaConfirmacion1.setForeground(new java.awt.Color(153, 0, 51));
        jPanel2.add(mesaConfirmacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 300, 30));

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

        jLabel10.setForeground(new java.awt.Color(153, 0, 51));
        jLabel10.setText("NOMBRE:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 60, 30));

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1400, 890));

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

        labelReservas.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        labelReservas.setForeground(new java.awt.Color(153, 0, 51));
        labelReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReservas.setText("RESERVAS");
        background.add(labelReservas);
        labelReservas.setBounds(360, 200, 560, 40);

        darDeBaja.setBackground(new java.awt.Color(255, 237, 221));
        darDeBaja.setForeground(new java.awt.Color(102, 0, 0));
        darDeBaja.setText("ACTUALIZAR");
        darDeBaja.setActionCommand("");
        darDeBaja.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        darDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darDeBajaActionPerformed(evt);
            }
        });
        background.add(darDeBaja);
        darDeBaja.setBounds(780, 340, 120, 30);

        crearReserva.setBackground(new java.awt.Color(255, 237, 221));
        crearReserva.setForeground(new java.awt.Color(102, 0, 0));
        crearReserva.setText("CREAR");
        crearReserva.setActionCommand("");
        crearReserva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        crearReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearReservaActionPerformed(evt);
            }
        });
        background.add(crearReserva);
        crearReserva.setBounds(780, 260, 120, 30);

        eliminarReserva.setBackground(new java.awt.Color(255, 237, 221));
        eliminarReserva.setForeground(new java.awt.Color(102, 0, 0));
        eliminarReserva.setText("ELIMINAR");
        eliminarReserva.setActionCommand("");
        eliminarReserva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        eliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarReservaActionPerformed(evt);
            }
        });
        background.add(eliminarReserva);
        eliminarReserva.setBounds(780, 300, 120, 30);

        spinnerMesas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerMesas.setBorder(null);
        spinnerMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(spinnerMesas);
        spinnerMesas.setBounds(460, 380, 150, 30);

        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logout.png"))); // NOI18N
        cerrarSesion.setContentAreaFilled(false);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        background.add(cerrarSesion);
        cerrarSesion.setBounds(240, 40, 30, 40);

        apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        apagar.setContentAreaFilled(false);
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });
        background.add(apagar);
        apagar.setBounds(280, 40, 30, 40);

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
        cambiarNombre2.setBounds(780, 50, 120, 30);

        textoUsuario1.setForeground(new java.awt.Color(153, 0, 51));
        textoUsuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario1ActionPerformed(evt);
            }
        });
        textoUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoUsuario1KeyPressed(evt);
            }
        });
        background.add(textoUsuario1);
        textoUsuario1.setBounds(520, 50, 220, 30);

        botonAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png"))); // NOI18N
        botonAjustes.setContentAreaFilled(false);
        botonAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAjustesActionPerformed(evt);
            }
        });
        background.add(botonAjustes);
        botonAjustes.setBounds(320, 40, 30, 40);

        nomNu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomNu.setForeground(new java.awt.Color(102, 0, 0));
        nomNu.setText("NUEVO NOMBRE:");
        background.add(nomNu);
        nomNu.setBounds(400, 50, 110, 30);

        etiquetaId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId.setText("NRO:");
        background.add(etiquetaId);
        etiquetaId.setBounds(790, 210, 40, 17);

        textoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoId);
        textoId.setBounds(840, 210, 60, 18);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaNombre.setText("NOMBRE:");
        etiquetaNombre.setAlignmentY(0.0F);
        background.add(etiquetaNombre);
        etiquetaNombre.setBounds(390, 260, 70, 30);

        textoNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoNombre);
        textoNombre.setBounds(460, 260, 270, 30);

        textoDni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoDni);
        textoDni.setBounds(460, 300, 150, 30);

        emesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emesa.setForeground(new java.awt.Color(153, 0, 51));
        emesa.setText("MESA:");
        background.add(emesa);
        emesa.setBounds(390, 380, 70, 30);

        etiquetaId2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaId2.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId2.setText("<- DNI sin puntos");
        background.add(etiquetaId2);
        etiquetaId2.setBounds(620, 310, 110, 15);

        etiquetaId3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId3.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId3.setText("FECHA:");
        background.add(etiquetaId3);
        etiquetaId3.setBounds(390, 340, 70, 30);

        etiquetaId4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId4.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId4.setText("DNI:");
        background.add(etiquetaId4);
        etiquetaId4.setBounds(390, 300, 70, 30);

        rbInactiva.setBackground(new java.awt.Color(255, 236, 223));
        rbInactiva.setForeground(new java.awt.Color(153, 0, 51));
        rbInactiva.setText("INACTIVA");
        rbInactiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInactivaActionPerformed(evt);
            }
        });
        background.add(rbInactiva);
        rbInactiva.setBounds(540, 420, 80, 30);

        calendario.setDateFormatString("dd/MM/yyyy HH:mm:ss");
        calendario.setMaxSelectableDate(new java.util.Date(253370779265000L));
        calendario.setMinSelectableDate(new java.util.Date(-62135755135000L));
        background.add(calendario);
        calendario.setBounds(460, 340, 270, 30);

        avisos.setBackground(new java.awt.Color(255, 236, 223));
        avisos.setForeground(new java.awt.Color(204, 0, 51));
        avisos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(avisos);
        avisos.setBounds(460, 440, 310, 30);

        limpiarCasilleros1.setBackground(new java.awt.Color(255, 237, 221));
        limpiarCasilleros1.setForeground(new java.awt.Color(102, 0, 0));
        limpiarCasilleros1.setText("LIMPIAR");
        limpiarCasilleros1.setActionCommand("");
        limpiarCasilleros1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        limpiarCasilleros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCasilleros1ActionPerformed(evt);
            }
        });
        background.add(limpiarCasilleros1);
        limpiarCasilleros1.setBounds(780, 440, 120, 30);

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
                "RESERVA", "NOMBRE", "DNI", "FECHA", "MESA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setBounds(390, 482, 510, 180);

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

        eActualizar.setForeground(new java.awt.Color(102, 0, 0));
        eActualizar.setText("EL NOMBRE DE USUARIO SE ACTUALIZO CON EXITO");
        background.add(eActualizar);
        eActualizar.setBounds(480, 30, 320, 20);

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

        emesa1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emesa1.setForeground(new java.awt.Color(153, 0, 51));
        emesa1.setText("ESTADO:");
        background.add(emesa1);
        emesa1.setBounds(390, 420, 70, 30);

        rbActiva.setBackground(new java.awt.Color(255, 236, 223));
        rbActiva.setForeground(new java.awt.Color(153, 0, 51));
        rbActiva.setText("ACTIVA");
        rbActiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActivaActionPerformed(evt);
            }
        });
        background.add(rbActiva);
        rbActiva.setBounds(460, 420, 80, 30);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Background.png"))); // NOI18N
        imagen.setAlignmentY(0.0F);
        background.add(imagen);
        imagen.setBounds(0, 0, 1430, 896);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Pasa a vista Lista de Precios
    private void botonPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPreciosActionPerformed
        background.removeAll();
        VistaPrecios vistaPrecios=new VistaPrecios();
        vistaPrecios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPreciosActionPerformed

    //Pasa a vista de Mesas
    private void botonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMesasActionPerformed
        background.removeAll();
        VistaMesas vistaMesas=new VistaMesas();
        vistaMesas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonMesasActionPerformed

    //Pasa a vista Pedidos
    private void botonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidosActionPerformed
        background.removeAll();
        VistaPedidos vistaPedidos=new VistaPedidos();
        vistaPedidos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPedidosActionPerformed

    //Creamos una reserva con los datos insertados en los campos de texto y avisamos si algo en el proceso está saliendo mal
    private void crearReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearReservaActionPerformed
        //Seteamos el campo dni
        this.setDni(textoDni.getText());
        //seteamos el campo de spinner mesas
        this.setNroMesa(spinnerMesas.getValue().toString());
        //Seteamos el sql Timestamp como un Time localDateTime para la fecha que obtiene el calendario
        Date utilStartDate = calendario.getDate();
        java.sql.Timestamp fec = new java.sql.Timestamp(utilStartDate.getTime());
        this.setFecha(fec.toLocalDateTime());
        //comparamos con la fecha de hoy para saber si es una fecha de reserva válida
        int fec2=LocalDateTime.now().compareTo(this.getFecha());
        DateTimeFormatter x = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        MesaData m1=new MesaData(conexion);
                
        //corroboramos que los datos sean validos mediante condicion if/else
        if (textoNombre.getText().equals("")) {
                    avisos.setText("Por favor ingrese su nombre.");
                } else if (textoDni.getText().equals("")) {
                    avisos.setText("Por favor ingrese su DNI.");
                } else if (fec2>=1) {
                    avisos.setText("Por favor ingrese una fecha válida.");
                } else if ("Reservada".equals(m1.deIdAMesa(this.getNroMesa()).getEstadoMesa())){
                avisos.setText("La mesa ya se encuentra reservada, seleccione otra.");
                }else{
                   
        
        nombreConfirmacion.setText(textoNombre.getText());
        dniConfirmacion.setText(textoDni.getText());
        fechaConfirmacion.setText(this.getFecha().format(x));
        mesaConfirmacion.setText(String.valueOf(this.getNroMesa()));
        estadoConfirmacion.setText(String.valueOf(rbActiva.isSelected()));
        confirmacion.setVisible(true);}
    }//GEN-LAST:event_crearReservaActionPerformed

    //vuelve a la pagina de inicio donde el mesero iniciara sesión
    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        background.removeAll();
        background.repaint();
        Inicio inicio=new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed
        
    //sale del programa
    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_apagarActionPerformed

    //actualiza el nombre del usuario, y vuelve a settear ocultos los campos de texto
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

    //Lo mismo que el método anterior pero a través de la tecla enter en el campo del nuevo nombre
    private void textoUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){

            MeseroData m1=new MeseroData(conexion);
            m1.cambiarNombre(Inicio.usuarioRegistrado(), textoUsuario1.getText());
            Inicio.almacenarUsuario(textoUsuario1.getText());
            textoUsuario1.setVisible(false);
            nomNu.setVisible(false);
            cambiarNombre2.setVisible(false);
            textoUsuario1.setText(null);
            eActualizar.setVisible(true);
            ocultar.setVisible(true);
        }
    }//GEN-LAST:event_textoUsuario1KeyPressed

    //llama a las variable que están ocultas en el constructor para realizar el cambio de nombre del usuario
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

    //Elimina la reserva por id o "numero de reserva"(el que se le da al cliente) y reestablece el estado de la mesa a Libre
    private void eliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReservaActionPerformed
        //DateTimeFormatter x = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
        nombreConfirmacion1.setText(textoNombre.getText());
        dniConfirmacion1.setText(textoDni.getText());
        //fechaConfirmacion1.setText(this.getFecha().format(x));
        //mesaConfirmacion1.setText(String.valueOf(this.getNroMesa()));
        confirmacion1.setVisible(true);
    }//GEN-LAST:event_eliminarReservaActionPerformed

    //Cambia la vigencia de una Reserva que no fue eliminada pero que ya no es válida
    private void darDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darDeBajaActionPerformed
        int idMesa=Integer.parseInt(textoId.getText());
        try {
        reservasLista=reservaData.obtenerReservas();  
        reservaData.actualizarEstado(rbActiva.isSelected(),"id_reserva",textoId.getText());
        
        if(rbActiva.isSelected()){mesaData.actualizarEstadoMesa("Reservada", idMesa);}
            else{
                for (Pedido p: pedidoData.obtenerPedidos()){
                    if(p.getMesa().getIdMesa()==idMesa){
                        mesaData.actualizarEstadoMesa("Atendida", p.getMesa().getIdMesa());
                        }else{mesaData.actualizarEstadoMesa("Libre", idMesa);}
                        }
                }
        this.limpiar();
        this.cargarTabla();
        JOptionPane.showMessageDialog(null,"Reserva actualizada.");
       } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VistaReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_darDeBajaActionPerformed
    
    //limpia los casilleros invocando al método limpiante
    private void limpiarCasilleros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCasilleros1ActionPerformed
        this.limpiar();
    }//GEN-LAST:event_limpiarCasilleros1ActionPerformed

    //Pasa a la vista de Balance
    private void botonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBalanceActionPerformed
        background.removeAll();
        VistaIngresos vistaBalance=new VistaIngresos();
        vistaBalance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonBalanceActionPerformed

    //Abre la ventada confirmacion para crear una reserva
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        confirmacion.dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed

    //si los datos son correctos el mesero registra la reserva
    private void botonAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar1ActionPerformed
        try {
            reservasLista=reservaData.obtenerReservas();
        //si todo es correcto crea una reserva y la guarda en la base de datos
        Reserva reserva=new Reserva(textoNombre.getText(),this.getDni(),this.getFecha(),mesaData.deIdAMesa(this.getNroMesa()),rbActiva.isSelected());
        reservaData.guardarReserva(reserva);
        //actualizamos el estado de la mesa para saber que está reservada
        mesaData.actualizarEstadoMesa("Reservada",this.getNroMesa());
        //Limpiamos los campos y avisamos que se creo la reserva
        confirmacion.setVisible(false);
        this.cargarTabla();
        this.limpiar();
        JOptionPane.showMessageDialog(null,"La reserva se creo exitosamente.");
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAceptar1ActionPerformed

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
    }//GEN-LAST:event_ocultarActionPerformed

    private void textoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario1ActionPerformed

    private void tablaReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservasMouseClicked
        DateTimeFormatter x = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        int filaSeleccionada = tablaReservas.getSelectedRow();
        if (filaSeleccionada != -1){
        textoId.setText(tablaReservas.getValueAt(filaSeleccionada, 0).toString());
        textoNombre.setText(tablaReservas.getValueAt(filaSeleccionada, 1).toString());
        textoDni.setText(tablaReservas.getValueAt(filaSeleccionada, 2).toString());
        calendario.setDate(Date.from(LocalDateTime.parse(tablaReservas.getValueAt(filaSeleccionada, 3).toString(),x).toInstant(ZoneOffset.UTC)));
        spinnerMesas.setValue(tablaReservas.getValueAt(filaSeleccionada, 4));
        if(reservaData.reservaDeLaMesa(spinnerMesas.getValue().toString()).isEstaVigente()){rbActiva.setSelected(true);rbInactiva.setSelected(false);}
            else{rbInactiva.setSelected(true);rbActiva.setSelected(false);}
        }    
    }//GEN-LAST:event_tablaReservasMouseClicked

    private void botonAceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAceptar2ActionPerformed

    private void botonAceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar3ActionPerformed
    try { 
        reservasLista=reservaData.obtenerReservas();
        reservaMesa=reservasLista.stream().filter(r->r.getIdReserva()==Integer.parseInt(textoId.getText())).collect(Collectors.toList());
        reservaMesa.forEach(r->{
        mesaData.actualizarEstadoMesa("Libre",r.getMesa().getIdMesa());});
        reservaData.borrarReserva(Integer.parseInt(textoId.getText()));
        this.limpiar();this.cargarTabla();avisos.setText("Reserva eliminada.");
        confirmacion1.dispose();
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAceptar3ActionPerformed

    private void rbInactivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInactivaActionPerformed
        rbActiva.setSelected(false);               
    }//GEN-LAST:event_rbInactivaActionPerformed

    private void rbActivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActivaActionPerformed
        rbInactiva.setSelected(false);
    }//GEN-LAST:event_rbActivaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JLabel avisos;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAceptar1;
    private javax.swing.JButton botonAceptar2;
    private javax.swing.JButton botonAceptar3;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonBalance;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JDialog confirmacion;
    private javax.swing.JDialog confirmacion1;
    private javax.swing.JButton crearReserva;
    private javax.swing.JButton darDeBaja;
    private javax.swing.JLabel dniConfirmacion;
    private javax.swing.JLabel dniConfirmacion1;
    private javax.swing.JLabel eActualizar;
    private javax.swing.JButton eliminarReserva;
    private javax.swing.JLabel emesa;
    private javax.swing.JLabel emesa1;
    private javax.swing.JLabel estadoConfirmacion;
    private javax.swing.JLabel etiquetaId;
    private javax.swing.JLabel etiquetaId2;
    private javax.swing.JLabel etiquetaId3;
    private javax.swing.JLabel etiquetaId4;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel fechaConfirmacion;
    private javax.swing.JLabel fechaConfirmacion1;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConfirmacion;
    private javax.swing.JLabel labelConfirmacion1;
    private javax.swing.JLabel labelReservas;
    private javax.swing.JButton limpiarCasilleros1;
    private javax.swing.JLabel mesaConfirmacion;
    private javax.swing.JLabel mesaConfirmacion1;
    private javax.swing.JLabel nomNu;
    private javax.swing.JLabel nombreConfirmacion;
    private javax.swing.JLabel nombreConfirmacion1;
    private javax.swing.JButton ocultar;
    private javax.swing.JRadioButton rbActiva;
    private javax.swing.JRadioButton rbInactiva;
    private javax.swing.JSpinner spinnerMesas;
    private javax.swing.JTable tablaReservas;
    private javax.swing.JTextField textoDni;
    private javax.swing.JTextField textoId;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
