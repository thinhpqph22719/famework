/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai5;

import bai3.User2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class lap5 extends javax.swing.JFrame {

    /**
     * Creates new form lap5
     */
    public lap5() {
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

        jLabel1 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_money = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_money = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_write = new javax.swing.JButton();
        btn_read = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lí sinh viên");

        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_name.setText("HỌ VÀ TÊN");

        lbl_money.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_money.setText("LƯƠNG");

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        btn_add.setText("THÊM");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_write.setText("LƯU");
        btn_write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_writeActionPerformed(evt);
            }
        });

        btn_read.setText("ĐỌC");
        btn_read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_readActionPerformed(evt);
            }
        });

        tbl_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ và Tên", "Lương"
            }
        ));
        jScrollPane1.setViewportView(tbl_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_money, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(btn_add)
                                        .addGap(47, 47, 47)
                                        .addComponent(btn_write)
                                        .addGap(42, 42, 42)
                                        .addComponent(btn_read))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                            .addComponent(txt_money)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_money)
                    .addComponent(txt_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_write)
                    .addComponent(btn_read))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        this.addnhanvien();
        this.fillTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "them thanh cong");
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_writeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_writeActionPerformed
        // TODO add your handling code here:
        write();
    }//GEN-LAST:event_btn_writeActionPerformed

    private void btn_readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_readActionPerformed
        // TODO add your handling code here:
        read();
    }//GEN-LAST:event_btn_readActionPerformed

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
            java.util.logging.Logger.getLogger(lap5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lap5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lap5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lap5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lap5().setVisible(true);
            }
        });
    }
    ArrayList<nhanvien> list = new ArrayList<>();
    void fillTable(){
        DefaultTableModel mol = (DefaultTableModel) tbl_table.getModel();                
        for(nhanvien x : list){
            Object[] data = new Object[]{
                x.getTen() ,x.getLuong()};
            mol.addRow(data);
        }
    }
    nhanvien readForm(){
        String ten,luong;
        ten = txt_name.getText();
        luong = txt_money.getText();
        return new nhanvien(ten,luong);
    }
    void addnhanvien(){
        nhanvien nv = new nhanvien();
        nv.ten = txt_name.getText();
        nv.luong = txt_money.getText();
        list.add(readForm());
    }
   void clearForm(){
      txt_name.setText("");
      txt_money.setText("");
   }
    
    void write(){
        try {
            // lấy ra đường dẫn của file
            JFileChooser fc = new JFileChooser();//cho phép chọn đường dẫn
            int chon = fc.showSaveDialog(null);
            if(chon==0)//co chọn ghi
            {
                String path = fc.getSelectedFile().getPath();
                FileOutputStream fo = new FileOutputStream(path);
                ObjectOutputStream ofo = new ObjectOutputStream(fo);
               ofo.writeObject(list);// ghi ra list sinhvien ra file
               ofo.close();
               JOptionPane.showMessageDialog(this, "ghi file thanh cong");
               //xoa bang
               DefaultTableModel mol = (DefaultTableModel) tbl_table.getModel();
               mol.setRowCount(0);
            }
            else{ //không chọn
                JOptionPane.showMessageDialog(this, "bạn không chọn lưu");
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "lỗi ghi file");
        }
    
    }
    void read(){//đọc file từ đĩa ra list
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showOpenDialog(null);
            if(chon==0){
               String path = fc.getSelectedFile().getPath();
                FileInputStream fi = new FileInputStream(path);
                ObjectInputStream ifi = new ObjectInputStream(fi);
                list = (ArrayList<nhanvien>) ifi.readObject();
                ifi.close();
                fillTable();
            }else{
            JOptionPane.showMessageDialog(this, "bạn k chọn file để đọc");
            }
        } catch (Exception e) {
               JOptionPane.showMessageDialog(this, "lỗi ghi file");

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_read;
    private javax.swing.JButton btn_write;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_money;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JTable tbl_table;
    private javax.swing.JTextField txt_money;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
