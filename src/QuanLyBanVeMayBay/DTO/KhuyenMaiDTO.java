/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DTO;

/**
 *
 * @author hp
 */
public class KhuyenMaiDTO {
    private int maKM;
    private String tenKM;
    private String dieuKienLoai;
    private int dieuKienSL;
    private int dieuKienGia;
    private int phanTramKM;
    private String ngayBD;
    private String ngayKT;
    
    public KhuyenMaiDTO(){
        
    }
    
    public int getMaKM(){
        return maKM;
    }
    
    public void setMaKH(int maKM){
        this.maKM = maKM;
    }
    
    public String getTenKM(){
        return tenKM;
    }
    
    public void setTenKM(String tenKM){
        this.tenKM = tenKM;
    }
    
    public String getNgayBD(){
        return ngayBD;
    }
    
    public void setNgayBD(String ngayBD){
        this.ngayBD = ngayBD;
    }
    
    public String getNgayKT(){
        return ngayKT;
    }
    
    public void setNgayKT(String ngayKT){
        this.ngayKT = ngayKT;
    }
    
    public String getDienKienLoai(){
        return dieuKienLoai;
    }
    
    public void setDieuKienLoai(String dieuKienLoai){
        this.dieuKienLoai = dieuKienLoai;
    }
    
    public int getDieuKienSL(){
        return dieuKienSL;
    }
    
    public void setDieuKienSL(int dieuKienSL){
        this.dieuKienSL = dieuKienSL;
    }
    
    public int getDieuKienGia(){
        return dieuKienGia;
    }
    
    public void setDieuKienGia(int dieuKienGia){
        this.dieuKienGia = dieuKienGia;
    }
    
    public int getPhanTramKM(){
        return phanTramKM;
    }
    
    public void setPhanTramKM(int phanTramKM){
        this.phanTramKM = phanTramKM;
    }
    
}
