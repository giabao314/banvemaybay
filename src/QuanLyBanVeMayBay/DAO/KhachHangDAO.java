/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;
import java.util.ArrayList;
import QuanLyBanVeMayBay.DTO.KhachHangDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author hp
 */
public class KhachHangDAO {
    
    public ArrayList<KhachHangDTO> getListKhachHang(){
        /*try{
            String querySQL = "SELECT * FROM KhachHang ";
            //connect database
            //PreparedStatement pre = MyConnect.conn.prepareStatement(querySQL);
            ResultSet rs; // = pre.executeQuery();
            ArrayList<KhachHangDTO> dskh = new ArrayList(); // Tao danh sach khanh hang = arraylist
            while(rs.next()true){
                KhachHangDTO kh = new KhachHangDTO(); // tao doi tuong khach hang
                kh.setMaKH(rs.getInt(1));
                kh.setHoKH(rs.getString(2));
                kh.setTenKH(rs.getString(3));
                kh.setGioiTinh(rs.getString(4));
                kh.setDate(rs.getString(5));
                kh.setCanCuoc(rs.getString(6));
                kh.setSdt(rs.getString(7));
                
                return dskh;
            }
        }catch(SQLException ex){
            
        } */
        return null;
    }
    
    public KhachHangDTO getKhachHang(int maKH){
        KhachHangDTO kh = null;
        /* try{
            //connect db
            // conn = DriverManager.getConnection(url,userName,password);
            String querySQL = "SELECT * FROM KhachHang WHERE maKH = ?";
            // st = conn.createStatement();
            // rs = st.executeQuery(querySQL);
            while(rs.next()){
                kh = new KhachHangDTO();
                kh.setMaKH(rs.getInt(1));
                kh.setHoKH(rs.getString(2));
                kh.setTenKH(rs.getString(3));
                kh.setGioiTinh(rs.getString(4));
                kh.setDate(rs.getString(5));
                kh.setCanCuoc(rs.getString(6));
                kh.setSdt(rs.getString(7));
      
            }
        }catch(SQLException ex){
            return null;
        }*/
        return kh;
    }
    
    public boolean themKhachHang(KhachHangDTO kh){
        boolean check = false;
        
        /*
        try{
        String querySQL = "INSERT INTO KhachHang VALUES(?,?,?,?,?,?,?)";
        PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
        prep.setInt(1, kh.getMaKH());
        prep.setString(2, kh.getHoKH());
        prep.setString(3, kh.getTenKH());
        prep.setString(4, kh.getGioiTinh());
        prep.setString(5, kh.getDate());
        prep.setString(6, kh.getCanCuoc());
        prep.setString(7, kh.getSdt());
        check = prep.executeUpdate() > 0;;
       
        }catch(SQLException ex){
            return false;
        }
        */
        return check;
    }
    
    
    public boolean xoaKhachHang(int maKH){
        boolean check = false;
        
        /*
        try{
            String querySQL = "DELETE FROM KhachHang WHERE maKH = ?"
            PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
            prep.setInt(1, maKH);
            check = prep.executeUpdate() > 0;
        }catch(SQLException ex){
            return false;
        }
        */

        return check;
    }
    
    public boolean suaKhachHang(int maKH,KhachHangDTO kh){
        boolean check = false;
        /*
        try{
            String querySQL = "UPDATE KhachHang SET hoKH = ?, tenKH = ?, gioiTinh = ?, date = ?, canCuoc = ?, sdt = ? WHERE maKH = ?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(querySQL);
            prep.setString(1, kh.getHoKH());
            prep.setString(2, kh.getTenKH());
            prep.setString(3, kh.getGioiTinh());
            prep.setString(4, kh.getDate());
            prep.setString(5, kh.getCanCuoc());
            prep.setString(6, kh.getSdt());
            prep.setInt(7, maKH);
        
            check = prep.executeUpdate() > 0
        }catch(SQLException ex){
            return false;
        }
        */
        
        return check;
        
    }
    
}
