//Nombre del paquete
package ventanas;

//Librerías importadas
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Darlin Manuel Casado Pérez
 */

//Nombre de la clase
public class Principal extends javax.swing.JFrame {

    //Conexion a la base de datos mediante la clase conexion.
    Connection cn = Conexion.conector();

    //Constructor de la clase
    public Principal() {
        initComponents();
        this.getContentPane().setBackground(getBackground());
        try {
            mostrarDatos();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel_Clientes = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlabel_datos = new javax.swing.JLabel();
        PrincipalNombre = new javax.swing.JLabel();
        txtPrinNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrinApellido = new javax.swing.JTextField();
        jlabelTelefono = new javax.swing.JLabel();
        txtPrinTelefono = new javax.swing.JTextField();
        jlabelCorreo = new javax.swing.JLabel();
        txtPrinCorreo = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        txtPrinUsuario = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        txtPrinContraseña = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(0, 204, 255));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        jLabel_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel_Clientes.setText("Clientes Registro");

        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(136, 37));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.setPreferredSize(new java.awt.Dimension(136, 37));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(136, 37));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_datos.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jlabel_datos.setText("Datos");

        PrincipalNombre.setText("Nombre");

        jLabel1.setText("Apellido");

        jlabelTelefono.setText("Telefono");

        jlabelCorreo.setText("Correo");

        jLabelUsuario.setText("Usuario");

        jLabelContraseña.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlabelTelefono)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlabelCorreo)
                                    .addComponent(jLabelUsuario)
                                    .addComponent(PrincipalNombre)
                                    .addComponent(jLabel1)
                                    .addComponent(txtPrinApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(txtPrinNombre)
                                    .addComponent(txtPrinTelefono)
                                    .addComponent(txtPrinCorreo)
                                    .addComponent(txtPrinUsuario)
                                    .addComponent(jLabelContraseña)
                                    .addComponent(txtPrinContraseña))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jlabel_datos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Clientes)
                        .addGap(189, 189, 189))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Clientes)
                            .addComponent(jlabel_datos))
                        .addGap(44, 44, 44)
                        .addComponent(PrincipalNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrinNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrinApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jlabelTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrinTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jlabelCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrinCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrinUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelContraseña)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrinContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Método para mostrar los datos en la tabla.
    public void mostrarDatos() throws SQLException {
        String[] titulos = {"Nombre", "Apellido", "Teléfono", "Correo", "Usuario", "Contraseña"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String query = "SELECT * FROM usuarios.usuarios";

        Statement pst = cn.createStatement();
        ResultSet rs = pst.executeQuery(query);

        while (rs.next()) {
            registros[0] = rs.getString("Nombre");
            registros[1] = rs.getString("Apellido");
            registros[2] = rs.getString("Telefono");
            registros[3] = rs.getString("Correo");
            registros[4] = rs.getString("Usuario");
            registros[5] = rs.getString("Contraseña");

            modelo.addRow(registros);
        }

        try {
            tablaUsuarios.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    
    //Método para limpiar las cajas de texto de la ventana principal.
    public void limpiarCajas() {
        txtPrinNombre.setText("");
        txtPrinApellido.setText("");
        txtPrinTelefono.setText("");
        txtPrinCorreo.setText("");
        txtPrinUsuario.setText("");
        txtPrinContraseña.setText("");
    }

    //Método para actualizar los datos de la tabla.
    public void actualizarDatos() {

        try {

            String Usuario = new String(txtPrinUsuario.getText());
            String query = "UPDATE usuarios.usuarios set Nombre=?,Apellido=?,Telefono=?,Correo=?,Usuario=?,Contraseña=? WHERE Usuario='" + Usuario + "' ";
            int filaSeleccionada = tablaUsuarios.getSelectedRow();
            PreparedStatement pst = cn.prepareStatement(query);

            pst.setString(1, txtPrinNombre.getText());
            pst.setString(2, txtPrinApellido.getText());
            pst.setString(3, txtPrinTelefono.getText());
            pst.setString(4, txtPrinCorreo.getText());
            pst.setString(5, txtPrinUsuario.getText());
            pst.setString(6, txtPrinContraseña.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage());
        }

    }
    
    //Método para eliminar los datos de la tabla
    public void eliminar(){
        try {
            String Usuario = new String(txtPrinUsuario.getText());
            String query = ("DELETE FROM usuarios.usuarios WHERE Usuario = '"+Usuario+"'");
            PreparedStatement pst = cn.prepareStatement(query);
            
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error " + ex.getMessage());
        }
    
    }

    //Para cerrar el formulario principal y volver al login.
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Login login = new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    //Método Para Agregar nuevos registros.
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Registro rg = new Registro();
        this.dispose();
        rg.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    //Evento mouseClicked Para obtener los datos de una fila en específico.
    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        int filaSeleccionada = tablaUsuarios.rowAtPoint(evt.getPoint());

        txtPrinNombre.setText(tablaUsuarios.getValueAt(filaSeleccionada, 0).toString());
        txtPrinApellido.setText(tablaUsuarios.getValueAt(filaSeleccionada, 1).toString());
        txtPrinTelefono.setText(tablaUsuarios.getValueAt(filaSeleccionada, 2).toString());
        txtPrinCorreo.setText(tablaUsuarios.getValueAt(filaSeleccionada, 3).toString());
        txtPrinUsuario.setText(tablaUsuarios.getValueAt(filaSeleccionada, 4).toString());
        txtPrinContraseña.setText(tablaUsuarios.getValueAt(filaSeleccionada, 5).toString());
    }//GEN-LAST:event_tablaUsuariosMouseClicked


    //Acction del boton actualizar que ejecuta el método actualizarDatos, el método limpiarCajas,
    //y mostrarDatos
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarDatos();
        limpiarCajas();
        try {
            mostrarDatos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error " + ex);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    //Acción del boton Eliminar que ejecuta el método eliminar, limpiarCajas y
    //mostrarDatos
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarCajas();
        try {
            mostrarDatos();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Hubo un error " + ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Método Main
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PrincipalNombre;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabel_Clientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabelCorreo;
    private javax.swing.JLabel jlabelTelefono;
    private javax.swing.JLabel jlabel_datos;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtPrinApellido;
    private javax.swing.JTextField txtPrinContraseña;
    private javax.swing.JTextField txtPrinCorreo;
    private javax.swing.JTextField txtPrinNombre;
    private javax.swing.JTextField txtPrinTelefono;
    private javax.swing.JTextField txtPrinUsuario;
    // End of variables declaration//GEN-END:variables
}
