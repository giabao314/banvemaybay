package QuanLyBanVeMayBay.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import QuanLyBanVeMayBay.DTO.HoaDon;

public class HoaDonDAO {
    public ArrayList<HoaDon> getListHoaDon() {
        ArrayList<HoaDon> dshd = new ArrayList<>();
        try {
            String sql = "SELECT * FROM hoadon";
            Statement stmt = MyConnect.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getInt(1));
                hd.setMaNV(rs.getNString(2));
                hd.setMaKHThanhToan(rs.getNString(3));
                hd.setNgayLap(rs.getNString(4));
                hd.setTongTien(rs.getInt(5));
                dshd.add(hd);
            }
        } catch (SQLException ex) {
            return null;
        }
        return dshd;
    }

    public boolean addHoaDon(HoaDon hd) {
        boolean result = false;
        try {
//            String sql1 = "UPDATE KhachHang SET TongChiTieu=TongChiTieu+" + hd.getTongTien() + " WHERE MaKH=" + hd.getMaKH();
//            Statement st = MyConnect.conn.createStatement();
//            st.executeUpdate(sql1);
            String sql = "INSERT INTO hoadon(MaKH, MaNV, NgayLap, TongTien) VALUES(?, ?, ?, ?)";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            prep.setString(1, hd.getMaKHThanhToan());
            prep.setString(2, hd.getMaNV());
            prep.setString(3, hd.getNgayLap());
            prep.setInt(4, hd.getTongTien());
  
            result = prep.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return result;
    }

    public int getMaHoaDonMoiNhat() {
        try {
            String sql = "SELECT MAX(maHD) FROM hoadon";
            Statement st = MyConnect.conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
                return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public ArrayList<HoaDon> getListHoaDon(String dateMin, String dateMax) {
        try {
            String sql = "SELECT * FROM hoadon WHERE ngayLap BETWEEN CAST(? AS DATE) AND CAST(? AS DATE)";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            prep.setString(1, dateMin);
            prep.setString(2, dateMax);
            ResultSet rs = prep.executeQuery();

            ArrayList<HoaDon> dshd = new ArrayList<>();

            while (rs.next()) {
            	HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getInt(1));
                hd.setMaNV(rs.getNString(2));
                hd.setMaKHThanhToan(rs.getNString(3));
                hd.setNgayLap(rs.getNString(4));
                hd.setTongTien(rs.getInt(5));
                dshd.add(hd);
            }
            return dshd;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}