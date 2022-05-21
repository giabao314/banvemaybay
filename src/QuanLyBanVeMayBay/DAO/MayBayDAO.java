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
import QuanLyBanVeMayBay.DTO.MayBayDTO;

/**
 *
 * @author Dell
 */
public class MayBayDAO {

    public ArrayList<MayBayDTO> getDanhSachMayBay() {
        try {
            String sql = "SELECT * FROM maybay";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<MayBayDTO> dsmb = new ArrayList<>();
            while (rs.next()) {
                MayBayDTO mb = new MayBayDTO();

                mb.setMaMayBay(rs.getString(1));
                mb.setTenMayBay(rs.getString(2));
                mb.setMaHang(rs.getString(3));
                mb.setSoLuongGhe(rs.getInt(4));

                dsmb.add(mb);
            }
            return dsmb;
        } catch (SQLException e) {
        }

        return null;
    }

    public MayBayDTO getMayBay(String ma) {
        try {
            String sql = "SELECT *FROM maybay WHERE maMayBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                MayBayDTO mb = new MayBayDTO();

                mb.setMaMayBay(rs.getString(1));
                mb.setTenMayBay(rs.getString(2));
                mb.setMaHang(rs.getString(3));
                mb.setSoLuongGhe(rs.getInt(4));

                return mb;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<MayBayDTO> getMayBayTheoHang(String tenHang) {
        try {
            String sql = "SELECT * FROM `maybay`, `hangbay` WHERE maybay.maHang=hangbay.maHang AND hangbay.tenHang = ?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, tenHang);
            ResultSet rs = pre.executeQuery();
            ArrayList<MayBayDTO> dsmb = new ArrayList<>();
            while (rs.next()) {
                MayBayDTO mb = new MayBayDTO();

                mb.setMaMayBay(rs.getString(1));
                mb.setTenMayBay(rs.getString(2));
                mb.setMaHang(rs.getString(3));
                mb.setSoLuongGhe(rs.getInt(4));

                dsmb.add(mb);
            }
            return dsmb;
        } catch (SQLException e) {
        }

        return null;
    }

//    public String getAnh(String ma) {
//        try {
//            String sql = "SELECT HinhAnh FROM MayBay WHERE MaMayBay=?";
//            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
//            pre.setString(1, ma);
//            ResultSet rs = pre.executeQuery();
//            if (rs.next()) {
//                return rs.getString("HinhAnh");
//            }
//        } catch (SQLException e) {
//        }
//        return "";
//    }
    public void capNhatSoLuongGhe(String ma, int soLuongGhe) {
        MayBayDTO mb = getMayBay(ma);
        mb.setSoLuongGhe(soLuongGhe);
        try {
            String sql = "UPDATE maybay SET soLuongGhe=? WHERE maMayBay=" + ma;
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, mb.getSoLuongGhe());
            pre.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public boolean themMayBay(MayBayDTO mb) {
        try {
            String sql = "INSERT INTO mayBay(tenMayBay, maHang, soLuongGhe) "
                    + "VALUES (?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, mb.getTenMayBay());
            pre.setString(2, mb.getMaHang());
            pre.setInt(3, mb.getSoLuongGhe());

            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

//    public boolean nhapSanPhamTuExcel(SanPham sp) {
//        try {
//            String sql = "DELETE * FROM sanpham; "
//                    + "INSERT INTO SanPham(TenSP, MaLoai, SoLuong, DonViTinh, HinhAnh, DonGia) "
//                    + "VALUES (?, ?, ?, ?, ?, ?)";
//            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
//            pre.setString(1, sp.getTenSP());
//            pre.setInt(2, sp.getMaLoai());
//            pre.setInt(3, sp.getSoLuong());
//            pre.setString(4, sp.getDonViTinh());
//            pre.setString(5, sp.getHinhAnh());
//            pre.setInt(6, sp.getDonGia());
//
//            pre.execute();
//            return true;
//        } catch (SQLException e) {
//        }
//        return false;
//    }
    public boolean xoaMayBay(String maMayBay) {
        try {
            String sql = "DELETE FROM maybay WHERE maMayBay=" + maMayBay;
            Statement st = MyConnect.conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaMayBay(MayBayDTO mb) {
        try {
            String sql = "UPDATE maybay SET "
                    + "tenMayBaY=?, "
                    + "maHang=?, soLuongGhe=?"
                    + "WHERE maMayBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, mb.getTenMayBay());
            pre.setString(2, mb.getMaHang());
            pre.setInt(3, mb.getSoLuongGhe());
            pre.setString(4, mb.getMaMayBay());

            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
