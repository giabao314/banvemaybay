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

    Scanner input = new Scanner(System.in);

    private String maMayBay;
    private String tenMayBay;
    private String maHang;
    private int soLuongGhe;

    public MayBayDTO() {

    }

    public MayBayDTO(String maMB, String tenMB, String maHB, int soLuongGhe) {
        this.maMayBay = maMB;
        this.tenMayBay = tenMB;
        this.maHang = maHB;
        this.soLuongGhe = soLuongGhe;
    }

    /* -------------- GET SET --------------- */
    public String getMaMayBay() {
        return this.maMayBay;
    }

    public String getTenMayBay() {
        return this.tenMayBay;
    }

    public String getMaHang() {
        return this.maHang;
    }

    public int getSoLuongGhe() {
        return this.soLuongGhe;
    }

    public void setMaMayBay(String ma) {
        this.maMayBay = ma;
    }

    public void setTenMayBay(String ten) {
        this.tenMayBay = ten;
    }

    public void setMaHang(String mahang) {
        this.maHang = mahang;
    }

    public void setSoLuongGhe(int soluong) {
        this.soLuongGhe = soluong;
    }
}
