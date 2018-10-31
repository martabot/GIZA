/*
 * 
 * 
 * 
 */
package vistas;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
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
    Conexion conexion;
    ReservaData r1;
    
    
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
        textoUsuario.setVisible(false);
        textoUsuario1.setVisible(false);
        nomOld.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
        
        //instanciamos la conexion
        try {
                conexion = new Conexion();
                conexion.getConexion();
                
                //cargamos la tabla con las reservas existentes
                this.cargarTabla();
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
        textoId.setText(null);
        textoNombre.setText(null);
        textoDni.setText(null);
        calendario.setDate(null);
        spinnerMesas.setValue(0);
        avisos.setText(null);
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
            
            //acomodamos el formato del horario para que se vea bonito en nuestra tabla
            DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss"); 
            
            //variables y conexiones
            ReservaData rd=new ReservaData(conexion);
            int x=rd.obtenerReservas().size();
            ArrayList<Reserva> lista=new ArrayList<>();
            lista=rd.obtenerReservas();
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
    /* intentamos comparar el dni para saber si es valido
    private boolean esEntero(String nosabemos){
        try {
            Integer.parseInt(nosabemos);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
    */
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
        textoUsuario = new javax.swing.JTextField();
        botonAjustes = new javax.swing.JButton();
        nomNu = new javax.swing.JLabel();
        nomOld = new javax.swing.JLabel();
        etiquetaId = new javax.swing.JLabel();
        textoId = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoDni = new javax.swing.JTextField();
        emesa = new javax.swing.JLabel();
        etiquetaId2 = new javax.swing.JLabel();
        etiquetaId3 = new javax.swing.JLabel();
        etiquetaId4 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        buscarReservaPor1 = new javax.swing.JButton();
        avisos = new javax.swing.JLabel();
        limpiarCasilleros1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        botonBalance = new javax.swing.JButton();
        eActualizar = new javax.swing.JLabel();
        ocultar = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        confirmacion.setAlwaysOnTop(true);
        confirmacion.setBackground(new java.awt.Color(253, 240, 240));
        confirmacion.setBounds(new java.awt.Rectangle(360, 188, 564, 490));

        jPanel1.setBackground(new java.awt.Color(255, 234, 223));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelConfirmacion.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        labelConfirmacion.setForeground(new java.awt.Color(153, 0, 51));
        labelConfirmacion.setText("CREAR RESERVA");
        jPanel1.add(labelConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 220, 30));

        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("NOMBRE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 60, 30));

        nombreConfirmacion.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(nombreConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 300, 30));

        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("DNI:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 60, 30));

        dniConfirmacion.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(dniConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 300, 30));

        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("FECHA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 60, 30));

        fechaConfirmacion.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(fechaConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 300, 30));

        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("MESA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, 30));

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
        labelReservas.setText("RESERVAS");
        background.add(labelReservas);
        labelReservas.setBounds(570, 190, 150, 40);

        darDeBaja.setBackground(new java.awt.Color(255, 237, 221));
        darDeBaja.setForeground(new java.awt.Color(102, 0, 0));
        darDeBaja.setText("DAR DE BAJA");
        darDeBaja.setActionCommand("");
        darDeBaja.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        darDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darDeBajaActionPerformed(evt);
            }
        });
        background.add(darDeBaja);
        darDeBaja.setBounds(780, 360, 120, 30);

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
        crearReserva.setBounds(780, 280, 120, 30);

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
        eliminarReserva.setBounds(780, 320, 120, 30);

        spinnerMesas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerMesas.setBorder(null);
        spinnerMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(spinnerMesas);
        spinnerMesas.setBounds(470, 390, 140, 30);

        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Logout-512.png"))); // NOI18N
        cerrarSesion.setContentAreaFilled(false);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        background.add(cerrarSesion);
        cerrarSesion.setBounds(240, 40, 30, 40);

        apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/salir.png"))); // NOI18N
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
        cambiarNombre2.setBounds(780, 60, 120, 30);

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
        textoUsuario1.setBounds(520, 60, 220, 30);

        textoUsuario.setForeground(new java.awt.Color(153, 0, 51));
        textoUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoUsuario);
        textoUsuario.setBounds(520, 20, 220, 30);

        botonAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/ajustes.png"))); // NOI18N
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
        nomNu.setBounds(400, 60, 110, 30);

        nomOld.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomOld.setForeground(new java.awt.Color(102, 0, 0));
        nomOld.setText("NOMBRE:");
        background.add(nomOld);
        nomOld.setBounds(400, 20, 100, 30);

        etiquetaId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId.setText("NRO:");
        background.add(etiquetaId);
        etiquetaId.setBounds(800, 210, 40, 17);

        textoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoId);
        textoId.setBounds(840, 210, 60, 18);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaNombre.setText("NOMBRE:");
        etiquetaNombre.setAlignmentY(0.0F);
        background.add(etiquetaNombre);
        etiquetaNombre.setBounds(380, 270, 90, 30);

        textoNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoNombre);
        textoNombre.setBounds(470, 269, 270, 30);

        textoDni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoDni);
        textoDni.setBounds(470, 310, 140, 30);

        emesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emesa.setForeground(new java.awt.Color(153, 0, 51));
        emesa.setText("MESA:");
        background.add(emesa);
        emesa.setBounds(380, 390, 90, 30);

        etiquetaId2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaId2.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId2.setText("* DNI sin puntos");
        background.add(etiquetaId2);
        etiquetaId2.setBounds(620, 320, 110, 15);

        etiquetaId3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId3.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId3.setText("FECHA:");
        background.add(etiquetaId3);
        etiquetaId3.setBounds(380, 350, 90, 30);

        etiquetaId4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId4.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId4.setText("DNI:");
        background.add(etiquetaId4);
        etiquetaId4.setBounds(380, 310, 90, 30);

        calendario.setDateFormatString("dd/MM/yyyy HH:mm:ss");
        background.add(calendario);
        calendario.setBounds(470, 350, 270, 30);

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

        avisos.setForeground(new java.awt.Color(102, 0, 0));
        avisos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(avisos);
        avisos.setBounds(470, 430, 290, 30);

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
        limpiarCasilleros1.setBounds(790, 430, 120, 30);

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
        jScrollPane1.setViewportView(tablaReservas);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(370, 482, 540, 180);

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

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Background.png"))); // NOI18N
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
        DateTimeFormatter x = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
        
        MesaData m1=new MesaData(conexion);
                
        //corroboramos que los datos sean validos mediante condicion if/else
        if (textoNombre.getText().equals("")) {
                    avisos.setText("Por favor ingrese su nombre.");
                } else if (textoDni.getText().equals("")) {
                    avisos.setText("Por favor ingrese su DNI.");
                } else if (fec2>1) {
                    avisos.setText("Por favor ingrese una fecha válida.");
                } else if ("Reservada".equals(m1.deIdAMesa(this.getNroMesa()).getEstadoMesa())){
                avisos.setText("La mesa ya se encuentra reservada, seleccione otra.");
                }else{
                   
        confirmacion.setUndecorated(true);
        confirmacion.setResizable(false);
        nombreConfirmacion.setText(textoNombre.getText());
        dniConfirmacion.setText(textoDni.getText());
        fechaConfirmacion.setText(this.getFecha().format(x));
        mesaConfirmacion.setText(String.valueOf(this.getNroMesa()));
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
        m1.cambiarNombre(textoUsuario.getText(), textoUsuario1.getText());
        Inicio.almacenarUsuario(textoUsuario1.getText());
        textoUsuario.setVisible(false);
        textoUsuario1.setVisible(false);
        nomOld.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        textoUsuario.setText(null);
        textoUsuario1.setText(null);
        eActualizar.setVisible(true);
        ocultar.setVisible(true);
        
    }//GEN-LAST:event_cambiarNombre2ActionPerformed

    //Lo mismo que el método anterior pero a través de la tecla enter en el campo del nuevo nombre
    private void textoUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){

            MeseroData m1=new MeseroData(conexion);
            m1.cambiarNombre(textoUsuario.getText(), textoUsuario1.getText());
            Inicio.almacenarUsuario(textoUsuario1.getText());
            textoUsuario.setVisible(false);
            textoUsuario1.setVisible(false);
            nomOld.setVisible(false);
            nomNu.setVisible(false);
            cambiarNombre2.setVisible(false);
            textoUsuario.setText(null);
            textoUsuario1.setText(null);
            eActualizar.setVisible(true);
            ocultar.setVisible(true);
        }
    }//GEN-LAST:event_textoUsuario1KeyPressed

    //llama a las variable que están ocultas en el constructor para realizar el cambio de nombre del usuario
    private void botonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAjustesActionPerformed
        textoUsuario.setVisible(true);
        textoUsuario1.setVisible(true);
        nomOld.setVisible(true);
        nomNu.setVisible(true);
        cambiarNombre2.setVisible(true);
    }//GEN-LAST:event_botonAjustesActionPerformed

    //Elimina la reserva por id o "numero de reserva"(el que se le da al cliente) y reestablece el estado de la mesa a Libre
    private void eliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReservaActionPerformed
       try { 
        ReservaData r1=new ReservaData(conexion);
        reservasLista=r1.obtenerReservas();
        reservaMesa=reservasLista.stream().filter(r->r.getIdReserva()==Integer.parseInt(textoId.getText())).collect(Collectors.toList());
        reservaMesa.forEach(r->{
        MesaData m1=new MesaData(conexion);
        m1.actualizarEstadoMesa("Libre",r.getMesa().getIdMesa());});
        r1.borrarReserva(Integer.parseInt(textoId.getText()));
        this.limpiar();this.cargarTabla();avisos.setText("Reserva eliminada.");
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarReservaActionPerformed

    //Cambia la vigencia de una Reserva que no fue eliminada pero que ya no es válida
    private void darDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darDeBajaActionPerformed
       try {
           
        ReservaData r1=new ReservaData(conexion);
        reservasLista=r1.obtenerReservas();  
        r1.cancelarReserva(Integer.parseInt(textoId.getText()));
        reservaMesa=reservasLista.stream().filter(r->r.getMesa().getIdMesa()==Integer.parseInt(textoId.getText())).collect(Collectors.toList());
        reservaMesa.forEach(r->{
        MesaData m1=new MesaData(conexion);
        m1.actualizarEstadoMesa("Libre",r.getMesa().getIdMesa());
        }); 
        ////incompleto
        tablaReservas.setDefaultRenderer (Object.class, new MiRender());
        this.limpiar();
        this.cargarTabla();
        avisos.setText("Reserva cancelada.");
       } catch (SQLException ex) {
            Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_darDeBajaActionPerformed
    
    //Selecciona en la lista de servas la que coincida con el numero de reserva que tiene el cliente
    private void buscarReservaPor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReservaPor1ActionPerformed
    
    }//GEN-LAST:event_buscarReservaPor1ActionPerformed

    //limpia los casilleros invocando al método limpiante
    private void limpiarCasilleros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCasilleros1ActionPerformed
        this.limpiar();
    }//GEN-LAST:event_limpiarCasilleros1ActionPerformed

    //Pasa a la vista de Balance
    private void botonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBalanceActionPerformed
        background.removeAll();
        VistaBalance vistaBalance=new VistaBalance();
        vistaBalance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonBalanceActionPerformed

    //Abre la ventada confirmacion para crear una reserva
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        confirmacion.setVisible(false);
    }//GEN-LAST:event_botonAceptarActionPerformed

    //si los datos son correctos el mesero registra la reserva
    private void botonAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar1ActionPerformed
        
        try {
                conexion = new Conexion();
                conexion.getConexion();
                ReservaData r1=new ReservaData(conexion);
                reservasLista=r1.obtenerReservas();
                MesaData m1=new MesaData(conexion);
            
        //si todo es correcto crea una reserva y la guarda en la base de datos
        Reserva reserva=new Reserva(textoNombre.getText(),this.getDni(),this.getFecha(),m1.deIdAMesa(this.getNroMesa()),true);
        r1.guardarReserva(reserva);
        //actualizamos el estado de la mesa para saber que está reservada
        m1.actualizarEstadoMesa("Reservada",this.getNroMesa());
        //Limpiamos los campos y avisamos que se creo la reserva
        confirmacion.setVisible(false);
        this.cargarTabla();
        this.limpiar();
        avisos.setText("La reserva se creo exitosamente.");
        } catch (ClassNotFoundException | SQLException ex) {
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JLabel avisos;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAceptar1;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonBalance;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton buscarReservaPor1;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JDialog confirmacion;
    private javax.swing.JButton crearReserva;
    private javax.swing.JButton darDeBaja;
    private javax.swing.JLabel dniConfirmacion;
    private javax.swing.JLabel eActualizar;
    private javax.swing.JButton eliminarReserva;
    private javax.swing.JLabel emesa;
    private javax.swing.JLabel etiquetaId;
    private javax.swing.JLabel etiquetaId2;
    private javax.swing.JLabel etiquetaId3;
    private javax.swing.JLabel etiquetaId4;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel fechaConfirmacion;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConfirmacion;
    private javax.swing.JLabel labelReservas;
    private javax.swing.JButton limpiarCasilleros1;
    private javax.swing.JLabel mesaConfirmacion;
    private javax.swing.JLabel nomNu;
    private javax.swing.JLabel nomOld;
    private javax.swing.JLabel nombreConfirmacion;
    private javax.swing.JButton ocultar;
    private javax.swing.JSpinner spinnerMesas;
    private javax.swing.JTable tablaReservas;
    private javax.swing.JTextField textoDni;
    private javax.swing.JTextField textoId;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
