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
public class TuyenBayDTO {

    Scanner input = new Scanner(System.in);

    private int maTuyenBay;
    private int sanBayCatCanh;
    private int sanBayHaCanh;
    private String gioCatCanh;
    private String gioHaCanh;

    /* HÀM THIẾT LẬP */
    public TuyenBayDTO() {

    }

    public TuyenBayDTO(int maTuyenBay, int SBcatCanh, int SBhaCanh, String gioCatCanh, String gioHaCanh) {
        this.maTuyenBay = maTuyenBay;
        this.sanBayCatCanh = SBcatCanh;
        this.sanBayHaCanh = SBhaCanh;
        this.gioCatCanh = gioCatCanh;
        this.gioHaCanh = gioHaCanh;
    }

    /* ------------------------- GET SET ------------------------ */
    public int getMaTuyenBay() {
        return this.maTuyenBay;
    }

    public int getSanBayCatCanh() {
        return this.sanBayCatCanh;
    }

    public int getSanBayHaCanh() {
        return this.sanBayHaCanh;
    }

    public String getGioCatCanh() {
        return this.gioCatCanh;
    }

    public String getGioHaCanh() {
        return this.gioHaCanh;
    }

    public void setMaTuyenBay(int ma) {
        this.maTuyenBay = ma;
    }

    public void setSanBayCatCanh(int sanBayCatCanh) {
        this.sanBayCatCanh = sanBayCatCanh;
    }

    public void setSanBayHaCanh(int sanBayHaCanh) {
        this.sanBayHaCanh = sanBayHaCanh;
    }

    public void setGioCatCanh(String gioCatCanh) {
        this.gioCatCanh = gioCatCanh;
    }

    public void setGioHaCanh(String gioHaCanh) {
        this.gioHaCanh = gioHaCanh;
    }
}
