/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lan3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class lan3 extends javax.swing.JFrame implements Runnable{
long end,begin;
    /**
     * Creates new form lan3
     */
    public lan3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        cbo_nsinh = new javax.swing.JComboBox<>();
        cbo_theloai = new javax.swing.JComboBox<>();
        rdo_rap = new javax.swing.JRadioButton();
        rdo_mang = new javax.swing.JRadioButton();
        rdo_truyenhinh = new javax.swing.JRadioButton();
        cbo_phim = new javax.swing.JComboBox<>();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_ghi = new javax.swing.JButton();
        btn_doc = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        btn_lammoi = new javax.swing.JButton();
        lbl_time = new javax.swing.JLabel();
        lbl_thoigianchay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("phim cua toi");

        jLabel2.setText("ho ten");

        jLabel3.setText("nam sinh");

        jLabel4.setText("the loai");

        tbl_table.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_table);

        jLabel5.setText("hinh thuc xem");

        jLabel6.setText("phim kinh dien");

        cbo_nsinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbo_theloai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rdo_rap);
        rdo_rap.setText("rạp");

        buttonGroup1.add(rdo_mang);
        rdo_mang.setText("mạng");

        buttonGroup1.add(rdo_truyenhinh);
        rdo_truyenhinh.setText("truyền hình");

        cbo_phim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_them.setText("them");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("sua");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("xoa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_ghi.setText("ghi");
        btn_ghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ghiActionPerformed(evt);
            }
        });

        btn_doc.setText("doc");
        btn_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_docActionPerformed(evt);
            }
        });

        btn_thoat.setText("thoat");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        btn_lammoi.setText("lam moi");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdo_rap)
                                        .addGap(28, 28, 28)
                                        .addComponent(rdo_mang))
                                    .addComponent(cbo_nsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(rdo_truyenhinh))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbo_theloai, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_phim, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(316, 316, 316))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(lbl_thoigianchay, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_lammoi)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_xoa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_thoat))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_sua)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_doc))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_them)
                                    .addGap(64, 64, 64)
                                    .addComponent(btn_ghi)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_them)
                            .addComponent(btn_ghi))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_sua)
                                    .addComponent(btn_doc))
                                .addGap(35, 35, 35)
                                .addComponent(btn_xoa))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btn_thoat)))
                        .addGap(33, 33, 33)
                        .addComponent(btn_lammoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbl_thoigianchay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbo_nsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbo_theloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdo_rap)
                                .addComponent(rdo_mang)
                                .addComponent(rdo_truyenhinh)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_phim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ghiActionPerformed
        // TODO add your handling code here:
        ghi();
    }//GEN-LAST:event_btn_ghiActionPerformed

    private void btn_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_docActionPerformed
        // TODO add your handling code here:
        doc();
    }//GEN-LAST:event_btn_docActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        add();
        fillTable();
        JOptionPane.showMessageDialog(this, "them thanh cong");
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        sua();
        fillTable();
        JOptionPane.showMessageDialog(this, "sua thanh cong");

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        xoa();
        fillTable();
        JOptionPane.showMessageDialog(this, "xoa thanh cong");

    }//GEN-LAST:event_btn_xoaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        begin =Calendar.getInstance().getTimeInMillis()/1000;
        this.setLocationRelativeTo(null);
        cbo_theloai.removeAllItems();
        cbo_theloai.addItem("tam li/tinh cam/hanh dong");
        cbo_theloai.addItem("tam li");
        cbo_theloai.addItem("tinh cam");
        cbo_theloai.addItem("hanh dong");
        cbo_phim.removeAllItems();
        cbo_phim.addItem("titanic");
        cbo_phim.addItem("one piec");
        cbo_phim.addItem("naruto");
        phim p1 = new phim("THINH", "2003", "tinh cam", "rạp", "one piece");
        phim p2 = new phim("SON", "2003", "hanh dong", "mạng", "titanic");
        phim p3 = new phim("TUAN", "2003", "tam li", "truyền hình", "naruto");
        listP.add(p1);
        listP.add(p2);
        listP.add(p3);
        fillTable();
        
    }//GEN-LAST:event_formWindowOpened

    private void tbl_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tableMouseClicked
        // TODO add your handling code here:
        int index = this.getRow();
        this.writeForm(listP.get(index));
    }//GEN-LAST:event_tbl_tableMouseClicked

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btn_lammoiActionPerformed

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
            java.util.logging.Logger.getLogger(lan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new lan3().setVisible(true);
//            }
//        });
    long ts=System.nanoTime();
        lan3 ch = new lan3();
// tao doi tuong cua class form
        ch.setVisible(true);// set form xuat hien
        Thread t = new Thread(ch);
        t.start();
        long te=System.nanoTime();
        String time = (te-ts)/1000+"";
        ch.lbl_thoigianchay.setText("thoi gian loadform: "+time);
    }
    ArrayList<phim> listP = new ArrayList<phim>();

    void fillTable() {
        DefaultTableModel mol = (DefaultTableModel) tbl_table.getModel();
        mol.setRowCount(0);
        for (phim x : listP) {
            Object[] data = new Object[]{
                x.getHoTen(), x.getNamSinh(), x.getTheLoai(), x.getHinhThucXem(), x.getPhimKinhDien()
            };
            mol.addRow(data);
        }
    }

    phim readForm() {
        String hoTen, namsinh, theLoai, hinhThucXem, phimKinhDien;
        hoTen = txt_ten.getText();
        namsinh = (String) cbo_nsinh.getSelectedItem();
        theLoai = (String) cbo_theloai.getSelectedItem();
        if (rdo_rap.isSelected()) {
            hinhThucXem = "rạp";
        } else if (rdo_mang.isSelected()) {
            hinhThucXem = "mạng";
        } else {
            hinhThucXem = "truyền hình";
        }
        phimKinhDien = (String) cbo_phim.getSelectedItem();
        return new phim(hoTen, namsinh, theLoai, hinhThucXem, phimKinhDien);
    }

    void writeForm(phim p) {
        txt_ten.setText(p.getHoTen());
        cbo_nsinh.setSelectedItem(p.getNamSinh());
        cbo_theloai.setSelectedItem(p.getTheLoai());
        if (p.getHinhThucXem().equalsIgnoreCase("rạp")) {
            rdo_rap.setSelected(true);
        } else if (p.getHinhThucXem().equalsIgnoreCase("mạng")) {
            rdo_mang.setSelected(true);
        } else {
            rdo_truyenhinh.setSelected(true);
        }
        cbo_phim.setSelectedItem(p.getPhimKinhDien());
    }

    int getRow() {
        return tbl_table.getSelectedRow();
    }

    void add() {
        listP.add(readForm());
    }

    void xoa() {
        int index = this.getRow();
        listP.remove(index);
    }

    void sua() {
        int index = this.getRow();
        phim p = this.readForm();
        listP.set(index, readForm());
    }
    void clear(){
    txt_ten.setText("");
    cbo_nsinh.setSelectedItem("");
    cbo_theloai.setSelectedItem("");
    }
    void ghi() {
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showSaveDialog(null);
            if (chon == 0) {
                String path = fc.getSelectedFile().getPath();
                FileOutputStream fo = new FileOutputStream(path);
                ObjectOutputStream ofo = new ObjectOutputStream(fo);
                ofo.writeObject(listP);
                ofo.close();
                JOptionPane.showMessageDialog(this, "ghi thanh cong");
                DefaultTableModel mol = (DefaultTableModel) tbl_table.getModel();
                mol.setRowCount(0);
            } else {
                JOptionPane.showMessageDialog(this, "chua chon file");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi ghi file");
        }
    }

    void doc() {
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showOpenDialog(null);
            if (chon == 0) {
                String path = fc.getSelectedFile().getPath();
                FileInputStream fi = new FileInputStream(path);
                ObjectInputStream ifi = new ObjectInputStream(fi);
                listP = (ArrayList<phim>) ifi.readObject();
                ifi.close();
                fillTable();
                JOptionPane.showMessageDialog(this, "doc thanh cong");

            } else {
                JOptionPane.showMessageDialog(this, "chua chon file");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi doc file");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_doc;
    private javax.swing.JButton btn_ghi;
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_nsinh;
    private javax.swing.JComboBox<String> cbo_phim;
    private javax.swing.JComboBox<String> cbo_theloai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_thoigianchay;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JRadioButton rdo_mang;
    private javax.swing.JRadioButton rdo_rap;
    private javax.swing.JRadioButton rdo_truyenhinh;
    private javax.swing.JTable tbl_table;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  end = Calendar.getInstance().getTimeInMillis()/1000;
  int time  = (int) (end - begin);
  int h,m,s;
        h= time/3600;
        m =(time%3600)/60;
        s = (time%3600)%60;
        lbl_time.setText("số giờ chạy: "+ h +":"+ m +":"+s);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
        Logger.getLogger(lan3.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}

