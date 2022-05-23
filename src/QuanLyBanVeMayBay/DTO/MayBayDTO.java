/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DTO;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MayBayDTO {
    private int maMayBay;
    private String tenMayBay;
    private int maHang;
    private int soLuongGhe;

    public MayBayDTO() {

    }

    /* -------------- GET SET --------------- */
    public int getMaMayBay(){
        return maMayBay;
    }
    
    public void setMaMayBay(int maMayBay){
        this.maMayBay = maMayBay;
    }
    
    public String getTenMayBay(){
        return tenMayBay;
    }
    
    public void setTenMayBay(String tenMayBay){
        this.tenMayBay = tenMayBay;
    }
    
    public int getMaHang(){
        return maHang;
    }
    
    public void setMaHang(int maHang){
        this.maHang = maHang;
    }
    
    public int getSoLuongGhe(){
        return soLuongGhe;
    }
    
    public void setSoLuongGhe(int soLuongGhe){
        this.soLuongGhe = soLuongGhe;
    }
}
