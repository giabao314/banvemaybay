/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;

import QuanLyBanVeMayBay.DTO.Ve;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thepi314
 */
public class VeDAO {
    public ArrayList<Ve> getListVe() {
        try {
            String sql = "SELECT * FROM ve";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<Ve> dsv = new ArrayList<>();
            while (rs.next()) {
                Ve ve = new Ve();
                ve.setMaVe(rs.getInt(1));
                ve.setMaChuyenBay(rs.getInt(2));
                ve.setMaLoaiVe(rs.getInt(3));
                ve.setMaGhe(rs.getString(4));
                ve.setGioLenMayBay(rs.getString(5));
                dsv.add(ve);
            }
            return dsv;
        } catch (SQLException e) {
        }

        return null;
    }

    public Ve getVe(int ma) {
        try {
            String sql = "SELECT * FROM ve WHERE maVe=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                Ve ve = new Ve();
                ve.setMaVe(rs.getInt(1));
                ve.setMaChuyenBay(rs.getInt(2));
                ve.setMaLoaiVe(rs.getInt(3));
                ve.setMaGhe(rs.getString(4));
                ve.setGioLenMayBay(rs.getString(5));
                return ve;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<Ve> getVeTheoMaChuyenBay(int maChuyenBay) {
        try {
            String sql = "SELECT * FROM ve WHERE maChuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maChuyenBay);
            ResultSet rs = pre.executeQuery();
            ArrayList<Ve> dsv = new ArrayList<>();
            while (rs.next()) {
                Ve ve = new Ve();
                ve.setMaVe(rs.getInt(1));
                ve.setMaChuyenBay(rs.getInt(2));
                ve.setMaLoaiVe(rs.getInt(3));
                ve.setMaGhe(rs.getString(4));
                ve.setGioLenMayBay(rs.getString(5));
                dsv.add(ve);
            }
            return dsv;
        } catch (SQLException e) {
        }
        return null;
    }

    public ArrayList<Ve> getVeTheoMaLoaiVe(int maLoaiVe) {
        try {
            String sql = "SELECT * FROM ve WHERE maLoaiVe=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maLoaiVe);
            ResultSet rs = pre.executeQuery();
            ArrayList<Ve> dsv = new ArrayList<>();
            while (rs.next()) {
                Ve ve = new Ve();

                ve.setMaVe(rs.getInt(1));
                ve.setMaChuyenBay(rs.getInt(2));
                ve.setMaLoaiVe(rs.getInt(3));
                ve.setMaGhe(rs.getString(4));
                ve.setGioLenMayBay(rs.getString(5));
                dsv.add(ve);
            }
            return dsv;
        } catch (SQLException e) {
        }

        return null;
    }

    // public String getAnh(int ma) {
    // try {
    // String sql = "SELECT HinhAnh FROM Ve WHERE MaSP=?";
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
    // Ve ve = getVe(ma);
    // int soLuong = ve.getSoLuong();
    // sp.setSoLuong(soLuong + soLuongMat);
    // try {
    // String sql = "UPDATE Ve SET SoLuong=? WHERE MaSP=" + ma;
    // PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
    // pre.setInt(1, sp.getSoLuong());
    // pre.executeUpdate();
    // } catch (SQLException e) {
    // }

    // }

    public boolean themVe(Ve ve) {
        try {
            String sql = "INSERT INTO Ve(maChuyenBay, maLoaiVe, maGhe, gioLenMayBay) "
                    + "VALUES (?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ve.getMaChuyenBay());
            pre.setInt(2, ve.getMaLoaiVe());
            pre.setString(3, ve.getMaGhe());
            pre.setString(4, ve.getGioLenMayBay());
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean nhapVeTuExcel(Ve ve) {
        try {
            String sql = "DELETE * FROM ve; " +
                    "INSERT INTO ve(maChuyenBay, maLoaiVe, maGhe, gioLenMayBay) "
                    + "VALUES (?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ve.getMaChuyenBay());
            pre.setInt(2, ve.getMaLoaiVe());
            pre.setString(3, ve.getMaGhe());
            pre.setString(4, ve.getGioLenMayBay());
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean xoaVe(int maVe) {
        try {
            String sql = "DELETE FROM ve WHERE maVe=" + maVe;
            Statement st = MyConnect.conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaVe(Ve ve) {
        try {
            String sql = "UPDATE ve SET "
                    + "maChuyenBay=?, "
                    + "maLoaiVe=?, maGhe=?, gioLenMayBay=? "
                    + "WHERE maVe=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ve.getMaChuyenBay());
            pre.setInt(2, ve.getMaLoaiVe());
            pre.setString(3, ve.getMaGhe());
            pre.setString(4, ve.getGioLenMayBay());
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
