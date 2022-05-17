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
public class HangBayDTO {

    Scanner input = new Scanner(System.in);

    private String maHang;
    private String tenHang;

    /* -------------- HÀM THIẾT LẬP ----------- */
    public HangBayDTO() {

    }

    public HangBayDTO(String ma, String ten) {
        this.maHang = ma;
        this.tenHang = ten;
    }

    public HangBayDTO(HangBayDTO hb) {
        this.maHang = hb.maHang;
        this.tenHang = hb.tenHang;
    }

    /* -------------- GET SET ------------ */
    public String getMaHang() {
        return this.maHang;
    }

    public String getTenHang() {
        return this.tenHang;
    }

    public void setMaHang(String ma) {
        this.maHang = ma;
    }

    public void setTenHang(String ten) {
        this.tenHang = ten;
    }
}
