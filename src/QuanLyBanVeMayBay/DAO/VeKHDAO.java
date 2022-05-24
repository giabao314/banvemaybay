/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;

import QuanLyBanVeMayBay.DTO.VeKH;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Thepi314
 */
public class VeKHDAO {
    public ArrayList<VeKH> getListVeKH() {
        try {
            String sql = "SELECT * FROM vekh";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<VeKH> dsvkh = new ArrayList<>();
            while (rs.next()) {
                VeKH veKH = new VeKH();
                veKH.setMaVeKH(rs.getInt(1));
                veKH.setMaVe(rs.getInt(2));
                veKH.setMaKH(rs.getInt(3));
                dsvkh.add(veKH);
            }
            return dsvkh;
        } catch (SQLException e) {
        }

        return null;
    }

    public VeKH getVeKH(int maVeKH) {
        try {
            String sql = "SELECT * FROM vekh WHERE maVeKH=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maVeKH);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                VeKH veKH = new VeKH();
                veKH.setMaVeKH(rs.getInt(1));
                veKH.setMaVe(rs.getInt(2));
                veKH.setMaKH(rs.getInt(3));
                return veKH;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<VeKH> getVeKHTheoMaVe(int maVe) {
        try {
            String sql = "SELECT * FROM vekh WHERE maVe=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maVe);
            ResultSet rs = pre.executeQuery();
            ArrayList<VeKH> dsvkh = new ArrayList<>();
            while (rs.next()) {
                VeKH veKH = new VeKH();
                veKH.setMaVeKH(rs.getInt(1));
                veKH.setMaVe(rs.getInt(2));
                veKH.setMaKH(rs.getInt(3));
                dsvkh.add(veKH);
            }
            return dsvkh;
        } catch (SQLException e) {
        }
        return null;
    }

    public ArrayList<VeKH> getVeKHTheoMaKhachHang(int maKH) {
        try {
            String sql = "SELECT * FROM vekh WHERE maKH=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maKH);
            ResultSet rs = pre.executeQuery();
            ArrayList<VeKH> dsvkh = new ArrayList<>();
            while (rs.next()) {
                VeKH veKH = new VeKH();
                veKH.setMaVeKH(rs.getInt(1));
                veKH.setMaVe(rs.getInt(2));
                veKH.setMaKH(rs.getInt(3));
                dsvkh.add(veKH);
            }
            return dsvkh;
        } catch (SQLException e) {
        }

        return null;
    }

    // public String getAnh(int ma) {
    // try {
    // String sql = "SELECT HinhAnh FROM VeKH WHERE MaSP=?";
    // PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
    // pre.setInt(1, ma);
    // ResultSet rs = pre.executeQuery();
    // if (rs.next()) {
    // return rs.getString("HinhAnh");
    // }
    // } catch (SQLException e) {
    // }
    // return "";
    // }

    // public void capNhatSoLuongVe(int maVe, int soLuongMat) {
    //     VeKH ve = getVeKH(ma);
    //     int soLuong = ve.getSoLuong();
    //     sp.setSoLuong(soLuong + soLuongMat);
    //     try {
    //         String sql = "UPDATE VeKH SET SoLuong=? WHERE MaSP=" + ma;
    //         PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
    //         pre.setInt(1, sp.getSoLuong());
    //         pre.executeUpdate();
    //     } catch (SQLException e) {
    //     }

    // }

    public boolean themVeKH(VeKH veKH) {
        boolean check = false;
        try {
            String sql = "INSERT INTO Ve(maVeKH, maVe, maKH) "
                    + "VALUES (NULL,?,?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, veKH.getMaVe());
            pre.setInt(2, veKH.getMaKH());
            check =  pre.executeUpdate() > 0;
            return check;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean nhapVeKHTuExcel(VeKH veKH) {
        try {
            String sql = "DELETE * FROM vekh; " +
                    "INSERT INTO ve(maVeKH, maVe, maKH) "
                    + "VALUES (?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, veKH.getMaVeKH());
            pre.setInt(2, veKH.getMaVe());
            pre.setInt(3, veKH.getMaKH());
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean xoaVeKH(int maVeKH) {
        boolean check = false;
        try {
            String sql = "DELETE FROM vekh WHERE maVeKH=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maVeKH);
            check = pre.executeUpdate() > 0;
            return check;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaVeKH(VeKH veKH) {
        boolean check = false;
        try {
            String sql = "UPDATE vekh SET "
                    + "maVe=?, "
                    + "maKH=? "
                    + "WHERE maVeKH=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, veKH.getMaVe());
            pre.setInt(2, veKH.getMaKH());
            pre.setInt(3, veKH.getMaVeKH());
            check =  pre.executeUpdate() > 0;
            return check;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
