/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;

import QuanLyBanVeMayBay.DTO.MayBayDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class MayBayDAO {

    public ArrayList<MayBayDTO> getListMayBay() {
        try {
            String sql = "SELECT * FROM maybay";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<MayBayDTO> dsmb = new ArrayList<>();
            while(rs.next()) {
                MayBayDTO mb = new MayBayDTO();
                mb.setMaMayBay(rs.getInt(1));
                mb.setTenMayBay(rs.getString(2));
                mb.setMaHang(rs.getInt(3));
                mb.setSoLuongGhe(rs.getInt(4));
                System.out.print("xin choa");
                dsmb.add(mb);
            }
            return dsmb;
        } catch (SQLException e) {

        }
        return null;
    }

    public MayBayDTO getMayBay(int ma) {
        try {
            String sql = "SELECT *FROM maybay WHERE maMayBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                MayBayDTO mb = new MayBayDTO();

                mb.setMaMayBay(rs.getInt(1));
                mb.setTenMayBay(rs.getString(2));
                mb.setMaHang(rs.getInt(3));
                mb.setSoLuongGhe(rs.getInt(4));
                return mb;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public boolean themMayBay(MayBayDTO mb) {
        boolean check = false;
        try {
            String sql = "INSERT INTO maybay (maMayBay, maHangBay, tenMayBay, soLgGhe) "
                    + "VALUES (NULL,?,?,?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, mb.getMaHang());
            pre.setString(2, mb.getTenMayBay());
            pre.setInt(3, mb.getSoLuongGhe());

            check = pre.executeUpdate() > 0;
            
        } catch (SQLException e) {
            return false;
        }
        return check;
    }

    public boolean suaMayBay(MayBayDTO mb) {
        boolean check = false;
        try {
            String sql = "UPDATE maybay "
                    + "SET tenMayBay=?, maHangBay=?, soLgGhe=? "
                    + "WHERE maMayBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, mb.getTenMayBay());
            pre.setInt(2, mb.getMaHang());
            pre.setInt(3, mb.getSoLuongGhe());
            pre.setInt(4, mb.getMaMayBay());

            check = pre.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        return check;
    }

    public boolean xoaMayBay(int maMayBay) {
        boolean check = false;
        try {
            String sql = "DELETE FROM maybay WHERE maMayBay=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            prep.setInt(1, maMayBay);
            check = prep.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
        return check;
    }

}
