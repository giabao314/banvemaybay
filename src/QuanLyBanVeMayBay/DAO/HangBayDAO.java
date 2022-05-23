/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import QuanLyBanVeMayBay.DTO.HangBayDTO;

/**
 *
 * @author Dell
 */
public class HangBayDAO {

    public ArrayList<HangBayDTO> getListHangBay() {
        try {
            String sql = "SELECT * FROM hangbay";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<HangBayDTO> dshb = new ArrayList<>();
            while (rs.next()) {
                HangBayDTO hb = new HangBayDTO();
                hb.setMaHang(rs.getInt(1));
                hb.setTenHang(rs.getString(2));
                dshb.add(hb);
            }
            return dshb;
        } catch (SQLException e) {
        }
        return null;
    }

    public boolean themHangBay(HangBayDTO hb) {
        boolean check = false;
        try {
            String sql = "INSERT INTO hangbay VALUES (NULL,?)";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            //prep.setInt(1, hb.getMaHang());
            prep.setString(1, hb.getTenHang());

            check = prep.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LoaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return check;
    }

    public boolean suaHangBay(HangBayDTO hb) {
        boolean check = false;
        try {
            String sql = "UPDATE hangbay SET "
                    + "tenHangBay=? "
                    + "WHERE maHangBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, hb.getTenHang());
            pre.setInt(2, hb.getMaHang());

            check = pre.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
        return check;
    }

    public boolean xoaHangBay(int maHang) {
        boolean check = false;
        try {
            String sql = "DELETE FROM hangbay WHERE maHangBay=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            prep.setInt(1, maHang);

            check = prep.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
        return check;
    }
}
