/*
 * 
 * 
 * 
 */
package vistas;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import modelo.Conexion;
import modelo.Mesa;
import modelo.MesaData;
import modelo.Mesero;
import modelo.MeseroData;
import modelo.Reserva;
import modelo.ReservaData;


/**
 *
 * @author Muñeca Brava
 */
public class Inicio extends javax.swing.JFrame {
    private String nombre;
    private Boolean meseroIngresado;
    private List<Mesero> filtrados;
    private int numeroMesa;
    private List<Mesa> estado;
    PreparedStatement ps;
    private List<Reserva> reservasPorId;
    
    
    public Inicio() {
        this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        
        
        initComponents();
        
        label3.setVisible(false);
        singUp.setVisible(false);
        barraMenu.setVisible(false);
        panelDeTrabajo.setVisible(false);
        ventanaMesas.setVisible(false);
    }
      
    
    
    public Boolean getMeseroIngresado(){
        return meseroIngresado;
    }
    public void setMeseroIngresado(Boolean meseroIng){
        this.meseroIngresado=meseroIng;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String name){
        this.nombre=name;
    }
    
    public boolean meseroEsta(String name){
        return this.getNombre().equals(name);
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
   
    public boolean idEsIgual(int num){
        return this.getNumeroMesa()==num;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUno = new javax.swing.JPanel();
        panelDeInicio = new javax.swing.JPanel();
        textoBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        singUp = new javax.swing.JButton();
        panelDeTrabajo = new javax.swing.JPanel();
        ventanaMesas = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        textoNroMesa = new javax.swing.JTextField();
        bBuscarMesa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textoEstado = new javax.swing.JLabel();
        textoReserva = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        mesas = new javax.swing.JMenu();
        reservas = new javax.swing.JMenu();
        pedidos = new javax.swing.JMenu();
        precios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelUno.setAlignmentX(0.0F);
        panelUno.setAlignmentY(0.0F);
        panelUno.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                panelUnoPropertyChange(evt);
            }
        });
        panelUno.setLayout(null);

        panelDeInicio.setBackground(new java.awt.Color(255, 153, 0));
        panelDeInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(246, 199, 45), null));

        textoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBuscarActionPerformed(evt);
            }
        });
        textoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoBuscarKeyPressed(evt);
            }
        });

        botonBuscar.setBackground(new java.awt.Color(204, 70, 0));
        botonBuscar.setForeground(new java.awt.Color(102, 0, 0));
        botonBuscar.setText("Log In");
        botonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 0, 0)));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        botonBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonBuscarKeyPressed(evt);
            }
        });

        label2.setText("Nombre del mesero:");

        label1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(51, 51, 51));
        label1.setText("INGRESAR");

        label3.setForeground(new java.awt.Color(255, 0, 0));
        label3.setText("Mesero no registrado");

        singUp.setBackground(new java.awt.Color(253, 253, 24));
        singUp.setForeground(new java.awt.Color(237, 63, 63));
        singUp.setText("Sign Up");
        singUp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        singUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeInicioLayout = new javax.swing.GroupLayout(panelDeInicio);
        panelDeInicio.setLayout(panelDeInicioLayout);
        panelDeInicioLayout.setHorizontalGroup(
            panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeInicioLayout.createSequentialGroup()
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeInicioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(label3)
                        .addGap(18, 18, 18)
                        .addComponent(singUp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDeInicioLayout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeInicioLayout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        panelDeInicioLayout.setVerticalGroup(
            panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeInicioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(singUp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        panelUno.add(panelDeInicio);
        panelDeInicio.setBounds(30, 110, 300, 280);

        ventanaMesas.setBackground(new java.awt.Color(254, 138, 22));
        ventanaMesas.setClosable(true);
        ventanaMesas.setForeground(java.awt.Color.lightGray);
        ventanaMesas.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cairo.jpg"))); // NOI18N
        ventanaMesas.setVisible(true);
        ventanaMesas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ventanaMesasPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(130, 14, 14));
        jLabel1.setText("Info de mesas:");

        textoNroMesa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textoNroMesa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(253, 142, 35)));
        textoNroMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNroMesaActionPerformed(evt);
            }
        });

        bBuscarMesa.setForeground(new java.awt.Color(124, 13, 13));
        bBuscarMesa.setText("Buscar");
        bBuscarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarMesaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(123, 5, 5));
        jLabel2.setText("nro:");

        javax.swing.GroupLayout ventanaMesasLayout = new javax.swing.GroupLayout(ventanaMesas.getContentPane());
        ventanaMesas.getContentPane().setLayout(ventanaMesasLayout);
        ventanaMesasLayout.setHorizontalGroup(
            ventanaMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaMesasLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(ventanaMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaMesasLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(bBuscarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        ventanaMesasLayout.setVerticalGroup(
            ventanaMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaMesasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(ventanaMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscarMesa)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDeTrabajoLayout = new javax.swing.GroupLayout(panelDeTrabajo);
        panelDeTrabajo.setLayout(panelDeTrabajoLayout);
        panelDeTrabajoLayout.setHorizontalGroup(
            panelDeTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaMesas)
        );
        panelDeTrabajoLayout.setVerticalGroup(
            panelDeTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaMesas)
        );

        panelUno.add(panelDeTrabajo);
        panelDeTrabajo.setBounds(330, 30, 600, 520);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cairo.jpg"))); // NOI18N
        imagen.setAlignmentY(0.0F);
        imagen.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(244, 242, 154), null));
        imagen.setMaximumSize(new java.awt.Dimension(14250, 9520));
        imagen.setMinimumSize(new java.awt.Dimension(14250, 9520));
        imagen.setName(""); // NOI18N
        imagen.setPreferredSize(new java.awt.Dimension(690, 450));
        panelUno.add(imagen);
        imagen.setBounds(0, 0, 1370, 820);

        mesas.setText("        MESAS      ");
        mesas.setFont(new java.awt.Font("Ubuntu", 0, 45)); // NOI18N
        mesas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesasActionPerformed(evt);
            }
        });
        barraMenu.add(mesas);

        reservas.setText("     RESERVAS     ");
        reservas.setFont(new java.awt.Font("Ubuntu", 0, 45)); // NOI18N
        reservas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        barraMenu.add(reservas);

        pedidos.setText("     PEDIDOS     ");
        pedidos.setFont(new java.awt.Font("Ubuntu", 0, 45)); // NOI18N
        pedidos.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        barraMenu.add(pedidos);

        precios.setText("     PRECIOS     ");
        precios.setFont(new java.awt.Font("Ubuntu", 0, 45)); // NOI18N
        precios.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        barraMenu.add(precios);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUno, javax.swing.GroupLayout.DEFAULT_SIZE, 1351, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUno, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelUnoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_panelUnoPropertyChange

    }//GEN-LAST:event_panelUnoPropertyChange

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void textoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBuscarActionPerformed
    
    }//GEN-LAST:event_textoBuscarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
       
        this.setNombre(textoBuscar.getText());
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
      
            MeseroData mesero=new MeseroData(conexion);
            
            //Mesero mesero1=new Mesero(this.getNombre());
            //mesero.guardarMesero(mesero1);
            
            
            //Consulta:
            
            //Boolean esEl =mesero.obtenerMesero().stream().anyMatch(meser ->meser.getNombreMesero().equals(this.getNombre())); 
            
            //mesero.obtenerMesero().forEach( meser-> {
                //contains
            //this.setMeseroIngresado(meser.getNombreMesero().equals(this.getNombre()));});
            
            this.filtrados= mesero.obtenerMesero().stream().filter(mese -> this.meseroEsta(mese.getNombreMesero())).collect(Collectors.toList());
            
            
           if (!this.filtrados.isEmpty()){
            label1.setVisible(false);
            label2.setVisible(false);
            botonBuscar.setVisible(false);
            textoBuscar.setVisible(false);
            panelDeInicio.setVisible(false);
            barraMenu.setVisible(true);
            ventanaMesas.setVisible(true);
            panelDeTrabajo.setVisible(true);
           }else{
               label3.setVisible(true);
               singUp.setVisible(true);
           }
           
        }catch(Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }        // TODO add your handling code here:
        
       
            
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void singUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singUpActionPerformed
        
        this.setNombre(textoBuscar.getText());
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
      
            MeseroData mesero=new MeseroData(conexion);
            
            Mesero mesero1=new Mesero(this.getNombre());
            mesero.guardarMeseros(mesero1);
            
            
            this.filtrados= mesero.obtenerMesero().stream().filter(mese -> this.meseroEsta(mese.getNombreMesero())).collect(Collectors.toList());
                       
            if (!this.filtrados.isEmpty()){
            label1.setVisible(false);
            label2.setVisible(false);
            botonBuscar.setVisible(false);
            textoBuscar.setVisible(false);
            panelDeInicio.setVisible(false);
            label3.setVisible(false);
            singUp.setVisible(false);
            barraMenu.setVisible(true);
            panelDeTrabajo.setVisible(true);
            ventanaMesas.setVisible(true);
           }
            
        }catch(Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_singUpActionPerformed

    private void botonBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonBuscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarKeyPressed

    private void textoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBuscarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            this.setNombre(textoBuscar.getText());
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
      
            MeseroData mesero=new MeseroData(conexion);
            
           this.filtrados= mesero.obtenerMesero().stream().filter(mese -> this.meseroEsta(mese.getNombreMesero())).collect(Collectors.toList());
            
           if (!this.filtrados.isEmpty()){
            label1.setVisible(false);
            label2.setVisible(false);
            botonBuscar.setVisible(false);
            textoBuscar.setVisible(false);
            panelDeInicio.setVisible(false);
            barraMenu.setVisible(true);
            panelDeTrabajo.setVisible(true);
            ventanaMesas.setVisible(true);
           }else{
               label3.setVisible(true);
               singUp.setVisible(true);
           }
           
        }catch(Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }  
            
            
        }
    }//GEN-LAST:event_textoBuscarKeyPressed

    private void mesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesasActionPerformed
        
        panelDeTrabajo.setVisible(true);
        ventanaMesas.setVisible(true);
    }//GEN-LAST:event_mesasActionPerformed

    private void ventanaMesasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ventanaMesasPropertyChange
       
    }//GEN-LAST:event_ventanaMesasPropertyChange

    private void textoNroMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNroMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNroMesaActionPerformed

    private void bBuscarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarMesaActionPerformed
        this.setNumeroMesa(Integer.parseInt(textoNroMesa.getText()));
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
            
            MesaData mesas1 = new MesaData(conexion);
            Mesa estado1= mesas1.deIdAMesa(this.getNumeroMesa());
            textoEstado.setText(estado1.getIdMesa()+" - Mesa "+estado1.getEstadoMesa());
            
            
            ReservaData r2= new ReservaData(conexion);
            this.reservasPorId = r2.obtenerReservas().stream().filter(r1 -> this.idEsIgual(r1.getMesa().getIdMesa())).collect(Collectors.toList());
            
            this.reservasPorId.forEach(reserva ->{
                textoReserva.setText("Reserva: "+reserva.getNombreCliente()+" "+reserva.getFechaReserva());
            });
            
        }catch(Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage()+textoEstado.getText());
        } 
        
    }//GEN-LAST:event_bBuscarMesaActionPerformed
        
    
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscarMesa;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JMenu mesas;
    private javax.swing.JPanel panelDeInicio;
    private javax.swing.JPanel panelDeTrabajo;
    private javax.swing.JPanel panelUno;
    private javax.swing.JMenu pedidos;
    private javax.swing.JMenu precios;
    private javax.swing.JMenu reservas;
    private javax.swing.JButton singUp;
    private javax.swing.JTextField textoBuscar;
    private javax.swing.JLabel textoEstado;
    private javax.swing.JTextField textoNroMesa;
    private javax.swing.JLabel textoReserva;
    private javax.swing.JInternalFrame ventanaMesas;
    // End of variables declaration//GEN-END:variables
}
