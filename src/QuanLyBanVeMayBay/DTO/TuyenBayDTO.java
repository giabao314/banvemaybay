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

    private String maTuyenBay;
    private String sanBayCatCanh;
    private String sanBayHaCanh;
    private String gioCatCanh;
    private String gioHaCanh;

    /* HÀM THIẾT LẬP */
    public TuyenBayDTO() {

    }

    public TuyenBayDTO(String maTuyenBay, String SBcatCanh, String SBhaCanh, String gioCatCanh, String gioHaCanh) {
        this.maTuyenBay = maTuyenBay;
        this.sanBayCatCanh = SBcatCanh;
        this.sanBayHaCanh = SBhaCanh;
        this.gioCatCanh = gioCatCanh;
        this.gioHaCanh = gioHaCanh;
    }

    /* ------------------------- GET SET ------------------------ */
    public String GetMaTuyenBay() {
        return this.maTuyenBay;
    }

    public String GetSanBayCatCanh() {
        return this.sanBayCatCanh;
    }

    public String GetSanBayHaCanh() {
        return this.sanBayHaCanh;
    }

    public String GetGioCatCanh() {
        return this.gioCatCanh;
    }

    public String GetGioHaCanh() {
        return this.gioHaCanh;
    }

    public void SetMaTuyenBay(String ma) {
        this.maTuyenBay = ma;
    }

    public void SetSanBayCatCanh(String sanBayCatCanh) {
        this.sanBayCatCanh = sanBayCatCanh;
    }

    public void SetSanBayHaCanh(String sanBayHaCanh) {
        this.sanBayHaCanh = sanBayHaCanh;
    }

    public void SetGioCatCanh(String gioCatCanh) {
        this.gioCatCanh = gioCatCanh;
    }

    public void SetGioHaCanh(String gioHaCanh) {
        this.gioHaCanh = gioHaCanh;
    }
}
