/*
 * 
 * 
 * 
 */
package vistas;

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
        jLabel1.setBounds(590, 200, 90, 30);

        mesa2.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa2.setForeground(new java.awt.Color(153, 0, 51));
        mesa2.setText("5");
        mesa2.setToolTipText("");
        mesa2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa2);
        mesa2.setBounds(640, 270, 60, 30);

        mesa1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa1.setForeground(new java.awt.Color(153, 0, 51));
        mesa1.setText("1");
        mesa1.setToolTipText("");
        mesa1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa1);
        mesa1.setBounds(400, 270, 60, 30);

        mesa3.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa3.setForeground(new java.awt.Color(153, 0, 51));
        mesa3.setText("4");
        mesa3.setToolTipText("");
        mesa3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa3);
        mesa3.setBounds(580, 270, 60, 30);

        mesa4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa4.setForeground(new java.awt.Color(153, 0, 51));
        mesa4.setText("3");
        mesa4.setToolTipText("");
        mesa4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa4);
        mesa4.setBounds(520, 270, 60, 30);

        mesa5.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa5.setForeground(new java.awt.Color(153, 0, 51));
        mesa5.setText("2");
        mesa5.setToolTipText("");
        mesa5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa5);
        mesa5.setBounds(460, 270, 60, 30);

        mesa6.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa6.setForeground(new java.awt.Color(153, 0, 51));
        mesa6.setText("22");
        mesa6.setToolTipText("");
        mesa6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa6);
        mesa6.setBounds(460, 390, 60, 30);

        mesa8.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa8.setForeground(new java.awt.Color(153, 0, 51));
        mesa8.setText("24");
        mesa8.setToolTipText("");
        mesa8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa8);
        mesa8.setBounds(580, 390, 60, 30);

        mesa9.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa9.setForeground(new java.awt.Color(153, 0, 51));
        mesa9.setText("21");
        mesa9.setToolTipText("");
        mesa9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa9);
        mesa9.setBounds(400, 390, 60, 30);

        mesa7.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa7.setForeground(new java.awt.Color(153, 0, 51));
        mesa7.setText("23");
        mesa7.setToolTipText("");
        mesa7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa7);
        mesa7.setBounds(520, 390, 60, 30);

        mesa10.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa10.setForeground(new java.awt.Color(153, 0, 51));
        mesa10.setText("25");
        mesa10.setToolTipText("");
        mesa10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa10);
        mesa10.setBounds(640, 390, 60, 30);

        mesa11.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa11.setForeground(new java.awt.Color(153, 0, 51));
        mesa11.setText("30");
        mesa11.setToolTipText("");
        mesa11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa11);
        mesa11.setBounds(640, 420, 60, 30);

        mesa12.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa12.setForeground(new java.awt.Color(153, 0, 51));
        mesa12.setText("28");
        mesa12.setToolTipText("");
        mesa12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa12);
        mesa12.setBounds(520, 420, 60, 30);

        mesa13.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa13.setForeground(new java.awt.Color(153, 0, 51));
        mesa13.setText("26");
        mesa13.setToolTipText("");
        mesa13.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa13);
        mesa13.setBounds(400, 420, 60, 30);

        mesa14.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa14.setForeground(new java.awt.Color(153, 0, 51));
        mesa14.setText("29");
        mesa14.setToolTipText("");
        mesa14.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa14);
        mesa14.setBounds(580, 420, 60, 30);

        mesa15.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa15.setForeground(new java.awt.Color(153, 0, 51));
        mesa15.setText("27");
        mesa15.setToolTipText("");
        mesa15.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa15);
        mesa15.setBounds(460, 420, 60, 30);

        mesa16.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa16.setForeground(new java.awt.Color(153, 0, 51));
        mesa16.setText("35");
        mesa16.setToolTipText("");
        mesa16.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa16);
        mesa16.setBounds(640, 450, 60, 30);

        mesa17.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa17.setForeground(new java.awt.Color(153, 0, 51));
        mesa17.setText("33");
        mesa17.setToolTipText("");
        mesa17.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa17);
        mesa17.setBounds(520, 450, 60, 30);

        mesa18.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa18.setForeground(new java.awt.Color(153, 0, 51));
        mesa18.setText("31");
        mesa18.setToolTipText("");
        mesa18.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa18);
        mesa18.setBounds(400, 450, 60, 30);

        mesa19.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa19.setForeground(new java.awt.Color(153, 0, 51));
        mesa19.setText("34");
        mesa19.setToolTipText("");
        mesa19.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa19);
        mesa19.setBounds(580, 450, 60, 30);

        mesa20.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa20.setForeground(new java.awt.Color(153, 0, 51));
        mesa20.setText("32");
        mesa20.setToolTipText("");
        mesa20.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa20);
        mesa20.setBounds(460, 450, 60, 30);

        mesa21.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa21.setForeground(new java.awt.Color(153, 0, 51));
        mesa21.setText("40");
        mesa21.setToolTipText("");
        mesa21.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa21);
        mesa21.setBounds(640, 480, 60, 30);

        mesa22.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa22.setForeground(new java.awt.Color(153, 0, 51));
        mesa22.setText("38");
        mesa22.setToolTipText("");
        mesa22.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa22);
        mesa22.setBounds(520, 480, 60, 30);

        mesa23.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa23.setForeground(new java.awt.Color(153, 0, 51));
        mesa23.setText("36");
        mesa23.setToolTipText("");
        mesa23.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa23);
        mesa23.setBounds(400, 480, 60, 30);

        mesa24.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa24.setForeground(new java.awt.Color(153, 0, 51));
        mesa24.setText("39");
        mesa24.setToolTipText("");
        mesa24.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa24);
        mesa24.setBounds(580, 480, 60, 30);

        mesa25.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa25.setForeground(new java.awt.Color(153, 0, 51));
        mesa25.setText("37");
        mesa25.setToolTipText("");
        mesa25.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa25);
        mesa25.setBounds(460, 480, 60, 30);

        mesa26.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa26.setForeground(new java.awt.Color(153, 0, 51));
        mesa26.setText("45");
        mesa26.setToolTipText("");
        mesa26.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa26);
        mesa26.setBounds(640, 510, 60, 30);

        mesa27.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa27.setForeground(new java.awt.Color(153, 0, 51));
        mesa27.setText("43");
        mesa27.setToolTipText("");
        mesa27.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa27);
        mesa27.setBounds(520, 510, 60, 30);

        mesa28.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa28.setForeground(new java.awt.Color(153, 0, 51));
        mesa28.setText("41");
        mesa28.setToolTipText("");
        mesa28.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa28);
        mesa28.setBounds(400, 510, 60, 30);

        mesa29.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa29.setForeground(new java.awt.Color(153, 0, 51));
        mesa29.setText("44");
        mesa29.setToolTipText("");
        mesa29.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa29);
        mesa29.setBounds(580, 510, 60, 30);

        mesa30.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa30.setForeground(new java.awt.Color(153, 0, 51));
        mesa30.setText("42");
        mesa30.setToolTipText("");
        mesa30.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa30);
        mesa30.setBounds(460, 510, 60, 30);

        mesa31.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa31.setForeground(new java.awt.Color(153, 0, 51));
        mesa31.setText("10");
        mesa31.setToolTipText("");
        mesa31.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa31);
        mesa31.setBounds(640, 300, 60, 30);

        mesa32.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa32.setForeground(new java.awt.Color(153, 0, 51));
        mesa32.setText("8");
        mesa32.setToolTipText("");
        mesa32.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa32);
        mesa32.setBounds(520, 300, 60, 30);

        mesa33.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa33.setForeground(new java.awt.Color(153, 0, 51));
        mesa33.setText("6");
        mesa33.setToolTipText("");
        mesa33.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa33);
        mesa33.setBounds(400, 300, 60, 30);

        mesa34.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa34.setForeground(new java.awt.Color(153, 0, 51));
        mesa34.setText("9");
        mesa34.setToolTipText("");
        mesa34.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa34);
        mesa34.setBounds(580, 300, 60, 30);

        mesa35.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa35.setForeground(new java.awt.Color(153, 0, 51));
        mesa35.setText("7");
        mesa35.setToolTipText("");
        mesa35.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa35);
        mesa35.setBounds(460, 300, 60, 30);

        mesa36.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa36.setForeground(new java.awt.Color(153, 0, 51));
        mesa36.setText("20");
        mesa36.setToolTipText("");
        mesa36.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa36);
        mesa36.setBounds(640, 360, 60, 30);

        mesa37.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa37.setForeground(new java.awt.Color(153, 0, 51));
        mesa37.setText("18");
        mesa37.setToolTipText("");
        mesa37.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa37);
        mesa37.setBounds(520, 360, 60, 30);

        mesa38.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa38.setForeground(new java.awt.Color(153, 0, 51));
        mesa38.setText("16");
        mesa38.setToolTipText("");
        mesa38.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa38);
        mesa38.setBounds(400, 360, 60, 30);

        mesa39.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa39.setForeground(new java.awt.Color(153, 0, 51));
        mesa39.setText("19");
        mesa39.setToolTipText("");
        mesa39.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa39);
        mesa39.setBounds(580, 360, 60, 30);

        mesa40.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa40.setForeground(new java.awt.Color(153, 0, 51));
        mesa40.setText("17");
        mesa40.setToolTipText("");
        mesa40.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa40);
        mesa40.setBounds(460, 360, 60, 30);

        mesa41.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa41.setForeground(new java.awt.Color(153, 0, 51));
        mesa41.setText("15");
        mesa41.setToolTipText("");
        mesa41.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa41);
        mesa41.setBounds(640, 330, 60, 30);

        mesa42.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa42.setForeground(new java.awt.Color(153, 0, 51));
        mesa42.setText("13");
        mesa42.setToolTipText("");
        mesa42.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa42);
        mesa42.setBounds(520, 330, 60, 30);

        mesa43.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa43.setForeground(new java.awt.Color(153, 0, 51));
        mesa43.setText("11");
        mesa43.setToolTipText("");
        mesa43.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa43);
        mesa43.setBounds(400, 330, 60, 30);

        mesa44.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa44.setForeground(new java.awt.Color(153, 0, 51));
        mesa44.setText("14");
        mesa44.setToolTipText("");
        mesa44.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa44);
        mesa44.setBounds(580, 330, 60, 30);

        mesa45.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa45.setForeground(new java.awt.Color(153, 0, 51));
        mesa45.setText("12");
        mesa45.setToolTipText("");
        mesa45.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa45);
        mesa45.setBounds(460, 330, 60, 30);

        mesa46.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa46.setForeground(new java.awt.Color(153, 0, 51));
        mesa46.setText("46");
        mesa46.setToolTipText("");
        mesa46.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa46);
        mesa46.setBounds(400, 540, 60, 30);

        mesa47.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa47.setForeground(new java.awt.Color(153, 0, 51));
        mesa47.setText("47");
        mesa47.setToolTipText("");
        mesa47.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa47);
        mesa47.setBounds(460, 540, 60, 30);

        mesa48.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa48.setForeground(new java.awt.Color(153, 0, 51));
        mesa48.setText("48");
        mesa48.setToolTipText("");
        mesa48.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa48);
        mesa48.setBounds(520, 540, 60, 30);

        mesa49.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa49.setForeground(new java.awt.Color(153, 0, 51));
        mesa49.setText("49");
        mesa49.setToolTipText("");
        mesa49.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa49);
        mesa49.setBounds(580, 540, 60, 30);

        mesa50.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        mesa50.setForeground(new java.awt.Color(153, 0, 51));
        mesa50.setText("50");
        mesa50.setToolTipText("");
        mesa50.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 106, 21), new java.awt.Color(189, 66, 58)));
        background.add(mesa50);
        mesa50.setBounds(640, 540, 60, 30);

        jLabel2.setBackground(new java.awt.Color(60, 219, 84));
        jLabel2.setOpaque(true);
        background.add(jLabel2);
        jLabel2.setBounds(430, 600, 20, 20);

        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("DISPONIBLE");
        background.add(jLabel3);
        jLabel3.setBounds(460, 600, 90, 20);

        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("RESERVADA");
        background.add(jLabel4);
        jLabel4.setBounds(460, 630, 90, 20);

        jLabel5.setBackground(new java.awt.Color(255, 240, 0));
        jLabel5.setOpaque(true);
        background.add(jLabel5);
        jLabel5.setBounds(430, 630, 20, 20);

        jLabel6.setBackground(new java.awt.Color(253, 134, 43));
        jLabel6.setOpaque(true);
        background.add(jLabel6);
        jLabel6.setBounds(570, 600, 20, 20);

        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("OCUPADA");
        background.add(jLabel7);
        jLabel7.setBounds(600, 600, 90, 20);

        jLabel8.setBackground(new java.awt.Color(255, 18, 0));
        jLabel8.setOpaque(true);
        background.add(jLabel8);
        jLabel8.setBounds(570, 630, 20, 20);

        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("ATENDIDA");
        background.add(jLabel9);
        jLabel9.setBounds(600, 630, 90, 20);

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
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonReservas;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JButton mesa6;
    private javax.swing.JButton mesa7;
    private javax.swing.JButton mesa8;
    private javax.swing.JButton mesa9;
    // End of variables declaration//GEN-END:variables
}
