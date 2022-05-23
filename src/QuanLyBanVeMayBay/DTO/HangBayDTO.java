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

    private int maHang;
    private String tenHang;

    /* -------------- HÀM THIẾT LẬP ----------- */
    public HangBayDTO() {

    }

    public HangBayDTO(int ma, String ten) {
        this.maHang = ma;
        this.tenHang = ten;
    }

    public HangBayDTO(HangBayDTO hb) {
        this.maHang = hb.maHang;
        this.tenHang = hb.tenHang;
    }

    /* -------------- GET SET ------------ */
    public int getMaHang() {
        return this.maHang;
    }

    public String getTenHang() {
        return this.tenHang;
    }

    public void setMaHang(int ma) {
        this.maHang = ma;
    }

    public void setTenHang(String ten) {
        this.tenHang = ten;
    }
}
