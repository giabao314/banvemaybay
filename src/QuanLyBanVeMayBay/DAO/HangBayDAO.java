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

    public ArrayList<HangBayDTO> getDanhSachHangBay() {
        try {
            String sql = "SELECT * FROM hangbay";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<HangBayDTO> dshb = new ArrayList<>();
            while (rs.next()) {
                HangBayDTO hb = new HangBayDTO();
                hb.setMaHang(rs.getString(1));
                hb.setTenHang(rs.getString(2));
                dshb.add(hb);
            }
            return dshb;
        } catch (SQLException e) {
        }
        return null;
    }

    public boolean themHangBay(HangBayDTO hb) {
        try {
            String sql = "INSERT INTO hangbay VALUES (?,?)";
            PreparedStatement prep = Myconnect.conn.preparedStatement(sql);
            prep.setString(1, hb.getMaHang());
            prep.setString(2, hb.getTenHang());

            prep.execute();
            return true;
        } catch (SQLException ex) {
//            Logger.getLogger(LoaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public boolean xoaHangBay(String maHang) {
        try {
            String sql = "DELETE FROM hangbay WHERE maHang=" + maHang;
            Statement st = MyConnect.conn.createStatement();
            int x = st.executeUpdate(sql);
            return x > 0 ? true : false;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaHangBay(HangBayDTO hb) {
        try {
            String sql = "UPDATE hangbay SET "
                    + "tenHang=?, "
                    + "WHERE maHang=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, hb.getTenHang());
            pre.setString(2, hb.getMaHang());

            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

//    public boolean timHangBayTheoTen(String tenHB){
//        try{
//            String sql = "SELECT "
//            return true;
//        }catch(SQLException e){
//            e.printStackTrace();
//        };
//    }
}
