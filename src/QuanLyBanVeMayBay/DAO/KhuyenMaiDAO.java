/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;
import QuanLyBanVeMayBay.DTO.KhuyenMai;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author hp
 */
public class KhuyenMaiDAO {
    
    public ArrayList<KhuyenMai> getListKhuyenMai(){
        try{
            String querySQL = "SELECT * FROM khuyenmai";
            PreparedStatement pre = MyConnect.conn.prepareStatement(querySQL);
            ResultSet rs  = pre.executeQuery();
            ArrayList<KhuyenMai> dskm = new ArrayList<>(); // Tao danh sach khuyen mai = arraylist
            while(rs.next() == true){
                KhuyenMai km = new KhuyenMai(); // tao doi tuong khach hang
                km.setMaKM(rs.getInt(1));
                km.setTenKM(rs.getString(2));
                km.setDieuKienGia(rs.getInt(3));
                km.setPhanTramKM(rs.getInt(4));
                km.setNgayBD(rs.getString(5));
                km.setNgayKT(rs.getString(6));
                dskm.add(km);
                
            }
            return dskm;
        }catch(SQLException ex){
            
        } 
        return null;
    }
    
    public boolean themKhuyenMai(KhuyenMai km){
        boolean check = false;
        
        
        try{
            String querySQL = "INSERT INTO khuyenmai VALUES(NULL,?,?,?,?,?)";
            PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
            // prep.setInt(1, km.getMaKM());
            prep.setString(1, km.getTenKM());
            prep.setInt(2, km.getDieuKienGia());
            prep.setInt(3, km.getPhanTramKM());
            prep.setString(4, km.getNgayBD());
            prep.setString(5, km.getNgayKT());
            
            check = prep.executeUpdate() > 0;
        }catch(SQLException ex){
            return false;
        }
        
        return check;
    }
    
    public boolean xoaKhuyenMai(int maKM){
        boolean check = false;
        
        try{
            String querySQL = "DELETE FROM khuyenmai WHERE maKM=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
            prep.setInt(1, maKM);
        
            check = prep.executeUpdate() > 0;
        }catch(SQLException ex){
            return false;
        }
        
        return check;
    }
    
    public boolean suaKhuyenMai(int maKM,KhuyenMai km){
        boolean check = false;
        
        try{
            String querySQL = "UPDATE khuyenmai"
                    + " SET tenKM=?, dieuKienGia=?, phanTramKM=?, ngayBD=?, ngayKT=? "
                    + "WHERE maKM=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
            prep.setString(1, km.getTenKM());
            prep.setInt(2, km.getDieuKienGia());
            prep.setInt(3, km.getPhanTramKM());
            prep.setString(4, km.getNgayBD());
            prep.setString(5, km.getNgayKT());
            prep.setInt(6, maKM);
            
            check = prep.executeUpdate() > 0;
        }catch(SQLException ex){
            return false;
        }
        
        return check;
    }
    
}
