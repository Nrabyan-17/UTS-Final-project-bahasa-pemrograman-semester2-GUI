/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pelanggan extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    Koneksi_Database k = new Koneksi_Database();

    cPelanggan pel[];
    int jpel;
    int mpel;

    public Pelanggan() {
        initComponents();
        pel = new cPelanggan[5];
        jpel = 0;
        mpel = 5;
    }
    
    class tabel_pelanggan extends Pelanggan {
        int id_pelanggan;
        String nama_pelanggan, alamat_pelanggan;
        
        public tabel_pelanggan () {
            this.id_pelanggan = Integer.parseInt(txtIDPel.getText());
            this.nama_pelanggan = txtNamaPel.getText();
            this.alamat_pelanggan = txtAlamatPel.getText();
        }
    }

    public void refreshTable () {
        model = new DefaultTableModel();
        model.addColumn("id_pelanggan");
        model.addColumn("nama_pelanggan");
        model.addColumn("alamat_pelanggan");
        tabel_pelanggan.setModel(model);
        
        try {
            this.stat = k.getCon().prepareStatement("select * from tabel_pelanggan");
            this.rs = this.stat.executeQuery();
            
            while (rs.next()) {
                Object[] data = {
                   rs.getInt("id_pelanggan"), 
                   rs.getString("nama_pelanggan"),
                   rs.getString("alamat_pelanggan")  
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        txtIDPel.setText("");
        txtNamaPel.setText("");
        txtAlamatPel.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDPel = new javax.swing.JTextField();
        txtNamaPel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAlamatPel = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_input = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_pelanggan = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtnBack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(119, 136, 153));
        jPanel4.setLayout(null);
        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 580, 470, 60);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("ID Pelanggan");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 70, 107, 28);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Nama Pelanggan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 110, 110, 31);

        txtIDPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDPelActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDPel);
        txtIDPel.setBounds(154, 71, 290, 31);

        txtNamaPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaPelActionPerformed(evt);
            }
        });
        jPanel1.add(txtNamaPel);
        txtNamaPel.setBounds(153, 110, 290, 31);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel6.setText("Alamat Pelanggan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 150, 130, 32);

        txtAlamatPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatPelActionPerformed(evt);
            }
        });
        jPanel1.add(txtAlamatPel);
        txtAlamatPel.setBounds(153, 150, 290, 31);

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update);
        btn_update.setBounds(190, 220, 93, 40);

        btn_input.setText("INPUT");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        jPanel1.add(btn_input);
        btn_input.setBounds(70, 220, 98, 40);

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete);
        btn_delete.setBounds(300, 220, 93, 40);

        tabel_pelanggan.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tabel_pelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pelanggan", "Nama Pelanggan", "Alamat Pelanggan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel_pelanggan);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 280, 470, 300);

        jPanel5.setBackground(new java.awt.Color(119, 136, 153));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data Pelanggan");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(110, 10, 221, 37);

        jbtnBack1.setFont(new java.awt.Font("Verdana", 0, 8)); // NOI18N
        jbtnBack1.setText("BACK");
        jbtnBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnBack1MouseClicked(evt);
            }
        });
        jbtnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBack1ActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnBack1);
        jbtnBack1.setBounds(380, 10, 65, 37);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 470, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDPelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDPelActionPerformed

    private void txtNamaPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaPelActionPerformed

    private void txtAlamatPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatPelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatPelActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        boolean ketemu = false;
        int indeks = 0;
        String IDPel = JOptionPane.showInputDialog(this, "Masukkan ID Pelanggan");
        for (int i = 0; i < jpel; i++) {
            indeks=i;
            if(pel[i].getIDPelanggan() == Integer.parseInt(IDPel)){
    ketemu = true;
    break;
}
        }
        if(ketemu==true){
            String ap = JOptionPane.showInputDialog(this, "Masukkan Alamat Baru");
            int j = JOptionPane.showConfirmDialog(this, "Yakin diubah?");
            if(j==0){
                pel[indeks].setAlamatPelanggan(ap);

                DefaultTableModel model = (DefaultTableModel)tabel_pelanggan.getModel();
                model.setValueAt(ap, indeks, 2);
                JOptionPane.showMessageDialog(this, "Berhasil Diupdate");
            } else {
                JOptionPane.showMessageDialog(this, "Batal Diupdate!!");
            }
        }else{
            JOptionPane.showMessageDialog(this, "ID Tidak Tersedia");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabel_pelanggan.getModel();
        if (jpel < 5) {
            boolean ketemu = false;
            for (int i = 0; i < jpel; i++) {
                if (pel[i].getIDPelanggan() == Integer.parseInt(txtIDPel.getText())){
                    ketemu = true;
                    break;
                }
            }
            if (ketemu) {
                JOptionPane.showMessageDialog(this, "ID sudah ada");
            } else {
                pel[jpel] = new cPelanggan();
                pel[jpel].setIDPelanggan(Integer.parseInt(txtIDPel.getText()));
                pel[jpel].setNamaPelanggan(txtNamaPel.getText());
                pel[jpel].setAlamatPelanggan(txtAlamatPel.getText());
              
                Object[] row = {
                    pel[jpel].getIDPelanggan(),
                    pel[jpel].getNamaPelanggan(),
                    pel[jpel].getAlamatPelanggan()
                };

                model.addRow(row);
                jpel++;
                JOptionPane.showMessageDialog(this, "Input Sukses");

                txtIDPel.setText("");
                txtNamaPel.setText("");
                txtAlamatPel.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Kapasitas Pelanggan sudah full");
            txtIDPel.setText("");
            txtNamaPel.setText("");
            txtAlamatPel.setText("");
        }
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        boolean ketemu = false;
        int indekshapus = 0;
        String IDPel = JOptionPane.showInputDialog(this, "Masukkan ID Pelanggan");
        for (int i = 0; i < jpel; i++) {
            indekshapus=i;
            if(pel[i].getIDPelanggan() == Integer.parseInt(IDPel)){
                ketemu = true;
                break;
            }
        }
        if(ketemu==true){
            int j = JOptionPane.showConfirmDialog(this, "Yakin ingin dihapus?");
            if(j==0){
                for (int i = indekshapus; i < jpel; i++) {
                    if(i==jpel-1)
                        pel[i]=null;
                    else
                        pel[i]=pel[i+1];
                }
                jpel--;
                DefaultTableModel model = (DefaultTableModel)tabel_pelanggan.getModel();
                model.removeRow(indekshapus);
                JOptionPane.showMessageDialog(this, "Berhasil Dihapus");
            } else {
                JOptionPane.showMessageDialog(this, "Batal Dihapus!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ID Tidak Tersedia");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jbtnBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnBack1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnBack1MouseClicked

    private void jbtnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBack1ActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(Home.EXIT_ON_CLOSE);
        
    }//GEN-LAST:event_jbtnBack1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_delete;
    public javax.swing.JButton btn_input;
    public javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtnBack1;
    private javax.swing.JTable tabel_pelanggan;
    private javax.swing.JTextField txtAlamatPel;
    private javax.swing.JTextField txtIDPel;
    private javax.swing.JTextField txtNamaPel;
    // End of variables declaration//GEN-END:variables
}