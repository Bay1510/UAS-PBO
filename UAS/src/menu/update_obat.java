package menu;

import menu.tambah_obat;
import menu.config_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import login.admin;

/**
 *
 * @author Bayu
 */

public final class update_obat extends javax.swing.JFrame {
    public update_obat() {
        initComponents();
        showdata();
        clear();
             }

    public Connection conn;
    
    private void clear(){
        txtnama.setText(null);
        txtnomor.setText(null);
        txttype.setText(null);
        txtstok.setText(null);
        txtharga.setText(null);
    }
    
    public void koneksi() throws SQLException {
        try {
            conn=null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginklinik", "root", "");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tambah_obat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(tambah_obat.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(tambah_obat.class.getName()).log(Level.SEVERE, null, es);
        }

    }
    
    
    protected void showdata() {
        DefaultTableModel tabelantri = new DefaultTableModel();
        tabelantri.addColumn("NO");
        tabelantri.addColumn("NAMA");
        tabelantri.addColumn("TYPE");
        tabelantri.addColumn("STOK");
        tabelantri.addColumn("HARGA");
        try {
            koneksi();
            String sql = "select * from obat";
            Statement stat = conn.createStatement();
            ResultSet res=stat.executeQuery(sql);
            while (res.next()) {
                tabelantri.addRow(new Object[]{
                    res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
           tabeldata.setModel(tabelantri);
        } 
        catch (Exception e) {
        }
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtstok = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnomor = new javax.swing.JTextField();
        txttype = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tombolupdt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 160, 30));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel1.setText("Update Obat");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel3.setText("STOK");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 160, 30));

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel5.setText("NOMOR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));
        getContentPane().add(txtnomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 160, 30));
        getContentPane().add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 160, 30));

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel6.setText("TYPE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        tombolupdt.setText("Update");
        tombolupdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolupdtActionPerformed(evt);
            }
        });
        getContentPane().add(tombolupdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        tabeldata.setAutoCreateRowSorter(true);
        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeldata.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldata);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 360, 80));

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel7.setText("HARGA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 50, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 160, 30));

        jLabel9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel9.setText("NAMA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/medical_charactor-01_generated (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 680, 400));

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pure-white-background-85a2a7fd_300x400.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 300, 400));
        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolupdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolupdtActionPerformed
        try {
            String sql = "UPDATE obat SET nomor='"+ txtnomor.getText()+"',nama_obat='"
                                                         +txtnama.getText()+"',stok='"
                                                         +txtstok.getText()+"',harga='"
                                                         +txtharga.getText()+"' WHERE nomor='"+txtnomor.getText()+"'";
            java.sql.Connection conn=(Connection)config_java.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil di ubah");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal di ubah "+e.getMessage());
        }
        showdata();
        clear();
    }//GEN-LAST:event_tombolupdtActionPerformed

    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked
    int baris = tabeldata.rowAtPoint(evt.getPoint());
        
        String nomor = tabeldata.getValueAt(baris, 0).toString();
        txtnomor.setText(nomor);

        String nama = tabeldata.getValueAt(baris, 1).toString();
        txtnama.setText(nama);

        String usia = tabeldata.getValueAt(baris, 2).toString();
        txttype.setText(usia);

        String nohp = tabeldata.getValueAt(baris, 3).toString();
        txtstok.setText(nohp);

        String poli = tabeldata.getValueAt(baris, 4).toString();
        txtharga.setText(poli);        
    }//GEN-LAST:event_tabeldataMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new admin().show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tambah_obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambah_obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambah_obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambah_obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambah_obat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabeldata;
    protected javax.swing.JButton tombolupdt;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnomor;
    private javax.swing.JTextField txtstok;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}
