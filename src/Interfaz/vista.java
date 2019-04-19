package Interfaz;

import infoelectivas.Data;
import infoelectivas.Electiva;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Alejandro
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    Data data = new Data();

    public vista() {
        
        initComponents();
        this.setLocationRelativeTo(null);

    }

    private void cargarElectivas() {

        jPanel1.removeAll();
        int Y = 5;

        if (jComboBox2.getItemCount() != 0) {
            if (!jComboBox2.getSelectedItem().toString().equals(" ")) {
                String[] electivas = data.ObtenerElectivas(jComboBox2.getSelectedItem().toString());
                for (int i = 0; i < electivas.length; i++) {

                    if (electivas[i] != null) {
                        JButton electiva = new JButton(electivas[i]);
                        electiva.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 11));
                        electiva.setVisible(true);
                        electiva.setName(String.valueOf(i));
                        electiva.addActionListener(new java.awt.event.ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //To change body of generated methods, choose Tools | Templates.

                                mostrarinformacion(e.getActionCommand());
                            }

                        });
                        jPanel1.add(electiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, Y, 200, 40));
                        Y = Y + 45;

                    }

                    jPanel1.updateUI();

                }

            }
        }
    }

    private void mostrarinformacion(String name) {
        Electiva elec = new Electiva(name);

        this.nombre.setText(name);
        this.codigo.setText(elec.getCodigo());
        this.tipo.setText(elec.getTipo());
        this.descripcion.setText(elec.getDescripcion());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        codigoBusqueda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel4.setText("Seleccione el semestre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 230, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel3.setText("Busqueda por Codigo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 210, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segundo Semestre", "Tercer Semestre", "Cuarto Semestre", "Quinto Semestre", "Sexto Semestre", "Septimo Semestre", "Octavo Semestre", "Noveno Semestre", "Decimo Semestre" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 30));

        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 230, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/iconouninorte.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 120, 150));

        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 230, 290));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tipo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Descripcion: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Codigo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nombre: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 90, 30));

        tipo.setEditable(false);
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 420, 30));

        nombre.setEditable(false);
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 420, 30));

        codigo.setEditable(false);
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 180, 30));

        descripcion.setEditable(false);
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        descripcion.setLineWrap(true);
        descripcion.setRows(5);
        jScrollPane2.setViewportView(descripcion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 520, 120));

        codigoBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoBusquedaKeyPressed(evt);
            }
        });
        getContentPane().add(codigoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel9.setText("Seleccione la electiva");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/degradados-fondos-de-pantalla-textura-la-luz-patr-n-fondo-un-degradado-429735.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        jComboBox2.removeAllItems();
        jPanel1.removeAll();
        this.tipo.setText("");
        this.nombre.setText("");
        this.codigo.setText("");
        this.descripcion.setText("");

        if (!jComboBox1.getSelectedItem().toString().equals(" ")) {
            String semestre = jComboBox1.getSelectedItem().toString();
            String[] tipoelectivas = data.tipoElectivasSemestre(semestre);

            for (int i = 0; i < tipoelectivas.length; i++) {
                if (tipoelectivas[i] != null) {
                    jComboBox2.addItem(tipoelectivas[i]);
                }
            }
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        cargarElectivas();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void codigoBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoBusquedaKeyPressed
        
        int enter = evt.VK_ENTER;
        String c = codigoBusqueda.getText().replace(" ", "");
        if (evt.getKeyCode() == enter && c.length() > 0) {
            
            Electiva elec = new Electiva(codigoBusqueda.getText(),0);
            
            codigo.setText(elec.getCodigo());
            nombre.setText(elec.getName());
            tipo.setText(elec.getTipo());
            descripcion.setText(elec.getDescripcion());
        }
    }//GEN-LAST:event_codigoBusquedaKeyPressed

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField codigoBusqueda;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
}
