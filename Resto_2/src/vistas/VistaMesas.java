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
public class VistaMesas extends javax.swing.JFrame {

    public VistaMesas() {
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
        jLabel1 = new javax.swing.JLabel();
        mesa2 = new javax.swing.JButton();
        mesa1 = new javax.swing.JButton();
        mesa3 = new javax.swing.JButton();
        mesa4 = new javax.swing.JButton();
        mesa5 = new javax.swing.JButton();
        mesa6 = new javax.swing.JButton();
        mesa8 = new javax.swing.JButton();
        mesa9 = new javax.swing.JButton();
        mesa7 = new javax.swing.JButton();
        mesa10 = new javax.swing.JButton();
        mesa11 = new javax.swing.JButton();
        mesa12 = new javax.swing.JButton();
        mesa13 = new javax.swing.JButton();
        mesa14 = new javax.swing.JButton();
        mesa15 = new javax.swing.JButton();
        mesa16 = new javax.swing.JButton();
        mesa17 = new javax.swing.JButton();
        mesa18 = new javax.swing.JButton();
        mesa19 = new javax.swing.JButton();
        mesa20 = new javax.swing.JButton();
        mesa21 = new javax.swing.JButton();
        mesa22 = new javax.swing.JButton();
        mesa23 = new javax.swing.JButton();
        mesa24 = new javax.swing.JButton();
        mesa25 = new javax.swing.JButton();
        mesa26 = new javax.swing.JButton();
        mesa27 = new javax.swing.JButton();
        mesa28 = new javax.swing.JButton();
        mesa29 = new javax.swing.JButton();
        mesa30 = new javax.swing.JButton();
        mesa31 = new javax.swing.JButton();
        mesa32 = new javax.swing.JButton();
        mesa33 = new javax.swing.JButton();
        mesa34 = new javax.swing.JButton();
        mesa35 = new javax.swing.JButton();
        mesa36 = new javax.swing.JButton();
        mesa37 = new javax.swing.JButton();
        mesa38 = new javax.swing.JButton();
        mesa39 = new javax.swing.JButton();
        mesa40 = new javax.swing.JButton();
        mesa41 = new javax.swing.JButton();
        mesa42 = new javax.swing.JButton();
        mesa43 = new javax.swing.JButton();
        mesa44 = new javax.swing.JButton();
        mesa45 = new javax.swing.JButton();
        mesa46 = new javax.swing.JButton();
        mesa47 = new javax.swing.JButton();
        mesa48 = new javax.swing.JButton();
        mesa49 = new javax.swing.JButton();
        mesa50 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textoPedido = new javax.swing.JTextField();
        textoMesero = new javax.swing.JTextField();
        textoReserva = new javax.swing.JTextField();
        textoCuenta = new javax.swing.JTextField();
        botonCobrar = new javax.swing.JButton();
        botonCobrar1 = new javax.swing.JButton();
        botonCobrar2 = new javax.swing.JButton();
        botonCobrar3 = new javax.swing.JButton();
        botonCobrar4 = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        mesa51 = new javax.swing.JButton();
        mesa52 = new javax.swing.JButton();
        mesa53 = new javax.swing.JButton();
        mesa54 = new javax.swing.JButton();
        mesa55 = new javax.swing.JButton();
        mesa56 = new javax.swing.JButton();
        mesa57 = new javax.swing.JButton();
        mesa58 = new javax.swing.JButton();
        mesa59 = new javax.swing.JButton();
        mesa60 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cambiarNombre2 = new javax.swing.JButton();
        textoUsuario1 = new javax.swing.JTextField();
        textoUsuario = new javax.swing.JTextField();
        nomOld = new javax.swing.JLabel();
        nomNu = new javax.swing.JLabel();
        botonAjustes = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Luisa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("MESAS");
        background.add(jLabel1);
        jLabel1.setBounds(590, 190, 90, 40);

        mesa2.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa2.setForeground(new java.awt.Color(153, 0, 51));
        mesa2.setText("5");
        mesa2.setToolTipText("");
        mesa2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa2);
        mesa2.setBounds(640, 250, 60, 30);

