/*
 * 
 * 
 * 
 */
package vistas;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
public class VistaPedidos extends javax.swing.JFrame {
    //atributos encapsulados
    private Conexion conexion;
    private Fuentes fuente;
    private Double subtotal;
    private ProductoData productoData;
    private PedidoData pedidoData;
    private ComandaData comandaData;
    private ArrayList<Producto> productos;
    private DefaultTableModel modelo;
    private MesaData mesaData;
    private MeseroData meseroData;
    private ReservaData reservaData;
    private int idPedido;
    private int idMesa;
    
    //construcutor 
    public VistaPedidos() {
        //inicializamos nuestro contador de subtotal
        this.subtotal = 00.0;
        
        //popiedades de la pantalla completa
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
            productos = (ArrayList<Producto>) productoData.obtenerProductos();
            pedidoData=new PedidoData(conexion);
            comandaData=new ComandaData(conexion);
            mesaData=new MesaData(conexion);
            meseroData=new MeseroData(conexion);
            reservaData=new ReservaData(conexion);
            
            modelo=new DefaultTableModel();
            //agrega las columnas con las que vamos a trabajar
                modelo.addColumn("CANTIDAD");
                modelo.addColumn("PRODUCTO");
                modelo.addColumn("SUB-TOTAL");
            
            //cargamos los prodcutos disponibles en el combobox
            cargarCbProductos();
            
            //Iniciamos con una mesa pre-cargada
            spinnerMesas.setValue(VistaMesas.getMesaActual());
            VistaMesas.setMesaActual(0);
            idMesa=Integer.valueOf(spinnerMesas.getValue().toString());
            if(idMesa!=0){textoId.setText(String.valueOf(pedidoData.seleccionarPedidoPor("id_mesa", idMesa).getIdPedido()));
            setIdPedido();
            atenderMesas();
            }
        } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Background.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido() {
        this.idPedido = Integer.parseInt(textoId.getText());
    }
    
