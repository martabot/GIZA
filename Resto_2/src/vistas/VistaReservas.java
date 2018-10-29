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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author Muñeca Brava
 */
public class VistaReservas extends javax.swing.JFrame {
    //Declaracion de atributos encapsulados
    private int idReserva;
    private String nombre;
    private int dni;
    private LocalDate fecha;
    private int nroMesa;
    private List<Reserva> reservaMesa;
    private ArrayList<Reserva> reservasLista=new ArrayList<>();
    
    
    //Constructor
    public VistaReservas(){
        
        //propiedades de la pantalla completa
        this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        
        initComponents();
        
        //campos ocultos que aparecen al ser llamados por los ajustes del usuario
        textoUsuario.setVisible(false);
        textoUsuario1.setVisible(false);
        nomOld.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
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

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
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
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        botonPrecios = new javax.swing.JButton();
        botonMesas = new javax.swing.JButton();
        botonReservas = new javax.swing.JButton();
        botonPedidos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mostrarReservas = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("RESERVAS");
        background.add(jLabel1);
        jLabel1.setBounds(570, 190, 150, 40);

        mostrarReservas.setBackground(new java.awt.Color(255, 237, 221));
        mostrarReservas.setForeground(new java.awt.Color(102, 0, 0));
        mostrarReservas.setText("MOSTRAR RESERVAS");
        mostrarReservas.setActionCommand("");
        mostrarReservas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        mostrarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarReservasActionPerformed(evt);
            }
        });
        background.add(mostrarReservas);
        mostrarReservas.setBounds(380, 470, 170, 21);

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
        cambiarNombre2.setBounds(770, 60, 120, 30);

        textoUsuario1.setForeground(new java.awt.Color(153, 0, 51));
        textoUsuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        textoId.setBounds(840, 210, 60, 19);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaNombre.setText("NOMBRE:");
        etiquetaNombre.setAlignmentY(0.0F);
        background.add(etiquetaNombre);
        etiquetaNombre.setBounds(380, 270, 90, 30);

        textoNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
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
        limpiarCasilleros1.setBounds(790, 440, 120, 30);

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
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaReservas.setSelectionBackground(new java.awt.Color(153, 0, 51));
        tablaReservas.setSelectionForeground(new java.awt.Color(254, 247, 230));
        jScrollPane1.setViewportView(tablaReservas);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(370, 502, 540, 160);

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

    //no se puede borrar, no hace nada
    private void botonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservasActionPerformed
        
    }//GEN-LAST:event_botonReservasActionPerformed

    //Pasa a vista Pedidos
    private void botonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidosActionPerformed
        background.removeAll();
        VistaPedidos vistaPedidos=new VistaPedidos();
        vistaPedidos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPedidosActionPerformed

    //Muestra las reservas en la tabla
    private void mostrarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarReservasActionPerformed
        
        
        try {
                Conexion conexion = new Conexion();
                conexion.getConexion();
                ReservaData r1=new ReservaData(conexion);
                //asignamos el Arraylist que devuelve obtenerReservas a nuesta lista para llenar la tabla
                reservasLista=r1.obtenerReservas();
                
                //Llamamos a un metodo que cree la matriz con los valores que llenan la tabla
                mostrar();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        //el problema no es null, al menos no acá
        catch(NullPointerException ex){
            System.out.println("null"+ex);
        }
    }
        
    //nuestro metodo utilizará un iterador para recorrer el tamaño de la lista y asi avanzar en cada fila de la tabla
    //de esta forma asigna a cada fila y columna el valor de cada reserva
    public void mostrar(){
        String matriz [][]= new String [reservasLista.size()][5];
                for (int i=0; i > reservasLista.size();i++){
                    matriz [i][0]=String.valueOf(reservasLista.get(i).getIdReserva());
                    matriz [i][1]=reservasLista.get(i).getNombreCliente();
                    matriz [i][2]=String.valueOf(reservasLista.get(i).getDniCliente());
                    matriz [i][3]=String.valueOf(reservasLista.get(i).getFechaReserva());
                    matriz [i][4]=String.valueOf(reservasLista.get(i).getMesa().getIdMesa());
                }
            tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "RESERVA", "NOMBRE", "DNI", "FECHA", "MESA"
            }
        ));
    }//GEN-LAST:event_mostrarReservasActionPerformed

    //Creamos una reserva con los datos insertados en los campos de texto y avisamos si algo en el proceso está saliendo mal
    private void crearReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearReservaActionPerformed
        //Seteamos el campo dni
        this.setDni(textoDni.getText());
        //seteamos el campo de spinner mesas
        this.setNroMesa(spinnerMesas.getValue().toString());
        //Seteamos el sql Date como un util localDate para la fecha que obtiene el calendario
        java.util.Date utilStartDate = calendario.getDate();
        java.sql.Date fec = new java.sql.Date(utilStartDate.getTime());
        this.setFecha(fec.toLocalDate());
        //comparamos con la fecha de hoy para saber si es una fecha de reserva válida
        int fec2=now().compareTo(fec.toLocalDate());
        
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
            MesaData m1=new MesaData(conexion);
            ReservaData r1=new ReservaData(conexion);
                
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
                    //si todo es correcto crea una reserva y la guarda en la base de datos
                Reserva reserva=new Reserva(textoNombre.getText(),this.getDni(),this.getFecha(),m1.deIdAMesa(this.getNroMesa()),true);
                r1.guardarReserva(reserva);
                    //actualizamos el estado de la mesa para saber que está reservada
                m1.actualizarEstadoMesa("Reservada",this.getNroMesa());
                //if (r1.obtenerReservas().contains(reserva)){ avisos.setText("La reserva se creo exitosamente");this.limpiar();}
                //else{avisos.setText("Error al crear la reserva");}
                    //Limpiamos los campos y avisamos que se creo la reserva
                this.limpiar();avisos.setText("La reserva se creo exitosamente.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

    //Lo mismo que el método anterior pero a través de la tecla enter en el campo del nuevo nombre
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

    //llama a las variable que están ocultas en el constructor para realizar el cambio de nombre del usuario
    private void botonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAjustesActionPerformed
        textoUsuario.setVisible(true);
        textoUsuario1.setVisible(true);
        nomOld.setVisible(true);
        nomNu.setVisible(true);
        cambiarNombre2.setVisible(true);
    }//GEN-LAST:event_botonAjustesActionPerformed

    //no se puede borrar, no hace nada
    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        
    }//GEN-LAST:event_textoNombreActionPerformed

    //Elimina la reserva por id o "numero de reserva" y reestablece el estado de la mesa a Libre
    private void eliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReservaActionPerformed
        try {
                Conexion conexion = new Conexion();
                conexion.getConexion();
                ReservaData r1 = new ReservaData(conexion);
                reservaMesa=r1.obtenerReservas().stream().filter(r->r.getMesa().getIdMesa()==Integer.parseInt(textoId.getText())).collect(Collectors.toList());
                reservaMesa.forEach(r->{
                MesaData m1=new MesaData(conexion);
                m1.actualizarEstadoMesa("Libre",r.getMesa().getIdMesa());});
                r1.borrarReserva(Integer.parseInt(textoId.getText()));
                avisos.setText("Reserva eliminada.");
                this.limpiar();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarReservaActionPerformed

    //Cambia la vigencia de una Reserva que no fue eliminada voluntariamente o cuando la fecha ya no sea valida
    private void darDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darDeBajaActionPerformed
        try {
                Conexion conexion = new Conexion();
                conexion.getConexion();
                ReservaData r1 = new ReservaData(conexion);
                r1.cancelarReserva(Integer.parseInt(textoId.getText()));
                reservaMesa=r1.obtenerReservas().stream().filter(r->r.getMesa().getIdMesa()==Integer.parseInt(textoId.getText())).collect(Collectors.toList());
                reservaMesa.forEach(r->{
                MesaData m1=new MesaData(conexion);
                m1.actualizarEstadoMesa("Libre",r.getMesa().getIdMesa());});
                avisos.setText("Reserva cancelada.");
                this.limpiar();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_darDeBajaActionPerformed
    
    //Selecciona de la lista de reservas la fila que coincida con el número de reserva buscado
    private void buscarReservaPor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReservaPor1ActionPerformed
        
        //Para eso cambiamos el color de background y foreground de la fila a los colores de seleccion
        
        
        
    }//GEN-LAST:event_buscarReservaPor1ActionPerformed

    //no se puede borrar, no hace nada
    private void limpiarCasilleros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCasilleros1ActionPerformed
        
    }//GEN-LAST:event_limpiarCasilleros1ActionPerformed

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
    private javax.swing.JButton apagar;
    private javax.swing.JLabel avisos;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton buscarReservaPor1;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton crearReserva;
    private javax.swing.JButton darDeBaja;
    private javax.swing.JButton eliminarReserva;
    private javax.swing.JLabel emesa;
    private javax.swing.JLabel etiquetaId;
    private javax.swing.JLabel etiquetaId2;
    private javax.swing.JLabel etiquetaId3;
    private javax.swing.JLabel etiquetaId4;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarCasilleros1;
    private javax.swing.JButton mostrarReservas;
    private javax.swing.JLabel nomNu;
    private javax.swing.JLabel nomOld;
    private javax.swing.JSpinner spinnerMesas;
    private javax.swing.JTable tablaReservas;
    private javax.swing.JTextField textoDni;
    private javax.swing.JTextField textoId;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