        mesa1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa1.setForeground(new java.awt.Color(153, 0, 51));
        mesa1.setText("1");
        mesa1.setToolTipText("");
        mesa1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa1);
        mesa1.setBounds(400, 250, 60, 30);

        mesa3.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa3.setForeground(new java.awt.Color(153, 0, 51));
        mesa3.setText("4");
        mesa3.setToolTipText("");
        mesa3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa3);
        mesa3.setBounds(580, 250, 60, 30);

        mesa4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa4.setForeground(new java.awt.Color(153, 0, 51));
        mesa4.setText("3");
        mesa4.setToolTipText("");
        mesa4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa4);
        mesa4.setBounds(520, 250, 60, 30);

        mesa5.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa5.setForeground(new java.awt.Color(153, 0, 51));
        mesa5.setText("2");
        mesa5.setToolTipText("");
        mesa5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa5);
        mesa5.setBounds(460, 250, 60, 30);

        mesa6.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa6.setForeground(new java.awt.Color(153, 0, 51));
        mesa6.setText("22");
        mesa6.setToolTipText("");
        mesa6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa6);
        mesa6.setBounds(460, 370, 60, 30);

        mesa8.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa8.setForeground(new java.awt.Color(153, 0, 51));
        mesa8.setText("24");
        mesa8.setToolTipText("");
        mesa8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa8);
        mesa8.setBounds(580, 370, 60, 30);

        mesa9.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa9.setForeground(new java.awt.Color(153, 0, 51));
        mesa9.setText("21");
        mesa9.setToolTipText("");
        mesa9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa9);
        mesa9.setBounds(400, 370, 60, 30);

        mesa7.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa7.setForeground(new java.awt.Color(153, 0, 51));
        mesa7.setText("23");
        mesa7.setToolTipText("");
        mesa7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa7);
        mesa7.setBounds(520, 370, 60, 30);

        mesa10.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa10.setForeground(new java.awt.Color(153, 0, 51));
        mesa10.setText("25");
        mesa10.setToolTipText("");
        mesa10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa10);
        mesa10.setBounds(640, 370, 60, 30);

        mesa11.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa11.setForeground(new java.awt.Color(153, 0, 51));
        mesa11.setText("30");
        mesa11.setToolTipText("");
        mesa11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa11);
        mesa11.setBounds(640, 400, 60, 30);

        mesa12.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa12.setForeground(new java.awt.Color(153, 0, 51));
        mesa12.setText("28");
        mesa12.setToolTipText("");
        mesa12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa12);
        mesa12.setBounds(520, 400, 60, 30);

        mesa13.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa13.setForeground(new java.awt.Color(153, 0, 51));
        mesa13.setText("26");
        mesa13.setToolTipText("");
        mesa13.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa13);
        mesa13.setBounds(400, 400, 60, 30);

        mesa14.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa14.setForeground(new java.awt.Color(153, 0, 51));
        mesa14.setText("29");
        mesa14.setToolTipText("");
        mesa14.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa14);
        mesa14.setBounds(580, 400, 60, 30);

        mesa15.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa15.setForeground(new java.awt.Color(153, 0, 51));
        mesa15.setText("27");
        mesa15.setToolTipText("");
        mesa15.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa15);
        mesa15.setBounds(460, 400, 60, 30);

        mesa16.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa16.setForeground(new java.awt.Color(153, 0, 51));
        mesa16.setText("35");
        mesa16.setToolTipText("");
        mesa16.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa16);
        mesa16.setBounds(640, 430, 60, 30);

        mesa17.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa17.setForeground(new java.awt.Color(153, 0, 51));
        mesa17.setText("33");
        mesa17.setToolTipText("");
        mesa17.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa17);
        mesa17.setBounds(520, 430, 60, 30);

        mesa18.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa18.setForeground(new java.awt.Color(153, 0, 51));
        mesa18.setText("31");
        mesa18.setToolTipText("");
        mesa18.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa18);
        mesa18.setBounds(400, 430, 60, 30);

        mesa19.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa19.setForeground(new java.awt.Color(153, 0, 51));
        mesa19.setText("34");
        mesa19.setToolTipText("");
        mesa19.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa19);
        mesa19.setBounds(580, 430, 60, 30);

        mesa20.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa20.setForeground(new java.awt.Color(153, 0, 51));
        mesa20.setText("32");
        mesa20.setToolTipText("");
        mesa20.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa20);
        mesa20.setBounds(460, 430, 60, 30);

        mesa21.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa21.setForeground(new java.awt.Color(153, 0, 51));
        mesa21.setText("40");
        mesa21.setToolTipText("");
        mesa21.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa21);
        mesa21.setBounds(640, 460, 60, 30);

        mesa22.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa22.setForeground(new java.awt.Color(153, 0, 51));
        mesa22.setText("38");
        mesa22.setToolTipText("");
        mesa22.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa22);
        mesa22.setBounds(520, 460, 60, 30);

        mesa23.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa23.setForeground(new java.awt.Color(153, 0, 51));
        mesa23.setText("36");
        mesa23.setToolTipText("");
        mesa23.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa23);
        mesa23.setBounds(400, 460, 60, 30);

        mesa24.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa24.setForeground(new java.awt.Color(153, 0, 51));
        mesa24.setText("39");
        mesa24.setToolTipText("");
        mesa24.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa24);
        mesa24.setBounds(580, 460, 60, 30);

        mesa25.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa25.setForeground(new java.awt.Color(153, 0, 51));
        mesa25.setText("37");
        mesa25.setToolTipText("");
        mesa25.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa25);
        mesa25.setBounds(460, 460, 60, 30);

        mesa26.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa26.setForeground(new java.awt.Color(153, 0, 51));
        mesa26.setText("45");
        mesa26.setToolTipText("");
        mesa26.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa26);
        mesa26.setBounds(640, 490, 60, 30);

        mesa27.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa27.setForeground(new java.awt.Color(153, 0, 51));
        mesa27.setText("43");
        mesa27.setToolTipText("");
        mesa27.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa27);
        mesa27.setBounds(520, 490, 60, 30);

        mesa28.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa28.setForeground(new java.awt.Color(153, 0, 51));
        mesa28.setText("41");
        mesa28.setToolTipText("");
        mesa28.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa28);
        mesa28.setBounds(400, 490, 60, 30);

        mesa29.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa29.setForeground(new java.awt.Color(153, 0, 51));
        mesa29.setText("44");
        mesa29.setToolTipText("");
        mesa29.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa29);
        mesa29.setBounds(580, 490, 60, 30);

        mesa30.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa30.setForeground(new java.awt.Color(153, 0, 51));
        mesa30.setText("42");
        mesa30.setToolTipText("");
        mesa30.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa30);
        mesa30.setBounds(460, 490, 60, 30);

        mesa31.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa31.setForeground(new java.awt.Color(153, 0, 51));
        mesa31.setText("10");
        mesa31.setToolTipText("");
        mesa31.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa31);
        mesa31.setBounds(640, 280, 60, 30);

        mesa32.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa32.setForeground(new java.awt.Color(153, 0, 51));
        mesa32.setText("8");
        mesa32.setToolTipText("");
        mesa32.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa32);
        mesa32.setBounds(520, 280, 60, 30);

        mesa33.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa33.setForeground(new java.awt.Color(153, 0, 51));
        mesa33.setText("6");
        mesa33.setToolTipText("");
        mesa33.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa33);
        mesa33.setBounds(400, 280, 60, 30);

        mesa34.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa34.setForeground(new java.awt.Color(153, 0, 51));
        mesa34.setText("9");
        mesa34.setToolTipText("");
        mesa34.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa34);
        mesa34.setBounds(580, 280, 60, 30);

        mesa35.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa35.setForeground(new java.awt.Color(153, 0, 51));
        mesa35.setText("7");
        mesa35.setToolTipText("");
        mesa35.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa35);
        mesa35.setBounds(460, 280, 60, 30);

        mesa36.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa36.setForeground(new java.awt.Color(153, 0, 51));
        mesa36.setText("20");
        mesa36.setToolTipText("");
        mesa36.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa36);
        mesa36.setBounds(640, 340, 60, 30);

        mesa37.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa37.setForeground(new java.awt.Color(153, 0, 51));
        mesa37.setText("18");
        mesa37.setToolTipText("");
        mesa37.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa37);
        mesa37.setBounds(520, 340, 60, 30);

        mesa38.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa38.setForeground(new java.awt.Color(153, 0, 51));
        mesa38.setText("16");
        mesa38.setToolTipText("");
        mesa38.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa38);
        mesa38.setBounds(400, 340, 60, 30);

        mesa39.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa39.setForeground(new java.awt.Color(153, 0, 51));
        mesa39.setText("19");
        mesa39.setToolTipText("");
        mesa39.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa39);
        mesa39.setBounds(580, 340, 60, 30);

        mesa40.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa40.setForeground(new java.awt.Color(153, 0, 51));
        mesa40.setText("17");
        mesa40.setToolTipText("");
        mesa40.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa40);
        mesa40.setBounds(460, 340, 60, 30);

        mesa41.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa41.setForeground(new java.awt.Color(153, 0, 51));
        mesa41.setText("15");
        mesa41.setToolTipText("");
        mesa41.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa41);
        mesa41.setBounds(640, 310, 60, 30);

        mesa42.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa42.setForeground(new java.awt.Color(153, 0, 51));
        mesa42.setText("13");
        mesa42.setToolTipText("");
        mesa42.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa42);
        mesa42.setBounds(520, 310, 60, 30);

        mesa43.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa43.setForeground(new java.awt.Color(153, 0, 51));
        mesa43.setText("11");
        mesa43.setToolTipText("");
        mesa43.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa43);
        mesa43.setBounds(400, 310, 60, 30);

        mesa44.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa44.setForeground(new java.awt.Color(153, 0, 51));
        mesa44.setText("14");
        mesa44.setToolTipText("");
        mesa44.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa44);
        mesa44.setBounds(580, 310, 60, 30);

        mesa45.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa45.setForeground(new java.awt.Color(153, 0, 51));
        mesa45.setText("12");
        mesa45.setToolTipText("");
        mesa45.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa45);
        mesa45.setBounds(460, 310, 60, 30);

        mesa46.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa46.setForeground(new java.awt.Color(153, 0, 51));
        mesa46.setText("46");
        mesa46.setToolTipText("");
        mesa46.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa46);
        mesa46.setBounds(400, 520, 60, 30);

        mesa47.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa47.setForeground(new java.awt.Color(153, 0, 51));
        mesa47.setText("47");
        mesa47.setToolTipText("");
        mesa47.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa47);
        mesa47.setBounds(460, 520, 60, 30);

        mesa48.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa48.setForeground(new java.awt.Color(153, 0, 51));
        mesa48.setText("48");
        mesa48.setToolTipText("");
        mesa48.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa48);
        mesa48.setBounds(520, 520, 60, 30);

        mesa49.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa49.setForeground(new java.awt.Color(153, 0, 51));
        mesa49.setText("49");
        mesa49.setToolTipText("");
        mesa49.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa49);
        mesa49.setBounds(580, 520, 60, 30);

        mesa50.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa50.setForeground(new java.awt.Color(153, 0, 51));
        mesa50.setText("50");
        mesa50.setToolTipText("");
        mesa50.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa50);
        mesa50.setBounds(640, 520, 60, 30);

        jLabel2.setBackground(new java.awt.Color(60, 219, 84));
        jLabel2.setOpaque(true);
        background.add(jLabel2);
        jLabel2.setBounds(410, 640, 20, 20);

        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("DISPONIBLE");
        background.add(jLabel3);
        jLabel3.setBounds(440, 640, 90, 20);

        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("RESERVADA");
        background.add(jLabel4);
        jLabel4.setBounds(690, 640, 90, 20);

        jLabel5.setBackground(new java.awt.Color(255, 240, 0));
        jLabel5.setOpaque(true);
        background.add(jLabel5);
        jLabel5.setBounds(660, 640, 20, 20);

        jLabel6.setBackground(new java.awt.Color(253, 134, 43));
        jLabel6.setOpaque(true);
        background.add(jLabel6);
        jLabel6.setBounds(540, 640, 20, 20);

        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("OCUPADA");
        background.add(jLabel7);
        jLabel7.setBounds(570, 640, 90, 20);

        jLabel8.setBackground(new java.awt.Color(255, 18, 0));
        jLabel8.setOpaque(true);
        background.add(jLabel8);
        jLabel8.setBounds(790, 640, 20, 20);

        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("ATENDIDA");
        background.add(jLabel9);
        jLabel9.setBounds(820, 640, 90, 20);

        textoPedido.setForeground(new java.awt.Color(153, 0, 51));
        textoPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(182, 52, 52)));
        background.add(textoPedido);
        textoPedido.setBounds(720, 400, 180, 30);

        textoMesero.setForeground(new java.awt.Color(153, 0, 51));
        textoMesero.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(182, 52, 52)));
        background.add(textoMesero);
        textoMesero.setBounds(720, 280, 180, 30);

        textoReserva.setForeground(new java.awt.Color(153, 0, 51));
        textoReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(182, 52, 52)));
        background.add(textoReserva);
        textoReserva.setBounds(720, 340, 180, 30);

        textoCuenta.setForeground(new java.awt.Color(153, 0, 51));
        textoCuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(182, 52, 52)));
        background.add(textoCuenta);
        textoCuenta.setBounds(720, 460, 90, 30);

        botonCobrar.setForeground(new java.awt.Color(153, 0, 51));
        botonCobrar.setText("LIMPIAR");
        botonCobrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(201, 254, 91), new java.awt.Color(148, 39, 83), new java.awt.Color(173, 98, 98), new java.awt.Color(222, 33, 33)));
        botonCobrar.setContentAreaFilled(false);
        background.add(botonCobrar);
        botonCobrar.setBounds(720, 520, 80, 30);

        botonCobrar1.setForeground(new java.awt.Color(153, 0, 51));
        botonCobrar1.setText("COBRAR");
        botonCobrar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(201, 254, 91), new java.awt.Color(148, 39, 83), new java.awt.Color(173, 98, 98), new java.awt.Color(222, 33, 33)));
        botonCobrar1.setContentAreaFilled(false);
        background.add(botonCobrar1);
        botonCobrar1.setBounds(820, 460, 80, 30);

        botonCobrar2.setForeground(new java.awt.Color(153, 0, 51));
        botonCobrar2.setText("BUSCAR");
        botonCobrar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(201, 254, 91), new java.awt.Color(148, 39, 83), new java.awt.Color(173, 98, 98), new java.awt.Color(222, 33, 33)));
        botonCobrar2.setContentAreaFilled(false);
        background.add(botonCobrar2);
        botonCobrar2.setBounds(810, 520, 90, 30);

        botonCobrar3.setForeground(new java.awt.Color(153, 0, 51));
        botonCobrar3.setText("ELIMINAR");
        botonCobrar3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(201, 254, 91), new java.awt.Color(148, 39, 83), new java.awt.Color(173, 98, 98), new java.awt.Color(222, 33, 33)));
        botonCobrar3.setContentAreaFilled(false);
        background.add(botonCobrar3);
        botonCobrar3.setBounds(720, 560, 80, 30);

        botonCobrar4.setForeground(new java.awt.Color(153, 0, 51));
        botonCobrar4.setText("AGREGAR");
        botonCobrar4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(201, 254, 91), new java.awt.Color(148, 39, 83), new java.awt.Color(173, 98, 98), new java.awt.Color(222, 33, 33)));
        botonCobrar4.setContentAreaFilled(false);
        background.add(botonCobrar4);
        botonCobrar4.setBounds(810, 560, 90, 30);

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

        mesa51.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa51.setForeground(new java.awt.Color(153, 0, 51));
        mesa51.setText("51");
        mesa51.setToolTipText("");
        mesa51.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa51);
        mesa51.setBounds(400, 550, 60, 30);

        mesa52.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa52.setForeground(new java.awt.Color(153, 0, 51));
        mesa52.setText("52");
        mesa52.setToolTipText("");
        mesa52.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        mesa52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa52ActionPerformed(evt);
            }
        });
        background.add(mesa52);
        mesa52.setBounds(460, 550, 60, 30);

        mesa53.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa53.setForeground(new java.awt.Color(153, 0, 51));
        mesa53.setText("53");
        mesa53.setToolTipText("");
        mesa53.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa53);
        mesa53.setBounds(520, 550, 60, 30);

        mesa54.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa54.setForeground(new java.awt.Color(153, 0, 51));
        mesa54.setText("54");
        mesa54.setToolTipText("");
        mesa54.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa54);
        mesa54.setBounds(580, 550, 60, 30);

        mesa55.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa55.setForeground(new java.awt.Color(153, 0, 51));
        mesa55.setText("55");
        mesa55.setToolTipText("");
        mesa55.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa55);
        mesa55.setBounds(640, 550, 60, 30);

        mesa56.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa56.setForeground(new java.awt.Color(153, 0, 51));
        mesa56.setText("60");
        mesa56.setToolTipText("");
        mesa56.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa56);
        mesa56.setBounds(640, 580, 60, 30);

        mesa57.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa57.setForeground(new java.awt.Color(153, 0, 51));
        mesa57.setText("59");
        mesa57.setToolTipText("");
        mesa57.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa57);
        mesa57.setBounds(580, 580, 60, 30);

        mesa58.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa58.setForeground(new java.awt.Color(153, 0, 51));
        mesa58.setText("58");
        mesa58.setToolTipText("");
        mesa58.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa58);
        mesa58.setBounds(520, 580, 60, 30);

        mesa59.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa59.setForeground(new java.awt.Color(153, 0, 51));
        mesa59.setText("57");
        mesa59.setToolTipText("");
        mesa59.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa59);
        mesa59.setBounds(460, 580, 60, 30);

        mesa60.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa60.setForeground(new java.awt.Color(153, 0, 51));
        mesa60.setText("56");
        mesa60.setToolTipText("");
        mesa60.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa60);
        mesa60.setBounds(400, 580, 60, 30);

        jLabel10.setForeground(new java.awt.Color(153, 0, 51));
        jLabel10.setText("CUENTA:");
        background.add(jLabel10);
        jLabel10.setBounds(720, 430, 180, 30);

        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        background.add(jLabel11);
        jLabel11.setBounds(720, 250, 180, 30);

        jLabel12.setForeground(new java.awt.Color(153, 0, 51));
        background.add(jLabel12);
        jLabel12.setBounds(720, 310, 180, 30);

        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        background.add(jLabel13);
        jLabel13.setBounds(720, 370, 180, 30);

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

        botonAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/ajustes.png"))); // NOI18N
        botonAjustes.setContentAreaFilled(false);
        botonAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAjustesActionPerformed(evt);
            }
        });
        background.add(botonAjustes);
        botonAjustes.setBounds(320, 40, 30, 40);

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

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        background.removeAll();
        AboutUs aboutUs=new AboutUs();
        aboutUs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aboutUsActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        background.removeAll();
        background.repaint();
        Inicio inicio=new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mesa52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa52ActionPerformed

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

    private void botonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAjustesActionPerformed
        textoUsuario.setVisible(true);
        textoUsuario1.setVisible(true);
        nomOld.setVisible(true);
        nomNu.setVisible(true);
        cambiarNombre2.setVisible(true);
    }//GEN-LAST:event_botonAjustesActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUs;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAjustes;
    private javax.swing.JButton botonCobrar;
    private javax.swing.JButton botonCobrar1;
    private javax.swing.JButton botonCobrar2;
    private javax.swing.JButton botonCobrar3;
    private javax.swing.JButton botonCobrar4;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton cambiarNombre2;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mesa1;
    private javax.swing.JButton mesa10;
    private javax.swing.JButton mesa11;
    private javax.swing.JButton mesa12;
    private javax.swing.JButton mesa13;
    private javax.swing.JButton mesa14;
    private javax.swing.JButton mesa15;
    private javax.swing.JButton mesa16;
    private javax.swing.JButton mesa17;
    private javax.swing.JButton mesa18;
    private javax.swing.JButton mesa19;
    private javax.swing.JButton mesa2;
    private javax.swing.JButton mesa20;
    private javax.swing.JButton mesa21;
    private javax.swing.JButton mesa22;
    private javax.swing.JButton mesa23;
    private javax.swing.JButton mesa24;
    private javax.swing.JButton mesa25;
    private javax.swing.JButton mesa26;
    private javax.swing.JButton mesa27;
    private javax.swing.JButton mesa28;
    private javax.swing.JButton mesa29;
    private javax.swing.JButton mesa3;
    private javax.swing.JButton mesa30;
    private javax.swing.JButton mesa31;
    private javax.swing.JButton mesa32;
    private javax.swing.JButton mesa33;
    private javax.swing.JButton mesa34;
    private javax.swing.JButton mesa35;
    private javax.swing.JButton mesa36;
    private javax.swing.JButton mesa37;
    private javax.swing.JButton mesa38;
    private javax.swing.JButton mesa39;
    private javax.swing.JButton mesa4;
    private javax.swing.JButton mesa40;
    private javax.swing.JButton mesa41;
    private javax.swing.JButton mesa42;
    private javax.swing.JButton mesa43;
    private javax.swing.JButton mesa44;
    private javax.swing.JButton mesa45;
    private javax.swing.JButton mesa46;
    private javax.swing.JButton mesa47;
    private javax.swing.JButton mesa48;
    private javax.swing.JButton mesa49;
    private javax.swing.JButton mesa5;
    private javax.swing.JButton mesa50;
    private javax.swing.JButton mesa51;
    private javax.swing.JButton mesa52;
    private javax.swing.JButton mesa53;
    private javax.swing.JButton mesa54;
    private javax.swing.JButton mesa55;
    private javax.swing.JButton mesa56;
    private javax.swing.JButton mesa57;
    private javax.swing.JButton mesa58;
    private javax.swing.JButton mesa59;
    private javax.swing.JButton mesa6;
    private javax.swing.JButton mesa60;
    private javax.swing.JButton mesa7;
    private javax.swing.JButton mesa8;
    private javax.swing.JButton mesa9;
    private javax.swing.JLabel nomNu;
    private javax.swing.JLabel nomOld;
    private javax.swing.JTextField textoCuenta;
    private javax.swing.JTextField textoMesero;
    private javax.swing.JTextField textoPedido;
    private javax.swing.JTextField textoReserva;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
