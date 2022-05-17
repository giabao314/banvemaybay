/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DTO;

/**
 *
 * @author hp55550o
 */
public class KhachHang {
    private int maKH;
    private String hoKH;
    private String tenKH;
    private String gioiTinh;
    private String date;
    private String canCuoc;
    private String sdt;
    
    public KhachHang(){
    
    }
    
    public int getMaKH(){
        return maKH;
    }
    
    public void setMaKH(int maKH){
        this.maKH = maKH;
    }
    
    public String getHoKH(){
        return hoKH;
    }
    
    public void setHoKH(String hoKH){
        this.hoKH = hoKH;
    }
    
    public String getTenKH(){
        return tenKH;
    }
    
    public void setTenKH(String tenKH){
        this.tenKH = tenKH;
    }
    
    public String getGioiTinh(){
        return gioiTinh;
    }
    
    public void setGioiTinh(String gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public String getCanCuoc(){
        return canCuoc;
    }
    
    public void setCanCuoc(String canCuoc){
        this.canCuoc = canCuoc;
    }
    
    public String getSdt(){
        return sdt;
    }
    
    public void setSdt(String sdt){
        this.sdt = sdt;
    }
    
}
