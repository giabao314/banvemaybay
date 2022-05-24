/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;

import QuanLyBanVeMayBay.DTO.LoaiVe;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Thepi314
 */
public class LoaiVeDAO {
    public ArrayList<LoaiVe> getDanhSachLoaiVe() {
        try {
//            new MyConnect();
            String sql = "SELECT * FROM loaive";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<LoaiVe> dsl = new ArrayList<>();
            while (rs.next()) {
                LoaiVe loai = new LoaiVe();
                loai.setMaLoaiVe(rs.getInt(1));
                loai.setTenLoaiVe(rs.getString(2));
                loai.setDonGia(rs.getInt(3));
                dsl.add(loai);
            }
            return dsl;
        } catch (SQLException e) {
        }
        return null;
    }

    public boolean themLoaiVe(LoaiVe loai) {
        try {
            String sql = "insert into loaive(tenLoaiVe, donGia) "
                    + "values ("
                    + "'" + loai.getTenLoaiVe() + "', '" + loai.getDonGia() + "')";
            Statement st = MyConnect.conn.createStatement();
            int x = st.executeUpdate(sql);
            return x > 0 ? true : false;
        } catch (SQLException ex) {
            Logger.getLogger(LoaiVeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public boolean xoaLoaiVe(int maLoaiVe) {
        try {
            String sql = "DELETE FROM loaive WHERE maLoaiVe=" + maLoaiVe;
            Statement st = MyConnect.conn.createStatement();
            int x = st.executeUpdate(sql);
            return x > 0 ? true : false;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaLoaiVe(int maLoaiVe, String tenLoaiVe, int donGia) {
        try {
            String sql = "UPDATE loaive SET tenLoaiVe='" + tenLoaiVe + "'" + ", donGia='" + donGia + "' WHERE maLoaiVe=" + maLoaiVe;
            Statement st = MyConnect.conn.createStatement();
            int x = st.executeUpdate(sql);
            return x > 0 ? true : false;
        } catch (SQLException e) {
        }
        return false;
    }
}
