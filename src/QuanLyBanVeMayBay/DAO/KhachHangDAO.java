/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;
import QuanLyBanVeMayBay.DTO.KhachHang;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
/**
 *
 * @author hp
 */
public class KhachHangDAO {
    
    public ArrayList<KhachHang> getListKhachHang(){
        try{
            String querySQL = "SELECT * FROM khachhang";
            PreparedStatement pre = MyConnect.conn.prepareStatement(querySQL);
            ResultSet rs  = pre.executeQuery();
            ArrayList<KhachHang> dskh = new ArrayList<>(); // Tao danh sach khanh hang = arraylist
            while(rs.next()){
                KhachHang kh = new KhachHang(); // tao doi tuong khach hang
                kh.setMaKH(rs.getInt(1));
                kh.setHoKH(rs.getString(2));
                kh.setTenKH(rs.getString(3));
                kh.setGioiTinh(rs.getString(4));
                kh.setDate(rs.getString(5));
                kh.setCanCuoc(rs.getString(6));
                kh.setSdt(rs.getString(7));
                kh.setTongChiTieu(rs.getInt(8));
                dskh.add(kh);
            }
            return dskh;
        }catch(SQLException ex){
            
        } 
        return null;
    }
    
    public boolean themKhachHang(KhachHang kh){
        boolean check = false;
        try{
        String querySQL = "INSERT INTO khachhang (maKH, hoKH, tenKH, gioiTinh, ngaySinh, canCuoc, sdt, tongChiTieu) "
                + "VALUES (NULL,?,?,?,?,?,?,1)";
        PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
        prep.setString(1, kh.getHoKH());
        prep.setString(2, kh.getTenKH());
        prep.setString(3, kh.getGioiTinh());
        prep.setString(4, kh.getDate());
        prep.setString(5, kh.getCanCuoc());
        prep.setString(6, kh.getSdt());
        //prep.setInt(7, kh.getTongChiTieu());
        check = prep.executeUpdate() > 0;
       
        }catch(SQLException ex){
            return false;
        }
        return check;
    }
    
    
    public boolean xoaKhachHang(int maKH){
        boolean check = false;

        try{
            String querySQL = "DELETE FROM khachhang WHERE maKH=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
            prep.setInt(1, maKH);
            check = prep.executeUpdate() > 0;
        }catch(SQLException ex){
            return false;
        }
        

        return check;
    }
    
    public boolean suaKhachHang(int maKH,KhachHang kh){
        boolean check = false;
        try{
            String querySQL = "UPDATE khachhang"
                    + " SET hoKH=?, tenKH=?, gioiTinh=?, ngaySinh=?, canCuoc=?, sdt=? "
                    + "WHERE maKH=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
            prep.setString(1, kh.getHoKH());
            prep.setString(2, kh.getTenKH());
            prep.setString(3, kh.getGioiTinh());
            prep.setString(4, kh.getDate());
            prep.setString(5, kh.getCanCuoc());
            prep.setString(6, kh.getSdt());
            prep.setInt(7, maKH);
        
            check = prep.executeUpdate() > 0;
        }catch(SQLException ex){
            return false;
        }
        
        
        return check;
        
    }
    
}
