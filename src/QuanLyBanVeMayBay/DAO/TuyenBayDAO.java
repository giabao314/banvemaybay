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

    public ArrayList<TuyenBayDTO> getDanhSachTuyenBay() {
        try {
            String sql = "SELECT * FROM tuyenbay";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<TuyenBayDTO> dstb = new ArrayList<>();
            while (rs.next()) {
                TuyenBayDTO tb = new TuyenBayDTO();

                tb.SetMaTuyenBay(rs.getString(1));
                tb.SetSanBayCatCanh(rs.getString(2));
                tb.SetSanBayHaCanh(rs.getString(3));
                tb.SetGioCatCanh(rs.getString(4));
                tb.SetSanBayHaCanh(rs.getString(5));

                dstb.add(tb);
            }
            return dstb;
        } catch (SQLException e) {
        }

        return null;
    }

    public TuyenBayDTO getTuyenBay(String ma) {
        try {
            String sql = "SELECT *FROM tuyenbay WHERE maTuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                TuyenBayDTO tb = new TuyenBayDTO();

                tb.SetMaTuyenBay(rs.getString(1));
                tb.SetSanBayCatCanh(rs.getString(2));
                tb.SetSanBayHaCanh(rs.getString(3));
                tb.SetGioCatCanh(rs.getString(4));
                tb.SetSanBayHaCanh(rs.getString(5));

                return tb;
            }
        } catch (SQLException e) {
        }

        return null;
    }

//    public ArrayList<SanPham> getSanPhamTheoLoai(int maLoai) {
//        try {
//            String sql = "SELECT * FROM sanpham WHERE MaLoai=?";
//            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
//            pre.setInt(1, maLoai);
//            ResultSet rs = pre.executeQuery();
//            ArrayList<SanPham> dssp = new ArrayList<>();
//            while (rs.next()) {
//                SanPham sp = new SanPham();
//
//                sp.setMaSP(rs.getInt(1));
//                sp.setTenSP(rs.getString(2));
//                sp.setMaLoai(rs.getInt(3));
//                sp.setSoLuong(rs.getInt(4));
//                sp.setDonViTinh(rs.getString(5));
//                sp.setHinhAnh(rs.getString(6));
//                sp.setDonGia(rs.getInt(7));
//
//                dssp.add(sp);
//            }
//            return dssp;
//        } catch (SQLException e) {
//        }
//
//        return null;
//    }
    public String getAnh(String ma) {
        try {
            String sql = "SELECT hinhAnh FROM tuyenbay WHERE maTuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                return rs.getString("hinhAnh");
            }
        } catch (SQLException e) {
        }
        return "";
    }

//    public void capNhatSoLuongSP(int ma, int soLuongMat) {
//        SanPham sp = getSanPham(ma);
//        int soLuong = sp.getSoLuong();
//        sp.setSoLuong(soLuong + soLuongMat);
//        try {
//            String sql = "UPDATE SanPham SET SoLuong=? WHERE MaSP=" + ma;
//            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
//            pre.setInt(1, sp.getSoLuong());
//            pre.executeUpdate();
//        } catch (SQLException e) {
//        }
//
//    }
    public boolean themTuyenBay(TuyenBayDTO tb) {
        try {
            String sql = "INSERT INTO tuyenbay(sanBayCatCanh, sanBayHaCanh, gioCatCanh, gioHaCanh) "
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, tb.GetSanBayCatCanh());
            pre.setString(2, tb.GetSanBayHaCanh());
            pre.setString(3, tb.GetGioCatCanh());
            pre.setString(4, tb.GetGioHaCanh());

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
    public boolean xoaTuyenBay(String maTB) {
        try {
            String sql = "DELETE FROM tuyenbay WHERE maTuyenBay=" + maTB;
            Statement st = MyConnect.conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaTuyenBay(TuyenBayDTO tb) {
        try {
            String sql = "UPDATE tuyenbay SET "
                    + "sanBayCatCanh=?, "
                    + "sanBayHaCanh=?, gioCatCanh=?, gioHaCanh=?"
                    + "WHERE maTuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, tb.GetSanBayCatCanh());
            pre.setString(2, tb.GetSanBayHaCanh());
            pre.setString(3, tb.GetGioCatCanh());
            pre.setString(4, tb.GetGioHaCanh());
            pre.setString(7, tb.GetMaTuyenBay());

            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
