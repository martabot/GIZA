/*
 * 
 * 
 * 
 */
package vistas;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import modelo.*;


/**
 *
 * @author Muñeca Brava
 */
public class Inicio extends javax.swing.JFrame {
    private String nombre;
    private Boolean meseroIngresado;
    private List<Mesero> filtrados;
    private int numeroMesa;
    PreparedStatement ps;
    private List<Reserva> reservasPorId;
    
    
    public Inicio() {
        this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        
        
        initComponents();
        
        label3.setVisible(false);
        signUp.setVisible(false);

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
    
    public boolean reservaDeMesa(int idM){
        return this.getNumeroMesa()==idM;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelDeInicio = new javax.swing.JPanel();
        textoBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        signUp = new javax.swing.JButton();
        bRenunciar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrincipal.setAlignmentX(0.0F);
        panelPrincipal.setAlignmentY(0.0F);
        panelPrincipal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                panelPrincipalPropertyChange(evt);
            }
        });
        panelPrincipal.setLayout(null);

        panelDeInicio.setBackground(new java.awt.Color(254, 237, 219));
        panelDeInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

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
        botonBuscar.setText("Ingresar");
        botonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 0, 0)));
        botonBuscar.setContentAreaFilled(false);
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

        label2.setForeground(new java.awt.Color(102, 0, 0));
        label2.setText("Nick:");

        label1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 0, 0));
        label1.setText("INGRESAR");

        label3.setForeground(new java.awt.Color(255, 0, 0));
        label3.setText("Mesero no registrado");

        signUp.setBackground(new java.awt.Color(255, 204, 153));
        signUp.setForeground(new java.awt.Color(237, 63, 63));
        signUp.setText("Registrar");
        signUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 0, 0)));
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        bRenunciar.setBackground(new java.awt.Color(204, 70, 0));
        bRenunciar.setForeground(new java.awt.Color(102, 0, 0));
        bRenunciar.setText("Renunciar");
        bRenunciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 0, 0)));
        bRenunciar.setContentAreaFilled(false);
        bRenunciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRenunciarActionPerformed(evt);
            }
        });
        bRenunciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bRenunciarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelDeInicioLayout = new javax.swing.GroupLayout(panelDeInicio);
        panelDeInicio.setLayout(panelDeInicioLayout);
        panelDeInicioLayout.setHorizontalGroup(
            panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeInicioLayout.createSequentialGroup()
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDeInicioLayout.createSequentialGroup()
                                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelDeInicioLayout.createSequentialGroup()
                                        .addComponent(bRenunciar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDeInicioLayout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6))))
                    .addGroup(panelDeInicioLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        panelDeInicioLayout.setVerticalGroup(
            panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeInicioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(bRenunciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPrincipal.add(panelDeInicio);
        panelDeInicio.setBounds(510, 280, 300, 270);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/salir.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(jButton1);
        jButton1.setBounds(50, 40, 30, 40);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/inicio.png"))); // NOI18N
        imagen.setAlignmentY(0.0F);
        imagen.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(244, 242, 154), null));
        imagen.setMaximumSize(new java.awt.Dimension(14250, 9520));
        imagen.setMinimumSize(new java.awt.Dimension(14250, 9520));
        imagen.setName(""); // NOI18N
        imagen.setPreferredSize(new java.awt.Dimension(690, 450));
        panelPrincipal.add(imagen);
        imagen.setBounds(0, 0, 1370, 870);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1351, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelPrincipalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_panelPrincipalPropertyChange

    }//GEN-LAST:event_panelPrincipalPropertyChange

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
            
           this.filtrados= mesero.obtenerMeseros().stream().filter(mese -> this.meseroEsta(mese.getNombreMesero())).collect(Collectors.toList());
            
           if (!this.filtrados.isEmpty()){
            mesero.almacenarUsuario(textoBuscar.getText());
            panelPrincipal.removeAll();
            Background background=new Background();
            background.setVisible(true);
            this.setVisible(false);
           }else{
               label3.setVisible(true);
               signUp.setVisible(true);
           }
           
        }catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }   
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        
        this.setNombre(textoBuscar.getText());
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
      
            MeseroData mesero=new MeseroData(conexion);
            
            Mesero mesero1=new Mesero(this.getNombre());
            mesero.guardarMeseros(mesero1);
            
            
            this.filtrados= mesero.obtenerMeseros().stream().filter(mese -> this.meseroEsta(mese.getNombreMesero())).collect(Collectors.toList());
                       
            if (!this.filtrados.isEmpty()){
            panelPrincipal.removeAll();
            Background background=new Background();
            background.setVisible(true);
            this.setVisible(false);
           }
            
        }catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }        
    }//GEN-LAST:event_signUpActionPerformed

    private void botonBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonBuscarKeyPressed
        
    }//GEN-LAST:event_botonBuscarKeyPressed

    private void textoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBuscarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            
        this.setNombre(textoBuscar.getText());
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
      
            MeseroData mesero=new MeseroData(conexion);
            
           this.filtrados= mesero.obtenerMeseros().stream().filter(mese -> this.meseroEsta(mese.getNombreMesero())).collect(Collectors.toList());
            
           if (!this.filtrados.isEmpty()){
            label1.setVisible(false);
            label2.setVisible(false);
            botonBuscar.setVisible(false);
            textoBuscar.setVisible(false);
            panelDeInicio.setVisible(false);
            panelPrincipal.removeAll();
            Background background=new Background();
            background.setVisible(true);
            this.setVisible(false);
           }else{
               label3.setVisible(true);
               signUp.setVisible(true);
           }
           
        }catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }  
            
            
        }
    }//GEN-LAST:event_textoBuscarKeyPressed

    private void bRenunciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRenunciarActionPerformed
        this.setNombre(textoBuscar.getText());
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
            
            MeseroData mesero1=new MeseroData(conexion);
            
            mesero1.borrarMesero(this.getNombre());
            
            textoBuscar.setText("");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bRenunciarActionPerformed

    private void bRenunciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bRenunciarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRenunciarKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
        
    
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
    private javax.swing.JButton bRenunciar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JPanel panelDeInicio;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton signUp;
    private javax.swing.JTextField textoBuscar;
    // End of variables declaration//GEN-END:variables
}
