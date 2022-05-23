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

import QuanLyBanVeMayBay.DTO.TuyenBayDTO;

/**
 *
 * @author Dell
 */
public class TuyenBayDAO {

    public ArrayList<TuyenBayDTO> getListTuyenBay() {
        try {
            String sql = "SELECT * FROM tuyenbay";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<TuyenBayDTO> dstb = new ArrayList<>();
            while (rs.next()) {
                TuyenBayDTO tb = new TuyenBayDTO();

                tb.setMaTuyenBay(rs.getInt(1));
                tb.setSanBayCatCanh(rs.getInt(2));
                tb.setSanBayHaCanh(rs.getInt(3));
                tb.setGioCatCanh(rs.getString(4));
                tb.setGioHaCanh(rs.getString(5));

                dstb.add(tb);
            }
            return dstb;
        } catch (SQLException e) {
        }

        return null;
    }

    public boolean themTuyenBay(TuyenBayDTO tb) {
        boolean check = false;
        try {
            String sql = "INSERT INTO tuyenbay(maTuyenBay, sanBayCatCanh, sanBayHaCanh, gioCatCanh, gioHaCanh) "
                    + "VALUES (NULL,?,?,?,?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, tb.getSanBayCatCanh());
            pre.setInt(2, tb.getSanBayHaCanh());
            pre.setString(3, tb.getGioCatCanh());
            pre.setString(4, tb.getGioHaCanh());

            check = pre.executeUpdate() > 0;
            return true;
        } catch (SQLException e) {
        }
        return check;
    }

    public boolean suaTuyenBay(TuyenBayDTO tb) {
        boolean check = false;
        try {
            String sql = "UPDATE tuyenbay SET "
                    + "sanBayCatCanh=?, "
                    + "sanBayHaCanh=?, gioCatCanh=?, gioHaCanh=? "
                    + "WHERE maTuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, tb.getSanBayCatCanh());
            pre.setInt(2, tb.getSanBayHaCanh());
            pre.setString(3, tb.getGioCatCanh());
            pre.setString(4, tb.getGioHaCanh());
            pre.setInt(5, tb.getMaTuyenBay());

            check = pre.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
        return check;
    }

    public boolean xoaTuyenBay(int maTB) {
        boolean check = false;
        try {
            String sql = "DELETE FROM tuyenbay WHERE maTuyenBay=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            prep.setInt(1, maTB);
            check = prep.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
        return check;
    }

}
