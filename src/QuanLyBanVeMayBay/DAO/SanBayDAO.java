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

    public ArrayList<SanBayDTO> getSanhSachSanBay() {
        try {
            String sql = "SELECT * FROM sanbay";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<SanBayDTO> dssb = new ArrayList<>();
            while (rs.next()) {
                SanBayDTO sb = new SanBayDTO();

                sb.setMaSanBay(rs.getString(1));
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
            String sql = "SELECT *FROM sanbay WHERE maSanBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                SanBayDTO sb = new SanBayDTO();

                sb.setMaSanBay(rs.getString(1));
                sb.setTenSanBay(rs.getString(2));
                sb.setDiaChi(rs.getString(3));

                return sb;
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
            String sql = "SELECT hinhAnh FROM sanbay WHERE maSanBay=?";
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

    public boolean themSanBay(SanBayDTO sb) {
        try {
            String sql = "INSERT INTO sanbay(tenSanBay, diaChi) "
                    + "VALUES (?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, sb.getTenSanBay());
            pre.setString(2, sb.getDiaChi());

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
    public boolean xoaSanBay(String maSB) {
        try {
            String sql = "DELETE FROM sanbay WHERE maSanBay=" + maSB;
            Statement st = MyConnect.conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaSanBay(SanBayDTO sb) {
        try {
            String sql = "UPDATE sanbay SET "
                    + "tenSanBay=?, "
                    + "diaChi=?"
                    + "WHERE maSanBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, sb.getTenSanBay());
            pre.setString(2, sb.getDiaChi());
            pre.setString(3, sb.getMaSanBay());

            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
