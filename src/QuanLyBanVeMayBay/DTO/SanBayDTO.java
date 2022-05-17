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

    Scanner input = new Scanner(System.in);

    private String maSanBay;
    private String tenSanBay;
    private String diaChi;

    /* HÀM THIẾT LẬP */
    public SanBayDTO() {

    }

    public SanBayDTO(String maSB, String tenSB, String diaChi) {
        this.maSanBay = maSB;
        this.tenSanBay = tenSB;
        this.diaChi = diaChi;
    }

    /* --------------------- GET SET ------------------- */
    public String getMaSanBay() {
        return this.maSanBay;
    }

    public String getTenSanBay() {
        return this.tenSanBay;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setMaSanBay(String ma) {
        this.maSanBay = ma;
    }

    public void setTenSanBay(String TenSanBay) {
        this.tenSanBay = TenSanBay;
    }

    public void setDiaChi(String DiaChi) {
        this.diaChi = DiaChi;
    }
}
