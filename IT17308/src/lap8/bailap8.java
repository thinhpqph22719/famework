/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lap8;

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
public class bailap8 extends javax.swing.JFrame implements Runnable{
static long ts,te;
    /**
     * Creates new form bailap8
     */
    public bailap8() {
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
        lbl_name = new javax.swing.JLabel();
        lbl_nsinh = new javax.swing.JLabel();
        lbl_theloai = new javax.swing.JLabel();
        lbl_hinhthuc = new javax.swing.JLabel();
        lbl_phim = new javax.swing.JLabel();
        lbl_tuoi = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_table = new javax.swing.JTable();
        cbo_nsinh = new javax.swing.JComboBox<>();
        cbo_theloai = new javax.swing.JComboBox<>();
        rdo_rap = new javax.swing.JRadioButton();
        rdo_mang = new javax.swing.JRadioButton();
        rdo_trhinh = new javax.swing.JRadioButton();
        cbo_phim = new javax.swing.JComboBox<>();
        txt_tuoi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lbl_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("PHIM CUA TOI");

        lbl_name.setText("HỌ VÀ TÊN");

        lbl_nsinh.setText("NĂM SINH");

        lbl_theloai.setText("THỂ LOẠI");

        lbl_hinhthuc.setText("HÌNH THỨC XEM");

        lbl_phim.setText("PHIM KINH ĐIỂN");

        lbl_tuoi.setText("TUỔI");

        tbl_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HỌ TÊN", "NĂM SINH", "THỂ LOẠI", "HÌNH THỨC", "PHIM KINH ĐIỂN", "TÍNH CÁCH"
            }
        ));
        jScrollPane1.setViewportView(tbl_table);

        cbo_nsinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbo_theloai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rdo_rap);
        rdo_rap.setText("RẠP");

        buttonGroup1.add(rdo_mang);
        rdo_mang.setText("MẠNG");

        buttonGroup1.add(rdo_trhinh);
        rdo_trhinh.setText("TRUYỀN HÌNH");

        cbo_phim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("SỬA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("THÊM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("XÓA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("SẮP XẾP");

        jButton5.setText("GHI FILE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("MỞ FILE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_theloai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_nsinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                            .addComponent(lbl_hinhthuc)
                            .addComponent(lbl_phim)
                            .addComponent(lbl_tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_nsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_phim, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_tuoi, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(rdo_rap)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdo_mang)))
                                .addGap(18, 18, 18)
                                .addComponent(rdo_trhinh))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbo_theloai, javax.swing.GroupLayout.Alignment.LEADING, 0, 241, Short.MAX_VALUE)
                                .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbl_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_name)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_nsinh)
                                    .addComponent(cbo_nsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_theloai)
                                    .addComponent(cbo_theloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_hinhthuc)
                                    .addComponent(rdo_rap)
                                    .addComponent(rdo_mang)
                                    .addComponent(rdo_trhinh))
                                .addGap(26, 26, 26)
                                .addComponent(lbl_phim))
                            .addComponent(cbo_phim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tuoi)
                    .addComponent(txt_tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
        cbo_nsinh.removeAllItems();
        for (int i = 1960; i <= 2010; i++) {
            String t = i + "";
            // cách 2 String t1=String.valueOf(i);
            cbo_nsinh.addItem(t);
        }
        cbo_theloai.removeAllItems();
        cbo_theloai.addItem("Tâm lí/Tình cảm/Hài/hành động");
        cbo_theloai.addItem("Tâm lí");
        cbo_theloai.addItem("Tình cảm");
        cbo_theloai.addItem("Hài");
        cbo_theloai.addItem("hành động");
        cbo_phim.removeAllItems();
        cbo_phim.addItem("TITANIC");
        cbo_phim.addItem("One Piece");
        cbo_phim.addItem("JJK");
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.addForm();
        this.fillTable();
        this.clearFrom();
        JOptionPane.showMessageDialog(this, "thêm thành công");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.xoa();
        this.fillTable();
        JOptionPane.showMessageDialog(this, "xoa thanh cong");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.sua();
        this.fillTable();
        JOptionPane.showMessageDialog(this, "sua thanh cong");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.write();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.read();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(bailap8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bailap8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bailap8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bailap8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bailap8().setVisible(true);
            }
        });
        bailap8 dt = new bailap8();
        Thread th = new Thread(dt);
        th.start();
    }
    ArrayList<Phim> listP = new ArrayList<>();
    void fillTable(){
        DefaultTableModel mol = (DefaultTableModel) tbl_table.getModel();
        mol.setRowCount(0);
        for(Phim x : listP){
            Object[] data = new Object[]{
                x.getHoTen(),x.getNamSinh(),x.getTheLoai(),x.getHinhThucXem(),x.getPhim()
            };
            mol.addRow(data);
        }
    }
    Phim readForm(){
        String name,nsinh,theloai,hinhthucxem,phim;
        name = txt_name.getText();
        nsinh = (String) cbo_nsinh.getSelectedItem();
        theloai = (String)cbo_theloai.getSelectedItem();
        if(rdo_rap.isSelected()){
            hinhthucxem ="RẠP";
        }else if(rdo_mang.isSelected()){
            hinhthucxem = "MẠNG";
        }else{
            hinhthucxem = "TRUYỀN HÌNH";
        }
        phim = (String)cbo_phim.getSelectedItem();
        return  new Phim(name, nsinh, theloai, hinhthucxem, phim);
    }
    void addForm(){
    listP.add(readForm());
    }
    void writeForm(Phim p){
        txt_name.setText(p.getHoTen());
        cbo_nsinh.setToolTipText(p.getNamSinh());
    }
    int getRow(){
        return tbl_table.getSelectedRow();
    }
    void xoa(){
        int index = this.getRow();
        listP.remove(index);
    }
    void sua(){
        int index = this.getRow();
        Phim p = this.readForm();
        listP.set(index, p);
    }
    void clearFrom(){
    txt_name.setText("");
    }
    void write(){
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showSaveDialog(null);
            if(chon==0)
            {
                String path = fc.getSelectedFile().getPath();
                FileOutputStream fo = new FileOutputStream(path);
                ObjectOutputStream ofo = new ObjectOutputStream(fo);
                ofo.writeObject(listP);
                ofo.close();
                JOptionPane.showMessageDialog(this, "thanh cong");
                DefaultTableModel mol = (DefaultTableModel) tbl_table.getModel();
                mol.setRowCount(0);
            }
            else{ 
                JOptionPane.showMessageDialog(this, "không chọn lưu");
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "lỗi ghi file");
        }
    
    }
    void read(){
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showOpenDialog(null);
            if(chon==0){
               String path = fc.getSelectedFile().getPath();
                FileInputStream fi = new FileInputStream(path);
                ObjectInputStream ifi = new ObjectInputStream(fi);
                listP = (ArrayList<Phim>) ifi.readObject();
                ifi.close();
                fillTable();
            }else{
            JOptionPane.showMessageDialog(this, " k chọn file để đọc");
            }
        } catch (Exception e) {
               JOptionPane.showMessageDialog(this, "lỗi file");

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_nsinh;
    private javax.swing.JComboBox<String> cbo_phim;
    private javax.swing.JComboBox<String> cbo_theloai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_hinhthuc;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_nsinh;
    private javax.swing.JLabel lbl_phim;
    private javax.swing.JLabel lbl_theloai;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_tuoi;
    private javax.swing.JRadioButton rdo_mang;
    private javax.swing.JRadioButton rdo_rap;
    private javax.swing.JRadioButton rdo_trhinh;
    private javax.swing.JTable tbl_table;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_tuoi;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    int time = (int)(te-ts);
    int h,m,s;
        h= time/3600;
        m =(time%3600)/60;
        s = (time%3600)%60;
        lbl_time.setText("số giờ chạy: "+ h +":"+ m +":"+s);
    }
}


