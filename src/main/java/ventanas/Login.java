//Nombre del páquete
package ventanas;

//Librerías importadas
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Darlin Manuel Casado Pérez
 */
public class Login extends javax.swing.JFrame {
    
    //Conexion a la base de datos mediante la clase conexion
    Connection cn = Conexion.conector();

   
    //Constructor del login
    public Login() {
        initComponents();
       
        this.getContentPane().setBackground(getBackground());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlabel_Login = new javax.swing.JLabel();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_Contraseña = new javax.swing.JLabel();
        btn_Iniciar = new javax.swing.JButton();
        jTextField_Usuario = new javax.swing.JTextField();
        jPassword_Contraseña = new javax.swing.JPasswordField();
        jLabel_noTieneCuenta = new javax.swing.JLabel();
        Registrarme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 204, 255));

        Jlabel_Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_Login.setText("Login");

        jLabel_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Usuario.setText("Usuario");

        jLabel_Contraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Contraseña.setText("Contraseña");

        btn_Iniciar.setText("Iniciar");
        btn_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarActionPerformed(evt);
            }
        });

        jLabel_noTieneCuenta.setText("¿No tienes cuenta?");

        Registrarme.setText("Registrarme");
        Registrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Usuario)
                    .addComponent(jLabel_Contraseña))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Jlabel_Login))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPassword_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Registrarme)
                    .addComponent(jLabel_noTieneCuenta))
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Jlabel_Login)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Usuario)
                    .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Contraseña)
                    .addComponent(jPassword_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel_noTieneCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registrarme)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Acción del botón Registrame que cierra la ventana del login
    //y abre la ventana del registro
    private void RegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarmeActionPerformed
      Registro rg = new Registro();
      this.dispose();
      rg.setVisible(true);
    }//GEN-LAST:event_RegistrarmeActionPerformed

    //Acción de boton iniciar que ejecuta el método validar
    private void btn_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarActionPerformed
       Validar();
    }//GEN-LAST:event_btn_IniciarActionPerformed

    //Logica para validar los datos ingresados por el 
    //usuario en los campos del login.
    public void Validar(){
      int resultado = 0;
      String usuario = jTextField_Usuario.getText();
      String contraseña = new String(jPassword_Contraseña.getPassword());
      String query= "SELECT * FROM usuarios.usuarios Where Usuario= '"+usuario+"' and Contraseña= '"+contraseña+"' ";   
      int Contador = 0;
      if (usuario.equals("")||contraseña.equals("")) {
            Contador++;
            JOptionPane.showMessageDialog(null, "“Debe ingresar su usuario y contraseña, si no está registrado debe registrarse");
      }
      if(Contador==0){
       try{
         Statement st = cn.createStatement();
         ResultSet rs = st.executeQuery(query);
         if(rs.next()){
            resultado = 1;
            if (resultado==1){
                Principal principal = new Principal();
                this.dispose();
                principal.setVisible(true);
            }
          }else{
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión, usuario no registrado");
          }
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Hubo un error");
        }
      }   
    
    }
    
    //Metodo main de la clase Login
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_Login;
    private javax.swing.JButton Registrarme;
    private javax.swing.JButton btn_Iniciar;
    private javax.swing.JLabel jLabel_Contraseña;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JLabel jLabel_noTieneCuenta;
    private javax.swing.JPasswordField jPassword_Contraseña;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
