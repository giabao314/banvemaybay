package QuanLyBanVeMayBay.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import QuanLyBanVeMayBay.DTO.NhanVien;

public class NhanVienDAO {

    public ArrayList<NhanVien> getDanhSachNhanVien() {
        try {
            String sql = "SELECT * FROM nhanvien";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<NhanVien> dssv = new ArrayList<>();
            while (rs.next()) {
                NhanVien nv = new NhanVien();

                nv.setMaNV(rs.getInt(1));
                nv.setHoNV(rs.getString(2));
                nv.setTenNV(rs.getString(3));
                nv.setGioiTinh(rs.getString(4));
                nv.setCanCuoc(rs.getString(5));
                nv.setSdt(rs.getInt(6));
                nv.setLuong(rs.getInt(7));
                dssv.add(nv);
            }
            return dssv;
        } catch (SQLException e) {
        }

        return null;
    }

    public NhanVien getNhanVien(int maNV) {
        NhanVien nv = null;
        try {
            String sql = "SELECT * FROM nhanvien WHERE maNV=?" ;
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maNV);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                nv.setMaNV(rs.getInt(1));
                nv.setHoNV(rs.getString(2));
                nv.setTenNV(rs.getString(3));
                nv.setGioiTinh(rs.getString(4));
                nv.setCanCuoc(rs.getString(5));
                nv.setSdt(rs.getInt(6));
                nv.setLuong(rs.getInt(7));
            }
        } catch (SQLException e) {
            return null;
        }

        return nv;
    }

    public boolean updateNhanVien(NhanVien nv) {
        boolean result = false;
        try {
            String sql = "UPDATE nhanvien"
            		+ "SET hoNV=?, tenNV=?, gioiTinh=?, canCuoc=? , sdt = ? "
            		+ "WHERE maNV=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, nv.getHoNV());
            pre.setString(2, nv.getTenNV());
            pre.setString(3, nv.getGioiTinh());
            pre.setString(4, nv.getCanCuoc());
            pre.setInt(5, nv.getSdt());
            pre.setInt(6, nv.getMaNV());
            result = pre.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        return result;
    }

    public boolean deleteNhanVien(int maNV) {
        boolean result = false;
        try {
            String sql = "DELETE FROM nhanvien WHERE maNV=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maNV);
            result = pre.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        return result;
    }

    public boolean themNhanVien(NhanVien nv) {
        boolean result = false;
        try {
            String sql = "INSERT INTO NhanVien(hoNV, tenNV, gioiTinh, canCuoc , sdt , luong) " +
                    "VALUES(?, ?, ?, ? , ? , ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, nv.getHoNV());
            pre.setString(2, nv.getTenNV());
            pre.setString(3, nv.getGioiTinh());
            pre.setString(4, nv.getCanCuoc());
            pre.setInt(5, nv.getSdt());
            pre.setInt(6, nv.getLuong());
            result = pre.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        return result;
    }

    public boolean nhapExcel(NhanVien nv) {
        try {
            String sql = "DELETE * FROM nhanvien; " +
                    "INSERT INTO nhanvien(hoNV, tenNV, gioiTinh, canCuoc, std , luong) " +
                    "VALUES(?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, nv.getHoNV());
            pre.setString(2, nv.getTenNV());
            pre.setString(3, nv.getGioiTinh());
            pre.setString(4, nv.getCanCuoc());
            pre.setInt(5, nv.getSdt());
            pre.setInt(6, nv.getLuong());
            return true;
        } catch (SQLException ex) {
        }
        return false;
    }
}
