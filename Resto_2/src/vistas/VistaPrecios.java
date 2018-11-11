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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author Muñeca Brava
 */
public class VistaPrecios extends javax.swing.JFrame {
    //atributos encapsulados
    private Fuentes fuente;
    private Conexion conexion;
    private ProductoData productoData;
    
    //constructor
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
        textoUsuario1.setVisible(false);
        nomNu.setVisible(false);
        cambiarNombre2.setVisible(false);
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
        
        //Instanciamos la conexion 
        try {
            conexion = new Conexion();
            conexion.getConexion();
            productoData = new ProductoData(conexion);
            //vamos a cargar los datos que hay en la db de la tabla productos a nuestra lista de precios
            this.cargarTabla();
                
        } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    //Carga la tabla con los datos
    private void cargarTabla(){
        DefaultTableModel modelo=new DefaultTableModel();
            tablaPrecios.setModel(modelo);
            
            modelo.addColumn("CODIGO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("PRECIO");
            
            ProductoData pd=new ProductoData(conexion);
            int x=pd.obtenerProductos().size();
            ArrayList<Producto> lista=new ArrayList<>();
            lista=pd.obtenerProductos();
            for (int b=0;b<x;b++){
            Object [] filas = new Object[3];
            Producto nuevo=lista.get(b);
            filas  [0]=nuevo.getIdProducto();
            filas  [1]=nuevo.getNombreProducto();
            filas  [2]=nuevo.getPrecio();
            modelo.addRow(filas);
            }
    }
    
    //limpia los campos de texto
    private void limpiar(){
        textoNombre.setText(null);
        textoMonto.setText("00.0");
        textoId.setText(null);
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
        labelPrecios = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrecios = new javax.swing.JTable();
        agregarProducto = new javax.swing.JButton();
        borrarProducto = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        nomNu = new javax.swing.JLabel();
        cambiarNombre2 = new javax.swing.JButton();
        botonAjustes = new javax.swing.JButton();
        textoUsuario1 = new javax.swing.JTextField();
        botonBalance = new javax.swing.JButton();
        textoId = new javax.swing.JTextField();
        etiquetaId = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaId4 = new javax.swing.JLabel();
        textoMonto = new javax.swing.JTextField();
        ph = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        ocultar = new javax.swing.JButton();
        eActualizar = new javax.swing.JLabel();
        avisos = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(null);

        botonPrecios.setBackground(new java.awt.Color(0, 0, 0));
        botonPrecios.setFont(new java.awt.Font("Luisa", 1, 36)); // NOI18N
        botonPrecios.setForeground(new java.awt.Color(238, 140, 60));
        botonPrecios.setText("PRECIOS");
        botonPrecios.setToolTipText("");
        botonPrecios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 3, true));
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

        actualizar.setBackground(new java.awt.Color(255, 237, 221));
        actualizar.setForeground(new java.awt.Color(102, 0, 0));
        actualizar.setText("ACTUALIZAR");
        actualizar.setActionCommand("");
        actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        background.add(actualizar);
        actualizar.setBounds(380, 450, 120, 30);

