/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DTO;
// import QuanLyBanVeMayBay.DTO.MayBay;

import java.util.Date;

/**
 *
 * @author Thepi314
 */
public class ChuyenBay {

    private int maChuyenBay;
    private int maTuyenBay;
    private int maMayBay;
    private int soLgVeCL;
    private String ngayCatCanh;
    private String ngayHaCanh;

    public ChuyenBay() {
    }

    public ChuyenBay(int maChuyenBay, int maTuyenBay, int maMayBay, int soLgVeCL, String ngayCatCanh,
            String ngayHaCanh) {
        this.maChuyenBay = maChuyenBay;
        this.maTuyenBay = maTuyenBay;
        this.maMayBay = maMayBay;
        this.soLgVeCL = soLgVeCL;
        this.ngayCatCanh = ngayCatCanh;
        this.ngayHaCanh = ngayHaCanh;
    }

    public int getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(int maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public int getMaTuyenBay() {
        return maTuyenBay;
    }

    public void setMaTuyenBay(int maTuyenBay) {
        this.maTuyenBay = maTuyenBay;
    }

    public int getMaMayBay() {
        return maMayBay;
    }

    public void setMaMayBay(int maMayBay) {
        this.maMayBay = maMayBay;
    }

    public int getSoLgVeCL() {
        return soLgVeCL;
    }

    public void setSoLgVeCL(int soLgVeCL) {
        this.soLgVeCL = soLgVeCL;
    }

    public String getNgayCatCanh() {
        return ngayCatCanh;
    }

    public void setNgayCatCanh(String ngayCatCanh) {
        this.ngayCatCanh = ngayCatCanh;
    }

    public String getNgayHaCanh() {
        return ngayHaCanh;
    }

    public void setNgayHaCanh(String ngayHaCanh) {
        this.ngayHaCanh = ngayHaCanh;
    }
}
