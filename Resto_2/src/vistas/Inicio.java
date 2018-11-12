/*
 * 
 * 
 * 
 */
package vistas;

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
    //atributos encapsuladas
    private String nombre;
    private Boolean meseroIngresado;
    private List<Mesero> filtrados;
    PreparedStatement ps;
    public static String usuario;
    
    //constructor
    public Inicio() {
        this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        
        VistaMesas.setMesaActual(0);
        initComponents();
        
        label3.setVisible(false);
        signUp.setVisible(false);

    }
    
    //Algunos getters y setter necesarios
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

    //Un booleano que compara el nombre
    public boolean meseroEsta(String name){
        return this.getNombre().equals(name);
    }
    
    //aquí almacenamos el usuario que estará usando la app, puede ser llamado de cualquier clase
    public static void almacenarUsuario(String usuario){
        Inicio.usuario=usuario;
    }
    
    //con este método podemos llamar al usuario almacenado
    public static String usuarioRegistrado(){
        return usuario;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmacion = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        labelConfirmacion3 = new javax.swing.JLabel();
        cancelarReg = new javax.swing.JButton();
        aceptarReg = new javax.swing.JButton();
        label10 = new javax.swing.JLabel();
        usuarioReg = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        confirmacion1 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        usuarioEliminado = new javax.swing.JLabel();
        labelConfirmacion4 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        aceptarRen = new javax.swing.JButton();
        cancelarRen = new javax.swing.JButton();
        usuarioElim1 = new javax.swing.JLabel();
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

        confirmacion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        confirmacion.setAlwaysOnTop(true);
        confirmacion.setBackground(new java.awt.Color(252, 238, 220));
        confirmacion.setBounds(new java.awt.Rectangle(377, 216, 562, 488));
        confirmacion.setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 236, 223));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelConfirmacion3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        labelConfirmacion3.setForeground(new java.awt.Color(153, 0, 51));
        labelConfirmacion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConfirmacion3.setText("REGISTRAR MESERO");
        jPanel4.add(labelConfirmacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 540, 30));

        cancelarReg.setBackground(new java.awt.Color(204, 70, 0));
        cancelarReg.setForeground(new java.awt.Color(102, 0, 0));
        cancelarReg.setText("Cancelar");
        cancelarReg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 0, 0)));
        cancelarReg.setContentAreaFilled(false);
        cancelarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarRegActionPerformed(evt);
            }
        });
        jPanel4.add(cancelarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 80, -1));

        aceptarReg.setBackground(new java.awt.Color(204, 70, 0));
        aceptarReg.setForeground(new java.awt.Color(102, 0, 0));
        aceptarReg.setText("Aceptar");
        aceptarReg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 0, 0)));
        aceptarReg.setContentAreaFilled(false);
        aceptarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarRegActionPerformed(evt);
            }
        });
        jPanel4.add(aceptarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 80, -1));

        label10.setForeground(new java.awt.Color(102, 0, 0));
        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText("Desea registrarse e ingresar al sistema como");
        jPanel4.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 540, 30));

        usuarioReg.setForeground(new java.awt.Color(102, 0, 0));
        usuarioReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(usuarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 540, 30));

        label11.setForeground(new java.awt.Color(102, 0, 0));
        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 540, 30));

        javax.swing.GroupLayout confirmacionLayout = new javax.swing.GroupLayout(confirmacion.getContentPane());
        confirmacion.getContentPane().setLayout(confirmacionLayout);
        confirmacionLayout.setHorizontalGroup(
            confirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        confirmacionLayout.setVerticalGroup(
            confirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        confirmacion1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        confirmacion1.setAlwaysOnTop(true);
        confirmacion1.setBackground(new java.awt.Color(252, 238, 220));
        confirmacion1.setBounds(new java.awt.Rectangle(377, 216, 562, 488));
        confirmacion1.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 236, 223));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioEliminado.setForeground(new java.awt.Color(102, 0, 0));
        usuarioEliminado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(usuarioEliminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 540, 30));

        labelConfirmacion4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        labelConfirmacion4.setForeground(new java.awt.Color(153, 0, 51));
        labelConfirmacion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConfirmacion4.setText("ELIMINAR MESERO");
        jPanel5.add(labelConfirmacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 540, 30));

        label12.setForeground(new java.awt.Color(102, 0, 0));
        label12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label12.setText("Desea eliminar el mesero");
        jPanel5.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 540, 30));

        aceptarRen.setBackground(new java.awt.Color(204, 70, 0));
        aceptarRen.setForeground(new java.awt.Color(102, 0, 0));
        aceptarRen.setText("Aceptar");
        aceptarRen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 0, 0)));
        aceptarRen.setContentAreaFilled(false);
        aceptarRen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarRenActionPerformed(evt);
            }
        });
        jPanel5.add(aceptarRen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 80, -1));

        cancelarRen.setBackground(new java.awt.Color(204, 70, 0));
        cancelarRen.setForeground(new java.awt.Color(102, 0, 0));
        cancelarRen.setText("Cancelar");
        cancelarRen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 0, 0)));
        cancelarRen.setContentAreaFilled(false);
        cancelarRen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarRenActionPerformed(evt);
            }
        });
        jPanel5.add(cancelarRen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 80, -1));

        usuarioElim1.setForeground(new java.awt.Color(102, 0, 0));
        usuarioElim1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(usuarioElim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 540, 30));

        javax.swing.GroupLayout confirmacion1Layout = new javax.swing.GroupLayout(confirmacion1.getContentPane());
        confirmacion1.getContentPane().setLayout(confirmacion1Layout);
        confirmacion1Layout.setHorizontalGroup(
            confirmacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        confirmacion1Layout.setVerticalGroup(
            confirmacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrincipal.setAlignmentX(0.0F);
        panelPrincipal.setAlignmentY(0.0F);
        panelPrincipal.setLayout(null);

        panelDeInicio.setBackground(new java.awt.Color(255, 236, 223));
        panelDeInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

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

        label2.setForeground(new java.awt.Color(102, 0, 0));
        label2.setText("Nick:");

        label1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 0, 0));
        label1.setText("INGRESAR");

        label3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 0, 51));
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

        javax.swing.GroupLayout panelDeInicioLayout = new javax.swing.GroupLayout(panelDeInicio);
        panelDeInicio.setLayout(panelDeInicioLayout);
        panelDeInicioLayout.setHorizontalGroup(
            panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeInicioLayout.createSequentialGroup()
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeInicioLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(label3)
                        .addGap(18, 18, 18)
                        .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDeInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelDeInicioLayout.createSequentialGroup()
                                .addComponent(bRenunciar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDeInicioLayout.createSequentialGroup()
                                .addComponent(label2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelDeInicioLayout.setVerticalGroup(
            panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeInicioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(bRenunciar))
                .addGap(43, 43, 43)
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelDeInicio);
        panelDeInicio.setBounds(550, 280, 260, 320);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(jButton1);
        jButton1.setBounds(50, 40, 30, 40);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
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

    //Fija tamaño de la resolucion
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    //Buscamos en la base de datos si existe el mesero y lo registramos
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        
        this.setNombre(textoBuscar.getText());
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
      
            MeseroData mesero=new MeseroData(conexion);
            
           this.filtrados= mesero.obtenerMeseros().stream().filter(mese -> this.meseroEsta(mese.getNombreMesero())).collect(Collectors.toList());
            
           //Si el mesero esta reistrado inicia sesión
           if (!this.filtrados.isEmpty()){
            Inicio.almacenarUsuario(this.getNombre());
            panelPrincipal.removeAll();
            Background background=new Background();
            background.setVisible(true);
            this.setVisible(false);
           }else{
               //Sino invoca estos componentes que le permiten registrarse
               label3.setVisible(true);
               signUp.setVisible(true);
           }
           
        }catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }   
    }//GEN-LAST:event_botonBuscarActionPerformed

    //método para registrar al mesero que intenta iniciar sesión, lo guarda en la base de datos y entra al programa
    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        confirmacion.setUndecorated(true);
        usuarioReg.setText(this.getNombre()+"?");
        confirmacion.setVisible(true);
    }//GEN-LAST:event_signUpActionPerformed

    //Buscamos en la base de datos si existe el mesero y lo registramos, se invoca con enter en el campo de buscar
    private void textoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBuscarKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            
        this.setNombre(textoBuscar.getText());
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
      
            MeseroData mesero=new MeseroData(conexion);
            
           this.filtrados= mesero.obtenerMeseros().stream().filter(mese -> this.meseroEsta(mese.getNombreMesero())).collect(Collectors.toList());
            
           if (!this.filtrados.isEmpty()){
            Inicio.almacenarUsuario(this.getNombre());
            panelPrincipal.removeAll();
            Background background=new Background();
            background.setVisible(true);
            this.dispose();
            
           }else{
               label3.setVisible(true);
               signUp.setVisible(true);
           }
           
        }catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }  
        }
    }//GEN-LAST:event_textoBuscarKeyPressed

    //elimina al mesero de la base de datos y lo avisa en el campo de texto
    private void bRenunciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRenunciarActionPerformed
        usuarioEliminado.setText(textoBuscar.getText()+"?");
        confirmacion1.setUndecorated(true);
        confirmacion1.setVisible(true);
    }//GEN-LAST:event_bRenunciarActionPerformed

    //Cierra el programa
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarRegActionPerformed
        confirmacion.dispose();
    }//GEN-LAST:event_cancelarRegActionPerformed

    private void aceptarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarRegActionPerformed
                this.setNombre(textoBuscar.getText());
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
      
            MeseroData mesero=new MeseroData(conexion);
            
            Mesero mesero1=new Mesero(this.getNombre());
            mesero.guardarMeseros(mesero1);
            
            
            
            this.filtrados= mesero.obtenerMeseros().stream().filter(mese -> this.meseroEsta(mese.getNombreMesero())).collect(Collectors.toList());
                       
            if (!this.filtrados.isEmpty()){
            Inicio.almacenarUsuario(this.getNombre());
            panelPrincipal.removeAll();
            Background background=new Background();
            background.setVisible(true);
            this.setVisible(false);
            confirmacion.dispose();
            confirmacion.setVisible(false);
           }
            
        }catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
    }//GEN-LAST:event_aceptarRegActionPerformed

    private void aceptarRenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarRenActionPerformed
    this.setNombre(textoBuscar.getText());
        
        try {
            Conexion conexion = new Conexion();
            conexion.getConexion();
            
            MeseroData mesero1=new MeseroData(conexion);
            
            mesero1.borrarMesero(this.getNombre());
            textoBuscar.setText(null);
            confirmacion1.setVisible(false);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aceptarRenActionPerformed

    private void cancelarRenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarRenActionPerformed
        confirmacion1.dispose();
    }//GEN-LAST:event_cancelarRenActionPerformed
      
    /**
     * @param args the command line arguments
     */
    
    //Método main para ejecutar todo nuestro programa
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarReg;
    private javax.swing.JButton aceptarRen;
    private javax.swing.JButton bRenunciar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton cancelarReg;
    private javax.swing.JButton cancelarRen;
    private javax.swing.JDialog confirmacion;
    private javax.swing.JDialog confirmacion1;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel labelConfirmacion3;
    private javax.swing.JLabel labelConfirmacion4;
    private javax.swing.JPanel panelDeInicio;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton signUp;
    private javax.swing.JTextField textoBuscar;
    private javax.swing.JLabel usuarioElim1;
    private javax.swing.JLabel usuarioEliminado;
    private javax.swing.JLabel usuarioReg;
    // End of variables declaration//GEN-END:variables
}
