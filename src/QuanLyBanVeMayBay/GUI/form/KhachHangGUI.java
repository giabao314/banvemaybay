/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QuanLyBanVeMayBay.GUI.form;
import java.util.ArrayList;
import java.util.Vector;
import QuanLyBanVeMayBay.BUS.KhachHangBUS;
import QuanLyBanVeMayBay.DTO.KhachHang;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hp
 */
public class KhachHangGUI extends javax.swing.JPanel {
    /**
     * Creates new form KhachHangGUI
     */
    
    private DefaultTableModel dtmKhachHang = new DefaultTableModel();
    KhachHangBUS khachhangBUS = new KhachHangBUS();
    ArrayList<KhachHang> dskh = new ArrayList<>();
    public KhachHangGUI() {
   
        initComponents();
        getListKhachHang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoKH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGioiTinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCanCuoc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtTuKhoa = new javax.swing.JTextField();
        txtLuaChon = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKhachHang = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Khách Hàng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Họ Khách Hàng");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tên Khách Hàng");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Giới Tính");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ngày Sinh");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Căn Cước");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số Điện Thoại");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("EXCEL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtHoKH)
                            .addComponent(txtTenKH)
                            .addComponent(txtGioiTinh))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCanCuoc, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(txtNgaySinh)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtCanCuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 104, Short.MAX_VALUE))))
        );

        txtLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Mã", "Tên", "Căn Cước", "Số Điện Thoại" }));

        jButton4.setText("Tìm Kiếm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tableKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Họ", "Tên", "Giới Tính", "Ngày Sinh", "Căn Cước", "Số Điện Thoại"
            }
        ));
        tableKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKhachHang);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Tìm Kiếm");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Quản Lý Khách Hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4))
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        themKhachHang();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        suaKhachHang();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        xoaKhachHang();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKhachHangMouseClicked
        // TODO add your handling code here:
        clickTableRowKH();
    }//GEN-LAST:event_tableKhachHangMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        timKiemKhachHang();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void themKhachHang(){
        String hoKH = txtHoKH.getText();
        String tenKH = txtTenKH.getText();
        String gioiTinh = txtGioiTinh.getText();
        String ngaySinh = txtNgaySinh.getText();
        String canCuoc = txtCanCuoc.getText();
        String soDienThoai = txtSoDienThoai.getText();
        
        khachhangBUS.themKhachHang(hoKH, tenKH, gioiTinh, ngaySinh, canCuoc, soDienThoai);
        showListKhachHang();

    }
    
    public void suaKhachHang(){
        String ma = txtMaKH.getText();
        int maKH = Integer.parseInt(ma);
        String hoKH = txtHoKH.getText();
        String tenKH = txtTenKH.getText();
        String gioiTinh = txtGioiTinh.getText();
        String ngaySinh = txtNgaySinh.getText();
        String canCuoc = txtCanCuoc.getText();
        String soDienThoai = txtSoDienThoai.getText();
        
        khachhangBUS.suaKhachHang(maKH, hoKH, tenKH, gioiTinh, ngaySinh, canCuoc, soDienThoai);
        showListKhachHang();
        
    }
    
    public void xoaKhachHang(){
        String ma = txtMaKH.getText();
        int i = tableKhachHang.getSelectedRow();
        int maKH = Integer.parseInt(ma);
        
        khachhangBUS.xoaKhachHang(maKH);
        dtmKhachHang.removeRow(i);
        tableKhachHang.setModel(dtmKhachHang);
        txtMaKH.setText("");
        txtHoKH.setText("");
        txtTenKH.setText("");
        txtGioiTinh.setText("");
        txtNgaySinh.setText("");
        txtCanCuoc.setText("");
        txtSoDienThoai.setText("");
        
    }
    
    public void getListKhachHang(){
        try{
        dtmKhachHang.setRowCount(0);
        dskh = khachhangBUS.getListKhachHang();
        
        Vector<Object> header = new Vector<>();
        header.add("Mã Khách Hàng");
        header.add("Họ Khách Hàng");
        header.add("Tên Khách Hàng");
        header.add("Giới Tính");
        header.add("Ngày Sinh");
        header.add("Căn Cước");
	header.add("Số Điện Thoại");
	if (dtmKhachHang.getRowCount() == 0) {
            dtmKhachHang = new DefaultTableModel(header, 0);
	}
        
        for(KhachHang kh : dskh){
            Vector<Object> vec = new Vector<>();
            vec.add(kh.getMaKH());
            vec.add(kh.getHoKH());
            vec.add(kh.getTenKH());
            vec.add(kh.getGioiTinh());
            vec.add(kh.getDate());
            vec.add(kh.getCanCuoc());
            vec.add(kh.getSdt());
            
            dtmKhachHang.addRow(vec);
            
        }
        tableKhachHang.setModel(dtmKhachHang);
        }catch(Exception e){
            
        }
    }
    
    public void clickTableRowKH(){
        int row = tableKhachHang.getSelectedRow();
        if(row > -1){
            txtMaKH.setText(tableKhachHang.getValueAt(row,0)+ "");
            txtHoKH.setText(tableKhachHang.getValueAt(row,1)+ "");
            txtTenKH.setText(tableKhachHang.getValueAt(row,2)+ "");
            txtGioiTinh.setText(tableKhachHang.getValueAt(row,3)+ "");
            txtNgaySinh.setText(tableKhachHang.getValueAt(row,4)+ "");
            txtCanCuoc.setText(tableKhachHang.getValueAt(row,5)+ "");
            txtSoDienThoai.setText(tableKhachHang.getValueAt(row,6)+ "");
        }
    }
    
    public void timKiemKhachHang(){
        String tuKhoa = txtTuKhoa.getText();
        String luaChon = txtLuaChon.getSelectedItem().toString();
        if(tuKhoa == ""){
            // dialog thong bao'
            return ;
        }
        
        if(luaChon == "Tất Cả"){
            dskh = khachhangBUS.getListKhachHang();
        }
        
        if(luaChon == "Mã"){
            dskh = khachhangBUS.timKiemKhachHangTheoMa(tuKhoa);
            
            if(dskh == null){
                //dialog k tim thay
            }
        }
        
        if(luaChon == "Tên"){
            dskh = khachhangBUS.timKiemKhachHangTheoTen(tuKhoa);
            if(dskh == null){
                //dialog k tim thay
            }
        }
        
        if(luaChon == "Căn Cước"){
            dskh = khachhangBUS.timKiemKhachHangTheoCanCuoc(tuKhoa);
            if(dskh == null){
                //dialog k tim thay
            }
        }
        
        if(luaChon == "Số Điện Thoại"){
            dskh = khachhangBUS.timKiemKhachHangTheoSDT(tuKhoa);
            if(dskh == null){
                //dialog k tim thay
            }
        }
        
        dtmKhachHang.setRowCount(0);
        
        Vector<Object> header = new Vector<>();
        header.add("Mã Khách Hàng");
        header.add("Họ Khách Hàng");
        header.add("Tên Khách Hàng");
        header.add("Giới Tính");
        header.add("Ngày Sinh");
        header.add("Căn Cước");
	header.add("Số Điện Thoại");
	if (dtmKhachHang.getRowCount() == 0) {
            dtmKhachHang = new DefaultTableModel(header, 0);
	}
        
        for(KhachHang kh : dskh){
            Vector<Object> vec = new Vector<>();
            vec.add(kh.getMaKH());
            vec.add(kh.getHoKH());
            vec.add(kh.getTenKH());
            vec.add(kh.getGioiTinh());
            vec.add(kh.getDate());
            vec.add(kh.getCanCuoc());
            vec.add(kh.getSdt());
            
            dtmKhachHang.addRow(vec);
        }
        tableKhachHang.setModel(dtmKhachHang);
    }
    
    public void showListKhachHang(){
        dtmKhachHang.setRowCount(0);
        dskh = khachhangBUS.listKH();
        Vector<Object> header = new Vector<>();
        header.add("Mã Khách Hàng");
        header.add("Họ Khách Hàng");
        header.add("Tên Khách Hàng");
        header.add("Giới Tính");
        header.add("Ngày Sinh");
        header.add("Căn Cước");
	header.add("Số Điện Thoại");
	if (dtmKhachHang.getRowCount() == 0) {
            dtmKhachHang = new DefaultTableModel(header, 0);
	}
        
        for(KhachHang kh : dskh){
            Vector<Object> vec = new Vector<>();
            vec.add(kh.getMaKH());
            vec.add(kh.getHoKH());
            vec.add(kh.getTenKH());
            vec.add(kh.getGioiTinh());
            vec.add(kh.getDate());
            vec.add(kh.getCanCuoc());
            vec.add(kh.getSdt());
            
            dtmKhachHang.addRow(vec);
        }
        tableKhachHang.setModel(dtmKhachHang);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKhachHang;
    private javax.swing.JTextField txtCanCuoc;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoKH;
    private javax.swing.JComboBox<String> txtLuaChon;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables
}