    //llena la tabla con informacion sobre el pedido
    private void cargarTabla(){
        limpiarTabla();
        setIdPedido();
        try {
            try {
                //nos ayuda a editar una tabla con modelo personalizado
                tablaPedido.setModel(modelo);            
                
                //preparamos una lista con las comandas del pedido seleccionado
                List<Comanda> lista=new ArrayList<>();
                lista=comandaData.selccionarComandasPorPedido(getIdPedido());
                
                //primera condicion, el pedido podría no existir
                if(pedidoData.seleccionarPedidoPor("id_pedido",getIdPedido())==null){
                    JOptionPane.showMessageDialog(null, "La orden no existe o se ha eliminado");}
                
                //el pedido podria haber sido cobrado, por lo que no debemos perjudicar la cuenta que almacena
                if(pedidoData.seleccionarPedidoPor("id_pedido",getIdPedido()).getCobrada()){
                    JOptionPane.showMessageDialog(null, "El predido ya fue cobrado, información en la pestaña de ingresos");
                } else {
                
                //si el pedido tiene comandas activas las lista en nuestra tabla
                for (Comanda c: lista){
                    modelo.addRow(new Object[]{c.getCantidad(),c.getProducto().getNombreProducto(),c.getCantidad()*c.getProducto().getPrecio()});
                    
                    //actualiza el subtotal y lo convierte en la suma de subtotales que luego serán la cuenta
                    subtotal=subtotal+(c.getProducto().getPrecio())*c.getCantidad();
                }
               } 
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VistaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Asigna el subtotal a la cuenta y lo muesta en su campo de texto, lo limpia para poder volver a cargarlo con otros datos
            pedidoData.actualizarCuentaDePedido(getIdPedido(),subtotal);
            textoCuenta.setText(String.valueOf(subtotal));
            subtotal=00.0;
            
            //nos muestra en el spinner la mesa del pedido que estamos seleccionando
            spinnerMesas.setValue(pedidoData.seleccionarPedidoPor("id_pedido",getIdPedido()).getMesa().getIdMesa()); 
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void limpiarTabla(){
        int x= modelo.getRowCount()-1;
        for (int i=x;i>=0;i--){
            modelo.removeRow(i);
        }
    }

    //pone todos nuestros campos en sus valores más virgenes
    private void limpiar(){
        textoId.setText(null);
        spinnerMesas.setValue(0);
        avisos.setText(null);
        spinnerCantidad.setValue(0);
        idProducto.setText(null);
        textoPagaCon.setText(null);
        textoCambio.setText(null);
        textoCuenta.setText(null);
        subtotal=00.0;
        limpiarTabla();
    }
    
    //Metodo para caragar los productos disponibles en el combobox
    public void cargarCbProductos(){
        productos.forEach((p) -> {
            cbProductos.addItem(p.getNombreProducto());
        });
    }
    
    //nuestro amigo identifica la mesa que se quiere seleccionar y segun las condiciones realizara diferentes acciones
    private void atenderMesas(){
        //asignamos la mesa con la que vamos a trabajar
        idMesa=Integer.valueOf(spinnerMesas.getValue().toString());
        String estadoMesa= mesaData.deIdAMesa(idMesa).getEstadoMesa();
        if ("Reservada".equals(estadoMesa) || "Libre".equals(estadoMesa)) {
            try {
                
                Pedido pedido=new Pedido(mesaData.deIdAMesa(idMesa),
                        meseroData.deUsuarioAMesero(Inicio.usuarioRegistrado()),LocalDateTime.now(),0.0,false);
                
                pedidoData.guardarPedido(pedido);
                
                if ("Reservada".equals(estadoMesa)){
                    reservaData.cancelarReserva("id_mesa", spinnerMesas.getValue().toString());
                }
                
                textoId.setText(String.valueOf(pedidoData.obtenerPedidos().get(pedidoData.obtenerPedidos().size()-1).getIdPedido()));
                setIdPedido();
                mesaData.actualizarEstadoMesa("Ocupada", idMesa);
                JOptionPane.showMessageDialog(null, "Agregue un producto para continuar");
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(VistaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if ("Ocupada".equals(estadoMesa)||"Atendida".equals(estadoMesa)){
            
            try {
                if (Inicio.usuarioRegistrado().equals(pedidoData.seleccionarPedidoPor("id_mesa",idMesa).getMesero().getNombreMesero())||"Ocupada".equals(estadoMesa)){
                    avisos.setText("Estado de la mesa: "+estadoMesa);
                    idPedido=pedidoData.seleccionarPedidoPor("id_mesa",idMesa).getIdPedido();
                    textoId.setText(String.valueOf(idPedido));
                    cargarTabla();
                } else {JOptionPane.showMessageDialog(null, "Mesa "+idMesa+" es atendida por otro usuario.");}
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VistaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        nomNu = new javax.swing.JLabel();
        textoUsuario1 = new javax.swing.JTextField();
        cambiarNombre2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();
        labelPedidos = new javax.swing.JLabel();
        limpiarCampos = new javax.swing.JButton();
        textoId = new javax.swing.JTextField();
        etiquetaId = new javax.swing.JLabel();
        emesa = new javax.swing.JLabel();
        spinnerMesas = new javax.swing.JSpinner();
        buscarPedido = new javax.swing.JButton();
        quitarProducto = new javax.swing.JButton();
        agregarProducto = new javax.swing.JButton();
        cobrarPedido = new javax.swing.JButton();
        ePagaCon1 = new javax.swing.JLabel();
        textoCuenta = new javax.swing.JTextField();
        botonBalance = new javax.swing.JButton();
        atenderMesa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cancelarPedido1 = new javax.swing.JButton();
        cbProductos = new javax.swing.JComboBox<>();
        ocultar = new javax.swing.JButton();
        eActualizar = new javax.swing.JLabel();
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
        background.add(botonPedidos);
        botonPedidos.setBounds(20, 400, 250, 70);

        eTomarPedido.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        eTomarPedido.setForeground(new java.awt.Color(153, 0, 51));
        eTomarPedido.setText("TOMAR PEDIDO");
        background.add(eTomarPedido);
        eTomarPedido.setBounds(390, 250, 190, 14);

        spinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerCantidad.setBorder(null);
        spinnerCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(spinnerCantidad);
        spinnerCantidad.setBounds(420, 380, 60, 30);

        avisos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        avisos.setForeground(new java.awt.Color(204, 0, 51));
        avisos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(avisos);
        avisos.setBounds(420, 310, 440, 30);

        eAgregarProducto.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        eAgregarProducto.setForeground(new java.awt.Color(153, 0, 51));
        eAgregarProducto.setText("AGREGAR AL PEDIDO");
        background.add(eAgregarProducto);
        eAgregarProducto.setBounds(390, 340, 190, 30);

        eCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eCantidad.setForeground(new java.awt.Color(153, 0, 51));
        eCantidad.setText("Cant:");
        background.add(eCantidad);
        eCantidad.setBounds(380, 380, 40, 30);

        eIdProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eIdProducto.setForeground(new java.awt.Color(153, 0, 51));
        eIdProducto.setText("Menú:");
        background.add(eIdProducto);
        eIdProducto.setBounds(500, 380, 70, 30);

        idProducto.setBackground(new java.awt.Color(255, 236, 223));
        idProducto.setForeground(new java.awt.Color(255, 236, 223));
        idProducto.setBorder(null);
        background.add(idProducto);
        idProducto.setBounds(710, 380, 30, 30);

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
        textoPagaCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recualculando(evt);
            }
        });
        background.add(textoPagaCon);
        textoPagaCon.setBounds(810, 490, 90, 30);

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
        nomNu.setBounds(420, 50, 100, 30);

        textoUsuario1.setForeground(new java.awt.Color(153, 0, 51));
        textoUsuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoUsuario1KeyPressed(evt);
            }
        });
        background.add(textoUsuario1);
        textoUsuario1.setBounds(520, 50, 220, 30);

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
                {null, null, null}
            },
            new String [] {
                "CANTIDAD", "PRODUCTO", "SUB-TOTAL"
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
        jScrollPane1.setViewportView(tablaPedido);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(380, 430, 320, 210);

        labelPedidos.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        labelPedidos.setForeground(new java.awt.Color(153, 0, 51));
        labelPedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPedidos.setText("PEDIDOS");
        background.add(labelPedidos);
        labelPedidos.setBounds(360, 200, 560, 40);

        limpiarCampos.setBackground(new java.awt.Color(255, 237, 221));
        limpiarCampos.setForeground(new java.awt.Color(102, 0, 0));
        limpiarCampos.setText("LIMPIAR CAMPOS");
        limpiarCampos.setToolTipText("");
        limpiarCampos.setActionCommand("");
        limpiarCampos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposActionPerformed(evt);
            }
        });
        background.add(limpiarCampos);
        limpiarCampos.setBounds(790, 270, 120, 30);

        textoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoId);
        textoId.setBounds(840, 210, 60, 18);

        etiquetaId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaId.setForeground(new java.awt.Color(153, 0, 51));
        etiquetaId.setText("NRO:");
        background.add(etiquetaId);
        etiquetaId.setBounds(800, 210, 40, 17);

        emesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emesa.setForeground(new java.awt.Color(153, 0, 51));
        emesa.setText("MESA:");
        background.add(emesa);
        emesa.setBounds(380, 270, 70, 30);

        spinnerMesas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerMesas.setBorder(null);
        spinnerMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(spinnerMesas);
        spinnerMesas.setBounds(440, 270, 130, 30);

        buscarPedido.setBackground(new java.awt.Color(255, 237, 221));
        buscarPedido.setForeground(new java.awt.Color(102, 0, 0));
        buscarPedido.setText("BUSCAR");
        buscarPedido.setActionCommand("");
        buscarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        buscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPedidoActionPerformed(evt);
            }
        });
        background.add(buscarPedido);
        buscarPedido.setBounds(800, 230, 100, 20);

        quitarProducto.setBackground(new java.awt.Color(255, 237, 221));
        quitarProducto.setForeground(new java.awt.Color(102, 0, 0));
        quitarProducto.setText("QUITAR");
        quitarProducto.setToolTipText("");
        quitarProducto.setActionCommand("");
        quitarProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        quitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarProductoActionPerformed(evt);
            }
        });
        background.add(quitarProducto);
        quitarProducto.setBounds(620, 650, 70, 20);

        agregarProducto.setBackground(new java.awt.Color(255, 237, 221));
        agregarProducto.setForeground(new java.awt.Color(102, 0, 0));
        agregarProducto.setText("AGREGAR");
        agregarProducto.setToolTipText("");
        agregarProducto.setActionCommand("");
        agregarProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });
        background.add(agregarProducto);
        agregarProducto.setBounds(770, 380, 110, 30);

        cobrarPedido.setBackground(new java.awt.Color(255, 237, 221));
        cobrarPedido.setForeground(new java.awt.Color(102, 0, 0));
        cobrarPedido.setText("COBRAR");
        cobrarPedido.setToolTipText("");
        cobrarPedido.setActionCommand("");
        cobrarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        cobrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrarPedidoActionPerformed(evt);
            }
        });
        background.add(cobrarPedido);
        cobrarPedido.setBounds(760, 570, 110, 30);

        ePagaCon1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ePagaCon1.setForeground(new java.awt.Color(153, 0, 51));
        ePagaCon1.setText("CUENTA:");
        background.add(ePagaCon1);
        ePagaCon1.setBounds(730, 450, 80, 30);

        textoCuenta.setForeground(new java.awt.Color(153, 0, 51));
        textoCuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.add(textoCuenta);
        textoCuenta.setBounds(810, 450, 90, 30);

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

        atenderMesa.setBackground(new java.awt.Color(255, 237, 221));
        atenderMesa.setForeground(new java.awt.Color(102, 0, 0));
        atenderMesa.setText("ATENDER");
        atenderMesa.setToolTipText("");
        atenderMesa.setActionCommand("");
        atenderMesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        atenderMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenderMesaActionPerformed(evt);
            }
        });
        background.add(atenderMesa);
        atenderMesa.setBounds(590, 270, 110, 30);

        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Seleccione un producto para quitar");
        background.add(jLabel1);
        jLabel1.setBounds(380, 650, 240, 14);

        cancelarPedido1.setBackground(new java.awt.Color(255, 237, 221));
        cancelarPedido1.setForeground(new java.awt.Color(102, 0, 0));
        cancelarPedido1.setText("CANCELAR PEDIDO");
        cancelarPedido1.setToolTipText("");
        cancelarPedido1.setActionCommand("");
        cancelarPedido1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 102), new java.awt.Color(204, 0, 51), new java.awt.Color(102, 0, 0)));
        cancelarPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPedido1ActionPerformed(evt);
            }
        });
        background.add(cancelarPedido1);
        cancelarPedido1.setBounds(740, 640, 150, 20);

        cbProductos.setForeground(new java.awt.Color(102, 102, 102));
        cbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbProductos.setBorder(null);
        cbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProductosActionPerformed(evt);
            }
        });
        background.add(cbProductos);
        cbProductos.setBounds(550, 380, 150, 30);

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
        eActualizar.setBounds(490, 30, 320, 14);

        imagen.setBackground(new java.awt.Color(204, 70, 0));
        imagen.setForeground(new java.awt.Color(1, 1, 1));
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

    //Pasa a la vista de Precios
    private void botonPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPreciosActionPerformed
        VistaPrecios vistaPrecios=new VistaPrecios();
        vistaPrecios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonPreciosActionPerformed

    //Pasa a la vista de Mesas
    private void botonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMesasActionPerformed
        VistaMesas vistaMesas=new VistaMesas();
        vistaMesas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonMesasActionPerformed

    //Pasa a la vista de Reservas
    private void botonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservasActionPerformed
        VistaReservas vistaReservas=new VistaReservas();
        vistaReservas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonReservasActionPerformed

    //cierra sesion y pasa al inicio
    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        background.removeAll();
        background.repaint();
        Inicio inicio=new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    //cierra el programa
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    //permite actualizar el nombre de usuario
    private void botonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAjustesActionPerformed
        textoUsuario1.setVisible(true);
        nomNu.setVisible(true);
        cambiarNombre2.setVisible(true);
    }//GEN-LAST:event_botonAjustesActionPerformed

    //actualiza el nombre de usuario con enter en el segundo campo
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

    //actualiza el nombre de usuario
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

    //boton de limpiar llama al método limpiar
    private void limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposActionPerformed
        this.limpiar();
    }//GEN-LAST:event_limpiarCamposActionPerformed

    //el boton de buscar carga la tabla cumpliendo con las condiciones del método invocado
    private void buscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPedidoActionPerformed
        this.cargarTabla();
    }//GEN-LAST:event_buscarPedidoActionPerformed

    //Quita el producto seleccionado de la tabla
    private void quitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarProductoActionPerformed
        //obtenemos los productos y filtramos los que tengan el nombre de una fila seleccionada
        List<Producto> productos=productoData.obtenerProductos().stream().filter(p->p.getNombreProducto().equals(tablaPedido.getValueAt(tablaPedido.getSelectedRow(), 1).toString())).collect(Collectors.toList());
        productos.forEach(p1->comandaData.borrarComandaPorPrdocuto(p1.getIdProducto()));
        
        //si lo elimina con exito y la tabla ya no tiene comandas.. avisa en la pantalla y limpia la tabla
        if(productos.isEmpty()){
            JOptionPane.showMessageDialog(null,"Producto eliminado.");
            tablaPedido.setModel(modelo);
            limpiarTabla();
            textoCuenta.setText(String.valueOf(00.0));
        }
        //si aun tiene comandas las muestra en la tabla
        else{this.cargarTabla();}
    }//GEN-LAST:event_quitarProductoActionPerformed

    //agregamos un producto a nuestra tabla con su cantidad
    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoActionPerformed
        try {
            
            int b=Integer.parseInt(idProducto.getText());
            int cantidad=Integer.valueOf(spinnerCantidad.getValue().toString());
            setIdPedido();
            
            //actualizamos el estado de la mesa ya que si hay una comanda hay alguien que la atiende
            mesaData.actualizarEstadoMesa("Atendida",idMesa);
            Comanda c=new Comanda(pedidoData.seleccionarPedidoPor("id_pedido",getIdPedido()),productoData.deIdAlProducto(b),cantidad);
            
            //la guardamos en la base y actualizamos la tabla para que aparezca
            comandaData.guardarComanda(c);
            this.cargarTabla();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_agregarProductoActionPerformed

    //cobra el pedido, dando por finalizado su ciclo, almacena el valor de su cuenta y libera la mesa
    private void cobrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrarPedidoActionPerformed
        
        Double salvar=Double.valueOf(textoCuenta.getText());
        //actualizamos el estado de la mesa para liberarla
        mesaData.actualizarEstadoMesa("Libre", idMesa);
        //cobrado
        pedidoData.actualizarEstadoYfecha(getIdPedido());
        //guardamos la cuenta del pedido cobrado para poder hacer nuestro balance
        //avisamos y limpiamos los campos
        pedidoData.actualizarCuentaDePedido(getIdPedido(), salvar);
        limpiar();
        JOptionPane.showMessageDialog(null, "El pedido se cobro con exito");
    }//GEN-LAST:event_cobrarPedidoActionPerformed

    //Pasa a la vista de Balance
    private void botonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBalanceActionPerformed
        VistaIngresos vistaBalance=new VistaIngresos();
        vistaBalance.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBalanceActionPerformed

    private void atenderMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenderMesaActionPerformed
       atenderMesas();
    }//GEN-LAST:event_atenderMesaActionPerformed

    //cancelar el pedido hara que se elimine de la base de datos, ese numero de pedido ya no podrá ser usado
    //Por ejemplo si queremos crear un pedido para la misma mesa de donde fue eliminado, seleccionamos la mesa y se creará un nuevo pedido
    private void cancelarPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPedido1ActionPerformed
        try {
            
            mesaData.actualizarEstadoMesa("Libre", idMesa);
            pedidoData.borrarPedido(getIdPedido());
            limpiar();
            
            //avisamos que numero de pedido fue eliminado
            JOptionPane.showMessageDialog(null,"Pedido "+idPedido+" eliminado.");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelarPedido1ActionPerformed
    
     //calcula el cambio que le daremos al cliente dependiendo de su cuenta y con cuanto pague
    private void recualculando(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recualculando
        textoCambio.setText(String.valueOf(Math.abs(Double.parseDouble(textoCuenta.getText())-Double.parseDouble(textoPagaCon.getText()))));
    }//GEN-LAST:event_recualculando

    private void cbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProductosActionPerformed
        List<Producto> productos=productoData.obtenerProductos().stream().filter(p->p.getNombreProducto().equals(cbProductos.getSelectedItem().toString())).collect(Collectors.toList());
        productos.forEach(p1->idProducto.setText(String.valueOf(p1.getIdProducto())));
    }//GEN-LAST:event_cbProductosActionPerformed

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
        eActualizar.setVisible(false);
        ocultar.setVisible(false);
    }//GEN-LAST:event_ocultarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProducto;
    private javax.swing.JButton atenderMesa;
    private javax.swing.JLabel avisos;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonBalance;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton buscarPedido;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JButton cancelarPedido1;
    private javax.swing.JComboBox<String> cbProductos;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton cobrarPedido;
    private javax.swing.JLabel eActualizar;
    private javax.swing.JLabel eAgregarProducto;
    private javax.swing.JLabel eCambio;
    private javax.swing.JLabel eCantidad;
    private javax.swing.JLabel eIdProducto;
    private javax.swing.JLabel ePagaCon;
    private javax.swing.JLabel ePagaCon1;
    private javax.swing.JLabel eTomarPedido;
    private javax.swing.JLabel emesa;
    private javax.swing.JLabel etiquetaId;
    private javax.swing.JTextField idProducto;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPedidos;
    private javax.swing.JButton limpiarCampos;
    private javax.swing.JLabel nomNu;
    private javax.swing.JButton ocultar;
    private javax.swing.JButton quitarProducto;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JSpinner spinnerMesas;
    private javax.swing.JTable tablaPedido;
    private javax.swing.JTextField textoCambio;
    private javax.swing.JTextField textoCuenta;
    private javax.swing.JTextField textoId;
    private javax.swing.JTextField textoPagaCon;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