        tablaPrecios.setBackground(new java.awt.Color(254, 247, 230));
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
                "CODIGO", "NOMBRE", "PRECIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
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
        tablaPrecios.setGridColor(new java.awt.Color(194, 65, 65));
        tablaPrecios.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tablaPrecios.setSelectionForeground(new java.awt.Color(254, 247, 230));
        tablaPrecios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPreciosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPrecios);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(520, 350, 390, 310);

        agregarProducto.setBackground(new java.awt.Color(255, 237, 221));
        agregarProducto.setForeground(new java.awt.Color(102, 0, 0));
        agregarProducto.setText("AGREGAR");
        agregarProducto.setActionCommand("");
        agregarProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });
        background.add(agregarProducto);
        agregarProducto.setBounds(380, 380, 120, 30);

        borrarProducto.setBackground(new java.awt.Color(255, 237, 221));
        borrarProducto.setForeground(new java.awt.Color(102, 0, 0));
        borrarProducto.setText("BORRAR");
        borrarProducto.setActionCommand("");
        borrarProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        borrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarProductoActionPerformed(evt);
            }
        });
        background.add(borrarProducto);
        borrarProducto.setBounds(380, 520, 120, 30);

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

        nomNu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomNu.setForeground(new java.awt.Color(102, 0, 0));
        nomNu.setText("NUEVO NOMBRE:");
        background.add(nomNu);
        nomNu.setBounds(390, 50, 130, 30);

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

        botonAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png"))); // NOI18N
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
        botonBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBalanceActionPerformed(evt);
            }
        });
        background.add(botonBalance);
        botonBalance.setBounds(20, 600, 250, 70);

        textoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoId);
        textoId.setBounds(840, 210, 60, 19);

        etiquetaId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId.setText("NRO:");
        background.add(etiquetaId);
        etiquetaId.setBounds(800, 210, 50, 20);

        textoNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoNombre);
        textoNombre.setBounds(490, 270, 270, 30);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaNombre.setText("NOMBRE:");
        etiquetaNombre.setAlignmentY(0.0F);
        background.add(etiquetaNombre);
        etiquetaNombre.setBounds(400, 270, 90, 30);

        etiquetaId4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId4.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId4.setText("PRECIO:    $");
        background.add(etiquetaId4);
        etiquetaId4.setBounds(400, 310, 90, 30);

        textoMonto.setText("00.0");
        textoMonto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoMonto);
        textoMonto.setBounds(490, 310, 140, 30);

        ph.setForeground(new java.awt.Color(232, 232, 231));
        background.add(ph);
        ph.setBounds(370, 200, 10, 10);

        limpiar.setBackground(new java.awt.Color(255, 237, 221));
        limpiar.setForeground(new java.awt.Color(102, 0, 0));
        limpiar.setText("LIMPIAR");
        limpiar.setActionCommand("");
        limpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        background.add(limpiar);
        limpiar.setBounds(380, 590, 120, 30);

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
        eActualizar.setBounds(490, 30, 340, 15);
        background.add(avisos);
        avisos.setBounds(490, 240, 300, 14);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Background.png"))); // NOI18N
        imagen.setAlignmentY(0.0F);
        imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductos(evt);
            }
        });
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
    
    //Pasa a la vista de Mesas
    private void botonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMesasActionPerformed
        background.removeAll();
        VistaMesas vistaMesas=new VistaMesas();
        vistaMesas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonMesasActionPerformed

    //Pasa a la vista de Reservas
    private void botonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservasActionPerformed
        background.removeAll();
        VistaReservas vistaReservas=new VistaReservas();
        vistaReservas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonReservasActionPerformed

    //Pasa a la vista de pedidos
    private void botonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidosActionPerformed
        background.removeAll();
        VistaPedidos vistaPedidos=new VistaPedidos();
        vistaPedidos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPedidosActionPerformed

    //actualiza la informacion de un producto con los datos cargados en cada campo
    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        int filaSeleccionada = tablaPrecios.getSelectedRow();
        if (filaSeleccionada != -1){
            productoData.actualizarIdProducto(Integer.parseInt(tablaPrecios.getValueAt(filaSeleccionada, 0).toString()), Integer.parseInt(textoId.getText()));
        tablaPrecios.setValueAt(textoId.getText(), filaSeleccionada, 0);
            productoData.actualizarNombreProducto(Integer.parseInt(tablaPrecios.getValueAt(filaSeleccionada, 0).toString()), textoNombre.getText());
        tablaPrecios.setValueAt(textoNombre.getText(), filaSeleccionada, 1);
            productoData.actualizarPrecioProducto(Integer.parseInt(tablaPrecios.getValueAt(filaSeleccionada, 0).toString()), Double.valueOf(textoMonto.getText()));
        tablaPrecios.setValueAt(textoMonto.getText(), filaSeleccionada, 2);
         limpiar();
         JOptionPane.showMessageDialog(null,"La información del producto se actualizó con éxito");
    }           
         
     
       
    }//GEN-LAST:event_actualizarActionPerformed

    //agrega un producto a la db y a la tabla
    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoActionPerformed
        ProductoData pd=new ProductoData(conexion);
        Producto p1=new Producto(textoNombre.getText(),Double.parseDouble(textoMonto.getText()));
        pd.guardarProducto(p1);
        this.cargarTabla();
        this.limpiar();
    }//GEN-LAST:event_agregarProductoActionPerformed

    //borra un producto de la db por medio de su id
    private void borrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarProductoActionPerformed
        try {
            ProductoData pd=new ProductoData(conexion);
            pd.borrarProducto(Integer.parseInt(textoId.getText()));
            this.cargarTabla();
            this.limpiar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaPrecios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_borrarProductoActionPerformed

    //cierra sesión y vuelve al inicio
    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        background.removeAll();
        background.repaint();
        Inicio inicio=new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    //Cierra el programa
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

   //Actualizar el nombre del mesero
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
 
    //Permite actualizar el nombre del mesero
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

    //Actualiza el nombre del usuario apretando enter en el segundo campo de texto
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

    //Pasa a vista de balance
    private void botonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBalanceActionPerformed
        background.removeAll();
        VistaIngresos vistaBalance=new VistaIngresos();
        vistaBalance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonBalanceActionPerformed

    //Este metodo no existe
    private void tablaPreciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPreciosMouseClicked
      int filaSeleccionada = tablaPrecios.getSelectedRow();
        if (filaSeleccionada != -1){
        textoId.setText(tablaPrecios.getValueAt(filaSeleccionada, 0).toString());
        textoNombre.setText(tablaPrecios.getValueAt(filaSeleccionada, 1).toString());
        textoMonto.setText(tablaPrecios.getValueAt(filaSeleccionada, 2).toString());
        } 
    }//GEN-LAST:event_tablaPreciosMouseClicked

    //Limpia los casilleros
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    //No hace nada, no se puede borrar
    private void jtProductos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductos
        
    }//GEN-LAST:event_jtProductos

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
    }//GEN-LAST:event_ocultarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregarProducto;
    private javax.swing.JLabel avisos;
    private javax.swing.JPanel background;
    private javax.swing.JButton borrarProducto;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonBalance;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JLabel eActualizar;
    private javax.swing.JLabel etiquetaId;
    private javax.swing.JLabel etiquetaId4;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPrecios;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel nomNu;
    private javax.swing.JButton ocultar;
    private javax.swing.JLabel ph;
    private javax.swing.JTable tablaPrecios;
    private javax.swing.JTextField textoId;
    private javax.swing.JTextField textoMonto;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
