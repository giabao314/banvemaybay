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
public class SanBayDTO {


    private int maSanBay;
    private String tenSanBay;
    private String thanhPho;

    /* HÀM THIẾT LẬP */
    public SanBayDTO() {

    }

    public SanBayDTO(int maSB, String tenSB, String thanhPho) {
        this.maSanBay = maSB;
        this.tenSanBay = tenSB;
        this.thanhPho = thanhPho;
    }

    /* --------------------- GET SET ------------------- */
    public int getMaSanBay() {
        return this.maSanBay;
    }

    public String getTenSanBay() {
        return this.tenSanBay;
    }

    public String getThanhPho() {
        return this.thanhPho;
    }

    public void setMaSanBay(int ma) {
        this.maSanBay = ma;
    }

    public void setTenSanBay(String TenSanBay) {
        this.tenSanBay = TenSanBay;
    }

    public void setDiaChi(String thanhPho) {
        this.thanhPho = thanhPho;
    }
}
