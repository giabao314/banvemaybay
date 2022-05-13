/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;
import QuanLyBanVeMayBay.DTO.KhuyenMaiDTO;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class KhuyenMaiDAO {
    
    public ArrayList<KhuyenMaiDTO> getListKhuyenMai(){
        /*try{
            String querySQL = "SELECT * FROM KhuyenMai";
            //connect database
            PreparedStatement pre = MyConnect.conn.prepareStatement(querySQL);
            ResultSet rs  = pre.executeQuery();
            ArrayList<KhuyenMaiDTO> dskm = new ArrayList(); // Tao danh sach khuyen mai = arraylist
            while(rs.next()true){
                KhuyenMaiDTO km = new KhuyenMaiDTO(); // tao doi tuong khach hang
                kh.setMaKM(rs.getInt(1));
                kh.setTenKM(rs.getString(2));
                kh.setDienKienLoai(rs.getString(3));
                kh.setDienKienSL(rs.getInt(4));
                kh.setDienKienGia(rs.getint(5));
                kh.setPhanTramKM(rs.getint(6));
                kh.setNgayBD(rs.getString(7));
                kh.setNgayKT(rs.getString(8));
                
                return dskm;
            }
        }catch(SQLException ex){
            
        } */
        return null;
    }
    
    public boolean themKhuyenMai(KhuyenMaiDTO km){
        boolean check = false;
        
        /*
        try{
            String querySQL = "INSERT INTO khuyenmai VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
            // prep.setInt(1, km.getMaKM());
            prep.setString(1, km.getTenKM());
            prep.setString(2, km.getDieuKienLoai());
            prep.setInt(3, km.getDieuKienSL());
            prep.setInt(4, km.getDieuKienGia());
            prep.setint(5, km.getPhanTramKM());
            prep.setString(6, km.getNgayBD());
            prep.setString(7, km.getNgayKT());
            
            check = prep.executeUpdate() > 0;
        }catch(SQLException ex){
            return false;
        }
        */
        return check;
    }
    
    public boolean xoaKhuyenMai(int maKM){
        boolean check = false;
        /*
        try{
            String querySQL = "DELETE FROM khuyenmai WHERE maKH = ?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
            prep.setInt(1, maKH);
        
            check = prep.executeUpdate() > 0;
        }catch(SQLException ex){
            return false;
        }
        */
        return check;
    }
    
    public boolean suaKhuyenMai(int maKH,KhuyenMaiDTO km){
        boolean check = false;
        /*
        try{
            String querySQL = "UPDATE khuyenmai SET tenKM = ?, dieuKienLoai = ?, dieuKienSL = ?, dieuKienGia = ?, phamTramKM = ?,ngayBD = ?, ngayKT = ? WHERE maKM = ?";
            PreparedStatement prep = MyConnect.conn.preparedStatement(querySQL);
            prep.setString(1, km.getTenKM());
            prep.setString(2, km.getDieuKienLoai());
            prep.setInt(3, km.getDieuKienSL());
            prep.setInt(4, km.getDieuKienGia());
            prep.setint(5, km.getPhanTramKM());
            prep.setString(6, km.getNgayBD());
            prep.setString(7, km.getNgayKT());
            prep.setInt(8, maKM);
        
            check = executeUpdate() > 0;
        }catch(SQLException ex){
            return false;
        }
        */
        return check;
    }
    
}
