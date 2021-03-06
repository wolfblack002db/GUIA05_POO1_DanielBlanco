/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;
import com.sv.udb.controlador.EquipoCtrl;
import com.sv.udb.controlador.JugadoresCtrl;
import com.sv.udb.modelo.ModeloEquipo;
import com.sv.udb.modelo.ModeloJugadores;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Estudiante
 */
public class GUIA05_POO1_DanielBlanco extends javax.swing.JFrame {

    /**
     * Creates new form GUIA05_POO1_DanielBlanco
     */
    int idEq = 0;
    int idJu = 0;
    EquipoCtrl equiCtrl;
    public GUIA05_POO1_DanielBlanco() {
        initComponents();
        llenarTabla();
        llenarTablaJugadores();
        this.equiCtrl = new EquipoCtrl();
        cargarcomboequipos();
    }

    private void llenarTabla() {
        try {
            DefaultTableModel model = (DefaultTableModel) this.tblequipos.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            } //Limpiar modelo
            for (ModeloEquipo temp : new EquipoCtrl().obtenerTodo()) {
                model.addRow(new Object[]{temp, temp.getDescri()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void llenarTablaJugadores() {
        try {
            DefaultTableModel model = (DefaultTableModel) this.tbljugadores.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            } //Limpiar modelo
            for (ModeloJugadores temp : new JugadoresCtrl().consTodo()) {
                model.addRow(new Object[]{temp.getCodiEqui(), temp,temp.getEdadJuga(),temp.getAltuJuga(),
                temp.getPesoJuga()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbljugadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbequipos = new javax.swing.JComboBox<>();
        txtnombrejuga = new javax.swing.JTextField();
        txtedadjuga = new javax.swing.JTextField();
        txtalturajuga = new javax.swing.JTextField();
        txtpesojuga = new javax.swing.JTextField();
        btnagregarjuga = new javax.swing.JButton();
        btnlimpiarjuga = new javax.swing.JButton();
        btnmodificarjuga = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblequipos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnModiEq = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminarEq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        tbljugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Equipo", "Jugador", "Edad", "Altura", "Peso"
            }
        ));
        tbljugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbljugadoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbljugadores);

        jLabel1.setText("Nombre");

        jLabel4.setText("Altura");

        jLabel5.setText("Equipo");

        jLabel6.setText("Peso");

        jLabel7.setText("Edad");

        btnagregarjuga.setText("Guardar");
        btnagregarjuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarjugaActionPerformed(evt);
            }
        });

        btnlimpiarjuga.setText("Limpiar");
        btnlimpiarjuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarjugaActionPerformed(evt);
            }
        });

        btnmodificarjuga.setText("Modificar");
        btnmodificarjuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarjugaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cmbequipos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombrejuga, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txtedadjuga)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtalturajuga)
                            .addComponent(txtpesojuga)))
                    .addComponent(btnagregarjuga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnlimpiarjuga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmodificarjuga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbequipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombrejuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtedadjuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtalturajuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpesojuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnagregarjuga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiarjuga)
                    .addComponent(btnmodificarjuga))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jugadores", jPanel2);

        jLabel2.setText("Nombre");

        tblequipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Descripcion"
            }
        ));
        tblequipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblequiposMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblequipos);

        jLabel3.setText("Descripcion");

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnModiEq.setText("Modificar");
        btnModiEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiEqActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminarEq.setText("Eliminar");
        btnEliminarEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(txtnombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnagregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModiEq, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                            .addComponent(txtdescripcion)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarEq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregar)
                            .addComponent(btnModiEq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarEq))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Equipos", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        try
        {
            if (new EquipoCtrl().guar(this.txtnombre.getText(), this.txtdescripcion.getText())) 
            {
                JOptionPane.showMessageDialog(this, "Equipo guardado correctamente", "POO", JOptionPane.INFORMATION_MESSAGE);
                this.txtnombre.setText("");
                this.txtdescripcion.setText("");
                llenarTabla();
                cargarcomboequipos();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al guardar equipo, favor verifique","POO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error al PROCESAR","POO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void tblequiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblequiposMouseClicked
        // TODO add your handling code here:
        int fila = this.tblequipos.getSelectedRow();
        if (fila >= 0) {
            ModeloEquipo obje = (ModeloEquipo) this.tblequipos.getValueAt(fila, 0);
            idEq = obje.getCodiEqui();
            txtnombre.setText(obje.getNombre());
            txtdescripcion.setText(obje.getDescri());
            
        }
    }//GEN-LAST:event_tblequiposMouseClicked
    public void cargarcomboequipos(){
        DefaultComboBoxModel<ModeloEquipo> modeEqui = new DefaultComboBoxModel<>();
        for (ModeloEquipo temp : equiCtrl.obtenerTodo()) {
            modeEqui.addElement(temp);
        }
        this.cmbequipos.setModel((DefaultComboBoxModel)modeEqui);
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarEq();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModiEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiEqActionPerformed
        // TODO add your handling code here:
        try {
       
        if(idEq != 0){
            if(new EquipoCtrl().modificar(idEq, txtnombre.getText(),txtdescripcion.getText())){
                JOptionPane.showMessageDialog(this, "Se modifico correctamente");
                limpiarEq();
                llenarTabla();
                cargarcomboequipos();
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo modificar");
            }
        }else{
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun equipo");
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnModiEqActionPerformed

    private void btnEliminarEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEqActionPerformed
        // TODO add your handling code here:
        if(idEq !=0){
            int dialogResult = JOptionPane.showConfirmDialog(null, "Desea eliminar el equipo?", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                if (new EquipoCtrl().eliminar(idEq)) {
                    JOptionPane.showMessageDialog(this, "Se elimino correctamente");
                    limpiarEq();
                    llenarTabla();
                    cargarcomboequipos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun equipo");
        }
    }//GEN-LAST:event_btnEliminarEqActionPerformed

    private void btnagregarjugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarjugaActionPerformed
        // TODO add your handling code here:
        try
        {
            if (new JugadoresCtrl().guar((ModeloEquipo)cmbequipos.getSelectedItem(),txtnombrejuga.getText(),
                    Integer.parseInt(txtedadjuga.getText()),Integer.parseInt(txtalturajuga.getText()),
                    Integer.parseInt(txtpesojuga.getText()))) 
            {
                JOptionPane.showMessageDialog(this, "Jugadores guardado correctamente", "POO", JOptionPane.INFORMATION_MESSAGE);
                limpiarjuga();
                llenarTablaJugadores();
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al guardar jugador, favor verifique","POO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error al PROCESAR","POO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnagregarjugaActionPerformed
    public void limpiarjuga(){
        this.txtnombrejuga.setText("");
        this.txtedadjuga.setText("");
        this.txtalturajuga.setText("");
        this.txtpesojuga.setText("");
    }
    private void tbljugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbljugadoresMouseClicked
        // TODO add your handling code here:
        int fila = this.tbljugadores.getSelectedRow();
        if (fila >= 0) {
            ModeloJugadores obje = (ModeloJugadores) this.tbljugadores.getValueAt(fila,1);
            idJu = obje.getCodiJuga();
            cmbequipos.setEditable(true);
            cmbequipos.setSelectedItem(obje.getCodiEqui());
            cmbequipos.setEditable(false);
            txtnombrejuga.setText(obje.getNombJuga());
            txtedadjuga.setText(String.valueOf(obje.getEdadJuga()));
            txtalturajuga.setText(String.valueOf(obje.getAltuJuga()));
            txtpesojuga.setText(String.valueOf(obje.getPesoJuga()));
            
        }
    }//GEN-LAST:event_tbljugadoresMouseClicked

    private void btnlimpiarjugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarjugaActionPerformed
        // TODO add your handling code here:
        limpiarjuga();
    }//GEN-LAST:event_btnlimpiarjugaActionPerformed

    private void btnmodificarjugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarjugaActionPerformed
        // TODO add your handling code here:
        try {
       
        if(idJu != 0){
            if(new EquipoCtrl().modificar(idEq, txtnombre.getText(),txtdescripcion.getText())){
                JOptionPane.showMessageDialog(this, "Se modifico correctamente");
                limpiarEq();
                llenarTabla();
                cargarcomboequipos();
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo modificar");
            }
        }else{
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun equipo");
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnmodificarjugaActionPerformed

    public void limpiarEq(){
        txtnombre.setText("");
        txtdescripcion.setText("");
        idEq=0;
    }
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
            java.util.logging.Logger.getLogger(GUIA05_POO1_DanielBlanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIA05_POO1_DanielBlanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIA05_POO1_DanielBlanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIA05_POO1_DanielBlanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIA05_POO1_DanielBlanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarEq;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModiEq;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnagregarjuga;
    private javax.swing.JButton btnlimpiarjuga;
    private javax.swing.JButton btnmodificarjuga;
    private javax.swing.JComboBox<String> cmbequipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblequipos;
    private javax.swing.JTable tbljugadores;
    private javax.swing.JTextField txtalturajuga;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtedadjuga;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombrejuga;
    private javax.swing.JTextField txtpesojuga;
    // End of variables declaration//GEN-END:variables
}
