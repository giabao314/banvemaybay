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
import QuanLyBanVeMayBay.DTO.SanBayDTO;

/**
 *
 * @author Dell
 */
public class SanBayDAO {

    public ArrayList<SanBayDTO> getListSanBay() {
        try {
            String sql = "SELECT * FROM sanbay";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<SanBayDTO> dssb = new ArrayList<>();
            while (rs.next()) {
                SanBayDTO sb = new SanBayDTO();

                sb.setMaSanBay(rs.getInt(1));
                sb.setTenSanBay(rs.getString(2));
                sb.setDiaChi(rs.getString(3));

                dssb.add(sb);
            }
            return dssb;
        } catch (SQLException e) {
        }

        return null;
    }

    public SanBayDTO getSanBay(String ma) {
        try {
            String sql = "SELECT * FROM sanbay WHERE maSanBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                SanBayDTO sb = new SanBayDTO();

                sb.setMaSanBay(rs.getInt(1));
                sb.setTenSanBay(rs.getString(2));
                sb.setDiaChi(rs.getString(3));

                return sb;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public boolean themSanBay(SanBayDTO sb) {
        boolean check = false;
        try {
            String sql = "INSERT INTO sanbay (maSanBay, tenSanBay, thanhPho) "
                    + "VALUES (NULL,?,?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, sb.getTenSanBay());
            pre.setString(2, sb.getThanhPho());

            check = pre.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
        return false;
    }

    public boolean xoaSanBay(int maSB) {
        boolean check = false;
        try {
            String sql = "DELETE FROM sanbay WHERE maSanBay=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            prep.setInt(1, maSB);
            check = prep.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
        return check;
    }

    public boolean suaSanBay(SanBayDTO sb) {
        try {
            String sql = "UPDATE sanbay SET "
                    + "tenSanBay=?, "
                    + "thanhPho=? "
                    + "WHERE maSanBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, sb.getTenSanBay());
            pre.setString(2, sb.getThanhPho());
            pre.setInt(3, sb.getMaSanBay());

            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
